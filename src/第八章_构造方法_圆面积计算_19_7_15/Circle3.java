package �ڰ���_���췽��_Բ�������_19_7_15;

import java.util.Scanner;

/*
 * Ϊʲô�ܳ����������Ҫset?
 * ��Ϊset�����ô��λ��ֵ�������������Ե�ֵ�Ѿ���ͨ���Լ�д�ķ������
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
		// ʹ�÷�װ���м򵥵�����ֵ����֤
		if (radius <= 0) {
			System.out.println("��������");
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
		// System.out.println("�뾶Ϊ" + this.radius + "��Բ���ܳ�Ϊ" + this.perimeter);
		// System.out.println("�뾶Ϊ" + this.radius + "��Բ�����Ϊ" + this.area);

		System.out.println("�뾶Ϊ" + this.radius + "��Բ���ܳ�Ϊ" + this.getPerimeter());
		System.out.println("�뾶Ϊ" + this.radius + "��Բ�����Ϊ" + this.getArea());

	}
}
