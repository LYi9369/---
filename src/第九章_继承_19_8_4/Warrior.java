package �ھ���_�̳�_19_8_4;

public class Warrior extends Hero {
	// սʿ������������
	private int PysicalAttack;// ������

	public Warrior() {
		super();
	}

	// ����15�к�22�е������Ƿ���ظ���
	// ���ᡣ14���ǹ��췽���������ǿ�����ʵ����Warrior����ʱ��ͬʱ����nickName��PysicalAttackֵ����ɶ����ʼ��
	// ��22�����ǿ��Ե�����PysicalAttack���и�ֵ
	public Warrior(String nickName, int PysicalAttack) {
		setNickName(nickName);
		setPysicalAttack(PysicalAttack);
	}

	@Override
	public void move() {
		// TODO �Զ����ɵķ������
		System.out.println(getNickName() + "�ƶ�����");
	}
	//
	// public void move() {
	// System.out.println(getNickName() + "�ƶ�����");
	// }

	public int getPysicalAttack() {
		return PysicalAttack;
	}

	public void setPysicalAttack(int pysicalAttack) {
		PysicalAttack = pysicalAttack;
	}

	@Override
	public String toString() {
		return getNickName() + "\t" + getLevel() + "\t" + getPysicalAttack();
	}

}
