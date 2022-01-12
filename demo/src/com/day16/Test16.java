package com.day16;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Test16 {

	public static void main(String[] args) throws Exception {

		// �� ����ȭ
		
		FileInputStream fis = new FileInputStream("d:\\doc\\out6.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Hashtable<String, String> h = (Hashtable<String, String>)ois.readObject(); // Downcast ����ȯ
		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key);
			System.out.println(key + ":"+ value);
			
		}
		ois.close();
		fis.close();
		
		
		
	}

}
