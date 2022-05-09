package ru.geekbrains.spring_less_web.Repository;

import org.springframework.stereotype.Component;
import ru.geekbrains.spring_less_web.Model.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> productList;

    @PostConstruct
    public void init(){
        productList = new ArrayList<>(Arrays.asList(
                new Product(1l, "Apple", 81),
                new Product(2l, "Potato", 400),
                new Product(3l,"Onion", 34),
                new Product(4l, "Meat", 243),
                new Product(5l, "IceCream", 44),
                new Product(6l,"Orange", 53)

        ));
    }

    public List<Product> getAllProducts(){
        return Collections.unmodifiableList(productList);
    }

    public Product findById(Long id){
        return productList.stream().filter(c -> c.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public void add(Long id, String title, Integer amount){
     productList.add(new Product(id, title, amount));
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void remove(Long id){
        productList.removeIf(product -> product.getId().equals(id));
    }
}
