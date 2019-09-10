package 第九章_继承_19_8_4;

public class HeroText {
	public static void main(String[] args) {
		// 新建一个对象Warrior对象,并赋值
		Warrior 李白 = new Warrior("李白", 500);
		System.out.println(李白.getNickName());
		李白.move();
		Hero 曹操1 = new Warrior("曹操", 200);
		Hero 曹操2 = new Warrior("曹操", 200);
		曹操1.setLevel(10);
		曹操2.setLevel(20);
		System.out.println(曹操1.compareTo(曹操2));

		Archmage 貂蝉 = new Archmage("貂蝉");
		// 貂蝉.biubiubiu();
		// System.out.println("当前生命值" + 貂蝉.getCurrLife());
		System.out.println(貂蝉);
	}
}
