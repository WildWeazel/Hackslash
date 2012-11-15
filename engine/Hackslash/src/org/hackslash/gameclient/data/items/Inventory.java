package org.hackslash.gameclient.data.items;

import java.util.Collection;

public class Inventory {

	public class InventoryException extends Exception {

		private static final long serialVersionUID = 220739121875851448L;

		public InventoryException(String msg) {
			super(msg);
		}

	}

	private int mCapacity;

	private Collection<IInventoryItem> mContents;

	public Inventory(int myCapacity) {
		mCapacity = myCapacity;
	}

	public int getCapacity() {
		return mCapacity;
	}

	public void setCapacity(int newCapacity) {
		mCapacity = newCapacity;
	}

	public int getEncumbrance() {
		int encumbrance = 0;
		for(IInventoryItem item : mContents) {
			encumbrance += item.getSize();
		}
		return encumbrance;
	}

	public int add(IInventoryItem item) throws InventoryException {
		if( getEncumbrance() + item.getSize() > mCapacity ) {
			throw new InventoryException("Inventory is full.");
		}
		mContents.add(item);
		return getEncumbrance();
	}

	public boolean remove(IInventoryItem item) {
		return mContents.remove(item);
	}

}
