package order;

import java.math.BigDecimal;

public class OrderItem {
	private Integer productId, vat, quantity;
	private String name;
	private BigDecimal price;

	public OrderItem(Integer productId, Integer vat, Integer quantity, String name, BigDecimal price) {
		super();
		this.productId = productId;
		this.vat = vat;
		this.quantity = quantity;
		this.name = name;
		this.price = price;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getVat() {
		return vat;
	}

	public void setVat(Integer vat) {
		this.vat = vat;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
