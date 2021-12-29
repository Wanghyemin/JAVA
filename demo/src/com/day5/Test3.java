package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		String str = "seoul Korea";
		// index: 01234567890

		// jumin: 941228-2056789
		// check: 234567 892345
		
		// �� = (9*2)+(4*3)+...+(8*5)
		// �� = 11-��%11
		// �� = ��%10
		// �� == 9
		
		Scanner sc = new Scanner(System.in);

		String jumin;
		int[] chk = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int i, tot, su;

		System.out.println("�ֹι�ȣ[xxxxxx-xxxxxxx]?");
		jumin = sc.next();

		if (jumin.length() != 14) {
			System.out.println("�Է¿���!");
			return; // exit(����)
		}
		
		tot = 0;	
		// index: 01234567890123
/*		// jumin: 941228-2056789
		// check: 234567 892345			*/

		for (i = 0; i < 12; i++) {
			
			if (i >= 6) { // ���ڸ� ��
				tot += chk[i] * Integer.parseInt(jumin.substring(i + 1, i + 2));
				
			} else { // �������
				tot += chk[i] * Integer.parseInt(jumin.substring(i, i + 1));
				
			}
		}

		su = 11 - tot % 11;
		su = su % 10;

		if (su == Integer.parseInt(jumin.substring(13))) {
			System.out.println("��Ȯ�� �ֹι�ȣ");

		} else {
			System.out.println("����Ȯ�� �ֹι�ȣ");
		}
		
		//return; ����
	}

}

/*		// substring( beginindex , endindex-1)
System.out.println(str);
System.out.println(str.substring(0, 3)); // seo
System.out.println(str.substring(6, 8));
System.out.println(str.substring(6));
*/