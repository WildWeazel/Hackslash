package org.hackslash.gameclient.data.utility;

import com.google.common.collect.ComparisonChain;
import com.google.common.primitives.UnsignedInteger;

/**
 * Utility class for managing an unsigned integer with a custom max value, such as for HP.
 * If the value is set higher than the declared maximum, it will default to the maximum.
 */
public class CappedValue implements Cloneable, Comparable<CappedValue> {

	private UnsignedInteger current;
	private final UnsignedInteger max;

	/**
	 * Constructor.
	 * @param myMax Maximum allowed value
	 */
	public CappedValue(int myMax) {
		max = UnsignedInteger.asUnsigned(myMax);
		current = max;
	}

	/**
	 * Constructor.
	 * @param myMax Maximum allowed value
	 * @param myCurrent Current value, will be capped to myMax
	 */
	public CappedValue(int myMax, int myCurrent) {
		max = UnsignedInteger.asUnsigned(myMax);
		set(myCurrent);
	}

	/**
	 * Copy constructor
	 * @param o CappedValue to copy
	 */
	public CappedValue(CappedValue o) {
		this.max = UnsignedInteger.asUnsigned(o.max.intValue());
		set(o.get());
	}

	/**
	 * @return Maximum allowed value
	 */
	public int max() {
		return max.intValue();
	}

	/**
	 * @return Current value
	 */
	public int get() {
		return current.intValue();
	}

	/**
	 * Sets the value, capped at the declared maximum.
	 * @param value New value
	 */
	public void set(int value) {
		UnsignedInteger temp = UnsignedInteger.asUnsigned(value);
		if(max.compareTo(temp) < 0) {
			current = max;
		} else {
			current = temp;
		}
	}

	@Override
	public CappedValue clone() {
		return new CappedValue(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((max == null) ? 0 : max.hashCode());
		result = prime * result + ((current == null) ? 0 : current.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof CappedValue)) {
			return false;
		}
		CappedValue other = (CappedValue) obj;
		if (max == null) {
			if (other.max != null) {
				return false;
			}
		} else if (!max.equals(other.max)) {
			return false;
		}
		if (current == null) {
			if (other.current != null) {
				return false;
			}
		} else if (!current.equals(other.current)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return current.intValue() + "/" + max.intValue();
	}

	@Override
	public int compareTo(CappedValue o) {
		return ComparisonChain.start().compare(max, o.max).compare(current, o.current).result();
	}

}
