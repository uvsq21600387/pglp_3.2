package Mathieu_De_Jesus.pglp_3_2;

public class Manager extends Salarie {
	private int nombrePersonnes;
	
	public Manager(int nombrePersonnes) {
		super(1500);
		this.nombrePersonnes = nombrePersonnes;
	}
	
	@Override
	public double calculSalaire() {
		return base + 100 * this.nombrePersonnes;
	}
}
