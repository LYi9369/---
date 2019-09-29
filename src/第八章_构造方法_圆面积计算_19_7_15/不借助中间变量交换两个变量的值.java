package 第八章_构造方法_圆面积计算_19_7_15;

public class 不借助中间变量交换两个变量的值 {
	public static void main(String[] args) {
		int a = 3, b = 4;
		a=a+b;//a=7
		b=a-b;
		a=a-b;
		System.out.println(a+"\t"+b);
	}
}
