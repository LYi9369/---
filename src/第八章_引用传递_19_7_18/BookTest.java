package �ڰ���_���ô���_19_7_18;

public class BookTest {
	public static void main(String[] args) {
		// ����һ��book����Ҳ���Ǵ���һ����
		Book book = new Book("����", "123-321", 41.5, 20);
		BookManagement bm1 = new BookManagement();
		// ������ǰ��� ����Ŀ��-1
		bm1.SellBook(book);
		System.out.println(book.getCount());
	}
}
