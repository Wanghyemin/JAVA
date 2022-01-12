package com.day16;

import java.io.Serializable;

public class MyDataVO implements Serializable {

	private String name;
	private int score;

	public MyDataVO(String name, int score) {

		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return name + ":" + score;
	}

}
