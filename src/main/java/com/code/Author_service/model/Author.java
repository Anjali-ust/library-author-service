package com.code.Author_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Author {

    @Id
    private String authorId;
    private String authorName;

    public Author() {
    }

    public Author(String authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
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
}
