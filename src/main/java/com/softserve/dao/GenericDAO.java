package com.softserve.dao;

import java.util.List;

/**
 * Generic DAO interface
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 */
public interface GenericDAO<T, ID> {

	/**
	 * Persists given entity of type T.
     * 
     * @param entity instance of type T to be persisted.
	 */
	void save(T entity);
	
	/**
	 * Updates given instance of type T.
	 * 
	 * @param entity instance to be updated.
	 * @return persisted entity.
	 */
	T update(T entity);
	
	/**
	 * Deletes given entity of type T.
	 * 
	 * @param entity to be deleted.
	 */
	void delete(T entity);
	
	/**
	 * Finds object by its id.
     * @param id object's id
     * @return instance of type T
	 */
	T findById(ID id);
	
	/**
	 * 
	 * @return all instances of given type T.
	 */
	List<T> findAll();
	
}
