package com.epsi.garage.application;

import java.util.Collection;

import com.epsi.garage.domaine.Client;
import com.epsi.garage.domaine.TypeMoteur;
import com.epsi.garage.domaine.Vehicule;

public interface VendreVehicule {
	Collection<Vehicule> getTypeVehicule(TypeMoteur typeMoteur);
	Boolean acheter(Vehicule vehicule, Client client);
	
}
