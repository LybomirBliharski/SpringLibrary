/**
 * 
 * This is a simple web application utilizing Spring MVC and Hibernate.
 * Developed by Lv-205 group of Softserve Academy.
 * 
 * Copyright (c) 1993-2016 Softserve, Inc.
 * This software is the confidential and proprietary information of Softserve.
 */
package com.softserve.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity class, represents book's exempliar.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 */
@Entity
@Table(name="exempliars")
public class Exempliar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private boolean isAvaliable;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Book book;
	
	@OneToMany(mappedBy = "exempliar")
	private List<Order> orders;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public boolean isAvaliable() {
		return isAvaliable;
	}

	public void setAvaliable(boolean isAvaliable) {
		this.isAvaliable = isAvaliable;
	}

	@Override
	public String toString() {
		return "Exemplar [id=" + id + ", isAvaliable=" + isAvaliable + ", book=" + book.getName() + "]";
	}

}