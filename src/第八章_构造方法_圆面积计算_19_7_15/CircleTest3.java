package 第八章_构造方法_圆面积计算_19_7_15;

import java.util.Scanner;

/*
 * 唯一的问题是如何把键入的值传到类中使用？
 * 错在没有Circle3类中46 47行。没有调用那两个方法，而是错误地调用值
 */
public class CircleTest3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("输入圆的半径：");
		double radius = sc.nextDouble();
		Circle3 circle = new Circle3(radius);
		circle.Show();
	}
}
