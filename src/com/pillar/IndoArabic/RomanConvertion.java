package com.pillar.IndoArabic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RomanConvertion")
public class RomanConvertion extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
		 String roman = (request.getParameter("roman")).toUpperCase();
		 Boolean validRoman = roman.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
	if(!validRoman) {
		request.setAttribute("errormessage2", "Please enter a valid roman number");
		request.getRequestDispatcher("/WEB-INF/IndoArabicPage.jsp").forward(request, response);
	}
	if (roman==""){
		request.setAttribute("errormessage3", "Please enter a roman number");
		request.getRequestDispatcher("/WEB-INF/IndoArabicPage.jsp").forward(request, response);
	}
	else {
		
	
	
		 RomanNumerals rn = new RomanNumerals(roman);
		 request.setAttribute("roman", roman);
		request.setAttribute("arabic", rn.getArabic());
		
		request.getRequestDispatcher("/WEB-INF/IndoArabicPage.jsp").forward(request, response);
	
	}	

	}
}
