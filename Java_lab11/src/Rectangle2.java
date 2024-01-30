
public class Rectangle2 implements Shape2 {
	
	private double width,length;
	
	Rectangle2(double width,double lenght){
		this.width = width;
		this.length = lenght;
	}
	@Override
	public double getArea() {
		return this.width * this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getLenght() {
		return this.length;
	}
	public String toString() {
		return "Rectangle2[width= "+this.width+",lenght= "+this.length/*+","+super.toString()+*/+"]";
	}


}
