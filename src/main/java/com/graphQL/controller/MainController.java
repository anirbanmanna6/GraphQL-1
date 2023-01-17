package com.graphQL.controller;

import com.graphQL.DTO.BookDTO;
import com.graphQL.entity.Book;
import com.graphQL.input.BookInput;
import com.graphQL.service.GraphqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RestController
//@RequestMapping(value="/book")
public class MainController {

    @Autowired
    private GraphqlService graphqlService;

    //@PostMapping(value="/create")
    @MutationMapping("createBook")
    public BookDTO createBook(@Argument BookInput bookInput)
    {
        Book book = new Book();
        book.setTitle(bookInput.getTitle());
        book.setAuthor(bookInput.getAuthor());
        book.setDescription(bookInput.getDescription());
        book.setPrice(bookInput.getPrice());
        book.setPages(bookInput.getPages());
        BookDTO bookDTO = graphqlService.create(book);
        return bookDTO;
    }

    //@GetMapping(value="/fetch/all")
    @QueryMapping("getAllBooks")  //same name used in schema.graphqls
    public List<BookDTO> getAllBooks()
    {
        return graphqlService.getAllBooks();
    }

    @QueryMapping("getSingleBook")
    public BookDTO getBook(@Argument int bookId)
    {
        return graphqlService.getBook(bookId);
    }


}
