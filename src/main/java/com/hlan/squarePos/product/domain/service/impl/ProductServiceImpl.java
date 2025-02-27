package com.hlan.squarePos.product.domain.service.impl;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.hlan.squarePos.product.domain.model.Product;
import com.hlan.squarePos.product.domain.repository.ProductRepository;
import com.hlan.squarePos.product.domain.service.ProductService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
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
//        product.setId(1);
        productRepository.save(product);

        String productName = productRepository.findById(product.getId())
                .map(Product::getProductName)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        System.out.println(productName);
    }

	@Override
	public void saveTheProduct() {
		
	}
}
