package com.Student.Library.Management.System.controller;

import com.Student.Library.Management.System.Model.Books;
import com.Student.Library.Management.System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Books")
public class BooksController {

    @Autowired
    BookService bookService;

@GetMapping("getAllBooks")
    public List<Books> getAllDetails(){
    return bookService.getBookDetails();
}

@GetMapping("getBybookId/{bookId}")
public Books getBy_BookId(@PathVariable int bookId) {
    return bookService.getBy_BookId(bookId);
}

@PostMapping("addBook")
    public String addBook(@RequestBody Books newBook){
    bookService.addBook(newBook);
    return "new Book added with Id:"+newBook.getBookId();
}

@PutMapping("updateBook/{bookId}")
public String bookUpdated(@PathVariable int bookId,@RequestBody Books newData){
    bookService.updateBook(bookId,newData);
    return "Book has updated having id :"+bookId;
}

@DeleteMapping("DeleteBook/{bookId}")
    public String remove_book(@PathVariable int bookId){
    bookService.remove_Book(bookId);
    return "book has removed with id :"+bookId;
}
}
