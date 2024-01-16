//package ma.intelcom.GestionDeProjet.services;
//
//
//import ma.intelcom.GestionDeProjet.models.Categorie;
//import ma.intelcom.GestionDeProjet.models.Equipement;
//import ma.intelcom.GestionDeProjet.repositories.CategorieRepository;
//import ma.intelcom.GestionDeProjet.repositories.EquipementRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//
//@Service
//public class CategorieService {
//
//    private final CategorieRepository categorieRepository;
//
//    public CategorieService(CategorieRepository categorieRepository) {
//        this.categorieRepository = categorieRepository;
//    }
//
//    public Categorie createCategorie(Categorie categorie){
//        return categorieRepository.save(categorie);
//    }
//
//    public Categorie getCategorieById (Long id){
//        return categorieRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Categorie non trouvé par l'id: " +id));
//    }
//
//    public List<Categorie> getAllCategories() {
//        return categorieRepository.findAll();
//    }
//
//    public Categorie updateCategorie(Long id, Categorie categorie) {
//        return categorieRepository.save(categorie);
//    }
//
//    public void deleteCategorie(Long id) {
//        categorieRepository.deleteById(id);
//    }
//}
