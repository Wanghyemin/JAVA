package com.project;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class Vaccine {
	
	// 3자리 수 마다 콤마찍기 (111,111)
	NumberFormat numberFormat = NumberFormat.getInstance();

	// 백신현황 공공API 데이터 가져오기 //
	public void vaccine() {
		
		 Calendar calendar = Calendar.getInstance();
		 SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 09시");
		 System.out.print(" 업데이트 시각 : ");
		 System.out.printf("%S 기준\n\n",sdf.format(calendar.getTime()));
		
		
		try {
			// URL 파싱 //
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();

			String url = "https://nip.kdca.go.kr/irgd/cov19stats.do?list=all";
			Document xmlDoc = parser.parse(url);

			// XML 노드 읽기 //
			Element root = xmlDoc.getDocumentElement();
			Node body = root.getChildNodes().item(1);
			Node items = body.getChildNodes().item(3);
			Node item3 = items.getChildNodes().item(5);
			NodeList itemList = item3.getChildNodes();

			Node a1 = itemList.item(3); // 1차백신 접종완료 인구
			Node b1 = itemList.item(5); // 2차백신 접종완료 인구
			Node c1 = itemList.item(7); // 3차백신 접종완료 인구

			// 문자(String)로 변환 //
			String first = a1.getChildNodes().item(0).getNodeValue();
			String second = b1.getChildNodes().item(0).getNodeValue();
			String third = c1.getChildNodes().item(0).getNodeValue();

			// 총 인구
			double people = 51347000;

			// 천만 단위 콤마찍어주기 //
			String str = numberFormat.format(people);
			String vc1 = numberFormat.format(Double.parseDouble(first));
			String vc2 = numberFormat.format(Double.parseDouble(second));
			String vc3 = numberFormat.format(Double.parseDouble(third));
			
			// 자료 출력 //
			System.out.printf(" ★ 전체 인구 약 %s명 중\n\n", str);
			
			System.out.print(" - 1차 백신 접종 완료 : 총 " + vc1 + "명 ");
			System.out.printf("(%.3g(%s))\n\n", Double.parseDouble(first) / people * 100, "%");
		
			System.out.print(" - 2차 백신 접종 완료 : 총 " + vc2 + "명 ");
			System.out.printf("(%.3g(%s))\n\n", Double.parseDouble(second) / people * 100, "%");
			
			System.out.print(" - 3차 백신 접종 완료 : 총 " + vc3 + "명 ");
			System.out.printf("(%.3g(%s))\n\n\n", Double.parseDouble(third) / people * 100, "%");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}