package com.example.demo.myfirstapi;

import com.example.demo.myfirstapi.model.Product;
import com.example.demo.myfirstapi.repository.ProductRepository;
import org.junit.jupiter.api.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepositoryTest {
    ProductRepository productRepository;
    @BeforeEach
    void setup(){
        productRepository = new ProductRepository();
    }

    @Test
    void findAllProductsInRepository(){
        assertEquals("Laptop", productRepository.findAll().get(0).getName());
        assertEquals("Mouse", productRepository.findAll().get(1).getName());
        assertEquals("Keyboard", productRepository.findAll().get(2).getName());
    }

    @Test
    void findProductByID(){
        Optional<Product> product = productRepository.findById((long) 1);
        Product product1 = product.get();
        assertEquals("Laptop", product1.getName());
        assertEquals(1, product1.getId());
        assertEquals(1200.00, product1.getPrice());
    }

    @Test
    void findProductByIDButNotExisting(){
        Optional<Product> product = productRepository.findById((long) 4);
        assertTrue(product.isEmpty());
    }

    @Test
    void savingProduct(){
        Product product = new Product("Macbook", 60000.00);
        productRepository.save(product);
        assertTrue(productRepository.findById((long) 4).get().equals(product));
    }

    @Test
    void savingExistingProduct(){
        Optional<Product> product = productRepository.findById((long) 1);
        Product product1 = product.get();
        product1.setPrice(52000.00);

        productRepository.save(product1);

        assertEquals("Laptop", product1.getName());
        assertEquals(1, product1.getId());
        assertEquals(52000.00, product1.getPrice());
    }
}
