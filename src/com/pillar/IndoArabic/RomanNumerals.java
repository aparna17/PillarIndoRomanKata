package com.pillar.IndoArabic;

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {
	
	private int arabic;
	private String roman;
	
	public RomanNumerals(){
		
	}
	
	public RomanNumerals(int arabic) {
		this.arabic = arabic;
		indoToRoman();
	}
	public RomanNumerals(String roman) {
		this.roman = roman;
		romanToIndo();
	}
	public int getArabic() {
		return arabic;
	}
	public void setArabic(int arabic) {
		this.arabic = arabic;
	}
	public String getRoman() {
		return roman;
	}
	public void setRoman(String roman) {
		this.roman = roman;
	}
	

	public static final List<Param> REFERENCE_TABLE = new ArrayList<>();
	
	static{
		REFERENCE_TABLE.add(new Param(1000,"M"));
		REFERENCE_TABLE.add(new Param(900,"CM"));
		REFERENCE_TABLE.add(new Param(500,"D"));
		REFERENCE_TABLE.add(new Param(400,"CD"));
		REFERENCE_TABLE.add(new Param(100,"C"));
		REFERENCE_TABLE.add(new Param(90,"XC"));
		REFERENCE_TABLE.add(new Param(50,"L"));
		REFERENCE_TABLE.add(new Param(40,"XL"));
		REFERENCE_TABLE.add(new Param(10,"X"));
		REFERENCE_TABLE.add(new Param(9,"IX"));
		REFERENCE_TABLE.add(new Param(5,"V"));
		REFERENCE_TABLE.add(new Param(4,"IV"));
		REFERENCE_TABLE.add(new Param(1,"I"));	
	}
	
	
	
	public String indoToRoman()
	{
		
	
		String roman="";
	
		for(Param arp:REFERENCE_TABLE){
			while( arabic >=arp.getArabic()){
				roman += arp.getRoman();
				arabic-= arp.getArabic();
				
			}
		}
	setRoman(roman);
	return roman;
	}
	
	public int romanToIndo(){
	int arabic =0;

	for(Param arp:REFERENCE_TABLE){
		
		while (roman.startsWith(arp.getRoman())){
			arabic += arp.getArabic();
			roman = roman.substring(arp.getRoman().length());
		}
	}
	setArabic(arabic);
	return arabic;
	
}
	
}
