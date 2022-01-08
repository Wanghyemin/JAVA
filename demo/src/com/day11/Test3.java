package com.day11;

// Interface
// �߻�Ŭ������ �������� ���ȸ� �ϰ� ����(����=�ڵ�)�� ����.
// ������ final ������ ���� �����ϴ�
// �������̽��� �����ϱ� ���ؼ��� implements�� ���
// �������̽��� ���������� �������̽��� ��� �޼ҵ带 ������(Override) �ؾ��Ѵ�.
// �������̽��� �ٸ� �������̽��� ��� ���� �� �ִ�. �׶��� extends�� ����Ѵ�. 
// Ŭ������ ���� ��������� �������̽��� ���� ������ �����ϴ�.

interface Fruit {

	String Won = "��"; // public static final ����

	int getPrice(); // public abstract ����

	public String getName();

	// public void print() {

	// } �Ϲ� �޼ҵ�� �������..

}

class FruitImpl implements Fruit {

	@Override
	public int getPrice() { // ������ �������̵� �ؾ���
		return 1000;
	}

	@Override
	public String getName() {
		return "���";
	}

	public String getItems() { // ��ü�޼ҵ� ���� ����

		return "����";

	}

}

public class Test3 {

	public static void main(String[] args) {

		FruitImpl ob1 = new FruitImpl();

		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);

		Fruit ob2 = ob1; // UPCAST
		
		System.out.println(ob2.getName()); 
		// System.out.println(ob2.getItem()); // �θ�� getItem�� ����
		
		
	}

}