package com.epsi.garage.application;

import com.epsi.garage.domaine.Client;
import com.epsi.garage.domaine.Employe;
import com.epsi.garage.domaine.Facture;
import com.epsi.garage.domaine.Vehicule;

public class AcheterVehiculeImplementation implements AcheterVehicule{

	@Override
	public void acheterVehicule(Client client, Vehicule vehicule, Employe employe) {
		Facture facture = new Facture();
		facture.setIdFacture(1);
		facture.setClient(client);
		facture.setEmploye(employe);
		facture.setVehicule(vehicule);
		facture.setMontantFacture(vehicule.getPrix()+800);
	}

}
