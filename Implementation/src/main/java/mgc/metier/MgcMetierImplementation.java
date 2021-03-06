package mgc.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mgc.dao.UtilisateurRepository;
import mgc.entities.Utilisateur;

@Service
@Transactional
public class MgcMetierImplementation implements MgcMetier{
	
	@Autowired
	private UtilisateurRepository utr;
	
	@Override
	public boolean chercherUtilisateur(String matricule) {
		return utr.existsById(matricule);
	}
	
	@Override
	public Utilisateur creerUtilisateur(Utilisateur u) {
		if( chercherUtilisateur(u.getMatricule())==true ) {
			// utilisateur deja existant
		}
		else {
			u.setLogin(u.getMatricule());
			utr.save(u);
		}
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
	public Utilisateur recupererCompte(String matricule, String email) {
		if (chercherUtilisateur(matricule)==true) {
			Utilisateur u = utr.getOne(matricule);
			if (u.getEmail()==email) {
				return u;
			}
			else {
				System.out.print("Email ne correspond pas");
			}
		}
		else {
			// Utilisateur introuvable
		}
		return null;
	}

	@Override
	public Utilisateur recupererUtilisateur(String matricule) {
		if (chercherUtilisateur(matricule)==true){
			return utr.getOne(matricule);
		}
		else {
			return null;
		}
	}

}
