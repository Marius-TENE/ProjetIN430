package mgc.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("E")
public class Enseignant extends Utilisateur{

	private static final long serialVersionUID = 1L;
	protected String departement;
	protected String grade;
	protected String specialite;
	
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enseignant(String matricule, String nom, String prenom, String email, String password, String adresse,
			String tel) {
		super(matricule, nom, prenom, email, password, adresse, tel);
		// TODO Auto-generated constructor stub
	}
	public Enseignant(String matricule, String nom, String email, String password, String adresse, String tel) {
		super(matricule, nom, email, password, adresse, tel);
		// TODO Auto-generated constructor stub
	}
	public Enseignant(String matricule, String nom, String email, String password, String adresse, String tel,
			String departement, String grade, String specialite) {
		super(matricule, nom, email, password, adresse, tel);
		this.departement = departement;
		this.grade = grade;
		this.specialite = specialite;
	}
	public Enseignant(String matricule, String nom, String prenom, String email, String password, String adresse,
			String tel, String departement, String grade, String specialite) {
		super(matricule, nom, prenom, email, password, adresse, tel);
		this.departement = departement;
		this.grade = grade;
		this.specialite = specialite;
	}
	public Enseignant(String matricule, String nom, String email, String password, String adresse, String tel,
			String departement, String grade) {
		super(matricule, nom, email, password, adresse, tel);
		this.departement = departement;
		this.grade = grade;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
}
