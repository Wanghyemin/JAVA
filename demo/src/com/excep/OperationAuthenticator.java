package com.excep;

public class OperationAuthenticator {

	public void inputFormat(String str) throws MyException {

		String temp[] = str.split(",");
		
		if (temp.length != 2) {

			throw new MyException("���� �Է� ����: " + str); // ������ �����ε�
		}

	}

	@SuppressWarnings("unused") // ������� ���� ������ üũ���� ���� // ���� �ʾƵ� �ȴ�
	public void number(String str) throws MyException {

		try {

			if (str.indexOf(".") != -1) {
				double num = Double.parseDouble(str);

			} else {
				int num = Integer.parseInt(str);
			}

		} catch (NumberFormatException e) {
			throw new MyException("���� ��ȯ �Ұ�: " + str);
		}

	}

	public void operator(char ch) throws MyException {

		switch (ch) {
		case '+':case '-':case '*':case '/':
			return;
		default: 
			throw new MyException("������ ����: " + ch);
		}

	}

}
