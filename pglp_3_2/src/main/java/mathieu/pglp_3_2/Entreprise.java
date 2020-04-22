package mathieu.pglp_3_2;

import java.util.ArrayList;

/**
 * class Entreprise stockant une liste d'employé.
 */
public class Entreprise {
    /**
     * liste l'ensemble des employés dans l'entreprise.
     */
    private ArrayList<Salarie> listSalarie;
    /**
     * constructeur de la classe Entreprise.
     */
    public Entreprise() {
        listSalarie = new ArrayList<Salarie>();
    }
    /**
     * ajoute un salarié dans l'entreprise s'il n'est pas déjà présent.
     * @param s le nouveau salarié de l'entreprise
     */
    public void addSalarie(final Salarie s) {
        if (!listSalarie.contains(s)) {
            listSalarie.add(s);
        }
    }
    /**
     * retire un salarié de la liste des salariés de l'entreprise
     * s'il est présent.
     * @param s le salarié à retirer de la liste
     */
    public void removeSalarie(final Salarie s) {
        if (listSalarie.contains(s)) {
            listSalarie.remove(s);
        }
    }
    /**
     * calcule la somme des salaires des salariés de l'entreprise.
     * @return la somme des salaires versés aux salariés
     */
    public double calculSalaireSalaries() {
        double salaireTotal = 0.0;
        for (Salarie s : listSalarie) {
            salaireTotal += s.calculSalaire();
        }
        return salaireTotal;
    }
}
