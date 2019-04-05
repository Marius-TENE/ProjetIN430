package mgc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mgc.entities.Utilisateur;

public interface UtilisateurRepository 
extends JpaRepository<Utilisateur, String> {

}
