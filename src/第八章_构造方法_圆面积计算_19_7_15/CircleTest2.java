package 第八章_构造方法_圆面积计算_19_7_15;

/*
 * 直接重载构造方法获得半径和面积
 * 为什么我的显示不了结果？主要问题是键入的值传递不进方法里，然后也显示不出来
 * 错误原因：Circle类中29行circle变量多加了double前缀
 * 因为此时30行的radius已经有值了，通过17行的构造方法Circle2获得了radius的值
 */
public class CircleTest2 {
	public static void main(String[] args) {
		Circle2 circle = new Circle2();
		circle.ShowPerimeter();
		circle.ShowArea();
	}
}
