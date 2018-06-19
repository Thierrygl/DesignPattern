package com.epsi.garage;

import com.epsi.garage.domaine.*;
import com.epsi.garage.application.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		try {
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date dateNaissance = df.parse("01/01/2018");
			
			Client client = new Client();
			client.setId(1);
			client.setNom("Gaiola");
			client.setPrenom("Thierry");
			dateNaissance = (Date) df.parse("22/12/1997");
			client.setNaissance(dateNaissance);
			client.setNumeroTel("0157845645");
			client.setMail("mail@test.fr");
			
			Employe employe = new Employe();
			employe.setId(2);
			employe.setNom("Foresta");
			employe.setPrenom("Vincent");
			dateNaissance = df.parse("17/03/1984");
			employe.setNaissance(dateNaissance);
			
			Vehicule vehicule = new Vehicule();
			vehicule.setIdVehicule(1);
			vehicule.setModele("Renault Clio");
			vehicule.setCouleur("Rouge");
			vehicule.setTypeMoteur(TypeMoteur.Essence);
			
			
			employe.vendreVehicule(client, vehicule, employe);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
