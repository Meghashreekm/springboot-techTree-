package com.example.demo.service;

import com.example.demo.entity.Orders;
import com.example.demo.entity.Product;
import com.example.demo.repository.OrderRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

   
    public List<Orders> getOrderByUserEmail(String userEmail) {
        return repository.findByUserEmail(userEmail);
    }
//    public List<Orders> saveProducts(List<Orders> products) {
//        return repository.saveAll(products);
//    }
//    public Orders saveProduct(Orders product) {
//        return repository.save(product);
//    }

  

}