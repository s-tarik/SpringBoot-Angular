package ma.intelcom.GestionDeProjet.controllers;

import ma.intelcom.GestionDeProjet.models.Ressource;
import ma.intelcom.GestionDeProjet.services.RessourceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/ressources")
@CrossOrigin
public class RessourceController {

    private final RessourceService ressourceService;

    public RessourceController(RessourceService ressourceService) {
        this.ressourceService = ressourceService;
    }
//
//    @PostMapping
//    public ResponseEntity<Ressource> createRessource(@RequestBody Ressource ressource)
//    {
//        return ResponseEntity.ok(ressourceService.createRessource(ressource));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Ressource> updateRessource(@PathVariable Long id, @RequestBody Ressource ressource){
//        return ResponseEntity.ok(ressourceService.updateRessource(id,ressource));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> deleteRessource(@PathVariable Long id){
//        ressourceService.deleteRessource(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Ressource> findRessource(@PathVariable Long id)
//    {
//        List<Ressource> ressourcesList = ressourceService.getAllRessources();
//        return ResponseEntity.ok(ressourceService.findRessource(id));
//    }
//
//    @GetMapping
//
//    public List<Ressource> getAllRessources(){
//        return ressourceService.getAllRessources();
//    }

    @GetMapping("/projets/{projectId}")
    public  List<Ressource> getRessourcesByProjectId(@PathVariable Long projectId){
        return  ressourceService.getRessourcesByProjetId(projectId);
    }

    @GetMapping("/{ressourceId}")
    public Optional<Ressource> getressourceById(@PathVariable Long ressourceId){
        return ressourceService.getRessourceById(ressourceId);
    }
//
    @PostMapping("/projets/{projectId}")
    public ResponseEntity<Ressource> createRessourceForProject(@RequestBody Ressource ressource, @PathVariable Long projectId){
       Ressource createRessource = ressourceService.createRessourceForProject(projectId, ressource);
       return new ResponseEntity<>(createRessource, HttpStatus.CREATED);
    }
//
    @PutMapping("{ressourceId}")
    public Ressource updateRessource(@PathVariable Long ressourceId, @RequestBody Ressource updatedRessource){
        return  ressourceService.updateRessource(ressourceId, updatedRessource);
    }
//
    @DeleteMapping("/{ressourceId}")
    public void deleteRessource(@PathVariable Long ressourceId) {
        ressourceService.deleteRessource(ressourceId);
    }


//    @GetMapping ("/projets/{projectId}")
//    public List<Ressource> getTachesByProjectId(@PathVariable Long projectId) {
//        return  ressourceService.getRessourceByProjectId(projectId);
//    }
//
//    @GetMapping("/{ressourceId}")
//    public Optional<Ressource> getRessourceById(@PathVariable Long ressourceId){
//        return ressourceService.getRessourceById(ressourceId);
//    }
//
//    @PostMapping("/projets/{projectId}")
//    public ResponseEntity<Ressource> createRessourceForProject(@PathVariable Long projectId, @RequestBody Ressource ressource){
//        Ressource createRessource = ressourceService.createRessourceForProject(projectId, ressource);
//        return new ResponseEntity<>(createRessource, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{ressourceId}")
//    public Ressource updateRessource(@PathVariable Long ressourceId, @RequestBody Ressource updatedRessource){
//        return ressourceService.updateRessource(ressourceId, updatedRessource);
//    }
//
//    @DeleteMapping("/{ressourceId}")
//    public void deleteRessource(@PathVariable Long ressourceId) {
//        ressourceService.deleteRessource(ressourceId);
//    }
}
