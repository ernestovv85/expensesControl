package Entities;

import Enums.CategoryExpense;

public class Expense {
  private int id;
  private String name, date;
  private double amount;
  private CategoryExpense categoryExpense;

  public Expense() {
  }

  public Expense(int id, String name, String date, double amount, CategoryExpense categoryExpense) {
    this.id = id;
    this.name = name;
    this.date = date;
    this.amount = amount;
    this.categoryExpense = categoryExpense;
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

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public CategoryExpense getCategoryExpense() {
    return categoryExpense;
  }

  public void setCategoryExpense(CategoryExpense categoryExpense) {
    this.categoryExpense = categoryExpense;
  }
}
