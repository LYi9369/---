package �ھ���_�̳�_19_8_4;

public class HeroText {
	public static void main(String[] args) {
		// �½�һ������Warrior����,����ֵ
		Warrior ��� = new Warrior("���", 500);
		System.out.println(���.getNickName());
		���.move();
		Hero �ܲ�1 = new Warrior("�ܲ�", 200);
		Hero �ܲ�2 = new Warrior("�ܲ�", 200);
		�ܲ�1.setLevel(10);
		�ܲ�2.setLevel(20);
		System.out.println(�ܲ�1.compareTo(�ܲ�2));

		Archmage ���� = new Archmage("����");
		// ����.biubiubiu();
		// System.out.println("��ǰ����ֵ" + ����.getCurrLife());
		System.out.println(����);
	}
}
