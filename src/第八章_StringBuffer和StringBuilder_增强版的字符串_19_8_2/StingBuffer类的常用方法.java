package 第八章_StringBuffer和StringBuilder_增强版的字符串_19_8_2;

public class StingBuffer类的常用方法 {
	public static void main(String[] args) {
		StringBuffer strBuffer1 = new StringBuffer("Hello World!");
		StringBuffer strBuffer2 = new StringBuffer("你好 新世界!");

		// reverse 字符串反转
		System.out.println(strBuffer1.reverse());
		;
		// 插入字符串
		strBuffer2.insert(2, "abc");
		System.out.println(strBuffer2);
		// 删除字符
		strBuffer2.deleteCharAt(3);
		System.out.println(strBuffer2);
		// 删除字符串
		// 左闭右开 [0,2)
		strBuffer2.delete(0, 2);
		System.out.println(strBuffer2);
		// 字符串替换
		strBuffer1.replace(0, 2, "你好");
		System.out.println(strBuffer1);
		// 该方法也可以直接替换一个字符
		strBuffer1.replace(0, 0, "我");
		System.out.println(strBuffer1);
	}
}
