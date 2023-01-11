package pl.stock.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreateDto {

    private String name;

    private Long quantity;

    private Float netPrice;

    private Long tax;

    private Float grossPrice;
}
