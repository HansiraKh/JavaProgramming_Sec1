import java.time.Year;
public class Book {
	private String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String title) {
		this.title= title;
	}
	public String getTitle() {
		return this.title;
	}
	public void setPrice(float price) {
		this.price= price;
	}
	public float getPrice() {
		return this.price;
	}
	public void setPublishyear(int year) {
		this.publishyear= year;
	}
	public int  getPublishyear() {
		return this.publishyear;
	}
	public int getTotalYear() {
		int currentyear = Year.now().getValue()-getPublishyear();
		return  currentyear;
		
	}
	public String toString() {
		return String.format("Title: "+this.title+" published for "+this.getTotalYear()+" year ("+this.price+" baht)") ;
	}
	

}
