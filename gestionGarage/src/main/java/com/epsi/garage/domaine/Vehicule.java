package com.epsi.garage.domaine;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vehicule {
	@OneToMany(mappedBy="vehicule", cascade = CascadeType.ALL)
	List<Facture> factures = new ArrayList<Facture>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int idVehicule;
	String modele;
	String couleur;
	TypeMoteur typeMoteur;
	int prix;

	public List<Facture> getFactures() {
		return factures;
	}
	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
	public int getIdVehicule() {
		return idVehicule;
	}
	public void setIdVehicule(int idVehicule) {
		this.idVehicule = idVehicule;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public TypeMoteur getTypeMoteur() {
		return typeMoteur;
	}
	public void setTypeMoteur(TypeMoteur typeMoteur) {
		this.typeMoteur = typeMoteur;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Vehicule [factures=" + factures + ", idVehicule=" + idVehicule + ", modele=" + modele + ", couleur="
				+ couleur + ", typeMoteur=" + typeMoteur + ", prix=" + prix + "]";
	}
	
}
