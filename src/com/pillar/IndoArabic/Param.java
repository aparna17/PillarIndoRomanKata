package com.pillar.IndoArabic;

import java.util.ArrayList;
import java.util.List;


public class Param {
	private int arabic;
	private String roman;
	
	public Param(){
		
	}
	
	
	public Param(int arabic, String roman) {
		this.arabic = arabic;
		this.roman = roman;
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

}
