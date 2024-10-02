package java.inheritance.shop;

import java.util.Random;

/*Smarphone, caratterizzati anche dal codice IMEI e
 *  dalla quantità di memoria*/

public class Smartphone extends Prodotto{
	private long imei;
	private int memory;

	public Smartphone(String name, String desc, int memory) {
		super(name, desc);
		memory = this.memory;
	}
	public void getImei () {
		Random randomImei = new Random();
		this.imei = randomImei.nextInt(99999999);
	}
	
}
