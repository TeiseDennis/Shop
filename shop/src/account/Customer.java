package account;

public class Customer {
	private Integer id;
	private CustomerAddress address;
	private String email;
	private BankPaymentMethod paymentMethod;

	
	
	public Customer(Integer id, CustomerAddress address, String email, BankPaymentMethod paymentMethod) {
		super();
		this.id = id;
		this.address = address;
		this.email = email;
		this.paymentMethod = paymentMethod;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CustomerAddress getAddress() {
		return address;
	}

	public void setAddress(CustomerAddress address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BankPaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(BankPaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
