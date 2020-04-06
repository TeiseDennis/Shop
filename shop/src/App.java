import java.util.Arrays;

import account.Account;
import account.BankPaymentMethod;
import account.Customer;
import account.CustomerAddress;
import product.Product;

public class App {

	public static void main(String[] args) {

		//Product erstellen 
		Product product1 = new Product("Banane", 0.60, 1);
		Product product2 = new Product("Cola", 1.20, 1);
		Product product3 = new Product("Apfel", 0.40, 1);

		product1.addProperty("verpackt", "1");
		product2.addProperty("verpackt", "1");
		product3.addProperty("gewaschen", "2");

		ProductManager.getInstance().addProduct(product1);
		ProductManager.getInstance().addProduct(product2);
		ProductManager.getInstance().addProduct(product3);
		System.out.println(Arrays.toString(ProductManager.getInstance().getProducts()));
		
		//Account/ Customer erstellen
		Account account1 = new Account("dennis", "password");
		CustomerAddress customerAddress = new CustomerAddress("landegge-sande", "49733", "haren", "germany");
		BankPaymentMethod bankPaymentMethod = new BankPaymentMethod("DE2002309482342122", "3982982", "Sparkasse");
		
		Customer customer = new Customer(1,customerAddress, "email", bankPaymentMethod);
		account1.setCustomer(customer);
		
	}

}
