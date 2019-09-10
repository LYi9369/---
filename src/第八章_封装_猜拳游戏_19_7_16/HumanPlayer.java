package �ڰ���_��װ_��ȭ��Ϸ_19_7_16;

public class HumanPlayer {
	// ��ȭ���͵���Ϣ
	public static final int MessageTypeFist = 1;
	// Ӯ����ʱ����Ϣ
	public static final int MessageTypeWin = 2;
	// �����ʱ����Ϣ
	public static final int MessageTypeLost = 3;

	private String name;
	private int score;
	private int fist;
	// ��ɫ��ȭʱ˵��̨��
	private String[] fistWords = { "ӴӴŶ~~��ɱ��~~~", "�����ϳ���������", "���ҵ���������", "�ǣ���������е��~~~" };
	private String[] winWords = { "�¶����~~~~", "��˵���һ�Ӯ��", "��ûؼ�����������~~~", "���Ѵ���֮��~~~ " };
	private String[] lostWords = { "�� ����~~~��", "��������һ����~~~", "�ߣ���û���Ӻã�", "������ʧǰ�㣡" };

	// ���ݴ������Ϣ���ͣ������ӡ��Ӧ���͵���Ϣ�����紫��MessageTypeWin���͵�ֵ�����ӡString[] winWords�����������
	public void sendMessage(int msgType) {
		// ����0-3֮������������Ϊ�����Ԫ�ض���4��
		int rand = (int) (Math.random() * 1000) % 4;
		// ȡ1000���ڵ�������Ϊ����������������������˵����
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
