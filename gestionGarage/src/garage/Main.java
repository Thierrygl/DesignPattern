package garage;

import garage.domain.*;

public class Main {

	public static void main(String[] args) {
		Client client = new Client();
		Employe employe = new Employe();
		client.setId(1);
		client.nom = "Gaiola";
		client.prenom = "Thierry";
		client.age = 22;
		client.mail = "mail@test.fr";
		
		employe.id = 2;
		employe.nom = "Foresta";
		employe.prenom = "Vincent";
		employe.age = 21;
		
		Vehicule vehicule = new Vehicule();
		vehicule.setTypeMoteur(TypeMoteur.Essence);
		//System.out.println(vehicule.getTypeMoteur());
		employe.vendreVehicule(client, vehicule, employe);
	}

}
