package generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		Powder p1 = new Powder();
		printer.setMaterial(p1);
		// 겟터에서는 리턴타입이 Object 타입이므로
		// 직접 형 변환을 해야 함
		Powder p2 = (Powder)printer.getMaterial();
	}

}
