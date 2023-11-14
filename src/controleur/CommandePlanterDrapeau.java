package controleur;

import modele.Continent.DRAPEAU;
import modele.Pays.PAYS;
import vue.VueContinator;

public class CommandePlanterDrapeau extends Commande{
	
	protected PAYS ancienDrapeau;
	protected PAYS nouveauDrapeau;
	protected Double x;
	protected Double y;
	public CommandePlanterDrapeau(PAYS ancienDrapeau, PAYS nouveauDrapeau, double x, double y) 
	{
		this.ancienDrapeau = ancienDrapeau;
		this.nouveauDrapeau = nouveauDrapeau;
		this.x = x;
		this.y = y;
	}
	public void executer() 
	{
		VueContinator.getInstance().decouvrirPays(nouveauDrapeau, x, y);
	}
	public void annuler() 
	{
		
	}
}
