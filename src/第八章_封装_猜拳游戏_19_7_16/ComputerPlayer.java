package 第八章_封装_猜拳游戏_19_7_16;

public class ComputerPlayer {
	// 出拳类型的信息
	public static final int MessageTypeFist = 1;
	// 赢比赛时的信息
	public static final int MessageTypeWin = 2;
	// 输比赛时的信息
	public static final int MessageTypeLost = 3;

	private String name;
	private int score;
	private int fist;
	// 角色出拳时说的台词
	private String[] fistWords = { "动感光波~~~", "我出必杀技！", "吃我一拳！", "大象的鼻子为什么这么长？" };
	private String[] winWords = { "还有谁~~~~", "吃着火锅唱着歌就赢了！", "全军出击~~~", "耶耶耶耶~~我赢了~~~ " };
	private String[] lostWords = { "呜呜呜呜~~~·", "我一定会回来的~~~", "哼！这次算你运气好！", "即使我输了，那也只是我失误了！" };

	// 根据传入的消息类型，随机打印对应类型的消息，例如传入MessageTypeWin类型的值，则打印String[] winWords数组里的内容
	public void sendMessage(int msgType) {
		// 生成0-3之间的随机数。因为数组的元素都是4个
		int rand = (int) (Math.random() * 1000) % 4;
		// 取1000以内的数字作为随机数，可以增加随机数的说服力
		String message = null;
		switch (msgType) {
		case MessageTypeFist:
			message = fistWords[rand];
			break;

		case MessageTypeWin:
			message = winWords[rand];
			break;

		case MessageTypeLost:
			message = lostWords[rand];
			break;

		}
		System.out.println(message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getFist() {
		// 机器人是自动出拳，也就是自动生成1-3的数字
		fist = (int) ((Math.random() * 1000) % 3 + 1);
		return fist;
	}

}
