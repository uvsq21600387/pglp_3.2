package mathieu.pglp_3_2;

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
     * @param nombrePersonnesP initialise l'attribut nombrePersonnes
     */
    public Manager(final int nombrePersonnesP) {
        super(1500);
        this.nombrePersonnes = nombrePersonnesP;
    }
    /**
     * calcule le salaire du manager :
     * base + 100 * this.nombrePersonnes.
     * @return le salaire du manager
     */
    @Override
    public double calculSalaire() {
        final int mult = 100;
        return base + mult * this.nombrePersonnes;
    }
}
