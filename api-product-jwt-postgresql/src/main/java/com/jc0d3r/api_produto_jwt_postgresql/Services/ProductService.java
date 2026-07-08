package com.jc0d3r.api_produto_jwt_postgresql.Services;

import com.jc0d3r.api_produto_jwt_postgresql.Exceptions.ResourceNotFoundException;
import com.jc0d3r.api_produto_jwt_postgresql.Model.Product;
import com.jc0d3r.api_produto_jwt_postgresql.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRep;

    public ProductService(ProductRepository productRep) {
        this.productRep = productRep;
    }

    public List<Product> listProducts() {
        return productRep.findAll();
    }

    public Product findById(Long id) {
        return productRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product with ID " + id + "not found"));
    }

    public Product saveProduct(Product product) {
        return productRep.save(product);
    }

    public void deleteProduct(Long id) {

        if (!productRep.existsById(id))
            throw new ResourceNotFoundException("Product with ID " + id + "not found");

        productRep.deleteById(id);
    }

}
