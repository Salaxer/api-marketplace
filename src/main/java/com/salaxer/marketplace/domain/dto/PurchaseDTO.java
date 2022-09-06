package com.salaxer.marketplace.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseDTO {
  private int PurchaseId;
  private String clientId;
  private LocalDateTime date;
  private String paymentMethod;
  private String comment;
  private String state;

  private List<PurchaseItemDTO> items;

  public int getPurchaseId() {
    return PurchaseId;
  }

  public void setPurchaseId(int purchaseId) {
    PurchaseId = purchaseId;
  }

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public List<PurchaseItemDTO> getItems() {
    return items;
  }

  public void setItems(List<PurchaseItemDTO> items) {
    this.items = items;
  }
  
  
}
