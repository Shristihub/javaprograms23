package com.bookapp.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

@Service // emphasize that this calss is a service layer
public class BookServiceImpl  implements IBookService{
	
	@Autowired
	private BookDetails bookDetails;
	
	@Override
	public List<Book> getAll() {
		
		return bookDetails.showBooks();
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		return bookDetails.showBooks()
		.stream()
		.filter(book-> book.getBookId()==bookId)
		.findFirst()
		.orElseThrow(()->new BookNotFoundException("invalid id"));
		 
	}

	@Override
	public List<Book> getByCategory(String category) {
		List<Book> books = bookDetails.showBooks()
				.stream()
				.filter(book->book.getCategory().equals(category))
				.sorted(Comparator.comparing(Book::getTitle))
				.collect(Collectors.toList());
		if(books.isEmpty())
			throw new BookNotFoundException("book not found");
		return books;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) {
		List<Book> books = bookDetails.showBooks()
				.stream()
				.filter(book->book.getPrice()<price)
				.sorted(Comparator.comparing(Book::getTitle))
				.collect(Collectors.toList());
		if(books.isEmpty())
			throw new BookNotFoundException("book not found");
		return books;
	}

	@Override
	public List<Book> getByTitleContaining(String title) throws BookNotFoundException {
		List<Book> books = bookDetails.showBooks()
				.stream()
				.filter(book->book.getTitle().contains(title))
				.sorted(Comparator.comparing(Book::getTitle))
				.collect(Collectors.toList());
		if(books.isEmpty())
			throw new BookNotFoundException("book not found");
		return books;
	}

	@Override
	public List<Book> getByAuthorStarting(String author) {
		List<Book> books = bookDetails.showBooks()
				.stream()
				.filter(book->book.getAuthor().startsWith(author))
				.sorted(Comparator.comparing(Book::getTitle))
				.collect(Collectors.toList());
		if(books.isEmpty())
			throw new BookNotFoundException("book not found");
		return books;
	}

}
