
public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	Invoice(int id,Customer customer,double amount){
		this.id= 0;
		this.customer = null;
		this.amount = 0;
	}
	public int getID() {
		return id ;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		customer = "";
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		amount = 0;
	}
	public int getCustomerID() {
		return getCustomer().getID() ;
	}
	public String getCustomerName() {
		return getCustomer().getName();
	}
	public int getCustomerDiscount() {
		return getCustomer().getDiscount() ;
	}
	public double getAmountAfterDiscount() {
		return getAmount() - (getAmount() * (getCustomerDiscount() / 100.0));
	}
	public String toString() {
		return "Invoice[id="+ id +",customer="+getCustomerName()+" ("+getCustomerID()+") ("+getCustomerDiscount()+")amount="+amount;
	}


}
