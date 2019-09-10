package 第八章_字符串相关的方法_19_7_29;

public class substring字符串指定位置截取 {
	public static void main(String[] args) {
		String str = "abcdefg";
		// [3,最后]
		System.out.println(str.substring(3));
		// [1,3)跟随机数一样，左闭右开
		System.out.println(str.substring(1, 3));

	}
}
