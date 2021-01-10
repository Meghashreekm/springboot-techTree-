package com.example.demo.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="orders")
public class Orders {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int oid;
	 
	 

	    private String userEmail;
	    
	    private String userAddress;
	    
	   private Date orderDate;
	    
	    private int quantity;

	    
	    private BigDecimal amount;
	    
	    @JoinColumn(name = "uid",referencedColumnName = "uid", insertable = false, updatable = false)
	    @ManyToOne
	    private User uid;

//	    @Column(name = "uid", insertable = false, updatable = false)
//	    private User uid;

//	    @JoinColumn(name = "uid")
//	    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
//	    private User user;
//
//	    @Column(name = "uid_fk", insertable = false, updatable = false)
//	    private User uid_fk;
//	    
	    
//		public User getUid_fk() {
//			return uid;
//		}
//
//
//		public void setUid_fk(User uid) {
//			this.uid = uid;
//		}


//		public User getUid() {
//			return uid;
//		}
//
//
//		public void setUid(User uid) {
//			this.uid = uid;
//		}


		public void setUserAddress(String userAddress) {
			this.userAddress = userAddress;
		}


//		public User getUser() {
//			return user;
//		}
//
//
//		public void setUser(User user) {
//			this.user = user;
//		}


		public int getOid() {
			return oid;
		}


		public void setOid(int oid) {
			this.oid = oid;
		}


		public String getUserEmail() {
			return userEmail;
		}


		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}


		public String getUserAddress() {
			return userAddress;
		}


		public void setUserAdress(String userAddress) {
			this.userAddress = userAddress;
		}


		public Date getOrderDate() {
			return orderDate;
		}


		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}


		public int getQuantity() {
			return quantity;
		}


		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}


		public BigDecimal getAmount() {
			return amount;
		}


		public void setAmount(BigDecimal amount) {
			this.amount = amount;
		}

		

}
