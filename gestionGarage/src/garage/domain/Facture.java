package garage.domain;

public class Facture {
	int idFacture;
	Vehicule vehicule;
	Client client;
	Employe employe;
	int montantFacture;
	
	public int getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(int idFacture) {
		this.idFacture = idFacture;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public int getMontantFacture() {
		return montantFacture;
	}
	public void setMontantFacture(int montantFacture) {
		this.montantFacture = montantFacture;
	}
	
	public void CreerFacture(int idFacture, Vehicule vehicule, Client client, Employe employe, int montantFacture) 
	{
		this.idFacture = idFacture;
		this.vehicule = vehicule;
		this.client = client;
		this.employe = employe;
		this.montantFacture = montantFacture;
		client.addFacture(this);
		employe.addFacture(this);
	}

}
