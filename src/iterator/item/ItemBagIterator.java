package iterator.item;

import java.util.Iterator;

public class ItemBagIterator implements Iterator<Object>{
	
	private ItemBag itemBag;
	private int index = 0;
	
	public ItemBagIterator(ItemBag itemBag) {
		this.itemBag = itemBag;
	}

	@Override
	public boolean hasNext() {
		if(index < itemBag.getLength()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Object next() {
		Item item = itemBag.getItemAt(index);
		index++;
		return item;
	}
	
}
