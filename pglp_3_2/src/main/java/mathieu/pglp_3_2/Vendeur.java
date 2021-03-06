package mathieu.pglp_3_2;

/**
 * classe représentant un vendeur dans l'entreprise.
 */
public class Vendeur extends Salarie {
    /**
     * la commission du vendeur qui s'ajoutera à son salaire.
     */
    private int commission;
    /**
     * constructeur de la classe.
     * @param commissionP initialise l'attribut commission
     */
    public Vendeur(final int commissionP) {
        super(1500);
        this.commission = commissionP;
    }
    @Override
    /**
     * calcule le salaire du vendeur :
     * base + commission.
     * @return le salaire du vendeur
     */
    public double calculSalaire() {
        return base + this.commission;
    }
}
