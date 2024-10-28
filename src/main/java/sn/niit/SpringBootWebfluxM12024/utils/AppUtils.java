package sn.niit.SpringBootWebfluxM12024.utils;

import org.springframework.beans.BeanUtils;
import sn.niit.SpringBootWebfluxM12024.dto.ProductDto;
import sn.niit.SpringBootWebfluxM12024.entity.Product;

public interface AppUtils {
    // Convert Product entity to ProductDto
    public static ProductDto entityToDto(Product product) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }
    // Convert ProductDto to Product entity
    public static Product dtoToEntity(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return product;
    }

}
