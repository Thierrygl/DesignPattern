package garage.domain;

import java.sql.Date;
import garage.domain.Client;

public class Employe extends Personne{
	int salaire;
	Date dateEmbauche;

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	
	
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
