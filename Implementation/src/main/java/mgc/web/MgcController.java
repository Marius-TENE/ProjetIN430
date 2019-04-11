package mgc.web;

import java.util.Enumeration;

import javax.servlet.http.HttpSession;
import javax.swing.JList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mgc.entities.Utilisateur;
import mgc.metier.MgcMetier;

@Controller
public class MgcController {
	
	@Autowired
	private MgcMetier mgcMetier;
	
	@RequestMapping(value = "/connexion")
	public String connexion(HttpSession session,Model model,String id,String password) {
		session.setAttribute("connecte",false);
		System.out.print("Avant : "+session.getAttribute("connecte"));
		 
		if (id==null || password==null) {
			if (id==null){
				model.addAttribute("id","Veuillez entrer un ID");
			}
			if(password==null) {
				model.addAttribute("password","Veuillez saisir votre mot de passe");
			}
			return "intefaces/pages/connexion";
		}
		else {
			//verifier existance du compte
			boolean cmpte_existant=mgcMetier.chercherUtilisateur(id);
			if ( cmpte_existant ==false) {
				model.addAttribute("cmpte_in", "Ce compte est introuvable");
				return "intefaces/pages/connexion";
			}
			else {
				// verifier mot de passe
				System.out.print("ok..");
				Utilisateur user=mgcMetier.recupererUtilisateur(id);
				if (password.compareToIgnoreCase(user.getPassword())!=0) {
					System.out.print("mot de passe : " +password+"\n");
					System.out.print("mot de passe2 : " +user.getPassword()+"\n");
					model.addAttribute("pass_in", "mot de passe incorrecte ");
					System.out.print("mot de passe incorrecte ");
					return "intefaces/pages/connexion";
				}
				else {
					System.out.print("ok....");
					session.setAttribute("connecte", true);
					System.out.print("Apres : "+session.getAttribute("connecte"));
					model.addAttribute("user",user);
					return "compte";
				}
			}
			
		}
	}

}
