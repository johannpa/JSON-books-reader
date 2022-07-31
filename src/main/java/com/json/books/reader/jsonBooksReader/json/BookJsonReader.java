package com.json.books.reader.jsonBooksReader.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class BookJsonReader {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File bookJsonfile = new File("src/main/resources/book.json");
        Book book = objectMapper.readValue(bookJsonfile, Book.class);

        // System.out.println(book);
        // System.out.println("Book title:" + book.getTitle());

        File booksJsonfile = new File("src/main/resources/books.json");

        Book[] books = objectMapper.readValue(booksJsonfile, Book[].class);

        System.out.println(Arrays.asList(books));
    }

}
