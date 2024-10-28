package com.code.Author_service.feign;

import com.code.Author_service.client.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="Book-service", url="http://Book-service-container:9090/library/book")
public interface BookClient {

    @GetMapping("/getBooksByAuthorId/{authorId}")
    public List<Book> getBooksByAuthorId(@PathVariable("authorId") String authorId);
}
