package 第八章_用户注册_19_7_29;

//
public class StringUtil_工具类 {
	// 用户名要小于25个字符，不能包括空格、单双引号、问号和特殊符号
	static boolean isCorrectUserName(String userName) {
		boolean isCorrect = true;
		if (userName == null)
			return false;
		if (userName.length() > 25)
			return false;
		// 非法字符数组
		char[] UnValidChar = { ' ', '\'', '?', '<', '>', ',' };
		for (char ch : UnValidChar) {
			// 将char数组转换为String类型
			// 在遍历个过程中，如果出现了非法的字符，则马上结束遍历，返回false
			if (userName.contains(Character.toString(ch))) {
				isCorrect = false;
				break;
			}
		}
		return isCorrect;
	}

	// 密码6-18位，只能为数字，字母，特殊符号（下划线，@#$！）
	// 纯数字、纯字母时，密码强度为2星
	// 任意两种则强度为4星
	// 三种都有则密码强度为6星
	public static String ValidDataPwd(String Pwd) {
		// 返回的是密码强度
		// 返回空值则密码输入非法，否则返回对应的密码强度
		String power = "密码不符合格式或长度要求，请重新输入";
		// String power = " ";
		if (Pwd == null)
			return power;
		if (Pwd.length() < 6 || Pwd.length() > 18)
			return power;
		// 合法字符
		// String[] CorrectPart = { "_", "@", "$", "!" };
		String Part = "_@#$!";
		for (int i = 0; i < Pwd.length(); i++) {
			// 先判断是否是数字或字母，如果不是则继续判断。因为如果不是
			if (!(Character.isLetterOrDigit(Pwd.charAt(i)))) {
				// 如果输入的密码里含有不是数字和字母的字符，并且也不是合法的特殊符合
				if (!Part.contains(Character.toString(Pwd.charAt(i)))) {
					return power;
				}
			}
		}
		// 下面判断密码强度
		if (isDigit(Pwd) || isLetter(Pwd)) {
			// 当字符串为纯数字或者纯字母时，这两个方法才会有一个的值为true
			power = "★★☆☆☆☆";
		} else if (isDigitAndLetter(Pwd)) {
			power = "★★★☆☆☆";
		} else if (isDigitAndLetterAndSymble(Pwd)) {
			power = "★★★★★★";
		}

		return power;
	}

	/*
	 * 判断字符串是否为纯数字
	 */
	private static boolean isDigit(String value) {
		for (int i = 0; i < value.length(); i++) {
			// 如果不是数字，则返回false
			if (!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private static boolean isLetter(String value) {
		// 如果不是字母，则返回false
		for (int i = 0; i < value.length(); i++) {
			if (!Character.isLetter(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private static boolean isDigitAndLetter(String value) {
		// 字符串中包含合法的字母和数字
		for (int i = 0; i < value.length(); i++) {
			if (Character.isLetterOrDigit(value.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private static boolean isDigitAndLetterAndSymble(String value) {
		// 同时有字母数字和特殊符合
		for (int i = 0; i < value.length(); i++) {
			if (!(Character.isDigit(value.charAt(i)) || Character.isLetter(value.charAt(i))
					|| "_@#$!".contains(Character.toString(value.charAt(i)))))
				;
			return false;
		}
		return true;
	}

	/*
	 * 判断是否包含特殊符号
	 */
	private static boolean isContainsSymble(String value) {
		String part = "_@#$!";
		for (int i = 0; i < value.length(); i++) {
			// 通过调用字符串的contains方法来判断value字符串是否包含有part字符串中的元素
			if (part.contains(Character.toString(value.charAt(i)))) {
				return true;
			}
		}
		// 当包含这些指定特殊符号时，才返回true。跟前面两个恰好相反
		return false;
	}

}
