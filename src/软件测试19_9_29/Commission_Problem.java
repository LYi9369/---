package �������19_9_29;

import java.util.Scanner;

public class Commission_Problem {
	public static void main(String[] args) {
		double SalesVolume = 0;// �����۶�
		double TotalCommission;// ��Ӷ��
		Scanner input = new Scanner(System.in);
		System.out.println("�������۵Ĳ�ǹ������");
		int Lock = input.nextInt();
		System.out.println("�������۵�ǹ������");
		int Stock = input.nextInt();
		System.out.println("�������۵�ǹ������");
		int Barrel = input.nextInt();
		System.out.println("�������۲�ǹ��" + Lock + "֧");
		System.out.println("��������ǹ��" + Stock + "֧");
		System.out.println("��������ǹ��" + Barrel + "֧");
		SalesVolume = 45 * Lock + 30 * Stock + 25 * Barrel;
		if ((Lock >= 1 && Lock <= 70) && (Stock >= 1 && Stock <= 80) && (Barrel >= 1 && Barrel <= 90)) {
			TotalCommission = CommissionLevel(SalesVolume);
			System.out.println("���������۶�Ϊ��" + SalesVolume);
			System.out.println("������Ӷ��Ϊ��" + TotalCommission);
		} else if (Lock > 70 || Stock > 80 || Barrel > 90) {
			System.out.println("�����Ӧ����");
			System.exit(0);
		} else {
			System.out.println("��������������һ֧�����Ĳ�ǹ");
			System.exit(0);
		}
	}

	public static double CommissionLevel(double SalesVolume) {
		if (SalesVolume <= 1000) {
			return (SalesVolume * 0.1);
		} else if (SalesVolume > 1000 && SalesVolume <= 1800) {
			return (SalesVolume - 1000) * 0.15 + 100;
		} else
			return (SalesVolume - 1800) * 0.2 + 120;

	}
}
