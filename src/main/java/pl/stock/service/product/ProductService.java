package pl.stock.service.product;

import pl.stock.model.dto.ProductCreateDto;
import pl.stock.model.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAllProducts();

    ProductDto createProduct(ProductCreateDto createDto);
}
