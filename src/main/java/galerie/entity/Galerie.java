package galerie.entity;
import javax.persistence.*;
import lombok.*;
import java.util.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Galerie {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(unique=true)
    @NonNull
    private String nom;
    
    @Column(unique=true)
    @NonNull
    private String adresse;
    
    @OneToMany(mappedBy = "galerie")
    private List<Exposition> evenements = new LinkedList<>();
    
    public float ca() {
        float chiffreAffaire = 0;
        for (Exposition e : evenements) {
            chiffreAffaire += e.ca();
        }
        return chiffreAffaire;
    }
}
