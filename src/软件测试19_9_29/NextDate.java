package �������19_9_29;

import javax.swing.JOptionPane;

public class NextDate {
	// public static final int NormlYear = 0;
	public static final int ErrorInput = 0;
	public static final int M1 = 1;
	public static final int M2 = 2;
	public static final int M3 = 3;
	public static final int M4 = 4;
	// public static final int D0 = 00;
	// public static final int D1 = 01;
	// public static final int D2 = 02;
	// public static final int D3 = 03;
	// public static final int D4 = 04;
	public static final int D0 = 01;
	public static final int D1 = 02;
	public static final int D2 = 03;
	public static final int D3 = 04;
	public static final int D4 = 05;

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "������Ҫ��NextDate������,��ݵ���Чȡֵ��ΧΪ[1818,2018]");
		String year = JOptionPane.showInputDialog(null, "���:");
		String month = JOptionPane.showInputDialog(null, "�·�:");
		String day = JOptionPane.showInputDialog(null, "����:");
		int Year = Integer.valueOf(year);
		int Month = Integer.valueOf(month);
		int Day = Integer.valueOf(day);
		if (Year <= 1818 || Year >= 2018) {
			JOptionPane.showMessageDialog(null, "������������", "����", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		if (MonthType(Month) != ErrorInput && DayType(Day) != ErrorInput) {
			/* ���� ��������ҷ��ϵ�ǰ�����������κ�һ�춼������ֱ�Ӽ�1 */
			if (DayType(Day) == D0) {
				JOptionPane.showMessageDialog(null, Year + "��" + Month + "��" + (Day + 1) + "��");
			}
			/* 12-31�� */
			if ((MonthType(Month) == M4) && (DayType(Day) == D4)) {
				JOptionPane.showMessageDialog(null, (Year + 1) + "��" + 1 + "��" + 1 + "��");
			}
			if (IsLeapYear(Year)) {// ����
				if ((MonthType(Month) == M1) && (DayType(Day) == D1 || DayType(Day) == D2
						|| DayType(Day) == D3)) {/* 1 3 5 7 8 10�� */
					JOptionPane.showMessageDialog(null, Year + "��" + Month + "��" + (Day + 1) + "��");
				}
				if ((MonthType(Month) == M1) && (DayType(Day) == D4)) {
					JOptionPane.showMessageDialog(null, Year + "��" + (Month + 1) + "��" + 1 + "��");
				}
				if ((MonthType(Month) == M2) && (DayType(Day) == D1
						|| DayType(Day) == D2)) {/* 1 3 5 7 8 10�� */
					JOptionPane.showMessageDialog(null, Year + "��" + (Month) + "��" + (Day + 1) + "��");
				}
				if ((MonthType(Month) == M2)
						&& (DayType(Day) == D3)) {/* 4 6 9 11�� */
					JOptionPane.showMessageDialog(null, Year + "��" + (Month + 1) + "��" + 1 + "��");
				}
				if ((MonthType(Month) == M3) && (DayType(Day) == D1)) {/* 2�� */
					JOptionPane.showMessageDialog(null, Year + "��" + (Month) + "��" + (Day + 1) + "��");
				}
				if ((MonthType(Month) == M3)
						&& (DayType(Day) == D2)) {/* 2-29�� */
					JOptionPane.showMessageDialog(null, Year + "��" + (Month + 1) + "��" + 1 + "��");
				}
			} else {// ƽ��
				if ((MonthType(Month) == M1) && (DayType(Day) == D1 || DayType(Day) == D2
						|| DayType(Day) == D3)) {/* 1 3 5 7 8 10�� */
					JOptionPane.showMessageDialog(null, Year + "��" + Month + "��" + (Day + 1) + "��");
				}
				if ((MonthType(Month) == M1) && (DayType(Day) == D4)) {
					JOptionPane.showMessageDialog(null, Year + "��" + (Month + 1) + "��" + 1 + "��");
				}
				if ((MonthType(Month) == M2) && (DayType(Day) == D1
						|| DayType(Day) == D2)) {/* 1 3 5 7 8 10�� */
					JOptionPane.showMessageDialog(null, Year + "��" + (Month) + "��" + (Day + 1) + "��");
				}
				if ((MonthType(Month) == M2)
						&& (DayType(Day) == D3)) {/* 4 6 9 11�� */
					JOptionPane.showMessageDialog(null, Year + "��" + (Month + 1) + "��" + 1 + "��");
				}
				if ((MonthType(Month) == M3) && (DayType(Day) == D1)) {/* 2�� */
					JOptionPane.showMessageDialog(null, Year + "��" + (Month) + "��" + (Day + 1) + "��");
				}
			}
		} else if (MonthType(Month) == ErrorInput && DayType(Day) != ErrorInput) {
			JOptionPane.showMessageDialog(null, "������·�����", "����", JOptionPane.ERROR_MESSAGE);
			// System.out.println("��������");
		} else if (MonthType(Month) != ErrorInput && DayType(Day) == ErrorInput) {
			JOptionPane.showMessageDialog(null, "�������������", "����", JOptionPane.ERROR_MESSAGE);
		} else if (MonthType(Month) == ErrorInput && DayType(Day) == ErrorInput) {
			JOptionPane.showMessageDialog(null, "������·ݺ����ڶ�����" + MonthType(Month) + DayType(Day), "����",
					JOptionPane.ERROR_MESSAGE);
		}
	}// ����2000-15-1 ����·ݺ����ڶ��� ������������ MonthType(Month)=0 DayType(Day)=0
		// ԭ����12���Ұ�D0���ó���0�������뷵��ֵErrorInputһ��

	public static boolean IsLeapYear(int year) { // ���ж��Ƿ�Ϊ����:�ܱ�4���������ܱ�100�����������ܱ�400��������ݡ�
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return true;
		else {
			return false;
		}
	}

	public static int MonthType(int Month) {// ƥ���·ݵ�����
		if (Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10)
			return M1;
		else if (Month == 4 || Month == 6 || Month == 9 || Month == 11) {
			return M2;
		} else if (Month == 2) {
			return M3;
		} else if (Month == 12) {
			return M4;
		} else {
			return ErrorInput;
		}
	}

	public static int DayType(int Day) {// ƥ�����ڵ�����
		if (Day >= 1 && Day <= 27) {
			return D0;
		} else if (Day == 28) {
			return D1;
		} else if (Day == 29) {
			return D2;
		} else if (Day == 30) {
			return D3;
		} else if (Day == 31) {
			return D4;
		} else {
			return ErrorInput;
		}
	}
}
