package com.softserve.service;

import java.util.List;

import com.softserve.entity.Customer;
import com.softserve.entity.Exempliar;

/**
 * 
 * Exempliar service.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 *
 */
public interface ExempliarService {
	
	/**
     * Makes given Exempliar instance persistent.
     * @param exempliar instance to be persisted
     */
	void save(Exempliar exempliar);
	
	/**
     * Updates given Exempliar instance.
     * @param exempliar instance to be updated
     * @return updated instance
     */
	Exempliar update(Exempliar exempliar);
	
	/**
     * Deletes given instance.
     * @param exempliar instance to be deleted
     */
	void delete(Exempliar exempliar);
	
	/**
	 * Find exempliar by id
	 * @param id exempliar's id
	 * @return exempliar instance
	 */
	Exempliar findById(Integer id);
	

	/**
	 * Find all exempliars
	 * @return list exempliars
	 */
	List<Exempliar> findAll();

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
