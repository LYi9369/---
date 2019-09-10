package 第八章_引用传递_19_7_18;

/*
 * 图书业务类，封装了图书数组的增删改查方法
 */
public class BookManagement {
	/*
	 * 该方法既要判断库存是否足够，足够的话减少原来的库存，又要返回销售结果是成功还是失败
	 * 
	 * 参数Book book 是要销售的图书对象
	 */
	public int SellBook(Book book) {
		// 1、判断图书库存是否大于0
		if (book.getCount() > 0) {
			/*
			 * 这行代码很有意义，是一定要掌握的！！
			 * 
			 * 利用set和get方法实现了销售成功就把原来的数量-1
			 */
			book.setCount(book.getCount() - 1);
			return 1;
		} else {
			return -1;
		}
		// 2、完成销售 库存-1
		// 3、返回销售的数量
	}
}
