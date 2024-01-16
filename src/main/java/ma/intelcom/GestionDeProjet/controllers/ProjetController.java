package ma.intelcom.GestionDeProjet.controllers;

import ma.intelcom.GestionDeProjet.models.Projet;
import ma.intelcom.GestionDeProjet.models.Tache;
import ma.intelcom.GestionDeProjet.services.ProjetService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/projets")
@CrossOrigin
public class ProjetController {

    private final ProjetService projetService;

    public ProjetController(ProjetService projetService) {
        this.projetService = projetService;
    }



    @PostMapping
    public  ResponseEntity<Projet> createProject(@RequestBody Projet projet)
    {
        return ResponseEntity.ok(projetService.createProject(projet));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Projet> updateProject(@PathVariable Long id, @RequestBody Projet projet){
        return ResponseEntity.ok(projetService.updateProject(id,projet));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable Long id){
        projetService.deleteProject(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Projet> findProject(@PathVariable Long id)
    {
        return ResponseEntity.ok(projetService.findProjet(id));
    }

    @GetMapping
    public List<Projet> getAllProjects(){
        return projetService.getAllProjects();
    }

//    @GetMapping
//    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
//    public ResponseEntity<List<Projet>> getAllProjectsWithTaches() {
//        List<Projet> projetsWithTaches = projetService.findAllProjects();
//        return ResponseEntity.ok(projetsWithTaches);
//        }

//    @GetMapping("/{projectId}/taches")
//    public  ResponseEntity<List<Tache>> getProjectTaches(@PathVariable Long projectId){
//        List<Tache> taches = projetService.getProjectTaches(projectId);
//        return ResponseEntity.ok(taches);
//    }

}


