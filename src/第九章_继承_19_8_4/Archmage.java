package 第九章_继承_19_8_4;

public class Archmage extends Hero {
	private int magicAttack;

	public void biubiubiu() {
		System.out.println("法师" + getNickName() + "正在集气");

	}

	public Archmage() {
		setNickName("默认法师");
		setLevel(1);
		setMaxLife(10);
		setCurrLife(5);
		setMagicAttack(100);

	}

	public Archmage(String nickName) {
		// 调用自己的构造方法
		this();
		setNickName(nickName);
	}

	public int getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}

	// 将要打印的信息封装成一个方法
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
