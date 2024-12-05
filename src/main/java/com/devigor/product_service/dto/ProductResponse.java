package com.devigor.product_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductResponse {

    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
