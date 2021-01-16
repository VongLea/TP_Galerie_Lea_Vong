/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import javax.persistence.*;
import lombok.*;
import java.util.*;

/**
 *
 * @author Léa
 */
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(unique=true)
    @NonNull
    private String nom;
    
    @Column(unique=true)
    @NonNull
    private String adresse;
    
    @OneToMany(mappedBy = "client")
    private List<Transaction> achats;
    
   /* public float budgetArt(int annee) {
        float budgetAnnuel = 0;
        for (Transaction t : achats) {
            if (achats.getVenduLe().getYear() == annee) {
                budgetAnnuel += achats.getPrixVente();
            }
        }
        return budgetAnnuel;
    }*/
}
