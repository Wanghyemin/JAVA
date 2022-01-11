package com.excep;

public class OperationAuthenticator {

	public void inputFormat(String str) throws MyException {

		String temp[] = str.split(",");
		
		if (temp.length != 2) {

			throw new MyException("숫자 입력 오류: " + str); // 생성자 오버로딩
		}

	}

	@SuppressWarnings("unused") // 사용하지 않은 변수에 체크하지 마라 // 하지 않아도 된다
	public void number(String str) throws MyException {

		try {

			if (str.indexOf(".") != -1) {
				double num = Double.parseDouble(str);

			} else {
				int num = Integer.parseInt(str);
			}

		} catch (NumberFormatException e) {
			throw new MyException("숫자 변환 불가: " + str);
		}

	}

	public void operator(char ch) throws MyException {

		switch (ch) {
		case '+':case '-':case '*':case '/':
			return;
		default: 
			throw new MyException("연산자 오류: " + ch);
		}

	}

}
