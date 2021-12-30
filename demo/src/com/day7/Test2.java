package com.day7;

//1. static�� new�� ������� �ʾƵ� �˾Ƽ� �޸𸮷� �ö󰣴�.
//2. static�� ��ü�� 100�� �����ǵ� �޸� ������ 1���� �����ȴ�.

public class Test2 {

	public static int a = 10; // class���� (static���ԵǸ�)
	// Ŭ���� ���� �Ǵ� Ŭ���� �޼ҵ�� Ŭ������ �ε��Ǵ� ����
	// �޸� �Ҵ��� �̷������ [Ŭ�����̸�.��ü]�� ���� ������ �� �ִ�.
	// ��, new�� ���� �޸� �Ҵ��� ���� �ʾƵ� ��� �����ϴ�.

	private int b = 20; // instance����
	// �ν��Ͻ� ���� �Ǵ� �ν��Ͻ� �޼ҵ�� new�� ���� �޸� �Ҵ��� �޾ƾ߸� ��� �����ϰ�,
	// �ٸ� �޼ҵ忡���� ���� ����������, Ŭ���� �޼ҵ忡���� ������ �Ұ����ϴ�.

	public void write() {// instance �޼ҵ�
		System.out.println("class ���� a: "+a);
		System.out.println("instance ���� b: "+ b);
	}

	public static void print() { // class �޼ҵ�
		System.out.println("class ���� a: "+a);
		// System.out.println("instance ���� b: "+ b); // Ŭ���� �޼ҵ忩�� b�� �νĵ��� ����
	}

	public static void main(String[] args) { // class �޼ҵ� ������ Ư���� �ѷ��Ͽ� main�޼ҵ��� �θ�!

		System.out.println("class���� : "+ a); 
		System.out.println("class���� : "+ Test2.a); // this.a �Ұ���
		
		//write(); �Ұ���
		print();
		Test2.print(); // class �޼ҵ�
		
		Test2 ob = new Test2();
		System.out.println("class���� : "+ ob.a); 
		System.out.println("instance ���� b: "+ ob.b);
		ob.print();
		ob.write();
		System.out.println("------------------------");
		
		Test2 ob2 = new Test2();
		ob2.a = 100;
		ob2.b = 200;
		ob2.write();
		System.out.println("------------------------");
		
		Test2 ob3 = new Test2();
		ob3.a = 1000;
		ob3.b = 2000;
		ob3.write();
		
		System.out.println("------------------------");
		ob.write();
		ob2.write();
		ob3.write();
		
	}

}
