package com.epsi.garage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.epsi.garage.application.AjouterVehicule;
import com.epsi.garage.application.AjouterVehiculeImplementation;
import com.epsi.garage.application.ConsulterCatalogue;
import com.epsi.garage.application.ConsulterCatalogueImplementation;
import com.epsi.garage.application.CreerFacture;
import com.epsi.garage.application.CreerFactureImplementation;
import com.epsi.garage.application.Inscrire;
import com.epsi.garage.application.InscrireImplementation;
import com.epsi.garage.domaine.Client;
import com.epsi.garage.domaine.ClientRepository;
import com.epsi.garage.domaine.Employe;
import com.epsi.garage.domaine.EmployeRepository;
import com.epsi.garage.domaine.FactureRepository;
import com.epsi.garage.domaine.TypeMoteur;
import com.epsi.garage.domaine.Vehicule;
import com.epsi.garage.domaine.VehiculeRepository;

@SpringBootApplication
public class DesignPatternsApplication {

	@Autowired
	ClientRepository clientRepository;
	@Autowired
	EmployeRepository employeRepository;
	@Autowired
	FactureRepository factureRepository;
	@Autowired
	VehiculeRepository voitureRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner launcher(VehiculeRepository vehiculeRepo, ClientRepository clientRepo, EmployeRepository employeRepo) {
		return (args) -> {
			try {
				AjouterVehicule ajoutervehicule= new AjouterVehiculeImplementation(vehiculeRepo);
				Inscrire inscrire = new InscrireImplementation(clientRepo, employeRepo);
				ConsulterCatalogue consulterCatalogue = new ConsulterCatalogueImplementation(vehiculeRepo);
				CreerFacture creerFacture = new CreerFactureImplementation();
				
				
				SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				Scanner in = new Scanner(System.in);
						
				boolean x = true;
				while(x == true) {
					System.out.println("------------------------------------------");
					System.out.println("Inscrire ou connecter ou ajouterVehicule ou consulterCatalogue ou acheterVehicule ?");
						String s = in.next();
						if (s.equals("inscrire") || s.equals("Inscrire")) {
							System.out.println("Client ou employe ?");
							s = in.next();
							if (s.equals("client") || s.equals("Client")) {
								System.out.println("Prenom Client ?");
								String prenom = in.next();
								System.out.println("Nom Client ?");
								String nom = in.next();
								System.out.println("Numero Client ?");
								String numero = in.next();
								System.out.println("Mot de passe Client ?");
								String motDePasse = in.next();
								System.out.println("Mail Client ?");
								String mail = in.next();				
								System.out.println("Naissance Client ?");
								Date naissance = df.parse(in.next());
								
								inscrire.inscrireClient(prenom, nom, naissance, numero, mail, motDePasse);
								Iterable<Client> c = clientRepo.findAll();
								System.out.println(c);
								
							}else if (s.equals("employe") || s.equals("Employe")) {
								System.out.println("Prenom Employe ?");
								String prenom = in.next();
								System.out.println("Nom Employe ?");
								String nom = in.next();
								System.out.println("Naissance Employe ?");
								Date naissance = df.parse(in.next());
								System.out.println("Salaire Employe ?");
								int salaire = Integer.parseInt(in.next());
								System.out.println("Date embauche Employe ?");
								Date embauche = df.parse(in.next());
								System.out.println("Mot de passe Employe ?");
								String motDePasse = in.next();
								
								inscrire.inscrireEmploye(prenom, nom, naissance, salaire, embauche, motDePasse);
								Iterable<Employe> e = employeRepo.findAll();
								System.out.println(e);
							}						
						}else if(s.equals("ajouterVehicule")) {
							System.out.println("Modele voiture ?");
							String modele = in.next();
							System.out.println("Couleur voiture ?");
							String couleur = in.next();
							System.out.println("Type moteur ?");
							String type = in.next();
							TypeMoteur typeMoteur = TypeMoteur.Essence;
							if(type.equals("biogaz")) {
								typeMoteur = TypeMoteur.Biogaz;
							}else if(type.equals("essence")) {
								typeMoteur = TypeMoteur.Essence;
							}else if(type.equals("electrique")) {
								typeMoteur = TypeMoteur.Electrique;
							}else if(type.equals("diesel")) {
								typeMoteur = TypeMoteur.Diesel;
							}
							System.out.println("Prix voiture?");
							int prix = Integer.parseInt(in.next());
							
							ajoutervehicule.ajouterVehicule(modele, couleur, typeMoteur, prix);
						}else if(s.equals("consulterCatalogue")) {
							consulterCatalogue.consulterCatalogue();
						}else if(s.equals("acheterVehicule")) {
							Client client = new Client();
							client.setId(1);
							client.setNom("Gaiola");
							client.setPrenom("Thierry");
							client.setNaissance(df.parse("22/12/1997"));
							client.setNumeroTel("0157845645");
							client.setMail("mail@test.fr");
							
							Employe employe = new Employe();
							employe.setId(2);
							employe.setNom("Foresta");
							employe.setPrenom("Vincent");
							employe.setNaissance(df.parse("17/03/1984"));
							
							Vehicule vehicule = new Vehicule();
							vehicule.setIdVehicule(1);
							vehicule.setModele("Renault Clio");
							vehicule.setCouleur("Rouge");
							vehicule.setTypeMoteur(TypeMoteur.Essence);
							
							creerFacture.creerFacture(client, vehicule, employe);
						}
						/*else if (s.equals("connecter") || s.equals("Connecter")) {
							boolean connect = true;
							while(connect == true) {
								System.out.println("Votre ID ?");
								int id = Integer.parseInt(in.next());
								if(clientRepo.existsById(id)) {
									System.out.println("Mot de passe ?");
									String motDePasse = in.next();
								}else {
									System.out.println("Identifiant inexistant");
								}
							}
						}*/
				}
				in.close();
			
				
				
				/*
				
			
				
				vehiculeRepo.save(vehicule);
				Optional<Vehicule> v = vehiculeRepo.findById(1);
				System.out.println(v);
				
				
				employe.vendreVehicule(client, vehicule, employe);*/
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		};
	}
}




