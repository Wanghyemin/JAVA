package com.day2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
/*		단가 15,800원짜리 상품을 일정 수량 이상 구입시 할인을 해줍니다.
		할인율은 다음과 같습니다.
		10개 이상 -> 10%
		20개 이상 -> 15%
		30개 이상 -> 20%
		판매금액을 계산해봅니다.
		예) 구입수량 15개인 경우 -> 구입수량: 15개, 판매총금액: 213300원*/

		Scanner sc = new Scanner(System.in);
		int a;
		double b;
		
		System.out.println("구매하실 물건의 개수를 적으시오.");
		a = sc.nextInt();
		
		if(a<10) {
			b = a*15800;
		}else if (a<20){
			b = a*15800*0.9;
		}else if (a<30){
			b = a*15800*0.85;
		}else {
			b = a*15800*0.8;
		}
		
		System.out.printf("구입수량: %d개, 판매총금액: %g원",a,b);
	
	}

}
