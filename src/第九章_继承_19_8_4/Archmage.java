package �ھ���_�̳�_19_8_4;

public class Archmage extends Hero {
	private int magicAttack;

	public void biubiubiu() {
		System.out.println("��ʦ" + getNickName() + "���ڼ���");

	}

	public Archmage() {
		setNickName("Ĭ�Ϸ�ʦ");
		setLevel(1);
		setMaxLife(10);
		setCurrLife(5);
		setMagicAttack(100);

	}

	public Archmage(String nickName) {
		// �����Լ��Ĺ��췽��
		this();
		setNickName(nickName);
	}

	public int getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}

	// ��Ҫ��ӡ����Ϣ��װ��һ������
	public String toString() {
		StringBuffer str = new StringBuffer(getLevel());
		str.append("\t");
		str.append(getNickName());
		str.append("\t");
		str.append(getMaxLife());
		str.append("\t");
		str.append(getCurrLife());
		str.append("\t");
		return str.toString();
	}

}
