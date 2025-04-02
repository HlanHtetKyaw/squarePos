package com.hlan.squarePos.backend.product.domain.service.impl;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.hlan.squarePos.backend.product.domain.model.Product;
import com.hlan.squarePos.backend.product.domain.repository.ProductRepository;
import com.hlan.squarePos.backend.product.domain.service.ProductService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final Product product;

    @Override
    public void gettingData() {
        product.setProductName("Apple");
        product.setCost(1000);
        product.setSale(1500);
        product.setExpire_date(LocalDate.now());
        product.setQuantity(5);
//      product.setId(1);
        productRepository.save(product);

        String productName = productRepository.findById((long) 1)
                .map(Product::getProductName)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        log.info(productName);
    }

	@Override
	public void saveTheProduct() {
		
	}
}
