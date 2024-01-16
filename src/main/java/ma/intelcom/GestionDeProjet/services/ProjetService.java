package ma.intelcom.GestionDeProjet.services;

import jakarta.transaction.Transactional;
import ma.intelcom.GestionDeProjet.models.Projet;
import ma.intelcom.GestionDeProjet.models.Ressource;
import ma.intelcom.GestionDeProjet.models.Tache;
import ma.intelcom.GestionDeProjet.repositories.ProjetRepository;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProjetService {

    private final ProjetRepository projetRepository;
    private final TacheService tacheService;

//    private final RessourceService ressourceService;



    public ProjetService(ProjetRepository projetRepository, TacheService tacheService, RessourceService ressourceService) {
        this.projetRepository = projetRepository;
        this.tacheService = tacheService;
//        this.ressourceService = ressourceService;
    }

    public Projet createProject(Projet projet) {
        return this.projetRepository.save(projet);
    }

    public void deleteProject(Long projetId) {
        if (projetId == null) {
            Log log = null;
            log.error("ID de projet est nul");
            return;
        }
        this.projetRepository.deleteById(projetId);
    }

    public Projet updateProject(Long id, Projet projet){
        projet.setId(id);

        return  projetRepository.save(projet);
    }

//    public List<Projet> findAllProjects(){
//        List<Projet> projets = projetRepository.findAll();
//
//        for (Projet projet: projets){
//            List<Tache> taches = tacheService.getTachesByProjetId(projet.getId());
//            projet.setTaches(taches);
////            List<Ressource> ressources = ressourceService.getRessourcesByProjetId(projet.getId());
////            projet.setRessource(ressources);
//        }
//
//
//        return projets;
//    }

    public Projet findProjet (Long id){
        return projetRepository.findById(id).get();
    }

    public List<Projet> getAllProjects() {
        return projetRepository.findAll();
    }

//    public List<Tache> getProjectTaches(Long projectId){
//        Projet projet = projetRepository.findById(projectId)
//                .orElseThrow(() -> new RuntimeException("project not found"));
//        return projet.getTaches();
//    }

}
