package com.day10;

import javax.security.auth.login.CredentialException;

// �߻� Ŭ����
// �޸��� ������� Ŭ������ �޼ҵ带 �̸� ����
// �޼ҵ带 �������ؼ� ���
// �߻� Ŭ�������� �ݵ�� �ϳ� �̻��� �߻� �޼ҵ尡 �־�� �ϰ�
// �Ϲ� �޼ҵ嵵 ���� �� �ִ�.

// **�ڹٿ����� �߻�Ŭ�������� �������̽��� �� ���� ����

abstract class ShapeClass { // �߻� Ŭ����

	abstract void draw(); // �߻� �޼ҵ�

}

class Circle extends ShapeClass {

	@Override
	void draw() {
		System.out.println("���� �׸���...");
	}

}

class Rect extends ShapeClass {

	@Override
	public void draw() {
		System.out.println("�簢���� �׸���...");
	}

}

class Tria extends ShapeClass {

	@Override
	void draw() {
		System.out.println("�ﰢ���� �׸���...");
	}

}

public class Test8 {

	public static void main(String[] args) {

		Circle c = new Circle();
		Rect r = new Rect();
		Tria t = new Tria();

		c.draw();
		r.draw();
		t.draw();

	}

}