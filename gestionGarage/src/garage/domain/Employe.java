package garage.domain;

import garage.domain.Client;

public class Employe extends Personne{

	public void vendreVehicule(Client client, Vehicule vehicule, Employe employe) {
		System.out.println("L'employe "+employe.prenom+" "+employe.nom+" a vendu une voiture.");
		client.acheterVehicule(vehicule);
		this.envoyerFacture(vehicule, client);
	}
	
	public void envoyerFacture(Vehicule vehicule, Client client) {
		Facture facture = new Facture();
		System.out.println("Facture créée.");
	}
}
