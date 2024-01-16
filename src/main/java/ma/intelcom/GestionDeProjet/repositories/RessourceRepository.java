package ma.intelcom.GestionDeProjet.repositories;

import ma.intelcom.GestionDeProjet.models.Ressource;
import ma.intelcom.GestionDeProjet.models.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RessourceRepository extends JpaRepository<Ressource, Long> {

    List<Ressource> findAllByProjetId(Long projetId);

}
