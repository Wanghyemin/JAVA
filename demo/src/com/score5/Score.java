package com.score5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.score5.ScoreVO;

public class Score {

	private List<ScoreVO> lists;
	
	private String path = System.getProperty("user.dir");
	private File f = new File (path,"\\data\\score.txt"); // ��� �ȴ�
	
	

	

	public void input() throws Exception {

		Scanner sc = new Scanner(System.in);
		ScoreVO vo = new ScoreVO();
		
		System.out.print("�̸�?");
		vo.setName(sc.next());
		
		System.out.print("����?");
		vo.setBirth(sc.nextInt());
		
		System.out.print("����?");
		vo.setScore(sc.nextInt());
		
		lists.add(vo);
		
		FileOutputStream fos = new FileOutputStream("d:\\doc\\score.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(lists);
		
		oos.close();
		
		System.out.println("������ ���� ����");
		

	}

	public void print() {

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			System.out.print(vo.toString());

		}

	}
	
	public void set() throws Exception {
		
		FileInputStream fis = new FileInputStream("d:\\doc\\score.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<ScoreVO> lists = (List<ScoreVO>)ois.readObject();
		
		/*Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			vo = it.next();

		}*/
		ois.close();
		fis.close();
		
		
		
	}
	
	

}
