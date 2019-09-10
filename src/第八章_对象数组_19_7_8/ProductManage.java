package 第八章_对象数组_19_7_8;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProductManage {
	final static int N = 2;

	public static void main(String[] args) {
		int counts[] = new int[N];
		// 支付总金额
		double total = 0;
		// 创建对象数组（但是还没有分配内存空间）
		Product[] products = new Product[N];

		for (int i = 0; i < N; i++) {
			// 分配内存空间
			// 右边的new Product()，在堆内存里申请一块空间，然后把这个空间的地址赋给左边
			products[i] = new Product();
			// 创建商品对象
			// Product product = new Product();
			String name = JOptionPane.showInputDialog("输入商品名称：");
			// 这一行和syso是一样的意思吗？就是打印一行内容？
			// 不一样。使用这个方法可以直接弹出一个消息提示框，然后可以输入数据，更直观一点！
			products[i].setName(name);
			// System.out.println("输入商品单价：");
			// product.setPrice(new Scanner(System.in).nextDouble());
			String strprice = JOptionPane.showInputDialog("输入商品单价：");
			products[i].setPrice(Double.parseDouble(strprice));
			// System.out.println("输入购买数量：");
			// counts[i] = new Scanner(System.in).nextInt();
			String strcount = JOptionPane.showInputDialog("输入购买数量：");
			counts[i] = Integer.parseInt(strcount);
			// 总金额
			total += counts[i] * products[i].getPrice();
		}
		for (int i = 0; i < products.length; i++) {
			// 打印商品信息
			System.out.println(products[i].getName() + "\t" + products[i].getPrice());
		}
		System.out.println("商品总价为：" + total);

		// int[] count = new int[N];
		// double total = 0;
		// // 创建对象数组
		// Product[] products = new Product[N];
		// for (int i = 0; i < products.length; i++) {
		// // 给每个对象数组元素分配内存空间
		// products[i] = new Product();
		//
		// System.out.println("输入商品名称：");
		// products[i].setName(new Scanner(System.in).next());
		// System.out.println("输入商品价格：");
		// products[i].setPrice(new Scanner(System.in).nextDouble());
		// System.out.println("输入商品数量：");
		// count[i] = new Scanner(System.in).nextInt();
		//
		// total += count[i] * products[i].getPrice();
		// }
		// for (int j = 0; j < products.length; j++) {
		// System.out.println("商品名称\t" + products[j].getName() + "商品价格" +
		// products[j].getPrice());
		// }
		// System.out.println("总价为：" + total);
		// }

		// 创建3个对象数组
		// Product[] products = new Product[3];
		// for (int i = 0; i < 3; i++) {
		// products[i] = new Product();
		// products[i].setName(new Scanner(System.in).next());
		// System.out.println(products[i].getName());
		// }
	}
}
