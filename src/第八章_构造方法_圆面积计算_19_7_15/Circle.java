package 第八章_构造方法_圆面积计算_19_7_15;

import java.util.Scanner;

public class Circle {
	// 半径
	private double radius;
	// 周长
	private double perimeter;
	// 面积
	private double area;

	public void InputRadius() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		// double radius = sc.nextDouble();
		radius = sc.nextDouble();
	}

	public void ShowPerimeter() {
		if (radius <= 0) {
			System.out.println("输入有误请重新输入！");
			InputRadius();
		} else {
			perimeter = 2 * Math.PI * radius;
			System.out.println("半径为" + radius + "的圆的周长为" + perimeter);
		}
	}

	public void ShowArea() {
		if (radius <= 0) {
			System.out.println("输入有误，请重新输入！");
			InputRadius();
		} else {
			area = Math.PI * radius * radius;
			System.out.println("半径为" + radius + "的圆的面积为" + area);
		}
	}
}
