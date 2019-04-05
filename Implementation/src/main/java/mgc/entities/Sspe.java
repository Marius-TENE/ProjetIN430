package mgc.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("S")
public class Sspe extends Utilisateur{
	
	private static final long serialVersionUID = 1L;
	
	protected String poste;

	public Sspe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sspe(String matricule, String nom, String prenom, String email, String password, String adresse,
			String tel) {
		super(matricule, nom, prenom, email, password, adresse, tel);
		// TODO Auto-generated constructor stub
	}

	public Sspe(String matricule, String nom, String email, String password, String adresse, String tel) {
		super(matricule, nom, email, password, adresse, tel);
		// TODO Auto-generated constructor stub
	}

	public Sspe(String matricule, String nom, String prenom, String email, String password, String adresse, String tel,
			String poste) {
		super(matricule, nom, prenom, email, password, adresse, tel);
		this.poste = poste;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}
	
	
	
}
