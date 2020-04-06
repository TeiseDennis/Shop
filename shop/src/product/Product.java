package product;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.UUID;

public class Product {
	private String uuid, name;
	private double price;
	private Integer vat;
	private ProductProperty[] properties = {};

	public Product(String name, double d, Integer vat) {

		UUID uuid = UUID.randomUUID();
		String randomUUIDString = uuid.toString();

		this.uuid = randomUUIDString;
		this.name = name;
		this.price = d;
		this.vat = vat;
	}

	@Override
	public String toString() {
		String string = " UUid:" + uuid+ " name:"+name+" price:"+price+" vat:"+vat+"\n";
		return string; 
	}
	
	public void addProperty(String name, String value) {
		ProductProperty prodProp = new ProductProperty(name, value);
		ProductProperty[] zwarr = Arrays.copyOf(getProperties(), (getProperties().length + 1));
		zwarr[zwarr.length - 1] = prodProp;
		setProperties(zwarr);
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getVat() {
		return vat;
	}

	public void setVat(Integer vat) {
		this.vat = vat;
	}

	public ProductProperty[] getProperties() {
		return properties;
	}

	public void setProperties(ProductProperty[] properties) {
		this.properties = properties;
	}

}
