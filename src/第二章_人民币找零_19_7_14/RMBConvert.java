package 第二章_人民币找零_19_7_14;

import java.util.Scanner;

public class RMBConvert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入要转换的人民币数量：");
		double m = sc.nextDouble();
		int n = (int) m;
		// 处理元部分
		int tenyuan = n / 10;
		int fiveyuan = n % 10 / 5;
		// 处理角部分
		int jiao = (int) (m * 10) % 10;
		int fivejiao = jiao / 5;
		// int onejiao = jiao - 5;
		// int onejiao =
		// int fivejiao =
		// System.out.println("需要"+tenyuan+"张1 0元"+fiveyuan+"张5元"+ oneyuan+"张1元"
		// + +"张五角"+ +"张1角");
		if (n % 10 >= 5 && fivejiao == 1) {
			System.out.println("需要" + tenyuan + "张10元\t" + fiveyuan + "张5元\t" + (n % 10 - 5) + "张1元\t" + fivejiao
					+ "张5角\t" + (jiao - 5) + "张1角");
		} else if (n % 10 >= 5 && fivejiao != 1) {
			System.out.println("需要" + tenyuan + "张10元\t" + fiveyuan + "张5元\t" + (n % 10 - 5) + "张1元\t" + fivejiao
					+ "张5角\t" + (jiao % 5) + "张1角");
		} else if (n % 10 < 5 && fivejiao == 1) {
			System.out.println("需要" + tenyuan + "张10元\t" + fiveyuan + "张5元\t" + (n % 10 - 5) + "张1元\t" + fivejiao
					+ "张5角\t" + (jiao - 5) + "张1角");
		} else if (n % 10 < 5 && fivejiao != 1) {
			System.out.println("需要" + tenyuan + "张10元\t" + fiveyuan + "张5元\t" + (n % 10 - 5) + "张1元\t" + fivejiao
					+ "张5角\t" + (jiao - 5) + "张1角");
		}
	}
}
