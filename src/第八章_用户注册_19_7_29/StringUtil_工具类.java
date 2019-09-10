package �ڰ���_�û�ע��_19_7_29;

//
public class StringUtil_������ {
	// �û���ҪС��25���ַ������ܰ����ո񡢵�˫���š��ʺź��������
	static boolean isCorrectUserName(String userName) {
		boolean isCorrect = true;
		if (userName == null)
			return false;
		if (userName.length() > 25)
			return false;
		// �Ƿ��ַ�����
		char[] UnValidChar = { ' ', '\'', '?', '<', '>', ',' };
		for (char ch : UnValidChar) {
			// ��char����ת��ΪString����
			// �ڱ����������У���������˷Ƿ����ַ��������Ͻ�������������false
			if (userName.contains(Character.toString(ch))) {
				isCorrect = false;
				break;
			}
		}
		return isCorrect;
	}

	// ����6-18λ��ֻ��Ϊ���֣���ĸ��������ţ��»��ߣ�@#$����
	// �����֡�����ĸʱ������ǿ��Ϊ2��
	// ����������ǿ��Ϊ4��
	// ���ֶ���������ǿ��Ϊ6��
	public static String ValidDataPwd(String Pwd) {
		// ���ص�������ǿ��
		// ���ؿ�ֵ����������Ƿ������򷵻ض�Ӧ������ǿ��
		String power = "���벻���ϸ�ʽ�򳤶�Ҫ������������";
		// String power = " ";
		if (Pwd == null)
			return power;
		if (Pwd.length() < 6 || Pwd.length() > 18)
			return power;
		// �Ϸ��ַ�
		// String[] CorrectPart = { "_", "@", "$", "!" };
		String Part = "_@#$!";
		for (int i = 0; i < Pwd.length(); i++) {
			// ���ж��Ƿ������ֻ���ĸ���������������жϡ���Ϊ�������
			if (!(Character.isLetterOrDigit(Pwd.charAt(i)))) {
				// �������������ﺬ�в������ֺ���ĸ���ַ�������Ҳ���ǺϷ����������
				if (!Part.contains(Character.toString(Pwd.charAt(i)))) {
					return power;
				}
			}
		}
		// �����ж�����ǿ��
		if (isDigit(Pwd) || isLetter(Pwd)) {
			// ���ַ���Ϊ�����ֻ��ߴ���ĸʱ�������������Ż���һ����ֵΪtrue
			power = "�������";
		} else if (isDigitAndLetter(Pwd)) {
			power = "�������";
		} else if (isDigitAndLetterAndSymble(Pwd)) {
			power = "�������";
		}

		return power;
	}

	/*
	 * �ж��ַ����Ƿ�Ϊ������
	 */
	private static boolean isDigit(String value) {
		for (int i = 0; i < value.length(); i++) {
			// ����������֣��򷵻�false
			if (!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private static boolean isLetter(String value) {
		// ���������ĸ���򷵻�false
		for (int i = 0; i < value.length(); i++) {
			if (!Character.isLetter(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private static boolean isDigitAndLetter(String value) {
		// �ַ����а����Ϸ�����ĸ������
		for (int i = 0; i < value.length(); i++) {
			if (Character.isLetterOrDigit(value.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private static boolean isDigitAndLetterAndSymble(String value) {
		// ͬʱ����ĸ���ֺ��������
		for (int i = 0; i < value.length(); i++) {
			if (!(Character.isDigit(value.charAt(i)) || Character.isLetter(value.charAt(i))
					|| "_@#$!".contains(Character.toString(value.charAt(i)))))
				;
			return false;
		}
		return true;
	}

	/*
	 * �ж��Ƿ�����������
	 */
	private static boolean isContainsSymble(String value) {
		String part = "_@#$!";
		for (int i = 0; i < value.length(); i++) {
			// ͨ�������ַ�����contains�������ж�value�ַ����Ƿ������part�ַ����е�Ԫ��
			if (part.contains(Character.toString(value.charAt(i)))) {
				return true;
			}
		}
		// ��������Щָ���������ʱ���ŷ���true����ǰ������ǡ���෴
		return false;
	}

}
