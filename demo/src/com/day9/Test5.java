package com.day9;

public class Test5 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();

		sb.append("����");
		sb.append("�λ�");

		System.out.println(sb); // hashcode�����°� �ƴ϶� String�� ����

		String str = sb.toString();
		System.out.println(str);

	}

}
