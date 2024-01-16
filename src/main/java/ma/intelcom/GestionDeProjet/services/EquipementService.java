//package ma.intelcom.GestionDeProjet.services;
//
//import ma.intelcom.GestionDeProjet.models.Employee;
//import ma.intelcom.GestionDeProjet.models.Equipement;
//import ma.intelcom.GestionDeProjet.repositories.EquipementRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//
//
//@Service
//public class EquipementService {
//
//    private final EquipementRepository equipementRepository;
//
//    public EquipementService(EquipementRepository equipementRepository) {
//        this.equipementRepository = equipementRepository;
//    }
//
//    public Equipement createEquipement(Equipement equipement){
//        return equipementRepository.save(equipement);
//    }
//
//
//    public Equipement getEquipementById (Long id){
//        return equipementRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Equipement non trouvé par l'id: " +id));
//    }
//
//
//    public List<Equipement> getAllEquipements() {
//        return equipementRepository.findAll();
//    }
//
//
//
//    public Equipement updateEquipement(Long id, Equipement equipement) {
//        return equipementRepository.save(equipement);
//    }
//
//
//    public void deleteEquipement(Long id) {
//        equipementRepository.deleteById(id);
//    }
//}
