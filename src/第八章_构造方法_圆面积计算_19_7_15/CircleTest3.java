package �ڰ���_���췽��_Բ�������_19_7_15;

import java.util.Scanner;

/*
 * Ψһ����������ΰѼ����ֵ��������ʹ�ã�
 * ����û��Circle3����46 47�С�û�е������������������Ǵ���ص���ֵ
 */
public class CircleTest3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("����Բ�İ뾶��");
		double radius = sc.nextDouble();
		Circle3 circle = new Circle3(radius);
		circle.Show();
	}
}
