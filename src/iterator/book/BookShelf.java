package iterator.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import iterator.Aggregate;

public class BookShelf implements Aggregate{
	
	private List<Book> books;
	private int last = 0;
	
	public BookShelf() {
		this.books = new ArrayList<Book>();
	}
	
	public Book getBookAt(int index) {
		return books.get(index);
	}
	
	public void appendBook(Book book) {
		this.books.add(book);
		last++;
	}
	
	public int getLength() {
		return last;
	}

	@Override
	public Iterator<Object> iterator() {
		return new BookShelfIterator(this);
	}
	
}
