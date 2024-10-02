package java.inheritance.shop;
/*Televisori, caratterizzati dalle dimensioni e 
 * dalla proprietà di essere smart oppure no*/
public class Televisore extends Prodotto {
private Prodotto dimension ;
private boolean smart;
	public Televisore(String name, String desc) {
		super(name, desc);
		
		
	}
	public Televisore (Prodotto dimension, boolean smart) {
		dimension = this.dimension;
		smart = this.smart;
	}
	public void isSmart() {
		if (smart) {
			System.out.println("Il televisore e smart");
		}else {
			System.out.println("E un televisore normale");
		}
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}

}
