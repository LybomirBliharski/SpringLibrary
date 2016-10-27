package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Author;

/**
 * Establish contract for Author class CRUD operations.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 */
public interface AuthorDAO extends GenericDAO<Author, Integer> {
	
	/**
	 * Find authors with given firstname
	 * 
	 * @param firstName Author's firstname
	 * @return list authors with given firstname
	 */
	List<Author> findByFirstName(String firstName);

	/**
	 * Find authors with given lastname
	 * 
	 * @param lastName Author's lastname
	 * @return list authors with given lastname
	 */
	List<Author> findByLastName(String lastName);

}
