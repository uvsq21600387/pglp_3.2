package Mathieu_De_Jesus.pglp_3_2;

import java.util.ArrayList;

public class Entreprise {
	private ArrayList <Salarie> listSalarie;
	
	public Entreprise() {
		listSalarie = new ArrayList <Salarie> ();
	}
	
	public void addSalarie(Salarie s) {
		if(listSalarie.contains(s) == false) {
			listSalarie.add(s);
		}
	}
	
	public void removeSalarie(Salarie s) {
		if(listSalarie.contains(s)) {
			listSalarie.remove(s);
		}
	}
	
	public double calculSalaireSalaries() {
		double salaireTotal = 0.0;
		for(Salarie s : listSalarie) {
			salaireTotal += s.calculSalaire();
		}
		return salaireTotal;
	}
}
