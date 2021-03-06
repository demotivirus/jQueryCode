package web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import web.dao.Book;
import web.dao.ServiceResponse;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    private List<Book> bookStore = new ArrayList<Book>();

    @GetMapping("/getBooks")
    public ResponseEntity<Object> getAllBooks(){
        ServiceResponse<List<Book>> response = new ServiceResponse<>("success", bookStore);
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }

    @PostMapping("/saveBook")
    public ResponseEntity<Object> addBook(@RequestBody Book book){
        bookStore.add(book);
        ServiceResponse<Book> response = new ServiceResponse<Book>("success", book);
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }

    @GetMapping("/book_home")
    public String bookHome(){
        return "ajax/book_home";
    }
}
