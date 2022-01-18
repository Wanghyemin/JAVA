package com.day12;

import java.util.Vector;

// Collection Framework (�����)

// �迭�� ����
// 1. ũ�⸦ ���ϸ� ������ �Ұ���
// 2. �̸� ũ�� ������ �޸� ���� �� �� ����
// 3. �迭 ���̿� ������ �Ұ���

// List, Vector, Set, Map, Hashtable, TreeSet, HashSet

// ���� ����
// List(I) - ArrayList(C) ����ȭX , Vector(C) ����ȭ O  : Map���� ���� 
// Map(I)  - Hashtable(C), HashSet(C)  :key���� ������ �־ ����



// Vector

public class Test5 {

	public static void main(String[] args) {

		Vector v = new Vector<>(); // �⺻ ������ type�� Object ��

		v.add("����"); // UPCAST
		v.add(30);
		v.add('c');

		String s = (String) v.get(0);  // DOWNCAST
		System.out.println(s);

		Integer i = (Integer) v.get(1);
		System.out.println(i);

		char c = (char) v.get(2);
		System.out.println(c);

	}

}
