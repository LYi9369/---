package �ڰ���_StringBuffer��StringBuilder_��ǿ����ַ���_19_8_2;

public class StingBuffer��ĳ��÷��� {
	public static void main(String[] args) {
		StringBuffer strBuffer1 = new StringBuffer("Hello World!");
		StringBuffer strBuffer2 = new StringBuffer("��� ������!");

		// reverse �ַ�����ת
		System.out.println(strBuffer1.reverse());
		;
		// �����ַ���
		strBuffer2.insert(2, "abc");
		System.out.println(strBuffer2);
		// ɾ���ַ�
		strBuffer2.deleteCharAt(3);
		System.out.println(strBuffer2);
		// ɾ���ַ���
		// ����ҿ� [0,2)
		strBuffer2.delete(0, 2);
		System.out.println(strBuffer2);
		// �ַ����滻
		strBuffer1.replace(0, 2, "���");
		System.out.println(strBuffer1);
		// �÷���Ҳ����ֱ���滻һ���ַ�
		strBuffer1.replace(0, 0, "��");
		System.out.println(strBuffer1);
	}
}
