package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz08")
public class GetMethodQuiz08 extends HttpServlet {
	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		// 한글 깨짐 방지 - html  
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		String serch = request.getParameter("serch");
		
		List<String> list = new ArrayList<>(Arrays.asList(
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));
		
		
		
		
		PrintWriter out = response.getWriter();
		
		//리스트 순회 => 출력 
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
				String line = iter.next();
				//검
//				if(line.contains(serch)) {
//				out.print(line + "<br>");
//				}
//				
//			}
		}
	}
		
//		out.print("<html><head><title>검색결과</title></head><body>");
//		
//		if(serch.contains("강남") ) {
//			out.print(list);
//		
//		}else {
//			out.print("검색결과가 없습니다.");
//			
//		}
	
	//스플릿으로 나눠서 생각하기 


		
		
	
		
}
