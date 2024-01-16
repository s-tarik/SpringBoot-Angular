//package ma.intelcom.GestionDeProjet.token;
//
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import ma.intelcom.GestionDeProjet.models.Utilisateur;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class Token {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    private String token;
//
//    @Enumerated(EnumType.STRING)
//    private  TokenType tokenType;
//
//    private boolean expired;
//
//    private boolean revoked;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private Utilisateur utilisateur;
//
//}
