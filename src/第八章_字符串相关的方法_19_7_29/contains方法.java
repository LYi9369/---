package �ڰ���_�ַ�����صķ���_19_7_29;

/*
 * java��contains�������ж��Ƿ���ڰ�����ϵ�ģ�
����˵����a =[1,2,3,4]��b=1����ôa�Ͱ���b��
contains���ص��ǲ�������true ��false�������Ļ��ͷ���true���������Ļ��ͷ���false 
 */
public class contains���� {
	public static void main(String[] args) {
		String a = "abcde";
		String b = "bc";
		System.out.println(a.contains(b));
		boolean result = a.contains(b); // ��������ж����ַ���a�Ƿ�������ַ���b
		System.out.println(result);
	}
}
