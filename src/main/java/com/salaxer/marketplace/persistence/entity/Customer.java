package com.salaxer.marketplace.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_customers")
  private Integer idCustomers;

  private String name;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "phone_number")
  private Long phoneNumber;

  private String address;

  private String email;
  
  @OneToMany(mappedBy = "customer")
  private List<Shopping> shopping;

  public Integer getIdCustomers() {
    return idCustomers;
  }
  public void setIdCustomers(Integer idCustomers) {
    this.idCustomers = idCustomers;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public Long getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
}
