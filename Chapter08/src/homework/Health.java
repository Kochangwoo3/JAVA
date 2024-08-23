package homework;

public class Health {
	private char gender;
	private double height;
	protected double weight;
	
	public Health() {}
	
	public Health(char gender, double height, double weight) {
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
