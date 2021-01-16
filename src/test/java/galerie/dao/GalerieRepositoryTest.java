package galerie.dao;

import galerie.entity.Galerie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;
import galerie.dao.GalerieRepository;
import java.util.Optional;

@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
public class GalerieRepositoryTest {

    @Autowired
    private GalerieRepository galerieDAO;

    @Test
    @Sql("test-data.sql") // On peut charger des donnnées spécifiques pour un test
    public void onSaitCompterLesEnregistrements() {
        log.info("On compte les enregistrements de la table 'Galerie'");
        int combienDansLeJeuDeTest = 3; 
        long nombre = galerieDAO.count();
        assertEquals(combienDansLeJeuDeTest, nombre, "On doit trouver 1 galerie" );
    }
    
    @Test
    @Sql("test-data.sql")
    public void test() {
        int code = 1;
        Optional<Galerie> resultat = galerieDAO.findById(code);
        // On s'assure qu'on trouvé le résultat
        assertTrue(resultat.isPresent(), "Cette catégorie");
        Galerie p = resultat.get();
        
        float resultatTest = 130;
        
        float result = p.caAnnuel(2020);
        assertEquals(resultatTest, result, "Le budget n'est pas identique");
        
    }

}
