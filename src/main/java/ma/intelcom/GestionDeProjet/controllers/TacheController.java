package ma.intelcom.GestionDeProjet.controllers;


import ma.intelcom.GestionDeProjet.models.Tache;
import ma.intelcom.GestionDeProjet.services.TacheService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/taches")
@CrossOrigin
public class TacheController {

    private final TacheService tacheService;

    public TacheController(TacheService tacheService) {
        this.tacheService = tacheService;
    }

//    @GetMapping()
//    public List<Tache> getAlltaches(){
//        return tacheService.findAllTache();
//    }
//
//    @PostMapping("/{id}")
//    public  ResponseEntity<Tache> createTache(@PathVariable Long id, @RequestBody Tache tache)
//    {
//        return ResponseEntity.ok(tacheService.addTaskToProject(id, tache));
//    }
//
//    @PutMapping("/projets/{projetId}/taches/{tacheId}")
//    public ResponseEntity<Tache> updateTache(
//            @PathVariable Long projetId,
//            @PathVariable Long tacheId,
//            @RequestBody Tache tacheModifiee){
//        Tache tacheMiseAJour = tacheService.updateTache(tacheId, tacheModifiee);
//        return ResponseEntity.ok(tacheMiseAJour);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> deleteTache(@PathVariable Long id){
//        tacheService.deleteTache(id);
//        return ResponseEntity.noContent().build();
//    }
//
//
//    @GetMapping("/projet/{projetId}")
//    public List<Tache> getTachesByProjetId(@PathVariable Long projetId)
//    {
//        return tacheService.getTachesByProjetId(projetId);
//    }

    @GetMapping ("/projets/{projectId}")
    public List<Tache> getTachesByProjectId(@PathVariable Long projectId) {
        return  tacheService.getTachesByProjetId(projectId);
    }

    @GetMapping("/{tacheId}")
    public Optional<Tache> getTacheById(@PathVariable Long tacheId){
        return tacheService.getTacheById(tacheId);
    }

    @PostMapping("/projets/{projectId}")
    public ResponseEntity<Tache> createTacheForProject(@PathVariable Long projectId, @RequestBody Tache tache){
        Tache createTache = tacheService.createTacheForProject(projectId, tache);
        return new ResponseEntity<>(createTache, HttpStatus.CREATED);
    }

    @PutMapping("/{tacheId}")
    public Tache updateTache(@PathVariable Long tacheId, @RequestBody Tache updatedTache){
        return tacheService.updateTache(tacheId, updatedTache);
    }

    @DeleteMapping("/{tacheId}")
    public void deleteTache(@PathVariable Long tacheId) {
        tacheService.deleteTache(tacheId);
    }

}
