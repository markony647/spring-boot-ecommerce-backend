package ua.marchenko.springbootecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.marchenko.springbootecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
