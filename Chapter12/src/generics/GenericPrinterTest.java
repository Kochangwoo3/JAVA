package generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// 제네릭 프린터 테스트
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();// 명시적 형변환 하지 않음
		//System.out.println(powderPrinter);
		powderPrinter.printing();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		//System.out.println(plasticPrinter);
		plasticPrinter.printing();
		//GenericPrinter<Water> printer = new GenericPrinter<Water>();
		
		
	}

}
