package com.wcs.java.basics.exercises.vars;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.wcs.java.basics.exercises.vars.VarsMain;

public class VarsMainTest {
	
	
	@Test
	public void test() {
		
		assertEquals(44, VarsMain.calculateAge(1976));
		
		assertTrue(VarsMain.isOld(31));
		assertFalse(VarsMain.isOld(30));
	}

}
