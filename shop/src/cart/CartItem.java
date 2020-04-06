package cart;

import product.Product;

public class CartItem {
	private Integer quantity;
	private Product product;
	
	public CartItem(Integer quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
