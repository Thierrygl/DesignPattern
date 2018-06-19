package com.epsi.garage.application;

import java.util.Date;

public interface Inscrire {
	public void inscrireClient(String prenom, String nom, Date naissance, String numero, String mail, String motDePasse);
	public void inscrireEmploye(String prenom, String nom, Date naissance, int salaire, Date dateEmbauche, String motDePasse);
}
