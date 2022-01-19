package com.project;

import java.util.Scanner;

public class Main extends Thread {

	public static void main(String[] args) throws Exception {

		
		ThreadSrt start = new ThreadSrt();
		ThreadEnd end = new ThreadEnd();
		Scanner sc = new Scanner(System.in);
		
		Covid co = new Covid();
		Vaccine va = new Vaccine();

		int num;
		
		
		// Threadsrt 실행 2초 뒤 Main 출력
		start.start();
		sleep(5000); // Main절 2초 대기

		
		// 키 입력하면 프로그램 실행
		System.out.println("\n\n===========================" 
						+ " 시작하려면 Enter키를 입력하세요 " 
						+ "===========================");
		
		System.in.read();
		
		//소개글
		System.out.println("         * 본 데이터는 공공 데이터 포털 DATA.GO.KR을 참조하여 제작 되었습니다.");
	
		//// 정보 제공 ////
		while (true) {

			do {
				System.out.println("┌──────────────────────────────────────────┐");
				System.out.println("│                                                                                    │");
				System.out.println("│    1. 누적 확진·사망자    2. 일일 확진·사망자   3. 백신접종 현황    4. 종료      │");
				System.out.println("│                                                                                    │");
				System.out.println("└──────────────────────────────────────────┘");

				num = sc.nextInt();

			} while (num < 1 || num > 5 );

			// 항목 선택 //
			switch (num) {

			case 1: // 1. 누적현황
				co.covid();
				co.total();
				break;

			case 2: // 2. 일일현황
				co.covid();
				co.daily();
				break;

			case 3: // 3. 현재백신현황
				va.vaccine();
				break;

			default: // 4. 종료
			
				end.start();
				sleep(3500);
				System.out.println("\n\n=============================" 
						+ "  프로그램이 종료되었습니다  " 
						+ "==============================\n\n");
				
				System.exit(0);
				
			}
			
		}

	}

}