package book.controller;

import book.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class BookController {

    @GetMapping(value = "/")
    public String welcomePage() {
        return "Welcome";
    }

    @GetMapping(value = "/books")
    public List<Book> books() {
        return Collections.emptyList();
    }
}
