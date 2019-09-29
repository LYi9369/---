package 软件测试19_9_29;

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
		JOptionPane.showMessageDialog(null, "输入需要求NextDate的日期,年份的有效取值范围为[1818,2018]");
		String year = JOptionPane.showInputDialog(null, "年份:");
		String month = JOptionPane.showInputDialog(null, "月份:");
		String day = JOptionPane.showInputDialog(null, "日期:");
		int Year = Integer.valueOf(year);
		int Month = Integer.valueOf(month);
		int Day = Integer.valueOf(day);
		if (Year <= 1818 || Year >= 2018) {
			JOptionPane.showMessageDialog(null, "输入的年份有误！", "错误", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		if (MonthType(Month) != ErrorInput && DayType(Day) != ErrorInput) {
			/* 符合 年份条件且符合当前日期条件的任何一天都是日期直接加1 */
			if (DayType(Day) == D0) {
				JOptionPane.showMessageDialog(null, Year + "年" + Month + "月" + (Day + 1) + "日");
			}
			/* 12-31日 */
			if ((MonthType(Month) == M4) && (DayType(Day) == D4)) {
				JOptionPane.showMessageDialog(null, (Year + 1) + "年" + 1 + "月" + 1 + "日");
			}
			if (IsLeapYear(Year)) {// 闰年
				if ((MonthType(Month) == M1) && (DayType(Day) == D1 || DayType(Day) == D2
						|| DayType(Day) == D3)) {/* 1 3 5 7 8 10月 */
					JOptionPane.showMessageDialog(null, Year + "年" + Month + "月" + (Day + 1) + "日");
				}
				if ((MonthType(Month) == M1) && (DayType(Day) == D4)) {
					JOptionPane.showMessageDialog(null, Year + "年" + (Month + 1) + "月" + 1 + "日");
				}
				if ((MonthType(Month) == M2) && (DayType(Day) == D1
						|| DayType(Day) == D2)) {/* 1 3 5 7 8 10月 */
					JOptionPane.showMessageDialog(null, Year + "年" + (Month) + "月" + (Day + 1) + "日");
				}
				if ((MonthType(Month) == M2)
						&& (DayType(Day) == D3)) {/* 4 6 9 11月 */
					JOptionPane.showMessageDialog(null, Year + "年" + (Month + 1) + "月" + 1 + "日");
				}
				if ((MonthType(Month) == M3) && (DayType(Day) == D1)) {/* 2月 */
					JOptionPane.showMessageDialog(null, Year + "年" + (Month) + "月" + (Day + 1) + "日");
				}
				if ((MonthType(Month) == M3)
						&& (DayType(Day) == D2)) {/* 2-29日 */
					JOptionPane.showMessageDialog(null, Year + "年" + (Month + 1) + "月" + 1 + "日");
				}
			} else {// 平年
				if ((MonthType(Month) == M1) && (DayType(Day) == D1 || DayType(Day) == D2
						|| DayType(Day) == D3)) {/* 1 3 5 7 8 10月 */
					JOptionPane.showMessageDialog(null, Year + "年" + Month + "月" + (Day + 1) + "日");
				}
				if ((MonthType(Month) == M1) && (DayType(Day) == D4)) {
					JOptionPane.showMessageDialog(null, Year + "年" + (Month + 1) + "月" + 1 + "日");
				}
				if ((MonthType(Month) == M2) && (DayType(Day) == D1
						|| DayType(Day) == D2)) {/* 1 3 5 7 8 10月 */
					JOptionPane.showMessageDialog(null, Year + "年" + (Month) + "月" + (Day + 1) + "日");
				}
				if ((MonthType(Month) == M2)
						&& (DayType(Day) == D3)) {/* 4 6 9 11月 */
					JOptionPane.showMessageDialog(null, Year + "年" + (Month + 1) + "月" + 1 + "日");
				}
				if ((MonthType(Month) == M3) && (DayType(Day) == D1)) {/* 2月 */
					JOptionPane.showMessageDialog(null, Year + "年" + (Month) + "月" + (Day + 1) + "日");
				}
			}
		} else if (MonthType(Month) == ErrorInput && DayType(Day) != ErrorInput) {
			JOptionPane.showMessageDialog(null, "输入的月份有误！", "错误", JOptionPane.ERROR_MESSAGE);
			// System.out.println("输入有误！");
		} else if (MonthType(Month) != ErrorInput && DayType(Day) == ErrorInput) {
			JOptionPane.showMessageDialog(null, "输入的日期有误！", "错误", JOptionPane.ERROR_MESSAGE);
		} else if (MonthType(Month) == ErrorInput && DayType(Day) == ErrorInput) {
			JOptionPane.showMessageDialog(null, "输入的月份和日期都有误！" + MonthType(Month) + DayType(Day), "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}// 输入2000-15-1 输出月份和日期都错 ······ MonthType(Month)=0 DayType(Day)=0
		// 原因是12行我把D0设置成了0，导致与返回值ErrorInput一样

	public static boolean IsLeapYear(int year) { // 先判断是否为闰年:能被4整除但不能被100整除，或者能被400整除的年份。
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return true;
		else {
			return false;
		}
	}

	public static int MonthType(int Month) {// 匹配月份的类型
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

	public static int DayType(int Day) {// 匹配日期的类型
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
