package garage.domain;

import garage.domain.Personne;
import garage.domain.Vehicule;

public class Client extends Personne{
	int numeroTel;
	String mail;
	
	public void seConnecter() {
		
	}
	
	public void seDeconnecter() {
		
	}
	
	public void acheterVehicule(Vehicule vehicule) {
		System.out.println("Le client " + this.prenom + " " + this.nom + " a acheté un véhicule de type " + vehicule.typeMoteur+".");
	}

}
