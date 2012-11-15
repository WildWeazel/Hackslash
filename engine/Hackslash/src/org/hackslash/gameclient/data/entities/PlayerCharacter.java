package org.hackslash.gameclient.data.entities;

import java.util.Set;

import org.hackslash.gameclient.data.items.Inventory;
import org.hackslash.gameclient.data.stats.Attribute;
import org.hackslash.gameclient.data.stats.CharacterClass;

public class PlayerCharacter implements ICharacter {
	
	private final CharacterClass mClass;
	
	private final String mName;
	
	private int mExperience;
	
	private int mLevel;
	
	private Set<Attribute> mAttributes;
	
	private Inventory mInventory;
	
	public PlayerCharacter(CharacterClass myClass, String myName) {
		mClass = myClass;
		mName = myName;
		mExperience = 0;
		mLevel = 1;
		mAttributes = null;
		mInventory = new Inventory(0);
	}

}
