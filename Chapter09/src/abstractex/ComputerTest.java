package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// 추상클래스는 인스턴스 생성불가 테스트
		//Computer c1 = new Computer();
		Computer c2 = new Desktop();
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
	}

}
