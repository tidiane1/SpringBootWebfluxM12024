package sn.niit.SpringBootWebfluxM12024.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import sn.niit.SpringBootWebfluxM12024.entity.Product;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product,
        String> {
}
