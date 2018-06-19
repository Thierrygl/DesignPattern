package com.epsi.garage.application;

import java.sql.Date;

import com.epsi.garage.domaine.Client;

public class SeConnecterImplementation implements SeConnecter {

	@Override
	public Client creerClient(String nom, String prenom, Date naissance, String numeroTel, String mail,
			String motdepasse) {
		Client client = new Client();
		client.setPrenom(prenom);
		client.setNom(nom);
		client.setNaissance(naissance);
		client.setNumeroTel(numeroTel);
		client.setMail(mail);
		client.setMotDePasse(motdepasse);
		return client;
	}

	@Override
	public Client getClient(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
