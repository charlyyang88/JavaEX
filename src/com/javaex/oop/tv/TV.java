package com.javaex.oop.tv;

// 채널 범위 : 1~255
// 볼룸 범위 : 0~100
public class TV {
	private static final int MIN_CHNNEL = 1;
	private static final int MAX_CHNNEL = 255;
	private static final int MIN_VOLUME = 0;
	private static final int MAX_VOLUME = 100;
	
	// 필드
	private int channel;
	private int volume;
	private boolean power;
	
	// 기본 생성자
	public TV() {
		this(7, 20, false);
		// 내부에 다른 생성자 호출
	}
	
	public TV (int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public void power(boolean on) {
		this.power = on;
	}
//	public void power(boolean on) {
//		String message = String.format("전원을 켰습니다.", power);
//		System.out.println(message);
//	}

	// 채널 변경 메서드
	public void channel(int channel) {
		// 채널의 범위 체크
		if (channel >= MIN_CHNNEL && channel <= MAX_CHNNEL) {
			this.channel = channel;
			// 범위를 벗어나면 채널 변경을 하지 않음
		}
	}

	// 채널 변경 메서드(오버로딩)
	public void channel(boolean up) {
		if (up) {
			if (this.channel < MAX_CHNNEL) {	//	최대 채널에 도달하지 않음
				this.channel++;
			}
		} else {
			if (this.channel > MIN_CHNNEL) {	//	최소 채널에 도달하지 않음
				this.channel--;
			}
		}
	}
	
	// 볼륨 조절 메서드
	public void volume(int volume) {
		if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
			this.volume = volume;
		} 
	}

	// 볼롬 조절 메서드(오버로딩)
	public void volume(boolean up) {
		if (up) { // 볼륨 높이기
			if (volume < MAX_VOLUME) {	//	최대 볼륨에 도달하지 않음
				this.volume++;
			} else { // 볼륨 낮추기
				if (volume > MIN_VOLUME) {	//	최소 볼륨에 도달하지 않음
					this.volume--;
				}
			}
		}
	}

	public void status() {
		System.out.println("전원: " + (power ? "켜짐" : "꺼짐"));
		System.out.println("채널: " + channel);
		System.out.println("볼륨: " + volume);
		System.out.println("-------------");
	}

}
