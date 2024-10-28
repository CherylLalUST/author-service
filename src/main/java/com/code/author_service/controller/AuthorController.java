package com.code.author_service.controller;

import com.code.author_service.model.Author;
import com.code.author_service.response.FullResponse;
import com.code.author_service.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/addAuthor")
    public ResponseEntity<Author> addAuthor(@RequestBody Author author){
        return ResponseEntity.status(HttpStatus.CREATED).body(authorService.addAuthor(author));
    }

    @GetMapping("/getAllAuthors")
    public ResponseEntity<List<Author>> getAllAuthors(){
        List<Author> authors = authorService.getAllAuthors();
        return ResponseEntity.status(HttpStatus.OK).body(authors);
    }

    @GetMapping("/getBooksByAuthorId/{authorId}")
    public ResponseEntity<FullResponse> getBooksByAuthorId(@PathVariable String authorId){
        FullResponse fullResponses = authorService.getBooksByAuthorId(authorId);
        if(fullResponses != null){
            return ResponseEntity.status(HttpStatus.OK).body(fullResponses);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping("/getAuthorById/{authorId}")
    public ResponseEntity<Author> getAuthorById(@PathVariable String authorId){
        Author author = authorService.getAuthorById(authorId).orElse(null);
        if(author != null){
            return ResponseEntity.status(HttpStatus.OK).body(author);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/deleteAuthorById/{authorId}")
    public ResponseEntity<Author> deleteAuthorById(@PathVariable String authorId){
        Author author = authorService.deleteAuthorById(authorId);
        if(author != null){
            return ResponseEntity.status(HttpStatus.OK).body(author);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
