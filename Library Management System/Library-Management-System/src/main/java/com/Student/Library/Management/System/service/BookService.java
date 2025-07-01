package com.Student.Library.Management.System.service;

import com.Student.Library.Management.System.Model.Books;
import com.Student.Library.Management.System.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Books> getBookDetails(){
       List<Books> results= bookRepository.findAll();
       return results;
    }

    public Books getBy_BookId(int bookId){
        Books found=bookRepository.findBybookId(bookId);
        return found;
    }

    public void addBook(Books newBook){
     bookRepository.save(newBook);
    }

    public void updateBook(int bookId,Books newData){
       Books oldBook=bookRepository.findBybookId(bookId);
       oldBook.setTitle(newData.getTitle());
       oldBook.setAuthor(newData.getAuthor());
       bookRepository.save(oldBook);
    }

    public void remove_Book(int bookId){
        bookRepository.deleteById(bookId);
    }
}
