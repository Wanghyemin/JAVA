package com.day19;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Test1 {

	public static void main(String[] args) {

		try {

			// Dom Document ��ü�� �����ϱ� ���� ���丮 ����
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance(); // newinstance ��ü����
			DocumentBuilder parser = f.newDocumentBuilder();

			// Dom �ļ��κ��� �Է¹��� ������ �Ľ���
			Document xmlDoc = null;

			String url = "book.xml";

			if (url.indexOf("http://") != -1) {

				URL u = new URL(url);
				InputStream is = u.openStream();
				xmlDoc = parser.parse(is);

			} else {
				xmlDoc = parser.parse(url);
			}

			// Element : xml������ ��Ҹ� ǥ���ϱ� ���� ���
			Element root = xmlDoc.getDocumentElement();

			System.out.println(root.getTagName());

			// ù��°book
			// Node : �� ��Ҹ� �б����� ���
			Node book1 = root.getElementsByTagName("book").item(0);
			System.out.println(((Element) book1).getAttribute("kind"));

			Node title = book1.getFirstChild();
			//System.out.println(title);
			Node title1 = title.getNextSibling();
			System.out.println(title1.getNodeName());
			Node title1_1 = title1.getFirstChild();
			System.out.println(title1_1.getNodeValue());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
