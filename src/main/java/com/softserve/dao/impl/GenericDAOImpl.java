package com.softserve.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.GenericDAO;

/**
 * 
 * Abstract class which provide default implementation of CRUD operations.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 25.10.2016
 *
 */
@Repository
@Transactional
public abstract class GenericDAOImpl<T, ID> implements GenericDAO<T, ID>{

	/** EntityManager object */
	@PersistenceContext
	private EntityManager entityManager;
	
	/** entity class */
	private Class<T> clazz;
	
	/**
	 * Constructor
	 * 
	 * @param clazz entity class
	 */
	protected GenericDAOImpl(Class<T> clazz) {
		this.clazz = clazz;
	}

	/**
     * Persists given entity of type T.
     * 
     * @param entity instance of type T to be persisted.
     */
	@Override
	public void save(T entity) {
		entityManager.persist(entity);
	}

	/**Updates given instance of type T.
	 * 
     * @param entity instance to be updated.
     * @return persisted entity.
     */
	@Override
	public T update(T entity) {
		return entityManager.merge(entity);
	}

	/**
     * Deletes given entity of type T.
     * 
     * @param entity to be deleted.
     */
	@Override
	public void delete(T entity) {
		entityManager.remove(entity);
	}

	/**
     * Finds object by its id.
     * 
     * @param id object's id
     * @return instance of type T
     */
	@Override
	public T findById(ID id) {
		return entityManager.find(clazz, id);
	}

	/**
     * @return all instances of given type T.
     */
	@Override
	public List<T> findAll() {
		return entityManager.createQuery("from " + clazz.getSimpleName(), clazz).getResultList();
	}

}