package dao;

import dao.dto.ExpenseDto;

import java.util.List;

public interface ExpenseDao {
  void create(ExpenseDto expenseDto);

  List<ExpenseDto> getAll();

  void update(ExpenseDto expenseDto);

  void delete(int expenseId);
}
