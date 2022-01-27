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

	// �ڷγ� Ȯ����, ����� ����API ������ �������� //
	public void covid() {

		try {

			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();

			//// ��¥���� ////
			System.out.print(" ��¥�� �Է��ϼ���[20220101]");
			today = sc.next();

			// ����
			SimpleDateFormat formin = new SimpleDateFormat("yyyyMMdd");
			Date todayDate = formin.parse(today);
			calendar.setTime(todayDate);

			// ����
			calendar.add(Calendar.DATE, 1);
			String tomorrow = formin.format(calendar.getTime());

			calendar.setTime(todayDate);

			//// URL ������ �б� ////
			// �迭 day = { ���� , ���� };
			String[] day = { today, tomorrow };

			for (int i = 0; i < day.length; i++) {

				String url = "http://openapi.data.go.kr/openapi/service/rest/Covid19"
						+ "/getCovid19InfStateJson?serviceKey=NCIUqcH3S7%2B53YimC1Rc"
						+ "H3h3AiFSpZrWZMfmjJGXFVZNGhf2BGW25igritgTfMcgMe4Gxd8qbS9nb%"
						+ "2F6%2BwBycXw%3D%3D&pageNo=1&numOfRows=10&" + "startCreateDt=" + day[i] + "&endCreateDt="
						+ day[i];

				Document xmlDoc = null;
				xmlDoc = parser.parse(url);

				// ��� �б�
				Element root = xmlDoc.getDocumentElement();
				Node body = root.getLastChild();
				Node items = body.getFirstChild();
				Node item = items.getFirstChild();
				NodeList itemList = item.getChildNodes();

				// ��忡�� Ȯ����, ����� �̸� ã��
				for (int j = 0; j < itemList.getLength(); j++) {

					Node aa = itemList.item(j);
					String k = aa.getNodeName();

					
					// ��忡�� Ȯ���� ����� �� �ҷ�����
					if (k.equals("decideCnt")) {

						decide[i] = Double.parseDouble(aa.getChildNodes().item(0).getNodeValue());

					} else if (k.equals("deathCnt")) {
						
						death[i] = Double.parseDouble(aa.getChildNodes().item(0).getNodeValue());
						
					}
				}
			}

			// 3�ڸ� �� ���� �޸���� (111,111)
			str1 = numberFormat.format(decide[1]);
			str2 = numberFormat.format(death[1]);

			str3 = numberFormat.format(decide[1] - decide[0]);
			str4 = numberFormat.format(death[1] - death[0]);

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// ���� �ڷγ� Ȯ����, ����� //
	public void total() {

		// ��¥ ���� ���ٸ� ��� ����
		if (str1 == "" || str2 == "")
			return;

		// Ķ���� ��¥ ���� ���� [20220101 �� 2022�� 01�� 01��]
		SimpleDateFormat formout = new SimpleDateFormat("yyyy�� MM�� dd��");
		String today = formout.format(calendar.getTime());

		// ����Ʈ
		System.out.println("\n\n �� 2020�� 01�� 20�Ϻ��� " + today + "���� ");
		System.out.println("\n   - �� Ȯ����: " + str1 + "��\n\n   - �� �����: " + str2 + "��\n");

		str1 = "";
		str2 = "";

	}

	// ���� �ڷγ� Ȯ����, ����� //
	public void daily() {

		// ��¥ ���� ���ٸ� ��� ����
		if (str3 == "" || str4 == "")
			return;

		// Ķ���� ��¥ ���� ���� [20220101 �� 2022�� 01�� 01��]
		SimpleDateFormat formout = new SimpleDateFormat("yyyy�� MM�� dd��");
		String today = formout.format(calendar.getTime());

		// ����Ʈ
		System.out.println("\n\n �� " + today + " ���� ");
		System.out.println("\n   - ���� Ȯ����: " + str3 + "��\n\n   - ���� �����: " + str4 + "��\n");

		str3 = "";
		str4 = "";

	}

}