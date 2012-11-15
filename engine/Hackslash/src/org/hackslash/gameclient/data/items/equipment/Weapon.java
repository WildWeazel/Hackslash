package org.hackslash.gameclient.data.items.equipment;

import org.hackslash.gameclient.data.items.IHealth;

public interface Weapon extends IEquippable, IHealth {
	
	public enum WeaponClass {
		WEAPON_CLASS_BLUNT,
		WEAPON_CLASS_KNIFE,
		WEAPON_CLASS_SWORD,
		WEAPON_CLASS_POLEARM,
		WEAPON_CLASS_RANGED
	}
	
	public WeaponClass getWeaponClass();

}
