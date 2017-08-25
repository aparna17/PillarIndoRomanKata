package com.pillar.IndoArabic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pillar.IndoArabic.Param;

@WebServlet(urlPatterns="/ArabicConvertion")
public class ArabicConvertion extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.getRequestDispatcher("/WEB-INF/IndoArabicPage.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int arabic= Integer.parseInt(request.getParameter("arabic"));
		//boolean validArabic = arabic.matches("[0-9]");
		/*if(arabic<=0){
			request.setAttribute("errorMessage",  "Please enter a valid number");
			request.getRequestDispatcher("/WEB-INF/IndoArabicPage.jsp").forward(request, response);
		}*/
	
	
		RomanNumerals rn = new RomanNumerals(arabic);
		request.setAttribute("arabic", arabic);
        request.setAttribute("roman", rn.getRoman());
		
		request.getRequestDispatcher("/WEB-INF/IndoArabicPage.jsp").forward(request, response);
	
	}
}
