package com.naver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NaverImpl implements Naver {

	private List<NaverVO> lists = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	@Override
	public int input() throws Exception {

		int result = 0;

		NaverVO vo = new NaverVO();

		System.out.println("아이디?");
		vo.setId(sc.next());

		if (vo.getId().length() < 8 || vo.getId().length() > 15) {
			throw new Exception("문자 길이 오류: " + vo.getId());
		}
		boolean eng = false;
		boolean num = false;

		for (int i = 0; i < vo.getId().length(); i++) {

			char ch = vo.getId().charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 97 && ch <= 122)) {
				eng = true;

			} else if (ch >= '0' && ch <= '9') {

				num = true;
			}
		}
		if (eng == false || num == false)
			throw new Exception("영문자, 숫자 혼용만 가능: " + vo.getId());

		System.out.println("비밀번호?");
		vo.setPw(sc.next());

		System.out.println("이름?");
		vo.setName(sc.next());

		System.out.println("성별[1:남자,2:여자]?");
		vo.setGender(sc.nextInt());

		do {
		System.out.println("생년월일[yyyymmdd]");
		vo.setBirth(sc.next());
		}while(vo.getBirth().length()!=8);
		
		System.out.println("이메일?");
		vo.setEmail(sc.next());

		System.out.println("전화번호[01012345678]?");
		vo.setTel(sc.nextInt());

		lists.add(vo);

		return result;
	}

	@Override
	public void print() {

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {

			NaverVO vo = it.next();
			System.out.print(vo.toString());
		}

	}

	@Override
	public void searchID() {

		System.out.println("검색할 아이디?");
		String id = sc.next();

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {

			NaverVO vo = it.next();

			if (vo.getId().equals(id)) {

				System.out.println(vo.toString());
				break;
			}
		}

	}

}
