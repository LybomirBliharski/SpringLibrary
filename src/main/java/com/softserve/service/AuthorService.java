package com.softserve.service;

import java.util.List;

import com.softserve.entity.Author;

/**
 * 
 * Author service.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 *
 */
public interface AuthorService {
	
	/**
     * Makes given Author instance persistent.
     * @param author instance to be persisted
     */
	void save(Author author);
	
	 /**
     * Updates given Author instance.
     * @param author instance to be updated
     * @return updated instance
     */
	Author update(Author author);
	
	/**
     * Deletes given instance.
     * @param author instance to be deleted
     */
	void delete(Author author);
	
	/**
	 * Find author by id
	 * @param id author's id
	 * @return author instance
	 */
	Author findById(Integer id);
	
	/**
	 * Find all authors
	 * @return list authors
	 */
	List<Author> findAll();
	
	/**
	 * Find authors by firstname 
	 * @param firstName author's firstname
	 * @return list authors
	 */
	List<Author> findByFirstName(String firstName);

	/**
	 * Find authors by lastname 
	 * @param lastName author's lastname
	 * @return list authors
	 */
	List<Author> findByLastName(String lastName);
}
