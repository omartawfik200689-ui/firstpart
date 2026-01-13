package pl.edu.vistula.firstrestapispring.product.service;

import org.springframework.stereotype.Service;
import pl.edu.vistula.firstrestapispring.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.request.UpdateProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.response.ProductResponse;
import pl.edu.vistula.firstrestapispring.product.domain.Product;
import pl.edu.vistula.firstrestapispring.product.repository.ProductRepository;
import pl.edu.vistula.firstrestapispring.product.support.ProductExceptionSupplier;
import pl.edu.vistula.firstrestapispring.product.support.ProductMapper;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductService(ProductRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProductResponse create(ProductRequest request) {
        Product product = mapper.toEntity(request);
        Product saved = repository.save(product);
        return mapper.toResponse(saved);
    }

    public ProductResponse find(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));
        return mapper.toResponse(product);
    }

    public List<ProductResponse> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    public ProductResponse update(Long id, UpdateProductRequest request) {
        Product product = repository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));

        Product before = new Product(product.getId(), product.getName());
        mapper.updateEntity(product, request);
        repository.save(product);

        return mapper.toResponse(before, product);
    }

    public void delete(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));
        repository.deleteById(product.getId());
    }
}
