package com.day9;

public class Test6 {

	public static void main(String[] args) {

		String s1 = "서울,부산,대구";
		String[] ss = s1.split(",");

		for (String s : ss) {
			System.out.print(s + " ");
		}
		System.out.println();

		String s2 = "seoul";
		String s3 = "Seoul";
		System.out.println(s2.equals(s3)); // False
		System.out.println(s2.equalsIgnoreCase(s3)); // True

		String s4 = "abc.def.hij";
		//			 01234567890
		System.out.println(s4.indexOf(".")); // indexOf : 위치 찾는 메소드 // 3
		System.out.println(s4.lastIndexOf(".")); //7
		System.out.println(s4.indexOf("def")); //4
		System.out.println(s4.indexOf("x")); //-1 : 없음

		String s5 = "우리나라 대한민국 좋은나라 대한민국";
		String s6 = s5.replaceAll("대한", "大韓");
		System.out.println(s6);

		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim()); // 양쪽 공백 제거
		System.out.println(s7.replaceAll(" ", ""));
		System.out.println(s7.replaceAll("\\s", ""));

		char ch = "abcdefg".charAt(2);
		System.out.println(ch); // c

		System.out.println("abcdefg".length()); // 7

		String s8 = "abcdefg";
		String s9 = "abceefg";
		
		System.out.println(s8.compareTo(s9)); // -1
		System.out.println(s9.compareTo(s8)); // 1
		
	}

}
