package com.epsi.garage.domaine;

import org.springframework.data.repository.CrudRepository;

public interface VehiculeRepository extends CrudRepository<Vehicule, Integer> {
	public Vehicule findByModele(String modele);
}
