package �ڰ���_��������_19_7_8;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProductManage {
	final static int N = 2;

	public static void main(String[] args) {
		int counts[] = new int[N];
		// ֧���ܽ��
		double total = 0;
		// �����������飨���ǻ�û�з����ڴ�ռ䣩
		Product[] products = new Product[N];

		for (int i = 0; i < N; i++) {
			// �����ڴ�ռ�
			// �ұߵ�new Product()���ڶ��ڴ�������һ��ռ䣬Ȼ�������ռ�ĵ�ַ�������
			products[i] = new Product();
			// ������Ʒ����
			// Product product = new Product();
			String name = JOptionPane.showInputDialog("������Ʒ���ƣ�");
			// ��һ�к�syso��һ������˼�𣿾��Ǵ�ӡһ�����ݣ�
			// ��һ����ʹ�������������ֱ�ӵ���һ����Ϣ��ʾ��Ȼ������������ݣ���ֱ��һ�㣡
			products[i].setName(name);
			// System.out.println("������Ʒ���ۣ�");
			// product.setPrice(new Scanner(System.in).nextDouble());
			String strprice = JOptionPane.showInputDialog("������Ʒ���ۣ�");
			products[i].setPrice(Double.parseDouble(strprice));
			// System.out.println("���빺��������");
			// counts[i] = new Scanner(System.in).nextInt();
			String strcount = JOptionPane.showInputDialog("���빺��������");
			counts[i] = Integer.parseInt(strcount);
			// �ܽ��
			total += counts[i] * products[i].getPrice();
		}
		for (int i = 0; i < products.length; i++) {
			// ��ӡ��Ʒ��Ϣ
			System.out.println(products[i].getName() + "\t" + products[i].getPrice());
		}
		System.out.println("��Ʒ�ܼ�Ϊ��" + total);

		// int[] count = new int[N];
		// double total = 0;
		// // ������������
		// Product[] products = new Product[N];
		// for (int i = 0; i < products.length; i++) {
		// // ��ÿ����������Ԫ�ط����ڴ�ռ�
		// products[i] = new Product();
		//
		// System.out.println("������Ʒ���ƣ�");
		// products[i].setName(new Scanner(System.in).next());
		// System.out.println("������Ʒ�۸�");
		// products[i].setPrice(new Scanner(System.in).nextDouble());
		// System.out.println("������Ʒ������");
		// count[i] = new Scanner(System.in).nextInt();
		//
		// total += count[i] * products[i].getPrice();
		// }
		// for (int j = 0; j < products.length; j++) {
		// System.out.println("��Ʒ����\t" + products[j].getName() + "��Ʒ�۸�" +
		// products[j].getPrice());
		// }
		// System.out.println("�ܼ�Ϊ��" + total);
		// }

		// ����3����������
		// Product[] products = new Product[3];
		// for (int i = 0; i < 3; i++) {
		// products[i] = new Product();
		// products[i].setName(new Scanner(System.in).next());
		// System.out.println(products[i].getName());
		// }
	}
}
