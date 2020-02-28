package Mathieu_De_Jesus.pglp_3_2;

public class Vendeur extends Salarie {
	
	private int commission;
	
	public Vendeur(int commission) {
		super(2000);
		this.commission = commission;
	}
	
	@Override
	public double calculSalaire() {
		return base + this.commission;
	}
}
