package mgc.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mgc.dao.UtilisateurRepository;
import mgc.entities.Utilisateur;

@Service
@Transactional
public class mgcMetierImplementation implements mgcMetier{
	
	@Autowired
	private UtilisateurRepository utr;
	
	@Override
	public Utilisateur creerUtilisateur(Utilisateur u) {
		utr.save(u);
		return u;
	}

	@Override
	public Utilisateur modifierInfosConnexion(Utilisateur u) {
		utr.save(u);
		return u;
	}

	@Override
	public Utilisateur modifierInfosUtilisateur(Utilisateur u) {
		utr.save(u);
		return u;
	}

	@Override
	public Utilisateur modifierStatutUtilisateur(Utilisateur u) {
		utr.save(u);
		return u;
	}

	@Override
	public Utilisateur chercherUtilisateur(String matricule, String password) {
		return null;
	}

	@Override
	public Utilisateur recupererCompte(String matricule, String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
