package iterator.item;

import java.util.ArrayList;
import java.util.Iterator;

import iterator.Aggregate;

public class ItemBag implements Aggregate{
	
	private ArrayList<Item> items;
	private int last = 0;
	
	public ItemBag() {
		items = new ArrayList<Item>();
	}
	
	public void appendItem(Item item) {
		items.add(item);
		last++;
	}
	
	public Item getItemAt(int index) {
		return items.get(index);
	}
	
	public int getLength() {
		return last;
	}

	@Override
	public Iterator<Object> iterator() {
		return new ItemBagIterator(this);
	}

}
