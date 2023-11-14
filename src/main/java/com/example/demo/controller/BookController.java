package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/bookService")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/addBook")
	public String registerBook(@RequestBody Book book) {
		String result =	bookService.addBook(book);
		return result;
	}
	
	@DeleteMapping("/deleteBook")
	public String removeBook(@RequestBody Book book) {
		String result = bookService.deleteBook(book);
		return result;
	}
	
	@GetMapping("/getAll")
	public List<Book> getAllBooks() {
		List<Book> books = bookService.getAllBooks();
		return books;
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public String removeBookById(@PathVariable int id) {
		String result = bookService.deletedBookById(id);
		return result;
	}
}
