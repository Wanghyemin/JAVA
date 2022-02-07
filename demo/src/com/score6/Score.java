package com.score6;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// DTO�� �޾Ƽ� DAO�� �����Ѵ�

//��������� ������ �޴� ��
public class Score {

	Scanner sc = new Scanner(System.in);
	ScoreDAO dao = new ScoreDAO();

	// �Է�
	public void insert() {

		try {

			ScoreDTO dto = new ScoreDTO();

			System.out.print("�й�?"); // 111
			dto.setHak(sc.next());

			System.out.print("�̸�?"); // suzi
			dto.setName(sc.next());

			System.out.print("����?"); // 50
			dto.setKor(sc.nextInt());

			System.out.print("����?"); // 70
			dto.setEng(sc.nextInt());

			System.out.print("����?"); // 60
			dto.setMat(sc.nextInt());

			int result = dao.insertData(dto);

			if (result != 0) {
				System.out.println("�߰� ����!!");
			}

		} catch (Exception e) {

		}

	}

	public void update() {
		ScoreDTO dto = new ScoreDTO();

		try {
			System.out.print("������ �й�?");
			dto.setHak(sc.next());

			System.out.print("����?");
			dto.setKor(sc.nextInt());

			System.out.print("����?");
			dto.setEng(sc.nextInt());

			System.out.print("����?");
			dto.setMat(sc.nextInt());

			int result = dao.updateData(dto);

			if (result != 0) {

				System.out.println("���� ����!!");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void delete() {

		String hak;

		try {

			System.out.print("������ �й�?");
			hak = sc.next();

			int result = dao.deleteData(hak);

			if (result != 0) {
				System.out.println("���� ����!");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// ��ü���
	public void selectAll() {

		List<ScoreDTO> lists = dao.getList();

		Iterator<ScoreDTO> it = lists.iterator();
		while (it.hasNext()) {
			ScoreDTO dto = it.next();
			System.out.println(dto.toString());

		}

	}

	// �̸��˻�
	public void searchName() {

		String name;

		try {

			System.out.print("�˻��� �̸�?");
			name = sc.next();

			List<ScoreDTO> lists = dao.getList(name);
			Iterator<ScoreDTO> it = lists.iterator();

			while (it.hasNext()) {

				ScoreDTO dto = it.next();
				System.out.println(dto.toString());
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	// �й��˻�

	public void searchHak() {

		String hak;

		try {

			System.out.print("�˻��� �й�?");
			hak = sc.next();

			ScoreDTO dto = dao.getHakList(hak);

			if (dto != null) {
				System.out.println(dto.toString());

			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
