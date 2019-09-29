package 软件测试19_9_29;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Triangle_Judgment {
	public static final int NotTriangle = 0;// 不能成为三角形
	public static final int NomalTriangle = 1;// 普通三角形
	public static final int IsoscelesTriangle = 2;// 等腰三角形
	public static final int EquilateralTriangle = 3;// 等边三角形

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// System.out.println("输入三角形的三条边：有效取值范围[1,200]");
		JOptionPane.showMessageDialog(null, "输入三角形的三条边：有效取值范围[1,200]");
		String a = JOptionPane.showInputDialog(null, "a:");
		String b = JOptionPane.showInputDialog(null, "b:");
		String c = JOptionPane.showInputDialog(null, "c:");

		if (a != null && b != null && c != null) {
			if (((isNum(a) && isNum(b) && isNum(c))) && (isRange(a) && isRange(b) && isRange(c))) {
				int result = TriangleType(a, b, c);// 根据返回值判断三角形类型
				if (result == 0) {
					JOptionPane.showMessageDialog(null, "不能成为三角形", "错误", JOptionPane.ERROR_MESSAGE);
				} else if (result == 1) {
					JOptionPane.showMessageDialog(null, "普通三角形");
				} else if (result == 2) {
					JOptionPane.showMessageDialog(null, "等腰三角形");
				} else {
					JOptionPane.showMessageDialog(null, "等边三角形");
				}
			} else {
				JOptionPane.showMessageDialog(null, "输入的数据有误,请重新输入！", "错误", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
		} else {
			System.out.println("输入的数据为空，重新输入！");
		}

	}

	public static boolean isNum(String str) {// 用于判断输入的字符串是否为数字
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i)))
				return false;
		}
		return true;
	}

	public static boolean isRange(String a) {// 用于判断输入的值是否在[1,200]
		if (Integer.valueOf(a) >= 1 && Integer.valueOf(a) <= 200) {
			return true;
		} else
			return false;
	}

	public static int TriangleType(String a, String b, String c) {
		int A = Integer.valueOf(a);
		int B = Integer.valueOf(b);
		int C = Integer.valueOf(c);
		if ((A + B) > C && (A - B) < C) {
			if (A == B && A == C) {
				return EquilateralTriangle;
			} else if (A == B || A == C) {
				return IsoscelesTriangle;
			} else {
				return NomalTriangle;
			}
		}
		return NotTriangle;
	}
}
