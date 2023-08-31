package dao;

import dao.dto.IncomeDto;

import java.util.List;

public interface IncomeDao {
  void create (IncomeDto incomeDto);

  List<IncomeDto> getAll();

  void update(IncomeDto incomeDto);
}
