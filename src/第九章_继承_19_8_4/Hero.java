package �ھ���_�̳�_19_8_4;

public class Hero {
	private String NickName;
	private int level;
	private int MaxLife;
	private int CurrLife;

	public Hero() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Hero(String nickName, int level, int maxLife, int currLife) {
		super();
		NickName = nickName;
		this.level = level;
		MaxLife = maxLife;
		CurrLife = currLife;
	}

	// �Ƚϵ�ǰ��this.level�ʹ�������getLevel�Ĵ�С
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
		System.out.println("Hero��move����");
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
