package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.OrderDetails;
import com.example.demo.entity.Orders;
import com.example.demo.entity.Product;



public interface OrderDetailsRepository  extends JpaRepository<OrderDetails,Integer> {
	   // List<Orders> findByUserEmail(String userEmail);
	
//	@Query(value=" Select sum(product.price*order_details.quantity)as total from product,order_details where orderDetailsId=?1",nativeQuery=true)
//	 public List<OrderDetails> getTotalAmountByUserId(int pid);
	
	//@Query(value="Select quantity from order_details where order_details_id:?1",nativeQuery=true)
	//List<OrderDetails>getTotalAmountByUserId(int order_details_id);
	
	  List<OrderDetails> findByorderDetailsId(int orderDetailsId);
	}

	


