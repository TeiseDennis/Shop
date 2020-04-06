import java.time.*;

import account.Account;
import cart.Cart;
import order.Order;
import product.Product;

public class CartManager {
	Cart cart;
	Account account; 

	public void creat(Account account) {
		this.cart = new Cart(LocalDateTime.now(), account);
		this.account = account;
	}

	public void addItem(int qty, Product product) {
		this.cart.addCartItem(qty, product);

	}

	public void removeItem(Product product) {
		for (int i = 0; i <= this.cart.getCartItems().length; i++) {
			if (this.cart.getCartItems()[i].equals(product)) {
				this.cart.getCartItems()[i] = null;
			}
		}
	}

//	public void checkout() {
//		return new Order(orderNumber, shipped, shippedTo, paid, paidWith, items)
//	 hier auf das Account in der Variable zugreifen 
//	}

}
