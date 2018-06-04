package garage.domain;

public class Vehicule {
	static int id;
	static String modele;
	static String couleur;
	static TypeMoteur typeMoteur;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public TypeMoteur getTypeMoteur() {
		return typeMoteur;
	}
	public void setTypeMoteur(TypeMoteur typeMoteur) {
		this.typeMoteur = typeMoteur;
	}
}
