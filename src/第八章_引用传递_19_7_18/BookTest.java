package 第八章_引用传递_19_7_18;

public class BookTest {
	public static void main(String[] args) {
		// 创建一个book对象，也就是创建一本书
		Book book = new Book("三体", "123-321", 41.5, 20);
		BookManagement bm1 = new BookManagement();
		// 下面就是把书 三体的库存-1
		bm1.SellBook(book);
		System.out.println(book.getCount());
	}
}
