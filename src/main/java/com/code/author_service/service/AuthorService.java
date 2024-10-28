package com.code.author_service.service;

import com.code.author_service.feign.BookFeign;
import com.code.author_service.model.Author;
import com.code.author_service.repo.AuthorRepo;
import com.code.author_service.response.BookResponse;
import com.code.author_service.response.FullResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    @Autowired
    private BookFeign bookFeign;

    public FullResponse getBooksByAuthorId(String authorId){
        Author author = authorRepo.findByAuthorId(authorId).orElse(null);
        List<BookResponse> books = bookFeign.getBookByAuthorId(authorId);
        if(author != null){
            FullResponse fullResponse = new FullResponse();
            fullResponse.setAuthorId(author.getAuthorId());
            fullResponse.setAuthorName(author.getAuthorName());
            fullResponse.setBooks(books);
            return fullResponse;
        }
        return null;
    }

    public Author addAuthor(Author author){
        return authorRepo.save(author);
    }

    public List<Author> getAllAuthors(){
        return authorRepo.findAll();
    }

    public Optional<Author> getAuthorById(String authorId){
        return authorRepo.findByAuthorId(authorId);
    }

    public Author deleteAuthorById(String authorId){
        Optional<Author> author = authorRepo.findById(authorId);
        if(author.isPresent()){
            authorRepo.deleteById(authorId);
            return author.get();
        }
        return null;
    }
}
