package com.salaxer.marketplace.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

  // Always a column called diferent to variable, use the annotation Column
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_product")
  private Integer idProduct;

  private String name;

  @Column(name = "id_categories")
  private Integer idCategories;

  @Column(name = "bar_code")
  private String barCode;

  private Double price;

  private Integer quantity;

  private Integer state;

  @ManyToOne
  @JoinColumn(name = "id_categories", insertable = false, updatable = false)
  private Category category;

  public Category getCategory(){
    return category;
  }

  public void setCategory(Category category){
    this.category = category;
  }

  public Integer getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(Integer idProduct) {
    this.idProduct = idProduct;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getIdCategories() {
    return idCategories;
  }

  public void setIdCategories(Integer idCategories) {
    this.idCategories = idCategories;
  }

  public String getBarCode() {
    return barCode;
  }

  public void setBarCode(String barCode) {
    this.barCode = barCode;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  

}
