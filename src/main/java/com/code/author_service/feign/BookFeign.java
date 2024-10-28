package com.code.author_service.feign;

import com.code.author_service.response.BookResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "book-service",url = "http://book-service-container:9090/library/book")
public interface BookFeign {

    @GetMapping("/getBookByAuthorId/{authorId}")
    List<BookResponse> getBookByAuthorId(@PathVariable("authorId") String authorId);
}
