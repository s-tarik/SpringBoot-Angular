package ma.intelcom.GestionDeProjet.services;

import jakarta.persistence.EntityNotFoundException;
import ma.intelcom.GestionDeProjet.models.Projet;
import ma.intelcom.GestionDeProjet.models.Tache;
import ma.intelcom.GestionDeProjet.repositories.ProjetRepository;
import ma.intelcom.GestionDeProjet.repositories.TacheRepository;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TacheService {

    private final TacheRepository tacheRepository;
    private final ProjetRepository projetRepository;


    public TacheService(TacheRepository tacheRepository, ProjetRepository projetRepository) {
        this.tacheRepository = tacheRepository;
        this.projetRepository = projetRepository;
    }
//
//    public Tache addTaskToProject(Long projectId, Tache tache) {
//        Projet projet = projetRepository.findById(projectId)
//                .orElseThrow(() -> new EntityNotFoundException("Project not found with ID: " + projectId));
//
//        tache.setProjet(projet);
//        return tacheRepository.save(tache);
//    }
//
//    public Tache updateTache(Long tacheId, Tache tacheModifiee) {
//        return  tacheRepository.save(tacheModifiee);
//    }
//
//
//    public void deleteTache(Long tacheId) {
//        if (tacheId == null) {
//            Log log = null;
//            log.error("ID de tache est nul");
//            return;
//        }
//        this.tacheRepository.deleteById(tacheId);
//    }
//
//    public Projet updateProject(Long id, Tache tache){
//        tache.setId(id);
//        return tacheRepository.save(tache).getProjet();
//    }
//
//    public List<Tache> findAllTache(){
//        return this.tacheRepository.findAll();
//    }

    public List<Tache> getTachesByProjetId(Long projetId){
        return tacheRepository.findAllByProjetId(projetId);
    }

    public Optional<Tache> getTacheById(Long tacheId) {
        return  tacheRepository.findById(tacheId);
    }

    public Tache createTacheForProject(Long projetId, Tache tache) {
        Projet projet = projetRepository.findById(projetId)
                .orElseThrow(() -> new EntityNotFoundException("project not found"));
        tache.setProjet(projet);
        return tacheRepository.save(tache);
    }

    public Tache updateTache(Long tacheId, Tache updatedTache) {
        Optional<Tache> existingTache = tacheRepository.findById(tacheId);

        if (existingTache.isPresent()) {
            Tache tache = existingTache.get();
            tache.setNom(updatedTache.getNom());
            tache.setDescription(updatedTache.getDescription());
            tache.setDateDebut(updatedTache.getDateDebut());
            tache.setDateFin(updatedTache.getDateFin());
            return  tacheRepository.save(tache);
        } else {
            return null;
        }
    }

    public void deleteTache(Long tacheId) {
        tacheRepository.deleteById(tacheId);
    }

//    public Tache findTache (Long id){
//        return tacheRepository.findById(id).get();
//    }


}
