package cart;

import java.time.LocalDateTime;
import java.util.Arrays;

import account.Account;
import product.Product;
import product.ProductProperty;

public class Cart {
	private LocalDateTime created;
	private Account createdBy;
	private CartItem[] cartItems = {};

	public Cart(LocalDateTime created, Account createdBy) {
		this.created = created;
		this.createdBy = createdBy;
		
	}

	public void addCartItem(Integer quantity, Product product) {
		CartItem cartItem = new CartItem(quantity, product);
		CartItem[] zwarr = Arrays.copyOf(getCartItems(), (getCartItems().length + 1));
		zwarr[zwarr.length - 1] = cartItem;
		setCartItems(zwarr);
	}
	
	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public Account getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Account createdBy) {
		this.createdBy = createdBy;
	}

	public CartItem[] getCartItems() {
		return cartItems;
	}

	public void setCartItems(CartItem[] cartItems) {
		this.cartItems = cartItems;
	}

}
