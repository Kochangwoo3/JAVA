package singleton;

public class KioskTest {

	public static void main(String[] args) {
		Kiosk kiosk = Kiosk.getInstance();
		
		Order order = kiosk.createOrder();
		
		System.out.println(order.getOrderNumber());

	}

}
