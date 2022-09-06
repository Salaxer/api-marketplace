package com.salaxer.marketplace.domain.repository;

import java.util.List;
import java.util.Optional;

import com.salaxer.marketplace.domain.dto.PurchaseDTO;

public interface PurchaseDTORepository {
  List<PurchaseDTO> getAll();
  Optional<List<PurchaseDTO>> getByClient(Integer clientId);
  PurchaseDTO save(PurchaseDTO purchaseDTO);
}
