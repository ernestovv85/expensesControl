package dao;

import dao.dto.ExpenseDto;

public interface ExpenseDao {
  void create(ExpenseDto expenseDto);
}
