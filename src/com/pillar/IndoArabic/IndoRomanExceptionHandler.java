package com.pillar.IndoArabic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/IndoRomanExceptionHandler")
public class IndoRomanExceptionHandler extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processError(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		processError(request, response);
	}


	public void processError(HttpServletRequest request, HttpServletResponse response)throws IOException {
		// TODO Auto-generated method stub
		Exception exception = (Exception)request.getAttribute("javax.servlet.error.exception");
	    Integer statusCode = (Integer)request.getAttribute("javax.servlet.error.status_code");
	    String servletName = (String)request.getAttribute("javax.servlet.error.servlet_name");
	    String requestUri = (String)request.getAttribute("javax.servlet.error.request_uri");
			         
			      if (servletName == null) {
			         servletName = "Unknown";
			      }
			      
			      
			      if (requestUri == null) {
			         requestUri = "Unknown";
			      }

			      // Set response content type
			      response.setContentType("text/html");

			      PrintWriter out = response.getWriter();
			      String title = "Error/Exception Information";
			     // String docType =
			      //   "<!doctype html public \"-//w3c//dtd html 4.0 " +
			       //  "transitional//en\">\n";
			         
			      out.println("<html>\n" +
			         "<head><title>" + title + "</title></head>\n" +
			         "<body bgcolor = \"#f0f0f0\">\n");

			      if (exception == null && statusCode == null) {
			         out.println("<h2>Error information is missing</h2>");
			         out.println("Please return to the <a href=\"" + 
			            response.encodeURL("http://localhost:8080/") + 
			            "\">Home Page</a>.");
			      } else if (statusCode != null) {
			         out.println("The status code : " + statusCode);
			         out.println("<br> <br> Please use the url http://localhost:8080/IndoRomanProject/ArabicConvertion");
			      } else {
			         out.println("<h2>Error information</h2>");
			         out.println("Servlet Name : " + servletName + "</br></br>");
			         out.println("Exception Type : " + exception.getClass( ).getName( ) + "</br></br>");
			         out.println("The request URI: " + requestUri + "<br><br>");
			         out.println("The exception message: " + exception.getMessage( ));
			      }
			      out.println("</body>");
			      out.println("</html>");
		
	}

}
