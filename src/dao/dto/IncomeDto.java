package dao.dto;

import entities.Date;
import enums.CategoryIncome;

public class IncomeDto extends Date{
  private int id;
  private String name;
  private double amount;
  private CategoryIncome category;

  public IncomeDto() {
  }

  public IncomeDto(int id, String name, int day, String month, int year, double amount, CategoryIncome category) {
    super(day, year, month);
    this.id = id;
    this.name = name;
    this.amount = amount;
    this.category = category;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public CategoryIncome getCategory() {
    return category;
  }

  public void setCategory(CategoryIncome category) {
    this.category = category;
  }

}
