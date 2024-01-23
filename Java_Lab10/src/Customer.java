
public class Customer {
	private int id;
	private String name;
	private int discount;
	
	Customer(int id ,String name ,int discount){
		this.id = id;
		this.name = name;
		this.discount = discount;
	}
	public int getID() {
		return id ; 
	}
	public String getName() {
		return name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		discount = 0;
	}
	public String toString(){
		return "name"+this.id+discount;
	}

}
