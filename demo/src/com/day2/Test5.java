package com.day2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name, pan;
		int kor;

		System.out.print("�̸�?");// lisa
		name = sc.next();

		System.out.print("����?");
		kor = sc.nextInt();

		// else if��
		if (kor >= 90) {
			pan = "��";
		} else if (kor >= 80) {
			pan = "��";
		} else if (kor >= 70) {
			pan = "��";
		} else if (kor >= 60) {
			pan = "��";
		} else {
			pan = "��";
		}
		System.out.println(name + ": " + pan);

	}

}
