package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Book;

/**
 * Establish contract for Book class CRUD operations.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 */
public interface BookDAO extends GenericDAO<Book, Integer>{

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
	 * Find all books
	 * 
	 * @return list books
	 */
	List<Book> findAll();

}