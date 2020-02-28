package Mathieu_De_Jesus.pglp_3_2;

public abstract class Salarie {
	
	private final int base;
	
	public Salarie(int base) {
		this.base = base;
	}
	
	public double calculSalaire() {
		return base;
	}
}
