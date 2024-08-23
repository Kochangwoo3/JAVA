package homework;

// 인터페이스
interface Playable {
	void play();
	void stop();
	void pause();
	void volumeUp();
	void volumeDown();
	void nextTrack();
	void prevTrack();
}

enum MediaType {
	MUSIC, VIDEO, PHOTO
}

class MediaPlayer implements Playable {
	//멤버변수
	private MediaType mediaType; // 미디어 타입 (음악, 동영상, 사진)
	//나머지 매개변수
	private int volume;         // 50
	private boolean isPlaying;  // false
	private int currentTrack;   // 1
	
	//생성자
	public MediaPlayer(MediaType mediaType) {
		this.mediaType = mediaType;
		// 나머지 초기화 volme, isPlaying, currentTrack
		this.volume = 50;
		isPlaying = false;
		currentTrack = 1;
	}
	
	// 추상메서드 구현
	@Override
	public void play() {
		if(!isPlaying) {
			System.out.println("미디어를 재생합니다.");
			isPlaying = true;
		}
	}
	@Override
	public void stop() {
		if(isPlaying) {
			System.out.println("미디어를 중지합니다.");
			isPlaying = false;
		}
	}
	@Override
	public void pause() {
		if(isPlaying) {
			System.out.println("미디어를 일시 정지합니다.");
			isPlaying = false;
		}
	}

	@Override
	public void volumeUp() {
		if(volume < 100) {
			volume++;
			System.out.println("볼륨을 올립니다.");
		}
		
	}
	@Override
	public void volumeDown() {
		if(volume > 0) {
			volume--;
			System.out.println("볼륨을 내립니다.");
		}
	}

	@Override
	public void nextTrack() {
		System.out.println("다음 트랙을 재생합니다.");
	}
	@Override
	public void prevTrack() {
		System.out.println("이전 트랙을 재생합니다.");
	}
	
	// 겟터, 셋터 생성
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public int getCurrentTrack() {
		return currentTrack;
	}

	public void setCurrentTrack(int currentTrack) {
		this.currentTrack = currentTrack;
	}

	public MediaType getMediaType() {
		return mediaType;
	}

	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}
	

	
}



public class MediaPlayerTest {

	public static void main(String[] args) {
		// 미디어 플레이어 테스트
		MediaPlayer player = new MediaPlayer(MediaType.MUSIC);
		
		player.play();
		player.volumeUp();
		player.nextTrack();
		player.pause();
		player.volumeDown();
		player.prevTrack();
		player.stop();
		
		System.out.println();
		System.out.println("현재 미디어 타입: " + player.getMediaType());
		System.out.println("현재 볼륨: " + player.getVolume());
		System.out.println("현재 재생 중인지 여부: " + player.isPlaying());
		System.out.println("현재 재생 중인 트랙: " + player.getCurrentTrack());
		

	}

}
