package Entities;

import Enums.CategoryIncome;

public class Income {
  private int id;
  private String name, date;
  private double amount;
  private CategoryIncome categoryIncome;

  public Income() {
  }

  public Income(int id, String name, String date, double amount, CategoryIncome categoryIncome) {
    this.id = id;
    this.name = name;
    this.date = date;
    this.amount = amount;
    this.categoryIncome = categoryIncome;
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

  public CategoryIncome getCategoryIncome() {
    return categoryIncome;
  }

  public void setCategoryIncome(CategoryIncome categoryIncome) {
    this.categoryIncome = categoryIncome;
  }
}
