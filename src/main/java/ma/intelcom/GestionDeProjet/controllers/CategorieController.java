//package ma.intelcom.GestionDeProjet.controllers;
//
//import ma.intelcom.GestionDeProjet.models.Categorie;
//import ma.intelcom.GestionDeProjet.services.CategorieService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/categories")
//@CrossOrigin
//
//
//public class CategorieController {
//
//    private final CategorieService categorieService;
//
//    public CategorieController(CategorieService categorieService) {
//        this.categorieService = categorieService;
//    }
//
//    @PostMapping
//
//    public Categorie createCategorie(@RequestBody Categorie categorie){
//        return categorieService.createCategorie(categorie);
//    }
//
//    @GetMapping("/{id}")
//
//    public Categorie getCategorieById(@PathVariable Long id){
//        return categorieService.getCategorieById(id);
//    }
//
//    @GetMapping
//
//    public List<Categorie> getAllCategories(){
//        return categorieService.getAllCategories();
//    }
//
//    @PutMapping("/{id}")
//
//    public Categorie updateCategorie(@PathVariable Long id, @RequestBody Categorie categorie){
//        categorie.setId(id);
//        return categorieService.updateCategorie(id , categorie);
//    }
//
//    @DeleteMapping("/{id}")
//
//    public void deleteCategorie(@PathVariable Long id){
//        categorieService.deleteCategorie(id);
//    }
//
//}
