package com.javaex.oop.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

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

	public boolean getPower() {
		return power;
	}

	public void power(boolean on) {
		String message = String.format("전원을 켰습니다.", power);
		System.out.println(message);
	}

	public void channel(int channel) {
		if (channel >= 1 && channel <= 255) {
			this.channel = channel;
			System.out.println(channel);
		} else {
			System.out.println("1~255번 채널을 입력하세요.");
		}
	}

	public void channel(boolean up) {
		if (up) {
			if (channel < 255) {
				channel++;
			}
		} else {
			if (channel > 1) {
				channel--;
			}
		}
		System.out.println(channel);
	}

	public void volume(int volume) {
		if (volume >= 0 && volume <= 100) {
			this.volume = volume;
			System.out.println(volume);
		} else {
			System.out.println("0~100 사이의 볼륨을 입력하세요.");
		}
	}

	public void volume(boolean up) {
		if (up) {
			if (volume < 100) {
				volume++;
			} else if (volume > 0) {
				volume--;
			}
		}
		System.out.println(volume);
	}

	public void status() {
		System.out.println("전원: " + (power ? "켜짐" : "꺼짐"));
		System.out.println("채널: " + channel);
		System.out.println("볼륨: " +volume);

	}

}
