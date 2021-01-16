-- Initialisation spécifiques pour un jeu de test
INSERT INTO Galerie(id, nom, adresse) VALUES (1, 'Saatchi', 'King\''s Road, Londres');
INSERT INTO Galerie(id, nom, adresse) VALUES (2, 'Galerie2', 'adresseGalerie2');
INSERT INTO Galerie(id, nom, adresse) VALUES (3, 'Galerie3', 'adresseGalerie3');

INSERT INTO Exposition(id, debut, intitule, duree) VALUES (1, TO_DATE('2020/01/16', 'YYYY/MM/DD'), 'intituleExpo1', 11);
INSERT INTO Exposition(id, debut, intitule, duree) VALUES (2, TO_DATE('2020/06/15', 'YYYY/MM/DD'), 'intituleExpo2', 12);
INSERT INTO Exposition(id, debut, intitule, duree) VALUES (3, TO_DATE('2020/03/22', 'YYYY/MM/DD'), 'intituleExpo3', 13);

INSERT INTO Personne(id, nom, adresse) VALUES (1, 'Personne1', 'adressePersonne1');
INSERT INTO Personne(id, nom, adresse) VALUES (2, 'Personne2', 'adressePersonne2');
INSERT INTO Personne(id, nom, adresse) VALUES (3, 'Personne3', 'adressePersonne3');