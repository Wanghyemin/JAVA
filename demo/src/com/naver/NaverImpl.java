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

		System.out.println("���̵�?");
		vo.setId(sc.next());

		if (vo.getId().length() < 8 || vo.getId().length() > 15) {
			throw new Exception("���� ���� ����: " + vo.getId());
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
			throw new Exception("������, ���� ȥ�븸 ����: " + vo.getId());

		System.out.println("��й�ȣ?");
		vo.setPw(sc.next());

		System.out.println("�̸�?");
		vo.setName(sc.next());

		System.out.println("����[1:����,2:����]?");
		vo.setGender(sc.nextInt());

		do {
		System.out.println("�������[yyyymmdd]");
		vo.setBirth(sc.next());
		}while(vo.getBirth().length()!=8);
		
		System.out.println("�̸���?");
		vo.setEmail(sc.next());

		System.out.println("��ȭ��ȣ[01012345678]?");
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

		System.out.println("�˻��� ���̵�?");
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
