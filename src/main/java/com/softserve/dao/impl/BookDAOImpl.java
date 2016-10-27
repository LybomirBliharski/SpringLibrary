package com.softserve.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.BookDAO;
import com.softserve.entity.Book;

@Repository
@Transactional
public class BookDAOImpl extends GenericDAOImpl<Book, Integer> 
		implements BookDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	protected BookDAOImpl() {
		super(Book.class);
	}
	
	@Override
	public Book findById(Integer id){
		return entityManager.createQuery("SELECT book FROM Book book JOIN fetch "
				+ "book.author author JOIN fetch book.genre genre WHERE "
				+ "book.id = :id", Book.class).setParameter("id", id).getSingleResult();
	}
	
	@Override 
	public List<Book> findAll() {
		return entityManager.createQuery("SELECT book FROM Book book JOIN fetch "
				+ "book.author author JOIN fetch book.genre genre", Book.class)
				.getResultList();
	}

	@Override
	public List<Book> findBooksByGenre(String genre) {
		return entityManager.createQuery("SELECT book FROM Book book JOIN fetch "
				+ "book.author author JOIN fetch book.genre genre WHERE "
				+ "genre.name = :name", Book.class)
				.setParameter("name", genre).getResultList();
	}

	@Override
	public List<Book> findBooksByName(String name) {
		return entityManager.createQuery("SELECT book FROM Book book JOIN fetch "
				+ "book.author author JOIN fetch book.genre genre WHERE "
				+ "book.name = :name", Book.class)
				.setParameter("name", name).getResultList();
	}

	
	@Override
	public List<Book> findBooksByAuthor(String firstName, String lastName) {
		return entityManager.createQuery("SELECT book FROM Book book JOIN fetch "
				+ "book.author author JOIN fetch book.genre genre WHERE "
				+ "author.firstName = :firstName AND "
				+ "author.lastName = :lastName", Book.class)
				.setParameter("firstName", firstName)
				.setParameter("lastName", lastName).getResultList();
	}

	@Override
	public List<Book> findAvailableBooks() {
		return entityManager.createQuery("SELECT DISTINCT book FROM Book book JOIN fetch "
				+ "book.author author JOIN fetch book.genre genre JOIN fetch "
				+ "book.exemplars e WHERE e.isAvaliable = :isAvaliable", Book.class)
				.setParameter("isAvaliable", true).getResultList();
	}
	
	@Override
	 public List<Book> findBooksByNameLike(String name) {
	   return entityManager.createQuery("SELECT book FROM Book book JOIN fetch "
				+ "book.author author JOIN fetch book.genre genre WHERE "
				+ "book.name LIKE CONCAT(:name,'%')", Book.class)
				.setParameter("name", name)
				.getResultList();
	  }
	
	@Override
	 public List<Book> findBooksByAuthorLastName(String lastName) {
	  return entityManager.createQuery("SELECT book FROM Book book JOIN fetch "
	    + "book.author author JOIN fetch book.genre genre WHERE "
	    + "author.lastName Like  CONCAT (:lastName,'%')", Book.class)
	    .setParameter("lastName", lastName).getResultList();
	 }

}
