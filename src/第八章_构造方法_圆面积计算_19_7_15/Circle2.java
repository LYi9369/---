package �ڰ���_���췽��_Բ�������_19_7_15;

import java.util.Scanner;

public class Circle2 {
	// �뾶
	private double radius;
	// �ܳ�
	private double perimeter;
	// ���
	private double area;

	public Circle2() {
		InputRadius();
	}

	public Circle2(double radius) {
		if (radius <= 0) {
			InputRadius();
		} else {
			// this.radius = radius;
			this.radius = radius;
		}
	}

	public void InputRadius() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		// double radius = sc.nextDouble();
		radius = sc.nextDouble();
	}

	public void ShowPerimeter() {
		if (radius <= 0) {
			System.out.println("�����������������룡");
			InputRadius();
		} else {
			perimeter = 2 * Math.PI * radius;
			System.out.println("�뾶Ϊ" + radius + "��Բ���ܳ�Ϊ" + perimeter);
		}
	}

	public void ShowArea() {
		if (radius <= 0) {
			System.out.println("�����������������룡");
			InputRadius();
		} else {
			area = Math.PI * radius * radius;
			System.out.println("�뾶Ϊ" + radius + "��Բ�����Ϊ" + area);
		}
	}

}
