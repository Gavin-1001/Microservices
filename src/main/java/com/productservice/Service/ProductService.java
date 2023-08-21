package com.productservice.Service;

import com.productservice.Dto.ProductRequest;
import com.productservice.Dto.ProductResponse;
import com.productservice.Entity.Product;

import java.util.List;

public interface ProductService {


    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();

    ProductResponse mapToProductResponse(Product product);
}
