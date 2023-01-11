package pl.stock.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.stock.model.dto.ProductDto;
import pl.stock.model.dto.ProductCreateDto;
import pl.stock.service.product.ProductService;

import java.util.List;

@RestController
@RequestMapping("/prd")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/all")
    public List<ProductDto> getProducts() {
        return productService.getAllProducts();
    }
}
