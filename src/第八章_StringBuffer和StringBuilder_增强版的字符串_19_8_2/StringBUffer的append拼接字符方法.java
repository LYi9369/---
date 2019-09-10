package �ڰ���_StringBuffer��StringBuilder_��ǿ����ַ���_19_8_2;

/*
 * StringBuffer��append�������Լ��������ַ���ƴ�ӵ��ٶ�
 * ��StringBuilder��append��������StringBuffer��ǿ��
 */
public class StringBUffer��appendƴ���ַ����� {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "def";
		String str3 = str1 + str2;
		// ��Ϊ�ַ������ܸı䣬�����������ַ����Ǵ������µ��ַ�������Ȼ�����ƴ��

		long startTime = System.currentTimeMillis();
		String str = "*";
		int N = 1000000;
		for (int i = 0; i < N; i++) {
			str += "*";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("+=��ʱ" + (endTime - startTime) + "ms");

		startTime = System.currentTimeMillis();
		StringBuffer str4 = new StringBuffer("*");
		for (int i = 0; i < N; i++) {
			str4.append("*");
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer��append������ʱ" + (endTime - startTime) + "ms");

		startTime = System.currentTimeMillis();
		StringBuilder str5 = new StringBuilder("*");
		for (int i = 0; i < N; i++) {
			str5.append("*");
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder��append������ʱ" + (endTime - startTime) + "ms");

	}
}
