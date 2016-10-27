package com.softserve.service;

import java.util.List;

import com.softserve.entity.Genre;

/**
 * 
 * Genre service.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 *
 */
public interface GenreService {

	/**
     * Makes given Genre instance persistent.
     * @param genre instance to be persisted
     */
	void save(Genre Genre);

	/**
     * Updates given Genre instance.
     * @param genre instance to be updated
     * @return updated instance
     */
	Genre update(Genre Genre);

	/**
     * Deletes given instance.
     * @param genre instance to be deleted
     */
	void delete(Genre Genre);

	/**
	 * Find genre by id
	 * @param id genre's id
	 * @return genre instance
	 */
	Genre findById(Integer id);

	/**
	 * Find all genres
	 * @return list genres
	 */
	List<Genre> findAll();
	
	/**
	 * Sort genres by alphabet
	 * 
	 * @return list genres
	 */
	List<Genre> getListSortByAlh();
	
}
