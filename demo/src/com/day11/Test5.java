package com.day11;

import java.util.Scanner;

interface FruitA {

	String Won = "원";

	public int getPrice();
	public String getName();

}

interface ItemFruit extends FruitA { // 상속 가능

	public String getItems();

}

class Orange implements ItemFruit {

	@Override
	public int getPrice() {
		return 1500;
	}

	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public String getItems() {
		return "과일";

	}

}

class Apple implements ItemFruit {

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public String getItems() {
		return "과일";
	}

}

public class Test5 {

	// ItemFruit ob = new Orange();
	// ItemFruit ob = new Apple();
	public void packing(ItemFruit ob) { 

		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Test5 t = new Test5();

		System.out.print("1.오렌지 2.사과?"); // 1,2
		int n = sc.nextInt();

		if (n == 1) {
			t.packing(new Orange()); //new Orange() 자체가 객체를 생성함

		} else if (n == 2) {
			t.packing(new Apple());
		}

		/* implements ob = new Orange(); // UPCAST // Object까지 UPCAST해버리면 메소드가 없어서 에러 */

		/*
		 * int a; a = 10; System.out.println(a); //10
		 * 
		 * int b; b = 20; System.out.println(b); //20
		 */

	}

}
