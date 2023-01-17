package com.graphQL.serviceImpl;

import com.graphQL.DTO.BookDTO;
import com.graphQL.entity.Book;
import com.graphQL.repo.IBookRepo;
import com.graphQL.service.GraphqlService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class GraphqlServiceImpl implements GraphqlService {

    @Autowired
    private IBookRepo bookRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public BookDTO create(Book book) {
        Book createdBook = bookRepo.save(book);
        BookDTO bookDTO = new BookDTO(createdBook.getId(), createdBook.getTitle(), createdBook.getDescription(), createdBook.getAuthor(), createdBook.getPrice(), createdBook.getPages());
        return bookDTO;
    }

    @Override
    public List<BookDTO> getAllBooks() {
       List<Book> bookList = (List<Book>) bookRepo.findAll();
        List<BookDTO> bookDTOList = Arrays.asList(modelMapper.map(bookList, BookDTO[].class));  // map method for LIST
        return bookDTOList;
    }
    public BookDTO getBook(int id)
    {
        Book book = bookRepo.findById(id).get();
        BookDTO bookDTO = null;
        if(Objects.nonNull(book))
        {
            bookDTO = modelMapper.map(book, BookDTO.class);
        }
        return bookDTO;
    }
}
