package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	//버전관리를 위한 정보
	private static final long serialVersionUID = -1503252402544036183L;
	
	String name;
	transient String job;
	
	
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		return name + "," + job;
	}
}


public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// 직렬화 테스트하기
		Person lee = new Person("이순신", "대표이사");
		Person kim = new Person("김유신", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");   
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			// 직렬화
			oos.writeObject(lee);
			oos.writeObject(kim);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("serial.txt");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			// 역직렬화
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
