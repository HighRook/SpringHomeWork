package ru.geekbrains.spring_less_web.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Repository.ProductRepository;
import ru.geekbrains.spring_less_web.Service.ProductService;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService service;

    @GetMapping("/product/all")
    public List<Product> getTest(){
        return productRepository.getAllProducts();
    }

    @GetMapping("/product/change_amount")
    public void changeAmount(@RequestParam Long productId, @RequestParam Integer delta){
        service.changeAmount(productId, delta);
    }

    @PostMapping("/product/add")
    public void addProductPost(@RequestBody Product product){
        productRepository.addProduct(product);
    }


    @GetMapping("/product/delete")
    public void deleteProduct(@RequestParam Long productId){
        service.deleteProduct(productId);
    }


}
