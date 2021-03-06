package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		String str = "seoul Korea";
		// index: 01234567890

		// jumin: 941228-2056789
		// check: 234567 892345
		
		// 합 = (9*2)+(4*3)+...+(8*5)
		// 합 = 11-합%11
		// 합 = 합%10
		// 합 == 9
		
		Scanner sc = new Scanner(System.in);

		String jumin;
		int[] chk = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int i, tot, su;

		System.out.println("주민번호[xxxxxx-xxxxxxx]?");
		jumin = sc.next();

		if (jumin.length() != 14) {
			System.out.println("입력오류!");
			return; // exit(종료)
		}
		
		tot = 0;	
		// index: 01234567890123
/*		// jumin: 941228-2056789
		// check: 234567 892345			*/

		for (i = 0; i < 12; i++) {
			
			if (i >= 6) { // 뒷자리 비교
				tot += chk[i] * Integer.parseInt(jumin.substring(i + 1, i + 2));
				
			} else { // 생년월일
				tot += chk[i] * Integer.parseInt(jumin.substring(i, i + 1));
				
			}
		}

		su = 11 - tot % 11;
		su = su % 10;

		if (su == Integer.parseInt(jumin.substring(13))) {
			System.out.println("정확한 주민번호");

		} else {
			System.out.println("부정확한 주민번호");
		}
		
		//return; 생략
	}

}

/*		// substring( beginindex , endindex-1)
System.out.println(str);
System.out.println(str.substring(0, 3)); // seo
System.out.println(str.substring(6, 8));
System.out.println(str.substring(6));
*/