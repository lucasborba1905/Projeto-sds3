package com.devsuperior.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerRepository;

	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public Page<SaleDTO> findALL(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}

	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		  return repository.amountGroupedBySeller();
	
	}
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		  return repository.successGroupedBySeller();
	}
	

}
