import java.util.Arrays;

import product.Product;
import product.ProductProperty;

public class ProductManager {
	private static ProductManager productManager_instance = null;

	private ProductManager() {

	}
	
	public static ProductManager getInstance() {

		if (productManager_instance == null) {
			productManager_instance = new ProductManager();
		}
		return productManager_instance;
	}

	private Product[] products = {};

	public void addProduct(Product product) {
		Product[] zwarr = Arrays.copyOf(getProducts(), (getProducts().length + 1));
		zwarr[zwarr.length - 1] = product;
		setProducts(zwarr);
	}

	public int resolveProdictId(Product product) {
		for (int i = 0; i <= products.length; i++) {
			if (products[i].equals(product)) {
				return i;
			}
		}
		return 0;
	}

	public Product resolveProdict(int productId) {
		return products[productId];
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

}
