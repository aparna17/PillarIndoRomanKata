
package com.pillar.IndoArabic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IndoRomanTest {
	 
	
	@Test
	public void indoToRomanTest(){
		
		RomanNumerals rn = new RomanNumerals(1);
		RomanNumerals rn1 = new RomanNumerals(4);
		RomanNumerals rn2 = new RomanNumerals(9);
		RomanNumerals rn3 = new RomanNumerals(1989);
		
		assertEquals("I", rn.getRoman());
		assertEquals("IV", rn1.getRoman());
		assertEquals("IX", rn2.getRoman());
		assertEquals("MCMLXXXIX", rn3.getRoman());
		
	}
	@Test
	public void romanToIndoTest(){
		RomanNumerals rn = new RomanNumerals("I");
		RomanNumerals rn1 = new RomanNumerals("IV");
		RomanNumerals rn2 = new RomanNumerals("IX");
		RomanNumerals rn3 = new RomanNumerals("MCMLXXXIX");
		
		assertEquals(1,rn.getArabic());
		assertEquals(4, rn1.getArabic());
		assertEquals(9, rn2.getArabic());
		assertEquals(1989, rn3.getArabic());
	}
}
