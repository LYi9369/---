package �������19_9_29;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Triangle_Judgment {
	public static final int NotTriangle = 0;// ���ܳ�Ϊ������
	public static final int NomalTriangle = 1;// ��ͨ������
	public static final int IsoscelesTriangle = 2;// ����������
	public static final int EquilateralTriangle = 3;// �ȱ�������

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// System.out.println("���������ε������ߣ���Чȡֵ��Χ[1,200]");
		JOptionPane.showMessageDialog(null, "���������ε������ߣ���Чȡֵ��Χ[1,200]");
		String a = JOptionPane.showInputDialog(null, "a:");
		String b = JOptionPane.showInputDialog(null, "b:");
		String c = JOptionPane.showInputDialog(null, "c:");

		if (a != null && b != null && c != null) {
			if (((isNum(a) && isNum(b) && isNum(c))) && (isRange(a) && isRange(b) && isRange(c))) {
				int result = TriangleType(a, b, c);// ���ݷ���ֵ�ж�����������
				if (result == 0) {
					JOptionPane.showMessageDialog(null, "���ܳ�Ϊ������", "����", JOptionPane.ERROR_MESSAGE);
				} else if (result == 1) {
					JOptionPane.showMessageDialog(null, "��ͨ������");
				} else if (result == 2) {
					JOptionPane.showMessageDialog(null, "����������");
				} else {
					JOptionPane.showMessageDialog(null, "�ȱ�������");
				}
			} else {
				JOptionPane.showMessageDialog(null, "�������������,���������룡", "����", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
		} else {
			System.out.println("���������Ϊ�գ��������룡");
		}

	}

	public static boolean isNum(String str) {// �����ж�������ַ����Ƿ�Ϊ����
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i)))
				return false;
		}
		return true;
	}

	public static boolean isRange(String a) {// �����ж������ֵ�Ƿ���[1,200]
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
