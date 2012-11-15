package org.hackslash.gameclient.data.stats;

public class Skill implements IStatistic, Cloneable {
	
	public int Level;
	
	public Skill() {
		Level = 0;
	}
	
	protected Skill(Skill o) {
		this.Level = o.Level;
	}
	
	public Skill clone() {
		return new Skill(this);
	}

}
