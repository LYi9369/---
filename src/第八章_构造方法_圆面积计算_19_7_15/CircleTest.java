package 第八章_构造方法_圆面积计算_19_7_15;

/*
 * 出错的原因在于Circle类的16行，不能加前缀double
 * 因为这个radius已经是自己定义好的属性，所以不必再加double重复定义
 */
public class CircleTest {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.InputRadius();
		circle.ShowPerimeter();
		circle.ShowArea();
	}
}
