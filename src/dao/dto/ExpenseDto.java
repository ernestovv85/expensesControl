package dao.dto;

import entities.Date;
import enums.CategoryExpense;

public class ExpenseDto extends Date {
  private int id;
  private String name;
  private double amount;
  private CategoryExpense category;

  public ExpenseDto() {
  }

  public ExpenseDto(int id, String name, int day, String month, int year, double amount, CategoryExpense category) {
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

  public CategoryExpense getCategory() {
    return category;
  }

  public void setCategory(CategoryExpense category) {
    this.category = category;
  }
}
