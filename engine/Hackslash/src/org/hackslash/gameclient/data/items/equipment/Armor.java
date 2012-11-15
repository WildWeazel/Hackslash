package org.hackslash.gameclient.data.items.equipment;

import org.hackslash.gameclient.data.items.IHealth;
import org.hackslash.gameclient.data.utility.CappedValue;

public abstract class Armor implements IEquippable, IHealth {
	
	protected String mName;
	
	public final ArmorClass Class = null;
	
	public final int Protection = 0;
	
	public final int Size = 0;
	
	protected CappedValue mDurability;

	public enum ArmorClass {
		ARMOR_CLASS_LIGHT,
		ARMOR_CLASS_MEDIUM,
		ARMOR_CLASS_HEAVY
	}
	
	public abstract ArmorClass getArmorClass();
}
