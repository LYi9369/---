package 第八章_字符串相关的方法_19_7_29;

import java.util.Scanner;

/*
 * 判断字符串是否是纯数字，而且只含有一个小数点，小数点不能在头和首位置
 */
public class 判断输入的字符串只能是含一个小数点的纯数字 {
	public static boolean isDecimal(String str) {
		boolean isDecimal = true;
		for (int i = 0; i < str.length(); i++) {
			// 当字符中出现非数字的时候，继续判断这个字符是不是小数点
			if (!(Character.isDigit(str.charAt(i)))) {
				if (str.charAt(i) == '.') {
					// 当小数点出现在第一个或最后一个时，字符串非法
					if (i == 0 || i == str.length() - 1) {
						isDecimal = false;
						break;
					}
				} else {// 当这个字符不是数字而且不是小数点的时候，就表明该字符串非法
					isDecimal = false;
					break;
				}
			}
		}
		return isDecimal;
	}

	public static void main(String[] args) {
		System.out.println("输入字符串，程序可以判断是否符合要求：");
		System.out.println(isDecimal(new Scanner(System.in).next()));

	}
}
