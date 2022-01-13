package com.score5;

import java.io.Serializable;

public class ScoreVO implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private String name;
	private int birth;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() { // Ãâ·Â±â
		/*return name + "	" + birth + "	" + score +"\n"; */
		return String.format("%6s %6s %4d",name, birth,score);
		
	}

}
