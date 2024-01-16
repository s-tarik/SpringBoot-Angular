package ma.intelcom.GestionDeProjet.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Projet implements Serializable {
      @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nom;
    private String Description;
    private Date DateDebut;
    private Date DateFin;
      @OneToMany(mappedBy = "projet")
      @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Tache> taches;
      @ManyToOne
    private Utilisateur utilisateurs;
      @OneToMany(mappedBy = "projet")
      @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Ressource> ressource;

}
