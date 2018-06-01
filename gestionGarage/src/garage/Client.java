package garage;

public class Client extends Personne{
	int numeroTel;
	String mail;
	
	public void seConnecter() {
		
	}
	
	public void seDeconnecter() {
		
	}
	
	public void acheterVehicule(Vehicule vehicule) {
		System.out.println("Le client " + this.prenom + " " + this.nom + " a acheté un véhicule.");
	}

}
