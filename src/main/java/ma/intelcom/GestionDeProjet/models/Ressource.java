package ma.intelcom.GestionDeProjet.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Ressource {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nom;
    private String Type;

//    @OneToMany(mappedBy = "ressources",cascade = CascadeType.ALL)
//    private List<Equipement> equipements;
//
//    @OneToMany(mappedBy = "ressources", cascade = CascadeType.ALL)
//    private List<Employee> employees;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Projet projet;
}
