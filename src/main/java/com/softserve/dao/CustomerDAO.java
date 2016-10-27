package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Customer;

/**
 * Establish contract for Customer class CRUD operations.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 */
public interface CustomerDAO extends GenericDAO<Customer, Integer> {

	/**
	 * Check if customer is registrated
	 * 
	 * @param id customer's id
	 * @return true if customer is registrated
	 */
	 public boolean isRegistrated(Integer id);
	 
	 /**
	  * Check if customer is registrated
	  * 
	  * @param firstName customer's firstname
	  * @param lastName	customer's lastname
	  * @return	true if customer is registrated
	  */
	 public boolean isRegistrated(String firstName, String lastName);
	 
	 /**
	  * Count how much days customer is registrated
	  * 
	  * @param id customer's id
	  * @return number of days customer is registrated
	  */
	 public int howMuchTimeRegistrated(Integer id);
	 
	 /**
	  * Count how much days customer is registrated
	  * 
	  * @param firstName customer's firstname
	  * @param lastName customer's lastname
	  * @return number of days customer is registrated
	  */
	 public int howMuchTimeRegistrated(String firstName, String lastName);
	 
	 /**
	  * Find customers who did not return book
	  * 
	  * @return list customers
	  */
	 public List<Customer> getListWhoDidNotReturn();
	 
	 /**
	  * Count number of books customer took
	  * 
	  * @param id customer's id
	  * @return number of books
	  */
	 public int howManyBooksTake(Integer id);
	 
	 /**
	  * Count number of books customer took
	  * 
	  * @param firstName customer's firstname
	  * @param lastName customer's lastname
	  * @return number of books
	  */
	 public int howManyBooksTake(String firstName, String lastName);
}
