package vue;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class VueLogo  extends AnchorPane{

	public VueLogo() 
	{
		this.setPrefHeight(200);
		this.setPrefWidth(166);
	}
	
	public VueLogo avecEcusson(ECUSSON_TYPE type) 
	{
		this.setEcusson(type);
		return this;
	}
	
	public VueLogo coloreEn(String couleur) 
	{
		this.setCouleur(couleur);
		return this;
	}
	
	
	
	public void setCouleur(String couleur)
	{
		this.setStyle("-fx-background-color: "+couleur+";");
	}
	
	public VueLogo decoreParUnDauphin(COULEUR_DAUPHIN couleur) 
	{
		this.setCouleurDauphin(couleur);
		return this;
	}
	public VueLogo  couronnrDeVagues(VAGUES_TYPE type) 
	{
		this.setVagues(type);
		return this;
	}
	
	public VueLogo proclamant(String texte) 
	{
		this.setText(texte);
		return this;
	}
	
	
	
	public enum ECUSSON_TYPE{Badge};
	public void setEcusson(ECUSSON_TYPE type)
	{
		
		ImageView ecusson = new ImageView();
		if(type == ECUSSON_TYPE.Badge)
			ecusson.setImage(new Image("vue/decoration/Badge.png")); // 300 x 356
		this.getChildren().add(ecusson);
	}
	
	public enum VAGUES_TYPE{ONDULE};
	public void setVagues(VAGUES_TYPE type)
	{
		ImageView vagues = new ImageView();
		if(type == VAGUES_TYPE.ONDULE)
			vagues.setImage(new Image("vue/decoration/vagues-ondulees.png")); // 300 x 356
		vagues.setLayoutX(50);
		vagues.setLayoutY(40);
		this.getChildren().add(vagues);

	}
	
	public void setText(String texte)
	{
		Label motto = new Label();
		motto.setText(texte);
		motto.setLayoutX(95);
		motto.setLayoutY(250);
		motto.setStyle("-fx-font: 25px Tahoma;");
		this.getChildren().add(motto);

	}
	
	public enum COULEUR_DAUPHIN{BLEU,ROSE};
	public void setCouleurDauphin(COULEUR_DAUPHIN type)
	{
		ImageView dauphin = new ImageView();
		if(type == COULEUR_DAUPHIN.BLEU)
			dauphin.setImage(new Image("vue/decoration/dauphin-bleu.png")); // 100 x 100
		if(type == COULEUR_DAUPHIN.ROSE)
			dauphin.setImage(new Image("vue/decoration/dauphin-rose.png")); // 100 x 100
		dauphin.setLayoutX(100);
		dauphin.setLayoutY(130);
		this.getChildren().add(dauphin);

	}
}

