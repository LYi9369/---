package �ڰ���_��װ_��ȭ��Ϸ_19_7_16;

import java.util.Scanner;

/*
 * �����У�
 * 1��Ϊʲô�������ķ�ʽ�½���������ң�
 * 2��Ϊʲô��������Ҳ�������set��get������
 */
public class GameRoom {
	final int TIME = 20;
	// ���ԣ��Ƿ��ƣ����ߣ�������Ϸ����ң������,����������������
	// �½�������Ҳ���ʼ��
	private HumanPlayer player1 = null;
	private ComputerPlayer player2 = null;
	private int RoomId;
	private String RoomName;
	private String RoomPwd;

	// ��������ʼ��Ϸ����ʼ����Ϸ����ʾ�˵���ѡ������ж���Ӯ

	public GameRoom(String RoomName, String RoomPwd) {
		// �˺ź��������ʱ�˳�����
		if (("��ȭ��Ϸ".equals(RoomName) && "123".equals(RoomPwd))) {
			System.out.println("���뷿��ɹ�");

		} else {
			System.out.println("�˺Ż�����������˳�����");
			System.exit(0);
		}
		this.setRoomName(RoomName);
		// ���漰���ķ�������װ����Ϸ������
		// ֱ�ӵ���������췽�����ܹ�һ���Ե������е���Ϸ��ط���
		InitGame();
		StartGame();
		EndGame();

	}

	// ��ʼ����Ϸ
	public void InitGame() {
		// ʵ������Ϸ���
		player1 = new HumanPlayer();
		player2 = new ComputerPlayer();
		System.out.print("��Ϸ������");
		for (int i = 0; i < TIME; i++) {
			System.out.print("*");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("��Ϸ���سɹ���");

	}

	// ��ʼ��Ϸ
	public void StartGame() {
		ShowMenu();
		ChooseRole();
		Gaming();
	}

	private void Gaming() {
		while (true) {
			// ��ȭ
			System.out.println(player1.getName() + "���ȭ:");
			// player1.setFist(new Scanner(System.in).nextInt());
			Scanner sc = new Scanner(System.in);
			player1.setFist(sc.nextInt());
			int fist1 = player1.getFist();
			// ����getfist�����Զ����player2�ĳ�ȭ����
			player2.getFist();
			int fist2 = player2.getFist();
			// ����1 ���1Ӯ ����0 ƽ�� ����-1 ���2Ӯ
			int result = Judge(fist1, fist2);
			// �ж���Ӯ
			if (result == 1) {
				// ��ӡ���
				System.out.println("���б�ʾ: ���" + player1.getName() + "Ӯ��\n");
				System.out.print(player1.getName() + "˵��");
				player1.sendMessage(HumanPlayer.MessageTypeWin);
				System.out.print(player2.getName() + "˵��");
				player2.sendMessage(ComputerPlayer.MessageTypeLost);
			} else if (result == -1) {
				System.out.println("���б�ʾ: ���" + player2.getName() + "Ӯ��\n");
				System.out.print(player1.getName() + "˵��");
				player1.sendMessage(HumanPlayer.MessageTypeLost);
				System.out.print(player2.getName() + "˵��");
				player2.sendMessage(ComputerPlayer.MessageTypeWin);
			} else {
				System.out.println("���б�ʾ: ƽ��\n");
				System.out.print(player1.getName() + "˵��");
				player1.sendMessage(HumanPlayer.MessageTypeFist);
				System.out.print(player2.getName() + "˵��");
				player2.sendMessage(ComputerPlayer.MessageTypeFist);
			}

			System.out.println("�Ƿ������Ϸ?����Y����,����N����");
			String answer = new Scanner(System.in).next();
			// ����Ĳ���y����ͣ����
			if (!"Y".equalsIgnoreCase(answer)) {
				break;
			}

		}

	}

	// չʾ�˵�
	public void ShowMenu() {
		System.out.println("��ӭ���롾" + RoomName + "������");
		System.out.println("��ȭ����Ϊ��1-������ 2-ʯͷ�� 3-��");
	}

	// ѡ���ɫ
	public void ChooseRole() {
		System.out.println("��ѡ��Է���ɫ��1-������ 2-���ģ� 3-������ 4-����");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		String[] nameArray = { "����", "����", "����", "����" };
		player1.setName("����С��");
		player2.setName(nameArray[choose - 1]);
		System.out.println(player1.getName() + "������ս" + player2.getName());

	}

	// �ж���Ӯ
	// Ϊʲô����Ҫ��2����ҵķ����ı䣬ҲҪ����-1��1��ֵ�أ�
	// ���ݷ��صĽ���������Ӧ�����������

	public int Judge(int fist1, int fist2) {
		// ƽ��
		if (fist1 == fist2) {
			return 0;
			// ���1Ӯ
		} else if (fist1 == 1 && fist2 == 3 || fist2 == 2 && fist2 == 1 || fist1 == 3 && fist2 == 2) {
			player1.setScore(player1.getScore() + 1);
			player2.setScore(player2.getScore() - 1);
			return 1;
		} else {
			// ���2Ӯ
			player1.setScore(player1.getScore() - 1);
			player2.setScore(player2.getScore() + 1);

			return -1;
		}

	}

	// ������Ϸ
	public void EndGame() {
		System.out.println("���յ÷֣�");
		System.out.println(player1.getName() + ":" + player1.getScore() + "��");
		System.out.println(player2.getName() + ":" + player2.getScore() + "��");
		System.out.println("��Ϸ������");
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
