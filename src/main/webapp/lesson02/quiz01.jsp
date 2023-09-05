<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz01</title>
</head>
<body>
<%-- <%!
	public static int addNumbersAll(int number) {
	
		int sum = 0;
		for(int i = 1; i <= 50; i++) {
			sum += i;
			
		
		}
		
		return sum;
	}

%>
<%!
	int[] scores = {80, 90, 100, 95, 80};
	
	double average = getAverage(80, 90, 100, 95, 80);
	out.println("평균은 " + average);

%>

<%!

	List<String> list = List.of("X", "O", "O", "O", "X", "O", "O", "O", "X", "O");

	

%>
<%!
	String birthDay = "20010820";

	String birth = subString(7, 4);
	int number = Integer.parseInt(birth);
	
	out.println("2001082의 나이는 " + (2023 - birth) + "세 입니다.");
	
	
%> --%>
	
<%!
	
		//1. 합계
		public int getSum(int n) {
			int sum = 0;
			for(int i =1; i <= n; i++){
				sum += i;
				
			}
			return sum;
			
	
		}

%>
<h2>1부터 50까지의 합은 <%= getSum(50) %>입니다. </h2>

<%
	int[] scores = {80, 90, 100, 95, 80};

	int sum = 0;
	for (int i = 0; i < scores.length; i++){//0~4
		sum+= scores[i];
	
	}	
	double average = sum / (double)scores.length;
%>
<h2>평균 점수는<%= average %> 입니다.</h2>

<%
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	
	int score = 0;
	for(int i = 0; i < scoreList.size(); i++){ //0~9 index 탐색
		if	(scoreList.get(i).equals("O")){
			score += 100 / scoreList.size();			
		}
		
	}

%>
<h2>체점 결과는 <%= score %>점 입니다.</h2>

<%
	String birthDay = "20010820"; //2001 0~3 index
	String year = birthDay.substring(0,4); 
	//out.print(year);
	int age = 2023- Integer.valueOf(year);

	
%>
<h2> <%=birthDay %>의 나이는 <%= age %> 세 입니다.</h2>





</body>
</html>