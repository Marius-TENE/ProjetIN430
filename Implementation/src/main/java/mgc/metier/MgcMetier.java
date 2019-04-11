package mgc.metier;

import mgc.entities.Utilisateur;

public interface MgcMetier {
	public Utilisateur creerUtilisateur(Utilisateur u);
	public Utilisateur modifierInfosConnexion(Utilisateur u);
	public Utilisateur modifierInfosUtilisateur(Utilisateur u);
	public Utilisateur modifierStatutUtilisateur(Utilisateur u);
	public Utilisateur recupererUtilisateur(String matricule);
	public Utilisateur recupererCompte(String matricule,String email);
	public boolean chercherUtilisateur(String matricule);

}
