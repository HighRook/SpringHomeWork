package ru.geekbrains.spring_less_web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public void changeAmount(Long id, Integer amount){
        Product product = repository.findById(id);
        product.setAmount(product.getAmount() + amount);

    }

    public void deleteProduct(Long id){
        repository.remove(id);
    }
}
