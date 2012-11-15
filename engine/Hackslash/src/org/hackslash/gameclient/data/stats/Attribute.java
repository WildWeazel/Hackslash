package org.hackslash.gameclient.data.stats;


import java.util.LinkedHashSet;
import java.util.Set;

public class Attribute implements IStatistic, Cloneable {
	
	public int Level;
	
	public final Set<Trait> Traits;
	
	public Attribute() {
		Level = 0;
		Traits = new LinkedHashSet<Trait>();
	}
	
	protected Attribute(Attribute o) {
		this.Level = o.Level;
		this.Traits = new LinkedHashSet<Trait>(o.Traits);
	}
	
	@Override
	public Attribute clone() {
		return new Attribute(this);
	}

}
