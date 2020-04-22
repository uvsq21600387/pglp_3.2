package mathieu.pglp_3_2;

/**
 * classe représentant la base d'un salarié.
 */
public abstract class Salarie {
    /**
     * base du salaire du salarié.
     */
    protected final double base;
    /**
     * constructeur de la classe.
     * @param baseP initialise la base du salaire
     */
    protected Salarie(final int baseP) {
        this.base = baseP;
    }
    /**
     * calcule le salaire du salarié.
     * @return la valeur du salaire du salarié
     */
    public abstract double calculSalaire();
}
