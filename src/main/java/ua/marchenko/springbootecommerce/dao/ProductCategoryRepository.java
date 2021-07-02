package ua.marchenko.springbootecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.marchenko.springbootecommerce.entity.ProductCategory;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category") // needed to override default api/productCategories
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
