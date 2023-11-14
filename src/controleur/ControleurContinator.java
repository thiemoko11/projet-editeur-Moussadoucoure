package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.Exportable;
import donnee.Exporteur;
import modele.Continent;
import modele.Continent.DRAPEAU;
import modele.Pays;
import modele.Pays.PAYS;
import vue.VueContinator;

public class ControleurContinator extends Controleur{
	

	private Pays.PAYS paysChoisi;

	//private List<Exportable> paysContinent = null;
	
	private Continent continent = new Continent(); 
	
	public ControleurContinator()
	{
		Logger.logMsg(Logger.INFO, "new ControleurJardinator()");
				
	}
	
	public void initialiser()
	{
		
	}

	public void notifierChoixPays (PAYS pays)
	{
		
		this.paysChoisi = pays;
	}
	protected List<Commande> historique = new ArrayList<Commande>();
	protected DRAPEAU continentChoisi = DRAPEAU.Allemagne;
	public void notifierChoixContinent(DRAPEAU nouveaudrapeau)  
	 {
		System.out.println("ControleurContinator.notifierChoixContinent()");
		//VueContinator.getInstance().afficherPays(drapeau);
		this.continent.setContinent(nouveaudrapeau);
		Commande commande = new CommandeChoisirContinent(continentChoisi, nouveaudrapeau);
		commande.executer();
		//commande.annuler();
		historique.add(commande);
		this.continentChoisi = nouveaudrapeau;
		
	}
	
	
	
	protected PAYS drapeauChoisi = paysChoisi;
	
	public void notifierClicDrapeauChoisi(double x, double y)
	{	
		System.out.println("ControleurContinator.notifierClicContinant()");
		
		
		Commande commande = new CommandePlanterDrapeau(null ,paysChoisi, x, y);
		commande.executer();
		historique.add(commande);
		//VueContinator.getInstance().decouvrirPays(this.paysChoisi, x, y);
		Pays pays = new Pays(this.paysChoisi, x,y);
		this.continent.ajouterPays(pays);
	}
	
	public void notifierSauvegarder() 
	{
		System.out.println("ControleurContinator.notifierSauvegarder()");
		Exporteur exporteur = new Exporteur();
		//exporteur.sauvegarder(paysContinent);
		exporteur.sauvegarder(continent);
	}
}
