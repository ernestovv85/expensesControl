package dao.impl;

import configuration.JDBC;
import dao.IncomeDao;
import dao.dto.IncomeDto;
import entities.Income;
import enums.CategoryIncome;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IncomeDaoImpl implements IncomeDao {
  private final Connection connection;

  public IncomeDaoImpl() {
    this.connection = JDBC.getDBConnection();
  }

  @Override
  public void create(IncomeDto incomeDto) {
    try {
      Income newIncome = new Income();
      newIncome.setName(incomeDto.getName());
      newIncome.setDay(incomeDto.getDay());
      newIncome.setMonth(incomeDto.getMonth());
      newIncome.setYear(incomeDto.getYear());
      newIncome.setCategory(incomeDto.getCategory());
      newIncome.setAmount(incomeDto.getAmount());

      PreparedStatement preparedStatement = connection.prepareStatement(
              "INSERT INTO income(name, incomeDay, incomeMonth, incomeYear, category, amount) VALUES(?, ?, ?, ?, ?, ?)");
      preparedStatement.setString(1, newIncome.getName());
      preparedStatement.setInt(2, newIncome.getDay());
      preparedStatement.setString(3, newIncome.getMonth());
      preparedStatement.setInt(4, newIncome.getYear());
      preparedStatement.setString(5, newIncome.getCategory().toString());
      preparedStatement.setDouble(6, newIncome.getAmount());
      preparedStatement.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<IncomeDto> getAll() {
    List<IncomeDto> incomes = new ArrayList<>();
    try {
      PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM income");
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int day = resultSet.getInt("incomeDay");
        String month = resultSet.getString("incomeMonth");
        int year = resultSet.getInt("incomeYear");
        CategoryIncome category = CategoryIncome.valueOf(resultSet.getString("category"));
        double amount = resultSet.getDouble("amount");
        IncomeDto newIncomeDto = new IncomeDto(id, name, day, month, year, amount, category);
        incomes.add(newIncomeDto);
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return incomes;
  }

  @Override
  public void update(IncomeDto incomeDto) {
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(
              "UPDATE income SET name=?, incomeDay=?, incomeMonth=?, incomeYear=?, category=?, amount=? WHERE id=?");
      preparedStatement.setString(1, incomeDto.getName());
      preparedStatement.setInt(2, incomeDto.getDay());
      preparedStatement.setString(3, incomeDto.getMonth());
      preparedStatement.setInt(4, incomeDto.getYear());
      preparedStatement.setString(5, incomeDto.getCategory().name());
      preparedStatement.setDouble(6, incomeDto.getAmount());
      preparedStatement.setInt(7, incomeDto.getId());
      preparedStatement.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }
}
