package org.hackslash.gameclient.data.stats;

import java.util.Set;

public class CharacterClass {
	
	public final String ClassName;
	
	public final Set<Attribute> BaseAttributes;
	
	public CharacterClass(String myName, Set<Attribute> myAttributes) {
		ClassName = myName;
		BaseAttributes = myAttributes;
	}

}
