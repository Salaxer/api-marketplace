package com.salaxer.marketplace.domain;

public class ProductDTO {
  private int productId;
  private String name;
  private int categoryId;
  private double price;
  private int stock;
  private int state;
  private Category category;
  
  public int getProductId() {
    return productId;
  }
  public void setProductId(int productId) {
    this.productId = productId;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public int getStock() {
    return stock;
  }
  public void setStock(int stock) {
    this.stock = stock;
  }
  public int getState() {
    return state;
  }
  public void setState(int state) {
    this.state = state;
  }
  public Category getCategory() {
    return category;
  }
  public void setCategory(Category category) {
    this.category = category;
  }

  
}
