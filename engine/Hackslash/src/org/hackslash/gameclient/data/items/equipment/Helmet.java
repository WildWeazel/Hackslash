package org.hackslash.gameclient.data.items.equipment;

import org.hackslash.gameclient.data.entities.PlayerCharacter;
import org.hackslash.gameclient.data.items.IInventoryItem;
import org.hackslash.gameclient.data.utility.CappedValue;

public class Helmet extends Armor {
	
	private String mName;
	
	private ArmorClass mClass;
	
	private int mProtection;
	
	private int mSize;
	
	private CappedValue mDurability;
	
	public Helmet(String myName, ArmorClass myClass, int myProtection, int mySize, CappedValue myDurability) {
		mName = myName;
		mClass = myClass;
		mProtection = myProtection;
		mSize = mySize;
		mDurability = myDurability;
	}

	@Override
	public boolean canEquip(PlayerCharacter character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] getRequirements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize() {
		return mSize;
	}

	@Override
	public int compareTo(IInventoryItem o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArmorClass getArmorClass() {
		return mClass;
	}

	@Override
	public CappedValue getHealth() {
		return mDurability;
	}

}
