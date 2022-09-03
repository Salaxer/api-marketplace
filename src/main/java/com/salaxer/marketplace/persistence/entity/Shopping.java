package com.salaxer.marketplace.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shopping")
public class Shopping {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_shopping")
  private Integer idShopping;

  @Column(name = "id_customers")
  private Integer idCustomers;

  private LocalDateTime date;

  @Column(name = "payment_method")
  private String paymentMethod;

  private String comment;

  private Integer state;

  @ManyToOne
  @JoinColumn(name = "id_customers", insertable = false, updatable = false)
  private Customer customer;

  @OneToMany(mappedBy = "shopping")
  private List<ProductShopping> shopping;

  public Integer getIdShopping() {
    return idShopping;
  }

  public void setIdShopping(Integer idShopping) {
    this.idShopping = idShopping;
  }

  public Integer getIdCustomers() {
    return idCustomers;
  }

  public void setIdCustomers(Integer idCustomers) {
    this.idCustomers = idCustomers;
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

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

}
