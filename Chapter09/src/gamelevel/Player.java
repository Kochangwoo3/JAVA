package gamelevel;

public class Player {
	//멤버 변수
	private PlayerLevel level;

	// 디폴트 생성자 : 초급자레벨로 시작
	public Player() {
		level = new BeginnerLevel();
		// PlayerLevel level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	// 셋터: 레벨 변경 메서드
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		// PlayerLevel level = new AdvancedLeve();
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);  // 템플릿 메서드
	}
	
}
