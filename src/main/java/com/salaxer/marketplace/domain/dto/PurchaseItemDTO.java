package com.salaxer.marketplace.domain.dto;

public class PurchaseItemDTO {
  private int productId;
  private int quantity;
  private double total;
  private int state;
  
  public int getProductId() {
    return productId;
  }
  public void setProductId(int productId) {
    this.productId = productId;
  }
  public int getQuantity() {
    return quantity;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  public double getTotal() {
    return total;
  }
  public void setTotal(double total) {
    this.total = total;
  }
  public int getState() {
    return state;
  }
  public void setState(int state) {
    this.state = state;
  }

  
}
