package 第八章_构造方法_圆面积计算_19_7_15;

import java.util.Scanner;

/*
 * 为什么周长和面积不需要set?
 * 因为set是利用传参获得值，而这两个属性的值已经是通过自己写的方法获得
 */
public class Circle3 {
	private double radius;
	private double perimeter;
	private double area;

	public double getRadius() {
		return radius;
	}

	public Circle3() {
	}

	public Circle3(double radius) {
		this.setRadius(radius);
	}

	public void setRadius(double radius) {
		// 使用封装进行简单的属性值的验证
		if (radius <= 0) {
			System.out.println("输入有误");
			System.exit(0);
		} else {
			this.radius = radius;
		}
	}

	public double getPerimeter() {

		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	public double getArea() {
		area = Math.PI * radius * radius;
		return area;
	}

	public void Show() {
		// System.out.println("半径为" + this.radius + "的圆的周长为" + this.perimeter);
		// System.out.println("半径为" + this.radius + "的圆的面积为" + this.area);

		System.out.println("半径为" + this.radius + "的圆的周长为" + this.getPerimeter());
		System.out.println("半径为" + this.radius + "的圆的面积为" + this.getArea());

	}
}
