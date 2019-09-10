package 第八章_StringBuffer和StringBuilder_增强版的字符串_19_8_2;

/*
 * StringBuffer的append方法可以极大地提高字符串拼接的速度
 * 而StringBuilder的append方法则是StringBuffer增强版
 */
public class StringBUffer的append拼接字符方法 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "def";
		String str3 = str1 + str2;
		// 因为字符串不能改变，所所以用这种方法是创建了新的字符串对象，然后进行拼接

		long startTime = System.currentTimeMillis();
		String str = "*";
		int N = 1000000;
		for (int i = 0; i < N; i++) {
			str += "*";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("+=耗时" + (endTime - startTime) + "ms");

		startTime = System.currentTimeMillis();
		StringBuffer str4 = new StringBuffer("*");
		for (int i = 0; i < N; i++) {
			str4.append("*");
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer的append方法耗时" + (endTime - startTime) + "ms");

		startTime = System.currentTimeMillis();
		StringBuilder str5 = new StringBuilder("*");
		for (int i = 0; i < N; i++) {
			str5.append("*");
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder的append方法耗时" + (endTime - startTime) + "ms");

	}
}
