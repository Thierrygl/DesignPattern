package com.epsi.garage.application;

import com.epsi.garage.domaine.TypeMoteur;

public interface AjouterVehicule {
	public void ajouterVehicule(String modele, String couleur, TypeMoteur typeMoteur, int prix);
}
