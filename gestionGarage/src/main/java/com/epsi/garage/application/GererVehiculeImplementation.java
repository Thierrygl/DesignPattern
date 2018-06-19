package com.epsi.garage.application;

import com.epsi.garage.domaine.TypeMoteur;
import com.epsi.garage.domaine.Vehicule;

public class GererVehiculeImplementation implements GererVehicule {

	@Override
	public boolean ajouterVehicule(String modele, String couleur, TypeMoteur typeMoteur, int prix) {
		Vehicule vehicule = new Vehicule();
		vehicule.setIdVehicule(1);
		vehicule.setModele(modele);
		vehicule.setCouleur(couleur);
		vehicule.setTypeMoteur(typeMoteur);
		vehicule.setPrix(prix);
		return true;
	}

	@Override
	public boolean supprimerVehicule(int idVehicule) {
		// TODO Auto-generated method stub
		return true;
	}

}
