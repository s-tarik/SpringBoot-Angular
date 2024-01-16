package ma.intelcom.GestionDeProjet.repositories;

import ma.intelcom.GestionDeProjet.models.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
