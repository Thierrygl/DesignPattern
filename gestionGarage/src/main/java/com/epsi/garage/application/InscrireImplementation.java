package com.epsi.garage.application;

import java.util.Date;

import javax.persistence.Query;

import com.epsi.garage.domaine.Client;
import com.epsi.garage.domaine.ClientRepository;
import com.epsi.garage.domaine.Employe;
import com.epsi.garage.domaine.EmployeRepository;

public class InscrireImplementation implements Inscrire {
	
	ClientRepository clientRepo;
	EmployeRepository employeRepo;	
	/*@Override
	public void inscrire(String typeUtilisateur) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		if (typeUtilisateur == "client") {
			try {
				String nom = "Beaulieu";
				String prenom = "Nicolas";
				String numeroTel = "0629305862";
				Date naissance;
				naissance = df.parse("14/11/1995");
				String mail = "nicolas.beaulieu@epsi.fr";
				String motDePasse = "password1";
				inscrireClient(nom, prenom, naissance, numeroTel, mail, motDePasse);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		else if (typeUtilisateur == "employe") {
			try {
				String prenom = "Lucien";
				String nom = "Nguyen";
				Date naissance = df.parse("22/06/1996");
				int salaire = 2500;
				Date dateEmbauche = df.parse("01/04/2016");
				String motDePasse = "password2";
				inscrireEmploye(prenom, nom, naissance, salaire, dateEmbauche, motDePasse);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}*/

	@Override
	public void inscrireClient(String prenom, String nom, Date naissance, String numeroTel, String mail,
			String motDePasse) {		
		Client client = new Client();
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setNaissance(naissance);
		client.setNumeroTel(numeroTel);
		client.setMail(mail);
		client.setMotDePasse(motDePasse);
		
		clientRepo.save(client);
		System.out.println("Inscription client validee");
	}

	@Override
	public void inscrireEmploye(String prenom, String nom, Date naissance, int salaire, Date dateEmbauche,
			String motDePasse) {
		
		Employe employe = new Employe();
		employe.setPrenom(prenom);
		employe.setNom(nom);
		employe.setNaissance(naissance);
		employe.setSalaire(salaire);
		employe.setDateEmbauche(dateEmbauche);
		employe.setMotDePasse(motDePasse);
		
		employeRepo.save(employe);
		System.out.println("Inscription employe validee");
	}
	
	public InscrireImplementation(ClientRepository clientRepo, EmployeRepository employeRepo) {
		super();
		this.clientRepo = clientRepo;
		this.employeRepo = employeRepo;
	}


}
