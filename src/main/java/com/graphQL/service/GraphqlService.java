package com.graphQL.service;

import com.graphQL.DTO.BookDTO;
import com.graphQL.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface GraphqlService {

    BookDTO create(Book book);

    List<BookDTO> getAllBooks();

    BookDTO getBook(int id);

}
