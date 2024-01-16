package ma.intelcom.GestionDeProjet.repositories;

import ma.intelcom.GestionDeProjet.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Utilisateur findUtilisateurByEmail(String email);
}
