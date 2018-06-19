package com.epsi.garage.domaine;

import org.springframework.data.repository.CrudRepository;

public interface EmployeRepository extends CrudRepository<Employe, Integer> {
	public Employe findByNom(String nom);
	public Employe findByPrenom(String prenom);
}
