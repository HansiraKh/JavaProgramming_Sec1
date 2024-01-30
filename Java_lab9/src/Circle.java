
public class Circle {
		//public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
		//define 2 private attribute
	private double radius;
	private String color;
	
		//Default Constructor
		//1
		Circle(){
			this.radius =  DEFAULT_RADIUS;
			this.color  = DEFAULT_COLOR;
		}
		//2
		Circle(double radius){
			this.radius = radius;
			this.color = DEFAULT_COLOR;
		}
		//3
		Circle(double radius,String color){
			this.radius = radius;
			this.color  = color;
		}
		public double getRadius() {
			return this.radius;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}
		public String getColor() {
			return this.color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String toString() {
			return "Circle[radius = "+radius+" , color = "+color+"]";
		}
		public double getArea() {
			return radius * radius * Math.PI;
			//return getRadius() * getRadius() *Math.PI;
		}
		public double getCircumference() {
			return 2.0 * Math.PI*getRadius();
		}

	}

