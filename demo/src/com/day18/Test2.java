package com.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ŭ������[java.lang.String]?");
		String str = br.readLine();

		Class cls = Class.forName(str); //*�߿���*// // ��Ű���� �̸�

		// ������ ����
		System.out.println("������ ����...");
		Constructor<?>[] c = cls.getConstructors();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		
		System.out.println("�޼ҵ� ����..");
		Method[] m = cls.getMethods();
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		
		
	}

}