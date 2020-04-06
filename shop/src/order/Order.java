package order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

import account.BankPaymentMethod;
import product.ProductProperty;

public class Order {
	private String orderNumber;
	private LocalDateTime shipped;
	private OrderAddress shippedTo;
	private Date paid;
	private BankPaymentMethod paidWith;
	private OrderItem[] items;

	public Order(String orderNumber, LocalDateTime shipped, OrderAddress shippedTo, Date paid,
			BankPaymentMethod paidWith, OrderItem[] items) {
		super();
		this.orderNumber = orderNumber;
		this.shipped = shipped;
		this.shippedTo = shippedTo;
		this.paid = paid;
		this.paidWith = paidWith;
		this.items = items;
	}

	public void addOrderItem(Integer productId,Integer vat,Integer quantity, String name,BigDecimal price) {
		OrderItem orderItem = new OrderItem(productId, vat, quantity,name,price);
		OrderItem[] zwarr = Arrays.copyOf(getItems(), (getItems().length + 1));
		zwarr[zwarr.length - 1] = orderItem;
		setItems(zwarr);
	}
	
	
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public LocalDateTime getShipped() {
		return shipped;
	}

	public void setShipped(LocalDateTime shipped) {
		this.shipped = shipped;
	}

	public OrderAddress getShippedTo() {
		return shippedTo;
	}

	public void setShippedTo(OrderAddress shippedTo) {
		this.shippedTo = shippedTo;
	}

	public Date getPaid() {
		return paid;
	}

	public void setPaid(Date paid) {
		this.paid = paid;
	}

	public BankPaymentMethod getPaidWith() {
		return paidWith;
	}

	public void setPaidWith(BankPaymentMethod paidWith) {
		this.paidWith = paidWith;
	}

	public OrderItem[] getItems() {
		return items;
	}

	public void setItems(OrderItem[] items) {
		this.items = items;
	}

}
