package controleur;

import modele.Continent.DRAPEAU;
import modele.Pays;
import modele.Pays.PAYS;
import vue.VueContinator;

public class CommandeChoisirContinent extends Commande{

	protected DRAPEAU ancienDrapeau;
	protected DRAPEAU nouveauDrapeau;
	public CommandeChoisirContinent(DRAPEAU anciendrapeau, DRAPEAU nouveaudrapeau)
	
	{
		this.nouveauDrapeau = nouveaudrapeau;
		this.ancienDrapeau = anciendrapeau;
	}
	public void executer() 
	{
		VueContinator.getInstance().afficherPays(this.nouveauDrapeau);
	}
	public void annuler() 
	{
		VueContinator.getInstance().afficherPays(this.ancienDrapeau);

	}
}
