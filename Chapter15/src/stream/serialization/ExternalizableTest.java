package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable{
	String name;
	
	public Dog() {}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}

public class ExternalizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 직렬화 역직렬화 테스트
		Dog dog = new Dog();
		dog.name = "댕댕이";
		
		//직렬화
		FileOutputStream fos = new FileOutputStream("external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try(fos; oos){
			oos.writeObject(dog);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		// 역직렬화 
		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog myDog = (Dog)ois.readObject();
		System.out.println(myDog);
		
	}

}
