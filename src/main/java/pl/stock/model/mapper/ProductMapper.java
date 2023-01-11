package pl.stock.model.mapper;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.stock.model.dto.ProductDto;
import pl.stock.model.entity.Product;

import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ProductMapper {
    public ProductDto toDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .quantity(product.getQuantity())
                .netPrice(product.getNetPrice())
                .tax(product.getTax())
                .grossPrice(product.getGrossPrice())
                .build();
    }
}
