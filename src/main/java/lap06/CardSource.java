package lap06;

/**
 * Nguồn cung cấp các lá bài.
 */
public interface CardSource {

	/**
	 * Rút một lá bài từ nguồn.
	 * 
	 * @pre !isEmpty()
	 */
	Card draw();

	/**
	 * @return true nếu nguồn không còn lá bài nào.
	 */
	boolean isEmpty();
}
