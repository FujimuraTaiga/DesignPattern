package iterator.book;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Object>{
	
	private BookShelf bookShelf;
	private int index = 0;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}
	
	@Override
	public boolean hasNext() {
		
		if(index < bookShelf.getLength()) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public Object next() {
		
		Book book = bookShelf.getBookAt(this.index);
		
		this.index++;
		
		return book;
	}
	
}
