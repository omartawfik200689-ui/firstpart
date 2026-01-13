package pl.edu.vistula.firstrestapispring.product.support;

import org.springframework.stereotype.Component;
import pl.edu.vistula.firstrestapispring.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.request.UpdateProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.response.ProductResponse;
import pl.edu.vistula.firstrestapispring.product.domain.Product;

@Component
public class ProductMapper {

    public Product toEntity(ProductRequest request) {
        return new Product(null, request.getName());
    }

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }

    public ProductResponse toResponse(Product beforeUpdate, Product afterUpdate) {
        return new ProductResponse(beforeUpdate.getId(), afterUpdate.getName());
    }

    public void updateEntity(Product product, UpdateProductRequest request) {
        product.setName(request.getName());
    }
}
