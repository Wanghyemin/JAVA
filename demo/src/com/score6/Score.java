package com.score6;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// DTO로 받아서 DAO에 저장한다

//사용자한테 데이터 받는 곳
public class Score {

	Scanner sc = new Scanner(System.in);
	ScoreDAO dao = new ScoreDAO();

	// 입력
	public void insert() {

		try {

			ScoreDTO dto = new ScoreDTO();

			System.out.print("학번?"); // 111
			dto.setHak(sc.next());

			System.out.print("이름?"); // suzi
			dto.setName(sc.next());

			System.out.print("국어?"); // 50
			dto.setKor(sc.nextInt());

			System.out.print("영어?"); // 70
			dto.setEng(sc.nextInt());

			System.out.print("수학?"); // 60
			dto.setMat(sc.nextInt());

			int result = dao.insertData(dto);

			if (result != 0) {
				System.out.println("추가 성공!!");
			}

		} catch (Exception e) {

		}

	}

	public void update() {
		ScoreDTO dto = new ScoreDTO();

		try {
			System.out.print("수정할 학번?");
			dto.setHak(sc.next());

			System.out.print("국어?");
			dto.setKor(sc.nextInt());

			System.out.print("영어?");
			dto.setEng(sc.nextInt());

			System.out.print("수학?");
			dto.setMat(sc.nextInt());

			int result = dao.updateData(dto);

			if (result != 0) {

				System.out.println("수정 성공!!");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void delete() {

		String hak;

		try {

			System.out.print("삭제할 학번?");
			hak = sc.next();

			int result = dao.deleteData(hak);

			if (result != 0) {
				System.out.println("삭제 성공!");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 전체출력
	public void selectAll() {

		List<ScoreDTO> lists = dao.getList();

		Iterator<ScoreDTO> it = lists.iterator();
		while (it.hasNext()) {
			ScoreDTO dto = it.next();
			System.out.println(dto.toString());

		}

	}

	// 이름검색
	public void searchName() {

		String name;

		try {

			System.out.print("검색할 이름?");
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

	// 학번검색

	public void searchHak() {

		String hak;

		try {

			System.out.print("검색할 학번?");
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
