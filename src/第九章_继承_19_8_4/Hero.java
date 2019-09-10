package 第九章_继承_19_8_4;

public class Hero {
	private String NickName;
	private int level;
	private int MaxLife;
	private int CurrLife;

	public Hero() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Hero(String nickName, int level, int maxLife, int currLife) {
		super();
		NickName = nickName;
		this.level = level;
		MaxLife = maxLife;
		CurrLife = currLife;
	}

	// 比较当前的this.level和传进来的getLevel的大小
	public int compareTo(Hero hero) {
		if (this.level > hero.getLevel())
			return 1;
		else if (this.level == hero.getLevel()) {
			return 0;
		} else {
			return -1;
		}
	}

	public void move() {
		System.out.println("Hero的move方法");
	}

	public String getNickName() {
		return NickName;
	}

	public void setNickName(String nickName) {
		NickName = nickName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMaxLife() {
		return MaxLife;
	}

	public void setMaxLife(int maxLife) {
		MaxLife = maxLife;
	}

	public int getCurrLife() {
		return CurrLife;
	}

	public void setCurrLife(int currLife) {
		CurrLife = currLife;
	}

}
