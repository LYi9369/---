package �ڰ���_�ַ�����صķ���_19_7_29;

import java.util.Scanner;

public class �ж��Ƿ�Ϊ������ {
	// �����ַ����Ǵ����֣��ͷ���false
	private static boolean isDigital(char ch) {
		return ch >= '0' && ch <= '9';

	}

	public static void main(String[] args) {
		boolean isDigit = true;
		System.out.println("�����ַ����������ж��Ƿ�Ϊ������");
		String value = new Scanner(System.in).next();
		for (int i = 0; i < value.length(); i++) {
			// value.charAt(1)����˼��ѡ��value�ַ���
			if (!isDigital(value.charAt(i))) {
				isDigit = false;
				break;
			}
		}
		if (isDigit) {
			System.out.println("�Ǵ�����");
		} else {
			System.out.println("���Ǵ�����");
		}
	}

}
