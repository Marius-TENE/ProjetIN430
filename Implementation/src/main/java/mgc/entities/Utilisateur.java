package mgc.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE ) //on aura juste une seule table Utilisateur qui va avoir une colonne nommée type_user qui pourra prendre pour valeur s ou e. s: SSPE et e: Enseignant
@DiscriminatorColumn(name = "type_user",discriminatorType = DiscriminatorType.STRING,length = 1)
public abstract class Utilisateur implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	protected String matricule;
	@Column(nullable = false)
	protected String nom;
	@Column(nullable = true)
	protected String prenom;
	@Column(nullable = false,unique = true)
	protected String email;
	@Column(nullable = true,unique = true)
	protected String login;
	@Column(nullable = false)
	protected String password;
	@Column(nullable = false)
	protected String adresse;
	@Column(nullable = false,unique = true)
	protected String tel;
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Utilisateur(String matricule, String nom, String email, String password, String adresse, String tel) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.email = email;
		this.password = password;
		this.adresse = adresse;
		this.tel = tel;
	}
	

	public Utilisateur(String matricule, String nom, String prenom, String email, String login, String password,
			String adresse, String tel) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.login = login;
		this.password = password;
		this.adresse = adresse;
		this.tel = tel;
	}


	public Utilisateur(String matricule, String nom, String prenom, String email, String password, String adresse,
			String tel) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.adresse = adresse;
		this.tel = tel;
	}


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}
	
	
	
}