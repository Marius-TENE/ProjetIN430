package mgc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mgc.dao.UtilisateurRepository;
import mgc.entities.Sspe;
import mgc.metier.MgcMetier;

@SpringBootApplication
public class GestionComptes implements CommandLineRunner{
	
	@Autowired
	MgcMetier mgcMetier;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionComptes.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Sspe sspe= new Sspe("15Y511","TENE MBA","Marius Firmin","tefuncowm@gmail.com","groupe7","BP 43 Ydé-CMR","691103603","Chef service");
		boolean rep=mgcMetier.chercherUtilisateur("1511");
		System.out.print("La réponse est : "+ rep);
	}

}