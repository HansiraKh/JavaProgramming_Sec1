public abstract class shape {

	private String color;

	shape(String color) {
		this.color = color;
	}

	shape() {
		this.color = null; //this.color = "";
	}

	public String toString() {
		return "Color= "+this.color;
	}

	//abstract method
	public abstract double getArea();

}