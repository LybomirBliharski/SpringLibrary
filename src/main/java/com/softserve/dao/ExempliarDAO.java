package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Customer;
import com.softserve.entity.Exempliar;

/**
 * Establish contract for Exempliar class CRUD operations.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 */
public interface ExempliarDAO extends GenericDAO<Exempliar, Integer>{

	/**
	 * Find exempliars read by customer
	 * 
	 * @param customer customer
	 * @return list exempliars
	 */
	List<Exempliar> findReadBooksByCustomer(Customer customer);
	
	/**
	 * Find exempliars customer is reading
	 * 
	 * @param customer customer
	 * @return list exempliars
	 */
	List<Exempliar> findBooksCustomerIsReading(Customer customer);
}
