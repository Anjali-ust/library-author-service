package com.code.Author_service.client;

import java.util.List;

public class FullResponse {
    private String authorId;
    private String authorName;
    private List<Book> books;

    public FullResponse() {
    }

    public FullResponse(String authorId, String authorName, List<Book> books) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.books = books;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
