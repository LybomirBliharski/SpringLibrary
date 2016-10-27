package com.softserve.service;

import java.util.List;

import com.softserve.entity.Customer;
import com.softserve.entity.Order;

/**
 * 
 * Order service.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 *
 */
public interface OrderService {
	
	List<Order> findAllOrdersByCustomer(Customer customer);

	int howManyTimeWasBookTakes(String bookname);

	int howManyTimeWasBookTakesByExempliars(int id);

	int averageReadingTimeByExempliar(int id);

	int averageReadingTimeByBook(String name);

	List<Order> findAll();
}
