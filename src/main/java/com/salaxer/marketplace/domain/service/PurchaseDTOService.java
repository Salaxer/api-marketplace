package com.salaxer.marketplace.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salaxer.marketplace.domain.dto.PurchaseDTO;
import com.salaxer.marketplace.domain.repository.PurchaseDTORepository;

@Service
public class PurchaseDTOService {
  
  @Autowired
  private PurchaseDTORepository purchaseDTORepository;
  
  public List<PurchaseDTO> getAll(){
    return purchaseDTORepository.getAll();
  };
  
  public Optional<List<PurchaseDTO>> getByClient(Integer clientId){
    return purchaseDTORepository.getByClient(clientId);
  }
  
  public PurchaseDTO save(PurchaseDTO purchaseDTO){
    return purchaseDTORepository.save(purchaseDTO);
  }

}
