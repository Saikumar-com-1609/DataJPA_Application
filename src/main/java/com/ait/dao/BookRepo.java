package com.ait.dao;


import org.springframework.data.repository.CrudRepository;

import com.ait.entity.Book;



public interface BookRepo extends CrudRepository<Book, Integer>{
	
	

}
