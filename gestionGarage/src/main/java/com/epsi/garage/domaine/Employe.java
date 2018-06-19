package com.epsi.garage.domaine;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Employe extends Personne{
	@OneToMany(mappedBy="employe", cascade = CascadeType.ALL)
	List<Facture> factures = new ArrayList<Facture>();
	int salaire;
	Date dateEmbauche;
	
	public List<Facture> getFactures() {
		return factures;
	}
	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
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
	@Override
	public String toString() {
		return "Employe [factures=" + factures + ", salaire=" + salaire + ", dateEmbauche=" + dateEmbauche + ", id="
				+ id + ", prenom=" + prenom + ", nom=" + nom + ", naissance=" + naissance + ", motDePasse=" + motDePasse
				+ "]";
	}
	
	public void vendreVehicule(Client client, Vehicule vehicule, Employe employe) {
		System.out.println("L employe "+employe.prenom+" "+employe.nom+" a vendu une voiture.");
		client.acheterVehicule(vehicule);
		this.envoyerFacture(vehicule, client);
	}
	
	public void envoyerFacture(Vehicule vehicule, Client client) {
		Facture facture = new Facture();
		System.out.println("Facture creee : " + facture);
	}
}
