package garage.application;

import java.util.Collection;
import garage.domain.*;

public interface VendreVehicule {
	Collection<Vehicule> getTypeVehicule(TypeMoteur typeMoteur);
	Boolean acheter(Vehicule vehicule, Client c);
	Client creerClient(String nom, String prenom);
	Client getClient(int id);
}
