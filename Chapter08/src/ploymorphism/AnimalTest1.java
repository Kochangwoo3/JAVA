package ploymorphism;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}	
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}	
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}	
}

class Tree {
	public void move() {
		System.out.println("나무가 자랍니다.");
	}
}

public class AnimalTest1 {
    // 메서드
	public void moveAnimal(Animal animal) {
		//Animal animal = new Human();
		animal.move();
	}

	public static void main(String[] args) {
		// 다형성 테스트
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
//		aTest.moveAnimal(new Tree());
	}

}
