package com.elbaleon.productmicroservice.controller;

import com.elbaleon.productmicroservice.entity.ProductEntity;
import com.elbaleon.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*Controlador de tipo Rest*/
@RestController
@RequestMapping("/api/products") /*La url para el enpoint*/
public class ProductController {
    /*Inyectamos ProductRepository*/
    @Autowired /*spring entiende quequeremos inyectar nuestro ProductRepository*/
    private ProductRepository productRepository;
@GetMapping/*Accesible por metodo Get*/
@ResponseStatus(HttpStatus.OK)/*El estado 200 con ResponseStatus */
    public List<ProductEntity> getAllProducts(){
        /*retornamos la lista completa de nuestra BBDD*/
return productRepository.findAll();
    }

    /*crear o guardar productos en BBDD en este caso en Mongo DB*/
    @PostMapping/*Metodo Post*/
    @ResponseStatus(HttpStatus.OK)
    public void createproduct(@RequestBody ProductEntity productEntity)/*recibe una coleccion de atributos de tipo ProductEntity*/
{
    productRepository.save(productEntity);


}}
