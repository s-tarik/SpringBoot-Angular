package ma.intelcom.GestionDeProjet.services;

import jakarta.persistence.EntityNotFoundException;
import ma.intelcom.GestionDeProjet.models.Projet;
import ma.intelcom.GestionDeProjet.models.Ressource;
import ma.intelcom.GestionDeProjet.models.Tache;
import ma.intelcom.GestionDeProjet.repositories.ProjetRepository;
import ma.intelcom.GestionDeProjet.repositories.RessourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class RessourceService {

    private final RessourceRepository ressourceRepository;

    private final ProjetRepository projetRepository;

    public RessourceService(RessourceRepository ressourceRepository, ProjetRepository projetRepository) {
        this.ressourceRepository = ressourceRepository;
        this.projetRepository = projetRepository;
    }
//
//    public Ressource createRessource(Ressource ressource){
//        return ressourceRepository.save(ressource);
//    }
//
//
//    public Ressource findRessource (Long id){
//        return ressourceRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Ressource non trouvé par l'id: " +id));
//    }
//
//
//    public List<Ressource> getAllRessources() {
//        return ressourceRepository.findAll();
//    }
//
//
//
//    public Ressource updateRessource(Long id, Ressource ressource) {
//        return ressourceRepository.save(ressource);
//    }
//
//
//    public void deleteRessource(Long id) {
//        ressourceRepository.deleteById(id);
//    }

    public List<Ressource> getRessourcesByProjetId(Long projetId){
        return ressourceRepository.findAllByProjetId(projetId);
    }

    public Optional<Ressource> getRessourceById(Long ressourceId) {
        return  ressourceRepository.findById(ressourceId);
    }

    public Ressource createRessourceForProject(Long projetId, Ressource ressource) {
        Projet projet = projetRepository.findById(projetId)
                .orElseThrow(() -> new EntityNotFoundException("project not found"));
        ressource.setProjet(projet);
        return ressourceRepository.save(ressource);
    }

    public Ressource updateRessource(Long ressourceId, Ressource updatedRessource) {
        Optional<Ressource> existingTache = ressourceRepository.findById(ressourceId);

        if (existingTache.isPresent()) {
            Ressource ressource = existingTache.get();
            ressource.setNom(updatedRessource.getNom());
            ressource.setType(updatedRessource.getType());
            return  ressourceRepository.save(ressource);
        } else {
            return null;
        }
    }

    public void deleteRessource(Long ressourceId) {
        ressourceRepository.deleteById(ressourceId);
    }
}
