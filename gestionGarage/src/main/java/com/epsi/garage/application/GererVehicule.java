package com.epsi.garage.application;

import com.epsi.garage.domaine.TypeMoteur;

public interface GererVehicule {
	public boolean ajouterVehicule(String modele, String couleur, TypeMoteur type, int prix);
	public boolean supprimerVehicule(int idVehicule);
}
