//package ma.intelcom.GestionDeProjet.models;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Data @AllArgsConstructor @NoArgsConstructor
//public class Equipement extends Ressource{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String Nom;
//    private String Description;
//
//    @ManyToOne
//    @JoinColumn(name = "categorie_id")
//    private Categorie categorie;
//
//    @ManyToOne
//    @JoinColumn(name = "ressources_id")
//    private Ressource ressources;
//
//}
