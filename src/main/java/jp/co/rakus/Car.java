package jp.co.rakus;

public class Car {

	// こんにちは
	private int speed;
	private String color;

	public void speedUp() {

		this.speed += 50;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
