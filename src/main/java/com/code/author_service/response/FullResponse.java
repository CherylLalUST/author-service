package com.code.author_service.response;

import java.util.List;

public class FullResponse {

    private String authorId;
    private String authorName;
    private List<BookResponse> books;

    public FullResponse() {
    }

    public FullResponse(String authorId, String authorName, List<BookResponse> books) {
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

    public List<BookResponse> getBooks() {
        return books;
    }

    public void setBooks(List<BookResponse> books) {
        this.books = books;
    }
}
