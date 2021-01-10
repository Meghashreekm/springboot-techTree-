package com.example.demo.controller;

import com.example.demo.entity.Orders;
import com.example.demo.entity.Product;
//import com.example.demo.entity.Product;
import com.example.demo.service.OrderService;

import java.util.List;

//import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService service;
    
    @GetMapping("/orders/{userEmail}")
    public List<Orders> findOrderByUserEmail(@PathVariable String userEmail) {
    	return service.getOrderByUserEmail(userEmail);
    }
    
//    @PostMapping("/addProducts")
//    public List<Orders> addProducts(@RequestBody List<Orders> products) {
//        return service.saveProducts(products);
//    }
//    @PostMapping("/Prod")
//    public Orders addProduct(@RequestBody Orders product) {
//        return service.saveProduct(product);
//    }

  
}
