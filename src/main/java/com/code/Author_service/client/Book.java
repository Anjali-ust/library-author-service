package com.code.Author_service.client;

public class Book {
    private String bookId;
    private String bookTitle;
    private String bookPrice;
    private String bookPublished;
    private String bookImageUrl;
    private String bookAuthorId;

    public Book() {
    }

    public Book(String bookId, String bookTitle, String bookPrice, String bookPublished, String bookImageUrl, String bookAuthorId) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.bookPublished = bookPublished;
        this.bookImageUrl = bookImageUrl;
        this.bookAuthorId = bookAuthorId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPublished() {
        return bookPublished;
    }

    public void setBookPublished(String bookPublished) {
        this.bookPublished = bookPublished;
    }

    public String getBookImageUrl() {
        return bookImageUrl;
    }

    public void setBookImageUrl(String bookImageUrl) {
        this.bookImageUrl = bookImageUrl;
    }

    public String getBookAuthorId() {
        return bookAuthorId;
    }

    public void setBookAuthorId(String bookAuthorId) {
        this.bookAuthorId = bookAuthorId;
    }
}
