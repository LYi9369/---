package 第八章_用户注册_19_7_29;

import java.util.Scanner;
import javax.swing.JOptionPane;

//实现用户注册
public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 每次输入相应内容后，都判断是否符合要求
		// System.out.println("请输入用户名：");
		// String UserName = sc.next();
		// System.out.println("请输入密码：");
		// System.out.println(StringUtil_工具类.ValidDataPwd(Pwd));
		// String Pwd = sc.next();

		String Pwd = JOptionPane.showInputDialog("请输入密码：");
		JOptionPane.showMessageDialog(null, StringUtil_工具类.ValidDataPwd(Pwd), "提示", JOptionPane.INFORMATION_MESSAGE);

		// System.out.println("请输入邮箱：");
		// String Email = sc.next();

	}
}
