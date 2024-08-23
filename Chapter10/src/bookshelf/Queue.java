package bookshelf;

public interface Queue {
	//뭔가 들어옴
	void enQueue(String title);
	//빼내는 추상메서드(선입선출법)
	String deQueue();
	int getSize();
}
