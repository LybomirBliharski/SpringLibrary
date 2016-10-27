package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Customer;
import com.softserve.entity.Order;

/**
 * Establish contract for Order class CRUD operations.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 */
public interface OrderDAO extends GenericDAO<Order, Integer> {

	/**
	 * Find customer's orders
	 * 
	 * @param customer customer
	 * @return list orders
	 */
	List<Order> findAllOrdersByCustomer(Customer customer);

	/**
	 * Count how many times book was taken
	 * 
	 * @param bookname name of book
	 * @return times book was taken
	 */
	int howManyTimeWasBookTakes(String bookname);

	/**
	 * Count how many times book was taken
	 * 
	 * @param id exempliar id
	 * @return times book was taken
	 */
	int howManyTimeWasBookTakesByExempliars(int id);

	/**
	 * Count average number of days book was reading
	 * 
	 * @param id exempliar id
	 * @return average number of days
	 */
	int averageReadingTimeByExempliar(int id);

	/**
	 * Count average number of days book was reading
	 * 
	 * @param name book name
	 * @return average number of days
	 */
	int averageReadingTimeByBook(String name);

	/**
	 * Find all orders 
	 * 
	 * @return list orders
	 */
	List<Order> findAll();

}
