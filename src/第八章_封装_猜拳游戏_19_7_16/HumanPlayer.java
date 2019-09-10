package 第八章_封装_猜拳游戏_19_7_16;

public class HumanPlayer {
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
	private String[] fistWords = { "哟哟哦~~必杀技~~~", "该我上场表演拉！", "瞧我的力量！！", "呵！你的智商有点低~~~" };
	private String[] winWords = { "孤独求败~~~~", "早说了我会赢！", "你该回家再练练！！~~~", "不费吹灰之力~~~ " };
	private String[] lostWords = { "呃 啊！~~~·", "再来，你一定输~~~", "哼！我没发挥好！", "啊！马失前蹄！" };

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

	public void setFist(int fist) {
		this.fist = fist;
	}

	public int getFist() {
		return fist;
	}

}
