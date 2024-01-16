package ma.intelcom.GestionDeProjet.repositories;

import ma.intelcom.GestionDeProjet.models.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TacheRepository extends JpaRepository<Tache, Long> {
    List<Tache> findAllByProjetId(Long projetId);
}
