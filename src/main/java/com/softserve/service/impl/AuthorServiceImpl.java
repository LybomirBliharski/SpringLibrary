package com.softserve.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.dao.AuthorDAO;
import com.softserve.entity.Author;
import com.softserve.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
	private AuthorDAO authorDAO;

	@Override
	public List<Author> findByFirstName(String firstName) {
		return authorDAO.findByFirstName(firstName);
	}

	@Override
	public List<Author> findByLastName(String lastName) {
		return authorDAO.findByLastName(lastName);
	}

	@Override
	public List<Author> findAll() {
		return authorDAO.findAll();
	}

	@Override
	public void save(Author author) {
		authorDAO.save(author);
	}

	@Override
	public Author update(Author author) {
		return authorDAO.update(author);
	}

	@Override
	public void delete(Author author) {
		authorDAO.delete(author);
	}

	@Override
	public Author findById(Integer id) {
		return authorDAO.findById(id);
	}
}
