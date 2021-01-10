package com.example.demo.controller;

import com.example.demo.entity.OrderDetails;
import com.example.demo.entity.Orders;
import com.example.demo.entity.Product;
import com.example.demo.service.OrderDetailsService;
//import com.example.demo.entity.Product;
import com.example.demo.service.OrderService;

import java.util.List;

//import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderDetailsController {

    @Autowired
    private OrderDetailsService service;
    
//  @GetMapping("/ord/{pid}")
//    public List<OrderDetails> findOrderByUserEmail(@PathVariable int pid) {
//    	return service.getOrderByUserEmails(pid);
//    }
    
//    @GetMapping("/total/{order_details_id}")
//    public List<OrderDetails>getTotalAmountByUserId(@PathVariable int order_details_id){
//    	return service.getTotalAmountByUserId(order_details_id);
//    }
    
//    @PostMapping("/addProducts")
//    public List<Orders> addProducts(@RequestBody List<Orders> products) {
//        return service.saveProducts(products);
//    }
    
    @GetMapping("/ord/{orderDetailsId}")
    public List<OrderDetails> findByorderDetailsId(@PathVariable int orderDetailsId) {
    	//System.out.println(service.getOrderById(orderDetailsId));
    	return service.getOrderById(orderDetailsId);
    	
    	
    }
    
    @GetMapping("/OrderDetails")
    public List<OrderDetails> findAllProducts() {
        return service.getProducts();
    }
    
    @PostMapping("/addOrders")
    public List<OrderDetails> addProducts(@RequestBody List<OrderDetails> products) {
        return service.saveProducts(products);
    }



  
}
