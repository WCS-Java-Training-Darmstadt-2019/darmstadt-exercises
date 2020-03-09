package com.wcs.java.basics.exercises.vars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wcs.java.basics.exercises.vars.Basic3;
import com.wcs.java.basics.exercises.vars.VarsMain;

public class VarsMainTest {
	
	
	@Test
	public void test() {
		
		assertEquals(44, VarsMain.calculateAge(1976));
		
		assertTrue(VarsMain.isOld(31));
		assertFalse(VarsMain.isOld(30));
	}

}
