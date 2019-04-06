package mgc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mgc.metier.MgcMetier;

@Controller
public class MgcController {
	
	@Autowired
	private MgcMetier mgcMetier;
	
	@RequestMapping("/connexion")
	public String index() {
		return "pages/connexion";
	}

}
