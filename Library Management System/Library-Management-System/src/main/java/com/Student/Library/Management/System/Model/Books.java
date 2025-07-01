package com.Student.Library.Management.System.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class Books {
    @Id
    private int bookId;
    private String title;
    private String author;
    private String isbn;
    private Date pub_date;
    public void setBookId(int bookId){
        this.bookId=bookId;
    }
    public void setTitle(String title) {

        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPub_date(Date pub_date) {

        this.pub_date = pub_date;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Date getPub_date() {
        return pub_date;
    }
}
