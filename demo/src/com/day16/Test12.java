package com.day16;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

// File 클래스
// 파일 및 폴더를 관리할 수 있도록 기능을 제공해주는 클래스
// 파일의 복사 또는 이름변경 등의 조작을 할 경우에만 사용될 뿐
// 파일의 내용을 입출력하기 위한 메소드를 제공하지는 않는다

public class Test12 {

	public static void main(String[] args) throws IOException {

		File f = new File("d:\\doc\\test.txt");

		System.out.println("파일명: " + f.getName());
		System.out.println("파일길이: " + f.length());
		System.out.println("파일경로: " + f.getAbsolutePath());
		System.out.println("표준경로: " + f.getCanonicalPath());
		System.out.println("만든날: " + new Date(f.lastModified()));
		System.out.println("파일패스: " + f.getParent());
		System.out.println("읽기속성: " + f.canRead());
		System.out.println("쓰기속성: " + f.canWrite());

	}

}
