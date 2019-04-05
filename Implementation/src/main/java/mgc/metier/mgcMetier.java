package mgc.metier;

import mgc.entities.Utilisateur;

public interface mgcMetier {
	public Utilisateur creerUtilisateur(Utilisateur u);
	public Utilisateur modifierInfosConnexion(Utilisateur u);
	public Utilisateur modifierInfosUtilisateur(Utilisateur u);
	public Utilisateur modifierStatutUtilisateur(Utilisateur u);
	public Utilisateur chercherUtilisateur(String matricule, String password);
	public Utilisateur recupererCompte(String matricule,String email);

}
