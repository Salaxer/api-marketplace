package com.salaxer.marketplace.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salaxer.marketplace.domain.dto.PurchaseDTO;
import com.salaxer.marketplace.domain.service.PurchaseDTOService;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
  
  @Autowired
  PurchaseDTOService purchaseDTOService;

  @GetMapping
  public ResponseEntity<List<PurchaseDTO>> getAll(){
    try {
      return new ResponseEntity<>(purchaseDTOService.getAll(), HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
  }

  @GetMapping(path = "{id}")
  public ResponseEntity<List<PurchaseDTO>> getByClient(@PathVariable("id") int clientId){
    return purchaseDTOService.getByClient(clientId)
    .map((products) -> new ResponseEntity<>(products, HttpStatus.OK))
    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping
  public ResponseEntity<PurchaseDTO> save(PurchaseDTO purchaseDTO){
    return new ResponseEntity<>(purchaseDTOService.save(purchaseDTO), HttpStatus.OK);
  }
  
}
