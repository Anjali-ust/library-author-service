package com.code.Author_service.controller;

import com.code.Author_service.client.FullResponse;
import com.code.Author_service.model.Author;
import com.code.Author_service.service.Authorservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/library/author")
public class Authorcontroller {
    @Autowired
    private Authorservice authorService;

    @PostMapping("/addAuthor")
    public ResponseEntity<Author> addBook(@RequestBody Author author)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(authorService.addAuthor(author));
    }

    @GetMapping("/getAllAuthors")
    public ResponseEntity<List<Author>> getAllAuthors(){
        return ResponseEntity.status(HttpStatus.OK).body(authorService.getAllAuthors());
    }

    @GetMapping("/getAuthorById/{id}")
    public ResponseEntity<Optional<Author>> getBookById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(authorService.getAuthorById(id));
    }

    @DeleteMapping("/deleteAuthorById/{id}")
    public ResponseEntity<String> deleteAuthorById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(authorService.deleteAuthorById(id));
    }

    @GetMapping("/getAuthorsWithBooks/{id}")
    public ResponseEntity<FullResponse> getAuthorsWithBooks(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(authorService.getAuthorsWithBooks(id));
    }
    
}
