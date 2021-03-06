/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import javax.persistence.*;
import lombok.*;
import java.util.*;
import java.time.LocalDate;

/**
 *
 * @author Léa
 */
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Exposition {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column
    @NonNull
    private LocalDate debut;
    
    @Column(unique=true)
    @NonNull
    private String intitule;
    
    @Column
    @NonNull
    private Integer duree;
    
    @ManyToOne
    private Galerie galerie;
    
    @ManyToMany
    private List<Tableau> oeuvres = new LinkedList<>();
    
    @OneToMany(mappedBy = "lieuDeVente")
    private List<Transaction> ventes = new LinkedList<>();
    
    public float ca() {
        float chiffreAffaire = 0;
        for (Transaction t : ventes) {
            chiffreAffaire += t.getPrixVente();
        }
        return chiffreAffaire;
    }
}
