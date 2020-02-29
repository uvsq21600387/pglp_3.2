package Mathieu_De_Jesus.pglp_3_2;

/**
 * classe Employé contenant une année d'embauche et l'année courante.
 */
public class Employe extends Salarie {
	/**
	 * année de l'embauche de l'employé.
	 */
	private final int anneeDebut;
	/**
	 * année courante dans le programme.
	 */
	private int anneeCourante;
	/**
	 * constructeur de l'employé.
	 * @param anneeDebut initialise l'année d'embauche
	 * @param anneeCourante intialise l'année courante dans le programme
	 * @throws Exception si le setter de l'année courante lève une exception
	 */
	public Employe(final int anneeDebut, final int anneeCourante)
	throws Exception {
		super(1500);
		this.anneeDebut = anneeDebut;
		setAnneeCourante(anneeCourante);
	}
	/**
	 * défini une nouvelle valeur pour l'année courante.
	 * @param annee nouvelle valeur
	 * @throws Exception si annéeCourante est inférieur à l'année courante
	 */
	public void setAnneeCourante(final int annee) throws Exception {
		anneeCourante = annee;
		if (anneeCourante < anneeDebut) {
			throw new Exception();
		}
	}
	@Override
	/**
	 * calcule le salaire de l'employé :
	 * base + (anneeCourante - anneeDebut) * 20.
	 * @return le salaire de l'employé
	 */
	public double calculSalaire() {
		return base + (anneeCourante - anneeDebut) * 20;
	}
}
