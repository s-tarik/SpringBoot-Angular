package ma.intelcom.GestionDeProjet.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor

public class SousTache extends Tache {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nom;
    private String Description;
    private Date DateDebut;
    private Date DateFin;
}
