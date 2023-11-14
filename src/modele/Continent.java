package modele;

import java.util.ArrayList;
import java.util.List;


import donnee.Exportable;

public class Continent implements Exportable{
	
	protected List<Pays> paysContinent;
	
	public enum DRAPEAU {Mali, Canada, Allemagne, Chine}
	protected DRAPEAU drapeau;
	
	
	public DRAPEAU getDrapeau() {
		return drapeau;
	}

	public void setContinent(DRAPEAU drapeau) {
		this.drapeau = drapeau;
	}
	public Continent() {
		this.paysContinent=new ArrayList<Pays>();
	}
	
	public List<Pays> getPaysContinent(){
		return paysContinent;
	}
	
	public void setPaysContinent(List<Pays> paysContinent) {
		this.paysContinent = paysContinent;
	}
	
	public void ajouterPays(Pays pays) {
		this.paysContinent.add(pays);
	}
	@Override
	public String exporterXML() {
		String xml = "";
		xml += "<drapeau>" + this.drapeau + "</drapeau>";
		xml += "<pays>";
		for(Pays pays:this.paysContinent)
		{
			xml+=pays.exporterXML();
		}
		xml += "</pays>";
		return  "<continent>" + xml + "</continent>";
	}

	@Override
	public String exporterJSON() {
		
		return "";
	}
}
