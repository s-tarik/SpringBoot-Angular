package ma.intelcom.GestionDeProjet.services;

import ma.intelcom.GestionDeProjet.models.Room;
import ma.intelcom.GestionDeProjet.models.Utilisateur;
import ma.intelcom.GestionDeProjet.repositories.UtilisateurRepository;
import org.springframework.stereotype.Service;
import org.apache.commons.codec.digest.DigestUtils;


import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UtilisateurService {

    private static UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }
//
//    public Utilisateur createUtilisateur(Utilisateur utilisateur){
//        return utilisateurRepository.save(utilisateur);
//    }
//
//
//    public Utilisateur getUtilisateurById (Long id){
//        return utilisateurRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("utilisateur non trouvé par l'id: " +id));
//    }
//
//
//    public List<Utilisateur> getAllUtilisateurs() {
//        return utilisateurRepository.findAll();
//    }
//
//
//
//    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
//        return utilisateurRepository.save(utilisateur);
//    }
//
//
//    public static void deleteUtilisateur(Long id) {
//        utilisateurRepository.deleteById(id);
//    }

    public static Utilisateur createUtilisateur(Utilisateur utilisateur){
        if (utilisateurRepository.findUtilisateurByEmail(utilisateur.getEmail()) != null) {
            throw new RuntimeException("Email already exists");
        }

        // Hash the password before saving it to the database
        String hashedPassword = hashPassword(utilisateur.getPassword());
        utilisateur.setPassword(hashedPassword);
        return  utilisateurRepository.save(utilisateur);
    }

    public boolean authenticateUser(String email, String password) {
        Utilisateur utilisateur = utilisateurRepository.findUtilisateurByEmail(email);
        return utilisateur != null && hashPassword(password).equals(utilisateur.getPassword());
    }

    private static String hashPassword(String password) {
        // Use a suitable hashing algorithm (SHA-256 in this example)
        return DigestUtils.sha256Hex(password);
    }
}
