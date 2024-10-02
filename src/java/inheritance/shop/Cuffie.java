package java.inheritance.shop;
/* Cuffie, caratterizzate dal colore e
 *  se sono wireless o cablate*/
public class Cuffie extends Prodotto  {
	private boolean wireles;
	private String color;
	
	public Cuffie (boolean wireles) {
		wireles = this.wireles;
	}

	public Cuffie(String name, String desc, String color) {
		super(name, desc);
		color = this.color;
	}
	
	public void isWireles() {
		if (wireles) {
			System.out.println("le cuffie sono wireless");
		}else {
			System.out.println("le cuffie sono con il cavo");
		}
		
	}
	
	
	

}
