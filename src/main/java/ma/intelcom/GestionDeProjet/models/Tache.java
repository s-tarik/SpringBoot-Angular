package ma.intelcom.GestionDeProjet.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Tache {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nom;
    private String Description;
    private Date DateDebut;
    private Date DateFin;
    private String etat;
    private String Responsable;
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Projet projet;



}
