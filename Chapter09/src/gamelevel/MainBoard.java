package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		// 추상클래스 및 템플릿 메서드 실습
		Player playerLim = new Player();
		playerLim.play(1);
		
		//중급자 레벨 업 출력
		AdvancedLevel aLevel = new AdvancedLevel();
		playerLim.upgradeLevel(aLevel);
		playerLim.play(2);
		
		//고급 레벨 업 출력
		SuperLevel sLevel = new SuperLevel();
		playerLim.upgradeLevel(sLevel);
		playerLim.play(3);
		
		Player playerLee = new Player();
		playerLee.upgradeLevel(new AdvancedLevel());
	}

}
