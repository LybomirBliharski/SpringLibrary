package com.softserve.service;

import java.util.List;

import com.softserve.entity.Book;

/**
 * 
 * Book service.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 *
 */
public interface BookService {
	
	/**
     * Makes given Book instance persistent.
     * @param book instance to be persisted
     */
	void save(Book book);
	
	/**
     * Updates given Book instance.
     * @param book instance to be updated
     * @return updated instance
     */
	Book update(Book book);
	
	/**
     * Deletes given instance.
     * @param book instance to be deleted
     */
	void delete(Book book);
	
	/**
	 * Find book by id
	 * @param id book's id
	 * @return book instance
	 */
	Book findById(Integer id);
	
	/**
	 * Find all books
	 * @return list books
	 */
	List<Book> findAll();

	/**
	 * Find books by given genre
	 * 
	 * @param genre genre of book
	 * @return list books
	 */
	List<Book> findBooksByGenre(String genre);
	
	/**
	 * Find books by given name
	 * 
	 * @param name name of book
	 * @return list books
	 */
	List<Book> findBooksByName(String name);
	
	/**
	 * Find books by given author names
	 * 
	 * @param firstName author's firstName
	 * @param lastName 	author's lastName
	 * @return list books
	 */
	List<Book> findBooksByAuthor(String firstName, String lastName);
	
	/**
	 * Find books by given author names
	 * 
	 * @param lastName author's lastname
	 * @return list books
	 */
	List<Book> findBooksByAuthorLastName(String lastName);
	
	/**
	 * Find list of available books
	 * 
	 * @return	list books
	 */
	List<Book> findAvailableBooks();
	
	/**
	 * Find books by name 
	 * 
	 * @param name book's name
	 * @return list books
	 */
	List<Book> findBooksByNameLike(String name);
	
	/**
	 * Find books by author or name
	 * 
	 * @param name name
	 * @param type type
	 * @return list books
	 */
	List<Book> search(String name , String type);
}
