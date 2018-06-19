package com.epsi.garage.domaine;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Client extends Personne{
	@OneToMany(mappedBy="client", cascade = CascadeType.ALL)
	List<Facture> factures = new ArrayList<Facture>();
	String numeroTel;
	String mail;

	public List<Facture> getFactures() {
		return factures;
	}
	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
		
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
	@Override
	public String toString() {
		return "Client [factures=" + factures + ", numeroTel=" + numeroTel + ", mail=" + mail + ", id=" + id
				+ ", prenom=" + prenom + ", nom=" + nom + ", motDePasse=" + motDePasse + "]";
	}
	
	
	public void acheterVehicule(Vehicule vehicule) {
		System.out.println("Le client " + this.prenom + " " + this.nom + " a achete un vehicule de type " + vehicule.typeMoteur+".");
	}

}
