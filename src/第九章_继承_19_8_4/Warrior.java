package 第九章_继承_19_8_4;

public class Warrior extends Hero {
	// 战士具有特有属性
	private int PysicalAttack;// 物理攻击

	public Warrior() {
		super();
	}

	// 这里15行和22行的内容是否会重复？
	// 不会。14行是构造方法，作用是可以在实例化Warrior对象时，同时传入nickName和PysicalAttack值，完成对象初始化
	// 而22行则是可以单独对PysicalAttack进行赋值
	public Warrior(String nickName, int PysicalAttack) {
		setNickName(nickName);
		setPysicalAttack(PysicalAttack);
	}

	@Override
	public void move() {
		// TODO 自动生成的方法存根
		System.out.println(getNickName() + "移动靠走");
	}
	//
	// public void move() {
	// System.out.println(getNickName() + "移动靠腿");
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
