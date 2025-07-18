package com.example.demo.myfirstapi;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    private static Product product;

    @BeforeEach
    void setup(){
        product = new Product((long) 1, "Laptop", 6000.0);
    }

    @Test
    void shouldGetProductID(){
        assertEquals(1, product.getId());
    }

    @Test
    void shouldGetProductName(){
        assertEquals("Laptop", product.getName());
    }

    @Test
    void shouldGetProductPrice(){
        assertEquals(6000.00, product.getPrice());
    }

    @Test
    void changeIDOfProduct(){
        product.setId((long) 5);
        assertEquals(5, product.getId());
    }

    @Test
    void changeNameOfProduct(){
        product.setName("Asus ROG");
        assertEquals("Asus ROG", product.getName());
    }

    @Test
    void changePriceOfProduct(){
        product.setPrice(56000.00);
        assertEquals(56000.00, product.getPrice());
    }

    @Test
    void toStringProductInformation(){
        assertEquals("Product{id=1, name='Laptop', price=6000.0}", product.toString());
    }

    @Test
    void checkIfProductsAreEqual(){
        Product newproduct = new Product((long) 1, "Laptop", 6000.0);
        assertTrue(product.equals(newproduct));
    }

    @Test
    void productHashCode(){
        assertEquals(-1594342042, product.hashCode());
    }
}
