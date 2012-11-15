package org.hackslash.gameclient.data.utility;

import com.google.common.primitives.UnsignedInteger;

public class CappedValue {
	
	private UnsignedInteger current;
	public final UnsignedInteger Max;
	
	
	public CappedValue(int myMax) {
		Max = UnsignedInteger.asUnsigned(myMax);
		current = Max;
	}
	
	public int get() {
		return current.intValue();
	}
	
	public void set(int value) {
		UnsignedInteger temp = UnsignedInteger.asUnsigned(value);
		if(Max.compareTo(temp) < 0) {
			current = Max;
		} else {
			current = temp;			
		}
	}

}
