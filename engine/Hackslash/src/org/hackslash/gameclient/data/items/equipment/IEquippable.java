package org.hackslash.gameclient.data.items.equipment;

import org.hackslash.gameclient.data.entities.PlayerCharacter;
import org.hackslash.gameclient.data.items.IInventoryItem;

public interface IEquippable extends IInventoryItem {
	
public boolean canEquip(PlayerCharacter character);
	
	public Object[] getRequirements();

}
