package com.salaxer.marketplace.domain;

public class Category {
  private int categoryId;
  private String category;
  private int state;
  
  public int getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }
  public int getState() {
    return state;
  }
  public void setState(int state) {
    this.state = state;
  }

  
}
