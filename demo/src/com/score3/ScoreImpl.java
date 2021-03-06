package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private List<ScoreVO> lists = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {

		int result = 0;

		ScoreVO vo = new ScoreVO();

		System.out.print("학번?"); // 111
		vo.setHak(sc.next());

		System.out.println("이름?");// suzi
		vo.setName(sc.next());

		System.out.print("국어?");
		vo.setKor(sc.nextInt());

		System.out.print("영어?");
		vo.setEng(sc.nextInt());

		System.out.print("수학?");
		vo.setMat(sc.nextInt());

		lists.add(vo);

		return result;

	}

	@Override
	public void print() {

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			System.out.print(vo.toString());

		}

	}

	@Override
	public void searchHak() {
		System.out.println("검색할 학번?");
		String hak = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (vo.getHak().equals(hak)) {

				System.out.println(vo.toString());
				break; // 같은 학번은 없으므로 하나의 값을 찾으면 break를 통해 끝남
			}

		}

	}

	@Override
	public void searchName() {

		System.out.print("이름?");
		String name = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (vo.getName().equals(name)) {

				System.out.println(vo.toString());

			}
		}

	}

	@Override
	public void descSortTot() {

		// 무명의 클래스
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot() ? 1 : -1; // 부등호 > 로 바꾸면 오름차순
			}
		};

		Collections.sort(lists, comp);

		print();

	}

	@Override
	public void ascSortHak() {

		// 무명의 클래스
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getHak().compareTo(vo2.getHak()); // 부등호 > 로 바꾸면 오름차순
			}
		};

		Collections.sort(lists, comp);

		print();

	}

	@Override
	public void deleteHak() {
		
			System.out.println("삭제할 학번?");
			String hak = sc.next();

			Iterator<ScoreVO> it = lists.iterator();

			while (it.hasNext()) {

				ScoreVO vo = it.next();

				if (vo.getHak().equals(hak)) {

					lists.remove(vo);
					print();
					break; 
					
				}

			}
		
		
	}

}
