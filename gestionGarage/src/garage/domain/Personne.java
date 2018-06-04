package garage.domain;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

public class Personne {
	int id;
	String prenom;
	String nom;
	Date naissance;
	Collection<Facture> factures = new ArrayList<Facture>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getNaissance() {
		return naissance;
	}
	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}
	public Collection<Facture> getFactures() {
		return factures;
	}
	public void setFactures(Collection<Facture> factures) {
		this.factures = factures;
	}
	public void addFacture(Facture facture)
	{
		factures.add(facture);
	}	
}
