package ploymorphism;

class Weapon {
	protected int fire() {
		return 1;
	}
}

class Cannon extends Weapon {
	@Override
	protected int fire() {
		return 10;  // 대포는 한 번에 10명을 살상
	}
}


public class WeaponOverridingEx {

	public static void main(String[] args) {
		// 게임에서 무기를 Weapon 클래스만들고 fire() 메서드 작성
		// 무기 별로 fire()
		Weapon weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
		
		Weapon weapon1 = new Cannon();
		System.out.println("대포의 살상 능력은 " + weapon1.fire());
		
	}

}
