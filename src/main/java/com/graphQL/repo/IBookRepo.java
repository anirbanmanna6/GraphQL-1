package com.graphQL.repo;

import com.graphQL.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends CrudRepository<Book, Integer> {
}
