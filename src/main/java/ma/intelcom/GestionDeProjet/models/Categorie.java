//package ma.intelcom.GestionDeProjet.models;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.io.Serializable;
//import java.util.List;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//
//public class Categorie implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    private Long id;
//    private String Nom;
//
//    @OneToMany(mappedBy = "categorie")
//    private List<Equipement> equipements;
//
//}
