package 第八章_字符串相关的方法_19_7_29;

import java.util.Scanner;

public class 判断是否为纯数字 {
	// 单个字符不是纯数字，就返回false
	private static boolean isDigital(char ch) {
		return ch >= '0' && ch <= '9';

	}

	public static void main(String[] args) {
		boolean isDigit = true;
		System.out.println("输入字符串，用于判断是否为纯数字");
		String value = new Scanner(System.in).next();
		for (int i = 0; i < value.length(); i++) {
			// value.charAt(1)的意思是选择value字符串
			if (!isDigital(value.charAt(i))) {
				isDigit = false;
				break;
			}
		}
		if (isDigit) {
			System.out.println("是纯数字");
		} else {
			System.out.println("不是纯数字");
		}
	}

}
