package �ڶ���_���������_19_7_14;

import java.util.Scanner;

public class RMBConvert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ҫת���������������");
		double m = sc.nextDouble();
		int n = (int) m;
		// ����Ԫ����
		int tenyuan = n / 10;
		int fiveyuan = n % 10 / 5;
		// ����ǲ���
		int jiao = (int) (m * 10) % 10;
		int fivejiao = jiao / 5;
		// int onejiao = jiao - 5;
		// int onejiao =
		// int fivejiao =
		// System.out.println("��Ҫ"+tenyuan+"��1 0Ԫ"+fiveyuan+"��5Ԫ"+ oneyuan+"��1Ԫ"
		// + +"�����"+ +"��1��");
		if (n % 10 >= 5 && fivejiao == 1) {
			System.out.println("��Ҫ" + tenyuan + "��10Ԫ\t" + fiveyuan + "��5Ԫ\t" + (n % 10 - 5) + "��1Ԫ\t" + fivejiao
					+ "��5��\t" + (jiao - 5) + "��1��");
		} else if (n % 10 >= 5 && fivejiao != 1) {
			System.out.println("��Ҫ" + tenyuan + "��10Ԫ\t" + fiveyuan + "��5Ԫ\t" + (n % 10 - 5) + "��1Ԫ\t" + fivejiao
					+ "��5��\t" + (jiao % 5) + "��1��");
		} else if (n % 10 < 5 && fivejiao == 1) {
			System.out.println("��Ҫ" + tenyuan + "��10Ԫ\t" + fiveyuan + "��5Ԫ\t" + (n % 10 - 5) + "��1Ԫ\t" + fivejiao
					+ "��5��\t" + (jiao - 5) + "��1��");
		} else if (n % 10 < 5 && fivejiao != 1) {
			System.out.println("��Ҫ" + tenyuan + "��10Ԫ\t" + fiveyuan + "��5Ԫ\t" + (n % 10 - 5) + "��1Ԫ\t" + fivejiao
					+ "��5��\t" + (jiao - 5) + "��1��");
		}
	}
}
