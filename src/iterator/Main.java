package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import iterator.book.Book;
import iterator.book.BookShelf;
import iterator.item.Item;

public class Main {
	public static void main(String[] args) {
		
		//BookクラスとBookShelfクラスに依存
		BookShelf bookShelf = new BookShelf();
		
		bookShelf.appendBook(new Book("Java 逆引きレシピ"));
		bookShelf.appendBook(new Book("UMLモデリング入門"));
		bookShelf.appendBook(new Book("UMLモデリングレッスン"));
		bookShelf.appendBook(new Book("iPhoneアプリ開発集中講座"));
		bookShelf.appendBook(new Book("オブジェクト指向UIデザイン"));
		bookShelf.appendBook(new Book("良いコードを書く技術"));
		
		Iterator<Object> it1 = bookShelf.iterator();
		
		while(it1.hasNext()) {
			Book book = (Book)it1.next();
			System.out.println(book.getName());
		}
		
		//ArrayListを使い、Itemクラスにのみ依存。Listクラスのiterator()を使っている。
		List<Item> itemBag = new ArrayList<>();
		
		itemBag.add(new Item("ダイアモンド"));
		itemBag.add(new Item("鉄鉱石"));
		itemBag.add(new Item("石炭"));
		itemBag.add(new Item("卵"));
		itemBag.add(new Item("ツルハシ"));
		itemBag.add(new Item("エンダーアイ"));
		itemBag.add(new Item("土"));
		
		Iterator<Item> it2 = itemBag.iterator();
		
		while(it2.hasNext()) {
			Item item = it2.next();
			System.out.println(item.getName());
		}
	}
}
