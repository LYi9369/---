package �ڰ���_��������_19_7_8;

public class Product {
	private String name;
	private double price;
	// ��Ʒ����
	private String description;
	// ��Ʒ����
	private String[] services;

	public Product() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Product(String name, String description) {
		setName(name);
		setDescription(description);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getServices() {
		return services;
	}

	public void setServices(String[] services) {
		this.services = services;
	}

}
