package com.epsi.garage.application;

import java.sql.Date;
import com.epsi.garage.domaine.Client;


public interface SeConnecter {
	public Client creerClient(String nom, String prenom, Date naissance, String numeroTel, String mail, String motdepasse);
	public Client getClient(int id);	
}


