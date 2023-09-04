package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/lesson01/quiz03")
public class UrlMappingQuiz03 extends HttpServlet{
	
	public void doGet(HttpServletRequest request,
	HttpServletResponse response) throws IOException {
	response.setCharacterEncoding("utf-8");
	response.setContentType("text/html");
	
		//기사 입력 시간
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:ss");
		
		//태그출력

		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>마론달 뉴스</title></head><body></body></html>");
		out.println("<h1>[단독]고양이가 야옹해</h1>");
		out.println("<p>기사 입력 시간:" + sdf.format(now) + "</p><hr>끝");
		
		
		out.println("</body></html>");

	}
	

}
