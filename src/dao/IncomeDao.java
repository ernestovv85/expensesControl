package dao;

import dao.dto.IncomeDto;

import java.util.List;

public interface IncomeDao {
  void create (IncomeDto incomeDto);

  List<IncomeDto> getAll();
  List<IncomeDto> getByMonth(String incomeMonth, int incomeYear);
  List<IncomeDto> getByYear(int incomeYear);

  void update(IncomeDto incomeDto);

  void delete(int incomeId);
}
