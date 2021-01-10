package com.example.demo.service;

import com.example.demo.entity.OrderDetails;
import com.example.demo.entity.Orders;
import com.example.demo.entity.Product;
import com.example.demo.repository.OrderDetailsRepository;
import com.example.demo.repository.OrderRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrderDetailsService {
    @Autowired
    private OrderDetailsRepository repository;

   
//    public List<Orders> getOrderByUserEmail(String userEmail) {
//        return repository.findByUserEmail(userEmail);
//    }
    public List<OrderDetails> saveProducts(List<OrderDetails> products) {
        return repository.saveAll(products);
    }
    public List<OrderDetails> getProducts() {
        return repository.findAll();
    }    
//    public List<OrderDetails> getTotalAmountByUserId(int order_details_id) {
//        return repository.getTotalAmountByUserId(order_details_id);
//    }
    
    public List<OrderDetails> getOrderById(int orderDetailsId) {
        return repository.findByorderDetailsId(orderDetailsId);
    }
  

}