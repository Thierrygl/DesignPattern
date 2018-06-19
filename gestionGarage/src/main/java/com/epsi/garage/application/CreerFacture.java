package com.epsi.garage.application;

import com.epsi.garage.domaine.Client;
import com.epsi.garage.domaine.Employe;
import com.epsi.garage.domaine.Vehicule;

public interface CreerFacture {
	public void creerFacture(Client client, Vehicule vehicule, Employe employe);
}
