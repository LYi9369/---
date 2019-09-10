package 第八章_封装_猜拳游戏_19_7_16;

public class TestMain {
	public static void main(String[] args) {
		// HumanPlayer player = new HumanPlayer();
		// // 调用sendMessage方法，然后直接打印需要输出的消息类型。例如我要打印输了后要说的话
		// player.sendMessage(HumanPlayer.MessageTypeLost);
		// // 等价于 hp.sendMessage(3);

		new GameRoom("猜拳游戏", "123");
	}
}
