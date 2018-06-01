package garage;

public class Main {

	public static void main(String[] args) {
		Client client = new Client();
		Employe employe = new Employe();
		client.id = 1;
		client.nom = "Gaiola";
		client.prenom = "Thierry";
		client.age = 22;
		
		
		Vehicule vehicule = new Vehicule();
		vehicule.setTypeMoteur(TypeMoteur.Essence);
	}

}
