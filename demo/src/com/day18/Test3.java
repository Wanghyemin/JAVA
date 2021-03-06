package com.day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 정규화 표현식
// java.util.regex

/*

c[a-z]* : c로 시작하는 영단어(c,ca,cab)
c[a-z]  : c로 시작하는 두글자 영단어(c,ca,cz)
c[a-zA-z0-9] : ca, cA,c4
c. : c로 시작하는 두글자(ca,cB,c&)
c.* : c로 시작하는 모든 글자
[b|c].* 또는 [bc].* 또는 [b-c].* : b,c,bbb

[\\d]+ 또는 [0-9]+ : 하나 이상의 숫자

*/

public class Test3 {

	public static void main(String[] args) {

		String[] str = { "bat", "baby", "brother", "c", "ca", "c.", "c0", "car", "count", "date" };

		Pattern p;

		p = Pattern.compile("c[a-z]*");
		for (String s : str) {
			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.println(s);
			}

		}
		System.out.println("--------------------------");

		p = Pattern.compile("c.");
		for (String s : str) {
			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.println(s);
			}

		}

		System.out.println("--------------------------");

		String[] mails = { "aaa@aaa.com", "@aaa.co.kr", ".@bbb.com", "aaa@vvv.co.kr", "sss.co.kr", "abc@aaa" };

		// [\\w]+ : 한글자 이상의 영, 숫자
		// @ : at 여기에
		// (\\.[\\w]+) : 괄호안에 있는 것은 반드시 한 번은 표시 되어야 한다
		// \\. : .
		
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+"; // 정규화 표현식
		
		for(String s : mails) {
			
			if(Pattern.matches(pat, s)) {
				System.out.println(s);
			}
			
		}
		
		
		
	}

}
