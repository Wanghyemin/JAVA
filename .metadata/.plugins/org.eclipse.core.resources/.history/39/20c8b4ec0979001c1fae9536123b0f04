package com.project;

import java.io.InputStream;
import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Covid {

	Scanner sc = new Scanner(System.in);
	NumberFormat numberFormat = NumberFormat.getInstance();
	Calendar calendar = Calendar.getInstance();

	double[] a = new double[2];
	double[] b = new double[2];

	String str1 = "";
	String str2 = "";
	String str3 = "";
	String str4 = "";
	
	String today;

	// 코로나 확진자, 사망자 공공API 데이터 가져오기 //
	public void covid() {

		try {

			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();

			//// 날짜설정 //// 
			System.out.print(" 날짜를 입력하세요[20220101]");
			today = sc.next(); 

			
			SimpleDateFormat formin = new SimpleDateFormat("yyyyMMdd");
			
			// 오늘
			Date todayDate = formin.parse(today);
			calendar.setTime(todayDate);
			
			// 내일
			calendar.add(Calendar.DATE,1);
			String tomorrow = formin.format(calendar.getTime());
			
			calendar.setTime(todayDate);
			
			//// URL 데이터 읽기 ////
			//  배열 day = {  전일 ,  당일 };
			String[] day = { today, tomorrow };

			for (int i = 0; i < day.length; i++) {
				
				String url = "http://openapi.data.go.kr/openapi/service/rest/Covid19"
						+ "/getCovid19InfStateJson?serviceKey=NCIUqcH3S7%2B53YimC1Rc"
						+ "H3h3AiFSpZrWZMfmjJGXFVZNGhf2BGW25igritgTfMcgMe4Gxd8qbS9nb%"
						+ "2F6%2BwBycXw%3D%3D&pageNo=1&numOfRows=10&" 
						+ "startCreateDt=" + day[i] + "&endCreateDt="+ day[i];

				Document xmlDoc = null;
				xmlDoc = parser.parse(url);

				// 노드 읽기
				Element root = xmlDoc.getDocumentElement();
				Node body = root.getLastChild();
				Node items = body.getFirstChild();
				Node item = items.getFirstChild();
				NodeList itemList = item.getChildNodes();

				Node a1 = itemList.item(3);
				Node b1 = itemList.item(2);

				// 노드에 있는 값 Double로 받아오기
				a[i] = Double.parseDouble(a1.getChildNodes().item(0).getNodeValue());
				b[i] = Double.parseDouble(b1.getChildNodes().item(0).getNodeValue());

			}

			// 3자리 수 마다 콤마찍기 (111,111)
			str1 = numberFormat.format(a[1]);
			str2 = numberFormat.format(b[1]);

			str3 = numberFormat.format(a[1] - a[0]);
			str4 = numberFormat.format(b[1] - b[0]);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 누적 코로나 확진자, 사망자 //
	public void total() {

		if (str1 == "" || str2 == "") { //날짜 값이 안들어왔으면 리턴
			return;
		}
		
		SimpleDateFormat formout = new SimpleDateFormat("yyyy년 MM월 dd일"); //캘린더 날짜 포맷 변경
		String today = formout.format(calendar.getTime());
		
		System.out.println("\n\n ★ 2020년 01월 20일부터 "+today+"까지 ");
		System.out.println("\n   - 총 확진자: " + str1 + "명\n\n   - 총 사망자: " + str2 + "명\n");
		
		str1 = "";
		str2 = "";

	}

	// 일일 코로나 확진자, 사망자 //
	public void daily() {
		
		if (str3 == "" || str4 == "") { //날짜 값이 안들어왔으면 리턴
			return;
		}
		
		SimpleDateFormat formout = new SimpleDateFormat("yyyy년 MM월 dd일"); //캘린더 날짜 포맷 변경
		String today = formout.format(calendar.getTime());
		System.out.println("\n\n ★ "+today+" 기준 ");
		System.out.println("\n   - 일일 확진자: " + str3 + "명\n\n   - 일일 사망자: " + str4 + "명\n");

		str3 = "";
		str4 = "";
		
	}

}
