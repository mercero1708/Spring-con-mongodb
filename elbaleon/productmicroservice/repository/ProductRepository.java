package com.elbaleon.productmicroservice.repository;

import com.elbaleon.productmicroservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/*interface MongoRepository- nos ayuda con los metodos para manejar los recursos*/
public interface ProductRepository extends MongoRepository <ProductEntity, String >{
}
