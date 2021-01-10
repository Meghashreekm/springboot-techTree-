package com.example.demo.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import javax.validation.constraints.DecimalMin;
//import javax.validation.constraints.Min;
import javax.validation.constraints.DecimalMin;


@Entity
@Table(name="product")
public class Product {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "pid")
	    private int pid;

	    @Column(name = "name", nullable = false, unique = true)
	    private String name;
      
	    @Column(name = "brand", nullable = false)
		   private String brand;
	    
	   

	    @Column(name = "price", nullable = false)
	    @DecimalMin(value = "0.00")
	    private BigDecimal price;
	    

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
		

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public Product() {
			
			
		}

		public Product(int pid, String name, String brand, BigDecimal price) {
			super();
			this.pid = pid;
			this.name = name;
			this.brand = brand;
			
			this.price = price;
		}
	    
	    
	    


}
