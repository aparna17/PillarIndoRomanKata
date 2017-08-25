<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="myform" action="ArabicConvertion" method="post">
	
	<h2> Roman Numerals Converter</h2>
		
	    Number to convert: <input type="text" name="arabic" value="${arabic}"/> <br></br>
		Roman Number: <input type="text" name="roman"  value="${roman}" /><br></br>
		<input type="submit" value="ToRoman" name="submitBtn" onclick="restictNumbers()" /> 
		<input type="submit" value="ToIndo" name="submitBtn1" onclick="form.action='RomanConvertion';restrictLetters()"/><br>
		<p>${errorMessage}</p>
		<p>${errormessage2}</p>
		<p>${errormessage3}</p>
	</form>
	
 <script type="text/javascript">
	function restrictLetters() {
		var input = document.forms["myform"]["roman"].value;
		var regExp = /^(?=[MDCLXVI])M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$/;
		if(input==""){
			alert("Please enter a roman number to convert");
		return false;
		}
		if(!regExp.test(input){
			alert("Please enter a valid roman number");
		return false;
		}
		else return true;
		
		
	}
	</script> 
	
	<script type="text/javascript">
	function restictNumbers(){
		var input = document.forms["myform"]["arabic"].value;
		var regExp = '^([0-9]|[1-9][0-9]|[1-9][0-9][0-9][0-9][0-9])$'
		if(input==""){
			alert("Please enter an arabic number");
			return false;
		}
		if(input<=0){
			alert("Please enter a valid arabic number to convert")
			return false;	
		}
		if ( isNaN(input)){
			alert("Please enter a valid arabic number to convert")
			return false;
		}
		else return true;
	}
	</script>
</body>
</html>