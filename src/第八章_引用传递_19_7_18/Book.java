package �ڰ���_���ô���_19_7_18;

public class Book {
	private String name;
	private String isbn;
	private double price;
	private int count;
	private boolean isborrow;

	public Book() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	Book(String name) {
		this.setName(name);
	}

	public Book(String name, String isbn, double price, int count) {
		super();
		this.name = name;
		this.isbn = isbn;
		this.price = price;
		this.count = count;
		// ���������������
		// setName(name);
		// setIsbn(isbn);
		// setPrice(price);
		// setCount(count);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price <= 0) {
			price = 0;
		} else {
			this.price = price;
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if (count <= 0) {
			count = 0;
		} else {
			this.count = count;
		}
	}

	public boolean isBorrow() {
		return isborrow;
	}

	public void setBorrow(boolean isborrow) {
		this.isborrow = isborrow;
	}

}
