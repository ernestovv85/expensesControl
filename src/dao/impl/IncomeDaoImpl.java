package dao.impl;

import configuration.JDBC;
import dao.IncomeDao;
import dao.dto.IncomeDto;
import entities.Income;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
