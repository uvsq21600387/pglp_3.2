package Mathieu_De_Jesus.pglp_3_2;

public class Employe extends Salarie {
	
	private final int anneeDebut;
	private int anneeCourante;
	
	public Employe(int anneeDebut, int anneeCourante) throws Exception {
		super(1500);
		this.anneeDebut = anneeDebut;
		setAnneeCourante(anneeCourante);
	}
	
	public void setAnneeCourante(int annee) throws Exception {
		anneeCourante = annee;
		if(anneeCourante < anneeDebut) throw new Exception();
	}

	@Override
	public double calculSalaire() {
		return base + (anneeCourante - anneeDebut) * 20;
	}
}
