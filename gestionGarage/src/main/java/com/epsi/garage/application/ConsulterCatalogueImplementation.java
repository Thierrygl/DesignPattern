package com.epsi.garage.application;

import com.epsi.garage.domaine.Vehicule;
import com.epsi.garage.domaine.VehiculeRepository;

public class ConsulterCatalogueImplementation implements ConsulterCatalogue{
	
	VehiculeRepository vehiculeRepo;
	
	@Override
	public void consulterCatalogue() {
		Iterable<Vehicule> v = vehiculeRepo.findAll();
		System.out.println(v);
	}
	
	public ConsulterCatalogueImplementation(VehiculeRepository vehiculeRepo) {
		super();
		this.vehiculeRepo = vehiculeRepo;
	}

}
