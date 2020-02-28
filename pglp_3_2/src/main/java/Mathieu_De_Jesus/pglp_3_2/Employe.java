package Mathieu_De_Jesus.pglp_3_2;

public class Employe extends Salarie {
	
	private final int anneeDebut;
	private int anneeCourante;
	
	public Employe(int anneeDebut, int anneeCourante) {
		super(1500);
		this.anneeDebut = anneeDebut;
		setAnneeCourante(anneeCourante);
	}
	
	public void setAnneeCourante(int annee) {
		anneeCourante = annee;
	}

	@Override
	public double calculSalaire() {
		return base + (anneeCourante - anneeDebut) * 20;
	}
}
