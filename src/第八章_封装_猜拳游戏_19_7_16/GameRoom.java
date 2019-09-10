package 第八章_封装_猜拳游戏_19_7_16;

import java.util.Scanner;

/*
 * 问题有：
 * 1、为什么是这样的方式新建的两个玩家？
 * 2、为什么这两个玩家不用设置set和get方法？
 */
public class GameRoom {
	final int TIME = 20;
	// 属性：记分牌，道具，参与游戏的玩家，房间号,房间名，房间密码
	// 新建两个玩家并初始化
	private HumanPlayer player1 = null;
	private ComputerPlayer player2 = null;
	private int RoomId;
	private String RoomName;
	private String RoomPwd;

	// 方法：开始游戏，初始化游戏，显示菜单，选择人物，判断输赢

	public GameRoom(String RoomName, String RoomPwd) {
		// 账号和密码错误时退出程序
		if (("猜拳游戏".equals(RoomName) && "123".equals(RoomPwd))) {
			System.out.println("进入房间成功");

		} else {
			System.out.println("账号或密码错误，已退出程序");
			System.exit(0);
		}
		this.setRoomName(RoomName);
		// 把涉及到的方法都封装到游戏房间里
		// 直接调用这个构造方法就能够一次性调用所有的游戏相关方法
		InitGame();
		StartGame();
		EndGame();

	}

	// 初始化游戏
	public void InitGame() {
		// 实例化游戏玩家
		player1 = new HumanPlayer();
		player2 = new ComputerPlayer();
		System.out.print("游戏加载中");
		for (int i = 0; i < TIME; i++) {
			System.out.print("*");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("游戏加载成功！");

	}

	// 开始游戏
	public void StartGame() {
		ShowMenu();
		ChooseRole();
		Gaming();
	}

	private void Gaming() {
		while (true) {
			// 出拳
			System.out.println(player1.getName() + "请出拳:");
			// player1.setFist(new Scanner(System.in).nextInt());
			Scanner sc = new Scanner(System.in);
			player1.setFist(sc.nextInt());
			int fist1 = player1.getFist();
			// 调用getfist方法自动获得player2的出拳内容
			player2.getFist();
			int fist2 = player2.getFist();
			// 返回1 玩家1赢 返回0 平局 返回-1 玩家2赢
			int result = Judge(fist1, fist2);
			// 判断输赢
			if (result == 1) {
				// 打印结果
				System.out.println("裁判表示: 玩家" + player1.getName() + "赢了\n");
				System.out.print(player1.getName() + "说：");
				player1.sendMessage(HumanPlayer.MessageTypeWin);
				System.out.print(player2.getName() + "说：");
				player2.sendMessage(ComputerPlayer.MessageTypeLost);
			} else if (result == -1) {
				System.out.println("裁判表示: 玩家" + player2.getName() + "赢了\n");
				System.out.print(player1.getName() + "说：");
				player1.sendMessage(HumanPlayer.MessageTypeLost);
				System.out.print(player2.getName() + "说：");
				player2.sendMessage(ComputerPlayer.MessageTypeWin);
			} else {
				System.out.println("裁判表示: 平局\n");
				System.out.print(player1.getName() + "说：");
				player1.sendMessage(HumanPlayer.MessageTypeFist);
				System.out.print(player2.getName() + "说：");
				player2.sendMessage(ComputerPlayer.MessageTypeFist);
			}

			System.out.println("是否继续游戏?输入Y继续,输入N结束");
			String answer = new Scanner(System.in).next();
			// 输入的不是y就暂停运行
			if (!"Y".equalsIgnoreCase(answer)) {
				break;
			}

		}

	}

	// 展示菜单
	public void ShowMenu() {
		System.out.println("欢迎进入【" + RoomName + "】房间");
		System.out.println("出拳规则为：1-剪刀， 2-石头， 3-布");
	}

	// 选择角色
	public void ChooseRole() {
		System.out.println("请选择对方角色：1-张三， 2-李四， 3-王二， 4-刘五");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		String[] nameArray = { "张三", "李四", "王二", "刘五" };
		player1.setName("蜡笔小新");
		player2.setName(nameArray[choose - 1]);
		System.out.println(player1.getName() + "即将对战" + player2.getName());

	}

	// 判断输赢
	// 为什么不仅要让2个玩家的分数改变，也要返回-1到1的值呢？
	// 根据返回的结果来输出对应的数组的内容

	public int Judge(int fist1, int fist2) {
		// 平局
		if (fist1 == fist2) {
			return 0;
			// 玩家1赢
		} else if (fist1 == 1 && fist2 == 3 || fist2 == 2 && fist2 == 1 || fist1 == 3 && fist2 == 2) {
			player1.setScore(player1.getScore() + 1);
			player2.setScore(player2.getScore() - 1);
			return 1;
		} else {
			// 玩家2赢
			player1.setScore(player1.getScore() - 1);
			player2.setScore(player2.getScore() + 1);

			return -1;
		}

	}

	// 结束游戏
	public void EndGame() {
		System.out.println("最终得分：");
		System.out.println(player1.getName() + ":" + player1.getScore() + "分");
		System.out.println(player2.getName() + ":" + player2.getScore() + "分");
		System.out.println("游戏结束！");
	}

	public int getRoomId() {
		return RoomId;
	}

	public void setRoomId(int roomId) {
		RoomId = roomId;
	}

	public String getRoomName() {
		return RoomName;
	}

	public void setRoomName(String roomName) {
		RoomName = roomName;
	}

	public String getRoomPwd() {
		return RoomPwd;
	}

	public void setRoomPwd(String roomPwd) {
		RoomPwd = roomPwd;
	}
}
