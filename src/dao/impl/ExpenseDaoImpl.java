package dao.impl;

import configuration.JDBC;
import dao.ExpenseDao;
import dao.dto.ExpenseDto;
import entities.Expense;
import enums.CategoryExpense;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDaoImpl implements ExpenseDao {
  private final Connection connection;

  public ExpenseDaoImpl(){
    this.connection = JDBC.getDBConnection();
  }

  @Override
  public void create(ExpenseDto expenseDto) {
    try {
      Expense newExpense = new Expense();
      newExpense.setName(expenseDto.getName());
      newExpense.setDay(expenseDto.getDay());
      newExpense.setMonth(expenseDto.getMonth());
      newExpense.setYear(expenseDto.getYear());
      newExpense.setCategory(expenseDto.getCategory());
      newExpense.setAmount(expenseDto.getAmount());

      PreparedStatement preparedStatement = connection.prepareStatement(
              "INSERT INTO expense(name, expenseDay, expenseMonth, expenseYear, category, amount) VALUES(?, ?, ?, ?, ?, ?)");
      preparedStatement.setString(1, newExpense.getName());
      preparedStatement.setInt(2, newExpense.getDay());
      preparedStatement.setString(3, newExpense.getMonth());
      preparedStatement.setInt(4, newExpense.getYear());
      preparedStatement.setString(5, newExpense.getCategory().toString());
      preparedStatement.setDouble(6, newExpense.getAmount());
      preparedStatement.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<ExpenseDto> getAll() {
    List<ExpenseDto> expenses = new ArrayList<>();
    try {
      PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM expense");
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()){
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int day = resultSet.getInt("expenseDay");
        String month = resultSet.getString("expenseMonth");
        int year = resultSet.getInt("expenseYear");
        CategoryExpense category = CategoryExpense.valueOf(resultSet.getString("category"));
        double amount = resultSet.getDouble("amount");
        ExpenseDto newExpenseDto = new ExpenseDto(id, name, day, month, year, amount, category);
        expenses.add(newExpenseDto);
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return expenses;
  }

  @Override
  public List<ExpenseDto> getByMonth(String expenseMonth, int expenseYear) {
    List<ExpenseDto> expenses = new ArrayList<>();
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(
              "SELECT * FROM expense WHERE expenseMonth=? AND expenseYear=?"
      );
      preparedStatement.setString(1, expenseMonth);
      preparedStatement.setInt(2, expenseYear);
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()){
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int day = resultSet.getInt("expenseDay");
        String month = resultSet.getString("expenseMonth");
        int year = resultSet.getInt("expenseYear");
        CategoryExpense category = CategoryExpense.valueOf(resultSet.getString("category"));
        double amount = resultSet.getDouble("amount");
        ExpenseDto newExpenseDto = new ExpenseDto(id, name, day, month, year, amount, category);
        expenses.add(newExpenseDto);
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return expenses;
  }

  @Override
  public List<ExpenseDto> getByYear(int expenseYear) {
    List<ExpenseDto> expenses = new ArrayList<>();
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(
              "SELECT * FROM expense WHERE expenseYear=?"
      );
      preparedStatement.setInt(1, expenseYear);
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()){
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int day = resultSet.getInt("expenseDay");
        String month = resultSet.getString("expenseMonth");
        int year = resultSet.getInt("expenseYear");
        CategoryExpense category = CategoryExpense.valueOf(resultSet.getString("category"));
        double amount = resultSet.getDouble("amount");
        ExpenseDto newExpenseDto = new ExpenseDto(id, name, day, month, year, amount, category);
        expenses.add(newExpenseDto);
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return expenses;
  }

  @Override
  public void update(ExpenseDto expenseDto) {
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(
              "UPDATE expense SET name=?, expenseDay=?, expenseMonth=?, expenseYear=?, category=?, amount=? WHERE id=?"
      );
      preparedStatement.setString(1, expenseDto.getName());
      preparedStatement.setInt(2, expenseDto.getDay());
      preparedStatement.setString(3, expenseDto.getMonth());
      preparedStatement.setInt(4, expenseDto.getYear());
      preparedStatement.setString(5, expenseDto.getCategory().toString());
      preparedStatement.setDouble(6, expenseDto.getAmount());
      preparedStatement.setInt(7, expenseDto.getId());
      preparedStatement.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void delete(int expenseId) {
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(
              "DELETE FROM expense WHERE id=?"
      );
      preparedStatement.setInt(1, expenseId);
      preparedStatement.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
