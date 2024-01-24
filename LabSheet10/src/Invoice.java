
public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	Invoice(int id, Customer customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount =amount;
		
	}
	public int getID() {
		return id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getCustomerID() {
		return this.getCustomerID();
	}
	public String getCustomerName() {
		return this.getCustomerName();
	}
	public int getCustomerDiscount() {
		return this.getCustomerDiscount();
	}
	public double getAmountAfterDiscount() {
		return amount - (customer.getDiscount() * amount /100);
	}
	public String toString() {
		return "Invoice[id="+id+",customer="+customer+",amount"+getAmountAfterDiscount()+"]";
	}
	
	
}
