package �ڰ���_�ַ�����صķ���_19_7_29;

import java.util.Scanner;

/*
 * �ж��ַ����Ƿ��Ǵ����֣�����ֻ����һ��С���㣬С���㲻����ͷ����λ��
 */
public class �ж�������ַ���ֻ���Ǻ�һ��С����Ĵ����� {
	public static boolean isDecimal(String str) {
		boolean isDecimal = true;
		for (int i = 0; i < str.length(); i++) {
			// ���ַ��г��ַ����ֵ�ʱ�򣬼����ж�����ַ��ǲ���С����
			if (!(Character.isDigit(str.charAt(i)))) {
				if (str.charAt(i) == '.') {
					// ��С��������ڵ�һ�������һ��ʱ���ַ����Ƿ�
					if (i == 0 || i == str.length() - 1) {
						isDecimal = false;
						break;
					}
				} else {// ������ַ��������ֶ��Ҳ���С�����ʱ�򣬾ͱ������ַ����Ƿ�
					isDecimal = false;
					break;
				}
			}
		}
		return isDecimal;
	}

	public static void main(String[] args) {
		System.out.println("�����ַ�������������ж��Ƿ����Ҫ��");
		System.out.println(isDecimal(new Scanner(System.in).next()));

	}
}
