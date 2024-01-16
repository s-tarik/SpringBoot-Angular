//package ma.intelcom.GestionDeProjet.controllers;
//
//import ma.intelcom.GestionDeProjet.models.Equipement;
//import ma.intelcom.GestionDeProjet.services.EquipementService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/equipements")
//@CrossOrigin
//
//public class EquipementController {
//
//    private final EquipementService equipementService;
//
//    public EquipementController(EquipementService equipementService) {
//        this.equipementService = equipementService;
//    }
//
//    @PostMapping
//
//    public Equipement createEquipement(@RequestBody Equipement equipement){
//        return equipementService.createEquipement(equipement);
//    }
//
//    @GetMapping("/{id}")
//
//    public Equipement getEquipementById(@PathVariable Long id){
//        return equipementService.getEquipementById(id);
//    }
//
//    @GetMapping
//
//    public List<Equipement> getAllEquipements(){
//        return equipementService.getAllEquipements();
//    }
//
//    @PutMapping("/{id}")
//
//    public Equipement updateEquipement(@PathVariable Long id, @RequestBody Equipement equipement){
//        equipement.setId(id);
//        return equipementService.updateEquipement(id , equipement);
//    }
//
//    @DeleteMapping("/{id}")
//
//    public void deleteEquipement(@PathVariable Long id){
//        equipementService.deleteEquipement(id);
//    }
//
//
//}
