package entities;

import enums.CategoryExpense;

public class Expense extends Date{
  private int id;
  private String name;
  private double amount;
  private CategoryExpense category;

  public Expense() {
  }

  public Expense(int id, String name, int day, String month, int year, double amount, CategoryExpense categoryExpense) {
    super(day, year, month);
    this.id = id;
    this.name = name;
    this.amount = amount;
    this.category = categoryExpense;
  }

  public int getId() {
    return id;
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
