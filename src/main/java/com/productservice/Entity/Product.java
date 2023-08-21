package com.productservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Table(name="product")
@Data
@Entity
@Builder
public class Product {

    @Id
    public String id;
    public String name;
    public String description;
    public BigDecimal price;


}
