package dao;

import dao.dto.ExpenseDto;

import java.util.List;

public interface ExpenseDao {
  void create(ExpenseDto expenseDto);

  List<ExpenseDto> getAll();
  List<ExpenseDto> getByMonth(String expenseMonth, int expenseYear);
  List<ExpenseDto> getByYear(int expenseYear);

  void update(ExpenseDto expenseDto);

  void delete(int expenseId);
}
