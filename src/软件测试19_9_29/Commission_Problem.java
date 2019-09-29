package 软件测试19_9_29;

import java.util.Scanner;

public class Commission_Problem {
	public static void main(String[] args) {
		double SalesVolume = 0;// 总销售额
		double TotalCommission;// 总佣金
		Scanner input = new Scanner(System.in);
		System.out.println("输入销售的步枪机数量");
		int Lock = input.nextInt();
		System.out.println("输入销售的枪托数量");
		int Stock = input.nextInt();
		System.out.println("输入销售的枪管数量");
		int Barrel = input.nextInt();
		System.out.println("当月销售步枪机" + Lock + "支");
		System.out.println("当月销售枪托" + Stock + "支");
		System.out.println("当月销售枪管" + Barrel + "支");
		SalesVolume = 45 * Lock + 30 * Stock + 25 * Barrel;
		if ((Lock >= 1 && Lock <= 70) && (Stock >= 1 && Stock <= 80) && (Barrel >= 1 && Barrel <= 90)) {
			TotalCommission = CommissionLevel(SalesVolume);
			System.out.println("当月总销售额为：" + SalesVolume);
			System.out.println("当月总佣金为：" + TotalCommission);
		} else if (Lock > 70 || Stock > 80 || Barrel > 90) {
			System.out.println("零件供应不足");
			System.exit(0);
		} else {
			System.out.println("当月销量不满足一支完整的步枪");
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
