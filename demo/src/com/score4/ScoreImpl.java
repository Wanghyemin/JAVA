package com.score4;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.score4.ScoreVO;

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> hMap = new TreeMap<>();

	Scanner sc = new Scanner(System.in);

	String hak;

	@Override
	public void input() {

		System.out.print("�й�?");
		hak = sc.next();

		if (searchHak(hak)) {

			System.out.println("�й��� �����մϴ� ���Է�:(");
			return;
		}
		ScoreVO vo = new ScoreVO();
		System.out.println("�̸�?");
		vo.setName(sc.next());

		System.out.println("����?");
		vo.setKor(sc.nextInt());

		System.out.println("����?");
		vo.setEng(sc.nextInt());

		System.out.println("����?");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);

		System.out.println("�߰� ����:)");

	}

	@Override
	public boolean searchHak(String hak) {

		if (hMap.containsKey(hak)) {
			return true;

		}

		return false;

	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator();

		while (it.hasNext()) {

			String hak = it.next();
			ScoreVO vo = hMap.get(hak);

			System.out.println(hak + " " + vo.toString());

		}

	}

	@Override
	public void delete() {

		System.out.print("������ �й�?");
		hak = sc.next();

		if (searchHak(hak)) {
			hMap.remove(hak);
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		return;
	}

	@Override
	public void update() {
		System.out.print("������ ������ �й�?");
		hak = sc.next();

		if (!searchHak(hak)) { // �ڵ� ���� ���� ����, boolean�ڵ�

			System.out.println("���� ����");
			return;
		}

		ScoreVO vo = new ScoreVO();

		System.out.println("�̸�?");
		vo.setName(sc.next());

		System.out.println("����?");
		vo.setKor(sc.nextInt());

		System.out.println("����?");
		vo.setEng(sc.nextInt());

		System.out.println("����?");
		vo.setMat(sc.nextInt());

		System.out.println("���� ����");

	}

	@Override
	public void findHak() {

		System.out.print("�˻��� �й�?");
		hak = sc.next();

		if (!searchHak(hak)) {
			System.out.println("�й��� �������� �ʽ��ϴ�");
			return;
		}
		ScoreVO vo = hMap.get(hak);
		System.out.println(hak + " " + vo.toString());
	}

	@Override
	public void findName() {
		System.out.println("�˻��� �̸�?");
		String name = sc.next();

		Iterator<String> it = hMap.keySet().iterator();

		boolean flag = false;
		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			if (vo.getName().equals(name)) {
				System.out.println(hak + " " + vo.toString());
				flag = true;
			}
		}

		if (!flag) {
			System.out.println("�̸��� �������� �ʽ��ϴ� �˻�����");
		}

	}

}
