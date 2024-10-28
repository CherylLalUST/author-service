package com.code.author_service.response;

public class BookResponse {

    private String bookId;
    private String bookTitle;
    private String bookPrice;
    private String bookPublishedDate;
    private String bookImageUrl;
    private String bookAuthorId;

    public BookResponse() {
    }

    public BookResponse(String bookId, String bookTitle, String bookPrice, String bookPublishedDate, String bookImageUrl, String bookAuthorId) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.bookPublishedDate = bookPublishedDate;
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

    public String getBookPublishedDate() {
        return bookPublishedDate;
    }

    public void setBookPublishedDate(String bookPublishedDate) {
        this.bookPublishedDate = bookPublishedDate;
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
