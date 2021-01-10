package com.example.demo.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;


@Entity
@Table(name="orderDetails")
public class OrderDetails {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int orderDetailsId;
	 
        @ManyToOne
	   
	    @JoinColumn(name ="pid")
	    private Product products;
        
        
	    private int quantity;
	    
	    private int total;

	    
//	    @ManyToOne
//	    private OrderDetails orderDetails;

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}



		public int getOrderDetailsId() {
			return orderDetailsId;
		}

		public void setOrderDetailsId(int orderDetailsId) {
			this.orderDetailsId = orderDetailsId;
		}

		public Product getProducts() {
			return products;
		}

		public void setProducts(Product products) {
			this.products = products;
		}

		


	



}
