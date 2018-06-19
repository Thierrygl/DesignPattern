package com.epsi.garage.application;

import com.epsi.garage.domaine.TypeMoteur;
import com.epsi.garage.domaine.Vehicule;
import com.epsi.garage.domaine.VehiculeRepository;

public class AjouterVehiculeImplementation implements AjouterVehicule {

	VehiculeRepository vehiculeRepo;
	@Override
	public void ajouterVehicule(String modele, String couleur, TypeMoteur typeMoteur, int prix) {
		Vehicule vehicule = new Vehicule();
		vehicule.setModele(modele);
		vehicule.setCouleur(couleur);
		vehicule.setTypeMoteur(typeMoteur);
		vehicule.setPrix(prix);
		
		vehiculeRepo.save(vehicule);
		System.out.println("Vehicule ajoute : "+vehicule);
	}
	
	public AjouterVehiculeImplementation(VehiculeRepository vehiculeRepo) {
		super();
		this.vehiculeRepo = vehiculeRepo;
	}
	
	
}
