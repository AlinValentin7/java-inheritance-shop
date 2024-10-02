package java.inheritance.shop;
import java.util.Random;
public class Prodotto {
	private int code;
	private String name;
	private String description;
	private double price;
	private double iva ;
	
	public Prodotto () {
		getCode();
		this.iva = 1.22;
	}
	
	public Prodotto (String name, String desc) {
		this();
		name = this.name;
		desc = this.description;
		
		
		
	}
	public void getCode () {
		Random randomCode = new Random();
		this.code = randomCode.nextInt(1000000000);
		
	}

	public double getPrice() {
		return price * iva;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String getCodiceEsteso () {
		return this.code + this.name;
	}
}
