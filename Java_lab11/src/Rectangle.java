
public class Rectangle extends shape {
	
	private double width;
	private double lenght;
	
	Rectangle(double width,double lenght,String color){
		super(color);
		this.width = width;
		this.lenght = lenght;
	}
	@Override
	public double getArea() {
		return this.width * this.lenght;
	}
	public String toString() {
		return "Rectangle[width= "+this.width+",lenght= "+this.lenght+","+super.toString()+"]";
	}
	public double getWidth() {
		return this.width;
	}
	public double getLenght() {
		return this.lenght;
	}

}
