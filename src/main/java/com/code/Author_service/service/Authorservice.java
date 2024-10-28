package com.code.Author_service.service;

import com.code.Author_service.client.Book;
import com.code.Author_service.client.FullResponse;
import com.code.Author_service.feign.BookClient;
import com.code.Author_service.model.Author;
import com.code.Author_service.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Authorservice {

    @Autowired
    private AuthorRepo authorRepo;

    @Autowired
    private BookClient client;

    public Author addAuthor(Author author)
    {
        return authorRepo.save(author);
    }

    public List<Author> getAllAuthors()
    {
        return authorRepo.findAll();
    }

    public Optional<Author> getAuthorById(String id)
    {
        return authorRepo.findByAuthorId(id);
    }
    public String deleteAuthorById(String id)
    {
         Optional<Author> author = authorRepo.findByAuthorId(id);
         if(author.isPresent())
         {
             authorRepo.deleteById(id);
             return "Author deleted";
         }
         return "Author is not found";
    }

    public FullResponse getAuthorsWithBooks(String id)
    {
        Author author = authorRepo.findByAuthorId(id).orElse(null);
        List<Book> books = client.getBooksByAuthorId(id);

        FullResponse response = new FullResponse();
        response.setAuthorId(id);
        response.setAuthorName(author.getAuthorName());
        response.setBooks(books);
        return response;
    }
}
