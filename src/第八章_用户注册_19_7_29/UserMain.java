package �ڰ���_�û�ע��_19_7_29;

import java.util.Scanner;
import javax.swing.JOptionPane;

//ʵ���û�ע��
public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ÿ��������Ӧ���ݺ󣬶��ж��Ƿ����Ҫ��
		// System.out.println("�������û�����");
		// String UserName = sc.next();
		// System.out.println("���������룺");
		// System.out.println(StringUtil_������.ValidDataPwd(Pwd));
		// String Pwd = sc.next();

		String Pwd = JOptionPane.showInputDialog("���������룺");
		JOptionPane.showMessageDialog(null, StringUtil_������.ValidDataPwd(Pwd), "��ʾ", JOptionPane.INFORMATION_MESSAGE);

		// System.out.println("���������䣺");
		// String Email = sc.next();

	}
}
