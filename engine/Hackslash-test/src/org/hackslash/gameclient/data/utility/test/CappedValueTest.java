package org.hackslash.gameclient.data.utility.test;

import static org.junit.Assert.*;

import org.hackslash.gameclient.data.utility.CappedValue;
import org.junit.Test;

public class CappedValueTest {

	@Test
	public void testValues() {
		int max = 20;
		CappedValue val = new CappedValue(max);
		assertTrue(val.max() == max);
		assertTrue(val.get() == max);
		int i = 10;
		val.set(i);
		assertTrue(val.get() == i);
		assertTrue(val.max() == max);
		i = 30;
		val.set(i);
		assertTrue(val.get() == val.max());
		i = -1;
		val.set(i);
		assertTrue(val.get() == val.max());
	}

	@Test
	public void testObject() {
		CappedValue val = new CappedValue(20, 10);
		CappedValue copy = val.clone();
		assertTrue(copy.equals(val));
		assertTrue(copy != val);
		assertTrue(val.hashCode() == copy.hashCode());
		assertTrue(val.toString().equals("10/20"));
		copy.set(18);
		assertTrue(copy.compareTo(val) > 0);
		assertTrue(!copy.equals(val));
		assertTrue(val.hashCode() != copy.hashCode());
	}

}
