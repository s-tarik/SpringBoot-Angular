package ma.intelcom.GestionDeProjet.controllers;

import ma.intelcom.GestionDeProjet.models.Utilisateur;
import ma.intelcom.GestionDeProjet.repositories.UtilisateurRepository;
import ma.intelcom.GestionDeProjet.services.UtilisateurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/enregistrement")
@CrossOrigin
public class UtilisateurController {

    private final UtilisateurService utilisateurService;
    private  final UtilisateurRepository utilisateurRepository;

    public UtilisateurController(UtilisateurService utilisateurService, UtilisateurRepository utilisateurRepository) {
        this.utilisateurService = utilisateurService;
        this.utilisateurRepository = utilisateurRepository;
    }

//    @PostMapping
//    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur) {
//        return utilisateurService.createUtilisateur(utilisateur);
//    }
//
//    @GetMapping("/{id}")
//
//    public Utilisateur getUtilisateurById(@PathVariable Long id){
//        return  utilisateurService.getUtilisateurById(id);
//    }
//
//    @GetMapping
//
//    public List<Utilisateur> getAllUtilisateurs(){
//        return utilisateurService.getAllUtilisateurs();
//    }
//
//    @PutMapping("/{id}")
//
//    public Utilisateur updateUtilisateur(@PathVariable Long id, @RequestBody Utilisateur utilisateur){
//        utilisateur.setId(id);
//        return utilisateurService.updateUtilisateur(utilisateur);
//    }
//
//    @DeleteMapping("/{id}")
//
//    public void deleteUtilisateur(@PathVariable Long id){
//        UtilisateurService.deleteUtilisateur(id);
//    }
    @PostMapping
    public ResponseEntity<Utilisateur> createUser(@RequestBody  Utilisateur utilisateur){

       Utilisateur createUser = utilisateurService.createUtilisateur(utilisateur);
        return new ResponseEntity<>(createUser, HttpStatus.CREATED);
    }



    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Utilisateur utilisateur) {
        if (utilisateurService.authenticateUser(utilisateur.getEmail(), utilisateur.getPassword())) {
            Utilisateur authUser = utilisateurRepository.findUtilisateurByEmail(utilisateur.getEmail());
            String connceted = authUser.getFirstname() + " " + authUser.getLastname();
            return ResponseEntity.ok(connceted);
        } else {
            return ResponseEntity.status(401).body("Invalid username or password");
        }
    }


}
