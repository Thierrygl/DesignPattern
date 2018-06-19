package com.epsi.garage.application;

import com.epsi.garage.domaine.Client;
import com.epsi.garage.domaine.Employe;
import com.epsi.garage.domaine.Vehicule;

public interface AcheterVehicule {
	public void acheterVehicule(Client client, Vehicule vehicule, Employe Employe);
}
