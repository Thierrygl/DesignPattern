package garage.domain;

import garage.domain.Personne;
import garage.domain.Vehicule;

public class Client extends Personne{
	String numeroTel;
	String mail;
	String motdepasse;
		
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	
	
	public void acheterVehicule(Vehicule vehicule) {
		System.out.println("Le client " + this.prenom + " " + this.nom + " a acheté un véhicule de type " + vehicule.typeMoteur+".");
	}

}
