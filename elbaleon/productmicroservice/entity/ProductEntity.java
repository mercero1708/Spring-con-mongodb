package com.elbaleon.productmicroservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value = "product")
/*implicitamente lombok metodos accesores*/
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {
    //propiedades
    @Id
    private String id;
    private String productname;
    private String productDescriction;
    private Double unitPrice;


}
