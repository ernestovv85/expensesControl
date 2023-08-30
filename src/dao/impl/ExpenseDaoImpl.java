package dao.impl;

import configuration.JDBC;
import dao.ExpenseDao;
import dao.dto.ExpenseDto;
import entities.Expense;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
              "INSERT INTO income(name, expenseDay, expenseMonth, expenseYear, category, amount) VALUES(?, ?, ?, ?, ?, ?)");
      preparedStatement.setString(1, newExpense.getName());
      preparedStatement.setInt(2, newExpense.getDay());
      preparedStatement.setString(3, newExpense.getMonth());
      preparedStatement.setInt(4, newExpense.getYear());
      preparedStatement.setString(5, newExpense.getCategory().toString());
      preparedStatement.setDouble(6, newExpense.getAmount());
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
