package com.epsi.garage.domaine;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {
	public Client findByNom(String nom);
	public Client findByPrenom(String prenom);
	public Client findByMail(String mail);
	public Client existsByMail(String mail);
}
