package ma.intelcom.GestionDeProjet.services;

import ma.intelcom.GestionDeProjet.models.Projet;
import ma.intelcom.GestionDeProjet.models.SousTache;
import ma.intelcom.GestionDeProjet.repositories.SousTacheRepository;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Service;

@Service
public class SousTacheService {

    private final SousTacheRepository sousTacheRepository;

    public SousTacheService(SousTacheRepository sousTacheRepository) {
        this.sousTacheRepository = sousTacheRepository;
    }

    public Projet createSousTache(SousTache sousTache) {
        return this.sousTacheRepository.save(sousTache).getProjet();
    }

    public void deleteSousTache(Long sousTacheId) {
        if (sousTacheId == null) {
            Log log = null;
            log.error("ID de sous-tache est nul");
            return;
        }
        this.sousTacheRepository.deleteById(sousTacheId);
    }

    public Projet updateProject(Long id, SousTache sousTache){
        sousTache.setId(id);

        return sousTacheRepository.save(sousTache).getProjet();
    }
}
