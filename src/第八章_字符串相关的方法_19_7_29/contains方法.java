package 第八章_字符串相关的方法_19_7_29;

/*
 * java中contains方法是判断是否存在包含关系的，
比如说集合a =[1,2,3,4]，b=1，那么a就包含b；
contains返回的是布尔类型true 和false，包含的话就返回true，不包含的话就返回false 
 */
public class contains方法 {
	public static void main(String[] args) {
		String a = "abcde";
		String b = "bc";
		System.out.println(a.contains(b));
		boolean result = a.contains(b); // 这里就是判断数字符串a是否包含者字符串b
		System.out.println(result);
	}
}
