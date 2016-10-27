package com.softserve.service;

import java.util.List;

import com.softserve.entity.Customer;

/**
 * 
 * Customer service.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 *
 */
public interface CustomerService {

	/**
     * Makes given Customer instance persistent.
     * @param customer instance to be persisted
     */
	void save(Customer customer);

	/**
     * Updates given Customer instance.
     * @param customer instance to be updated
     * @return updated instance
     */
	Customer update(Customer customer);

	/**
     * Deletes given instance.
     * @param customer instance to be deleted
     */
	void delete(Customer customer);

	/**
	 * Find customer by id
	 * @param id customer's id
	 * @return customer instance
	 */
	Customer findById(Integer id);

	/**
	 * Find all customers
	 * @return list customers
	 */
	List<Customer> findAll();

	/**
	 * Check if customer is registrated
	 * 
	 * @param id customer's id
	 * @return true if customer is registrated
	 */
	boolean isRegistrated(Integer id);

	/**
	  * Check if customer is registrated
	  * 
	  * @param firstName customer's firstname
	  * @param lastName	customer's lastname
	  * @return	true if customer is registrated
	  */
	boolean isRegistrated(String firstName, String lastName);

	/**
	  * Count how much days customer is registrated
	  * 
	  * @param id customer's id
	  * @return number of days customer is registrated
	  */
	int howMuchTimeRegistrated(Integer id);

	/**
	  * Count how much days customer is registrated
	  * 
	  * @param firstName customer's firstname
	  * @param lastName customer's lastname
	  * @return number of days customer is registrated
	  */
	int howMuchTimeRegistrated(String firstName, String lastName);

	/**
	  * Find customers who did not return book
	  * 
	  * @return list customers
	  */
	List<Customer> getListWhoDidNotReturn();

	/**
	  * Count number of books customer took
	  * 
	  * @param id customer's id
	  * @return number of books
	  */
	int howManyBooksTake(Integer id);

	/**
	  * Count number of books customer took
	  * 
	  * @param firstName customer's firstname
	  * @param lastName customer's lastname
	  * @return number of books
	  */
	int howManyBooksTake(String firstName, String lastName);
}
