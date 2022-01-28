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

	double[] decide = new double[2];
	double[] death = new double[2];

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
<<<<<<< HEAD
			today = sc.next();

=======
			today = sc.next(); 
			
>>>>>>> a262c5e2d914fcc14810d2818203bf3c15967f16
			// 당일
			SimpleDateFormat formin = new SimpleDateFormat("yyyyMMdd");
			Date todayDate = formin.parse(today);
			calendar.setTime(todayDate);
<<<<<<< HEAD

			// 익일
			calendar.add(Calendar.DATE, 1);
=======
			
			// 익일
			calendar.add(Calendar.DATE,1);
>>>>>>> a262c5e2d914fcc14810d2818203bf3c15967f16
			String tomorrow = formin.format(calendar.getTime());

			calendar.setTime(todayDate);

			//// URL 데이터 읽기 ////
<<<<<<< HEAD
			// 배열 day = { 당일 , 익일 };
=======
			//  배열 day = {  당일 ,  익일   };
>>>>>>> a262c5e2d914fcc14810d2818203bf3c15967f16
			String[] day = { today, tomorrow };
			
			for (int i = 0; i < day.length; i++) {

				String url = "http://openapi.data.go.kr/openapi/service/rest/Covid19"
						+ "/getCovid19InfStateJson?serviceKey=NCIUqcH3S7%2B53YimC1Rc"
						+ "H3h3AiFSpZrWZMfmjJGXFVZNGhf2BGW25igritgTfMcgMe4Gxd8qbS9nb%"
<<<<<<< HEAD
						+ "2F6%2BwBycXw%3D%3D&pageNo=1&numOfRows=10&" + "startCreateDt=" + day[i] + "&endCreateDt="
						+ day[i];

=======
						+ "2F6%2BwBycXw%3D%3D&pageNo=1&numOfRows=10&" 
						+ "startCreateDt=" + day[i] + "&endCreateDt="+ day[i];
				
>>>>>>> a262c5e2d914fcc14810d2818203bf3c15967f16
				Document xmlDoc = null;
				xmlDoc = parser.parse(url);

				// 노드 읽기
				Element root = xmlDoc.getDocumentElement();
				Node body = root.getLastChild();
				Node items = body.getFirstChild();
				Node item = items.getFirstChild();
				NodeList itemList = item.getChildNodes();
<<<<<<< HEAD

				// 노드에서 확진자, 사망자 이름 찾기
				for (int j = 0; j < itemList.getLength(); j++) {

					Node aa = itemList.item(j);
					String k = aa.getNodeName();

					
					// 노드에서 확진자 사망자 값 불러오기
					if (k.equals("decideCnt")) {

						decide[i] = Double.parseDouble(aa.getChildNodes().item(0).getNodeValue());

					} else if (k.equals("deathCnt")) {
						
						death[i] = Double.parseDouble(aa.getChildNodes().item(0).getNodeValue());
						
					}
				}
=======
				
				Node a1 = itemList.item(3);
				Node b1 = itemList.item(2);
				
				
				System.out.println("@@@@@스레드주석풀기@@@@@");
				// 노드에 있는 값 Double로 받아오기
				decide[i] = Double.parseDouble(a1.getChildNodes().item(0).getNodeValue()); // 확진자
				death[i] = Double.parseDouble(b1.getChildNodes().item(0).getNodeValue());  // 사망자
				
>>>>>>> a262c5e2d914fcc14810d2818203bf3c15967f16
			}
			
			// 3자리 수 마다 콤마찍기 (111,111)
			str1 = numberFormat.format(decide[1]);
			str2 = numberFormat.format(death[1]);
<<<<<<< HEAD

			str3 = numberFormat.format(decide[1] - decide[0]);
			str4 = numberFormat.format(death[1] - death[0]);

=======

			str3 = numberFormat.format(decide[1] - decide[0]);
			str4 = numberFormat.format(death[1] - death[0]);
			
>>>>>>> a262c5e2d914fcc14810d2818203bf3c15967f16
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	
	// 누적 코로나 확진자, 사망자 //
	public void total() {

		// 날짜 값이 없다면 출력 금지
<<<<<<< HEAD
		if (str1 == "" || str2 == "")
			return;

		// 캘린더 날짜 포맷 변경 [20220101 → 2022년 01월 01일]
		SimpleDateFormat formout = new SimpleDateFormat("yyyy년 MM월 dd일");
		String today = formout.format(calendar.getTime());

		// 프린트
		System.out.println("\n\n ★ 2020년 01월 20일부터 " + today + "까지 ");
=======
		if (str1 == "" || str2 == "") 
			return;
		
		// 캘린더 날짜 포맷 변경 [20220101 → 2022년 01월 01일]
		SimpleDateFormat formout = new SimpleDateFormat("yyyy년 MM월 dd일");
		String today = formout.format(calendar.getTime());
		
		// 프린트
		System.out.println("\n\n ★ 2020년 01월 20일부터 "+today+"까지 ");
>>>>>>> a262c5e2d914fcc14810d2818203bf3c15967f16
		System.out.println("\n   - 총 확진자: " + str1 + "명\n\n   - 총 사망자: " + str2 + "명\n");

		str1 = "";
		str2 = "";

	}

	
	// 일일 코로나 확진자, 사망자 //
	public void daily() {
<<<<<<< HEAD

		// 날짜 값이 없다면 출력 금지
		if (str3 == "" || str4 == "")
			return;

		// 캘린더 날짜 포맷 변경 [20220101 → 2022년 01월 01일]
		SimpleDateFormat formout = new SimpleDateFormat("yyyy년 MM월 dd일");
		String today = formout.format(calendar.getTime());

		// 프린트
		System.out.println("\n\n ★ " + today + " 기준 ");
=======
		
		// 날짜 값이 없다면 출력 금지
		if (str3 == "" || str4 == "")  
			return;
		
		// 캘린더 날짜 포맷 변경 [20220101 → 2022년 01월 01일]
		SimpleDateFormat formout = new SimpleDateFormat("yyyy년 MM월 dd일"); 
		String today = formout.format(calendar.getTime());
		
		// 프린트
		System.out.println("\n\n ★ "+today+" 기준 ");
>>>>>>> a262c5e2d914fcc14810d2818203bf3c15967f16
		System.out.println("\n   - 일일 확진자: " + str3 + "명\n\n   - 일일 사망자: " + str4 + "명\n");

		str3 = "";
		str4 = "";

	}

}