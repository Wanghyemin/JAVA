package com.score3;

public class ScoreVO { // �����ͺ��̽� ���� �� �����س��� ���� VO // Value Object : �����͸� ����

	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;

	// �޼ҵ� : ���� �ʱ�ȭ

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() { // �ܺο��� tot�� ���� �ʿ䰡 �����Ƿ� setTot X
		return kor + eng + mat;
	}

	@Override
	public String toString() {
		
		String str = String.format("%6s %4d %4d %4d %4d %4d\n", 
				name, kor, eng, mat, getTot(),getTot() / 3);

		return str;
	}
}
