package com.jc0d3r.api_produto_jwt_postgresql.Repository;

import com.jc0d3r.api_produto_jwt_postgresql.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
