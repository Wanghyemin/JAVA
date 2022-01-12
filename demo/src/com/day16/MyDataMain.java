package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyDataMain {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("d:\\doc\\data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		/* List<MyDataVO> lists = new ArrayList<MyDataVO>(); */

		oos.writeObject(new MyDataVO("suzi", 30));
		oos.writeObject(new MyDataVO("inna", 40));
		oos.writeObject(new MyDataVO("insun", 20));
		oos.writeObject(new MyDataVO("jihae", 3));
		oos.writeObject(new MyDataVO("gemma", 50));

		oos.close();
		fos.close(); // 직렬화

		// 역직렬화

		FileInputStream fis = new FileInputStream("d:\\doc\\data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		MyDataVO ob = null;

		try {

			while (true) {

				ob = (MyDataVO) ois.readObject();

				if (ob == null) {
					break;
				}
				System.out.println(ob.toString());
			}

		} catch (Exception e) {
		}

		ois.close();
		fis.close();

	}

}
