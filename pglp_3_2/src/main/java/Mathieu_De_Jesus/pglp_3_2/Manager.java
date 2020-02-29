package Mathieu_De_Jesus.pglp_3_2;

/**
 * classe représentant un manager d'entreprise.
 */
public class Manager extends Salarie {
	/**
	 * nombre de personnes à sa charge.
	 */
	private int nombrePersonnes;
	/**
	 * constructeur de la classe.
	 * @param nombrePersonnes initialise l'attribut nombrePersonnes
	 */
	public Manager(final int nombrePersonnes) {
		super(1500);
		this.nombrePersonnes = nombrePersonnes;
	}
	/**
	 * calcule le salaire du manager :
	 * base + 100 * this.nombrePersonnes.
	 * @return le salaire du manager
	 */
	@Override
	public double calculSalaire() {
		return base + 100 * this.nombrePersonnes;
	}
}
