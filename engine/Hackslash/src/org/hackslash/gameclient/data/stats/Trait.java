package org.hackslash.gameclient.data.stats;

import java.util.LinkedHashSet;
import java.util.Set;

public class Trait implements IStatistic, Cloneable {

	public int Level;
	
	public final Set<Skill> Skills;
	
	public Trait() {
		Level = 0;
		Skills = new LinkedHashSet<Skill>();
	}

	protected Trait(Trait o) {
		this.Level = o.Level;
		this.Skills = new LinkedHashSet<Skill>(o.Skills);
	}
	
	@Override
	public Trait clone() {
		return new Trait(this);
	}
	
}
