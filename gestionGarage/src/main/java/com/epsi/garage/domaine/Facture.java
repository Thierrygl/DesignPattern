package com.epsi.garage.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Facture {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int idFacture;
	@ManyToOne
	Vehicule vehicule;
	@ManyToOne
	Client client;
	@ManyToOne
	Employe employe;
	int montantFacture;
	
	public int getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(int idFacture) {
		this.idFacture = idFacture;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public int getMontantFacture() {
		return montantFacture;
	}
	public void setMontantFacture(int montantFacture) {
		this.montantFacture = montantFacture;
	}
	
	public void CreerFacture(int idFacture, Vehicule vehicule, Client client, Employe employe, int montantFacture) 
	{
		this.idFacture = idFacture;
		this.vehicule = vehicule;
		this.client = client;
		this.employe = employe;
		this.montantFacture = montantFacture;
	}
	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", vehicule=" + vehicule + ", client=" + client + ", employe="
				+ employe + ", montantFacture=" + montantFacture + "]";
	}
	
}
