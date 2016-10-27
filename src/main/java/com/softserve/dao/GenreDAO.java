package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Genre;

/**
 * Establish contract for Genre class CRUD operations.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 */
public interface GenreDAO extends GenericDAO<Genre, Integer>{

	/**
	 * Sort genres by alphabet
	 * 
	 * @return list genres
	 */
	List<Genre> getListSortByAlh();
}
