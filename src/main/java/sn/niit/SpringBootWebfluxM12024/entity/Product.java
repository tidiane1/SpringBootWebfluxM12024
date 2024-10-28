package sn.niit.SpringBootWebfluxM12024.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// An entity class representing a product
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")
public class Product {
    // The ID of the product
    @Id
    private String id;
    // The name of the product
    private String name;
    // The quantity of the product
    private int qty;
    // The price of the product
    private double price;
}
