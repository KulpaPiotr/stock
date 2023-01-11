package pl.stock.service.product;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.stock.model.dto.ProductDto;
import pl.stock.model.mapper.ProductMapper;
import pl.stock.repository.ProductRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{


    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream().map(productMapper::toDto)
                .collect(Collectors.toList());
    }
}
