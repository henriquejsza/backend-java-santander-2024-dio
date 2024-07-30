package com.mycompany.myapi.repository;

import com.mycompany.myapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Você pode adicionar métodos personalizados aqui se necessário
}
