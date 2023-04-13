/*package com.Facturation.demo.Controller;
import com.Facturation.demo.Entity.Utilisateur;
import com.Facturation.demo.Repository.UtilisateurRepository;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;



public class UtilisateurControllerTest {

    private UtilisateurRepository utilisateurRepository;
    private Utilisateur utilisateur;

    @Before("")
    public void setUp() {
        // Initialisation de la base de données
        utilisateurRepository = new utilisateurRepository();
        utilisateur = new Utilisateur("John", "Doe",);
    }

    @After
    public void tearDown() {
        // Suppression de la base de données
        utilisateurRepository.deleteAll();
    }

    @Test
    public void testCreate() {
        // Création d'une nouvelle personne
        personDao.create(person);

        // Vérification que l'objet a été correctement enregistré
        Person personFromDb = personDao.findById(person.getId());
        assertNotNull(personFromDb);
        assertEquals(person, personFromDb);
    }

    @Test
    public void testUpdate() {
        // Mise à jour d'une personne existante
        personDao.create(person);
        person.setFirstName("Jane");
        personDao.update(person);

        // Vérification que l'objet a été correctement mis à jour
        Person personFromDb = personDao.findById(person.getId());
        assertNotNull(personFromDb);
        assertEquals(person, personFromDb);
    }

    @Test
    public void testDelete() {
        // Suppression d'une personne existante
        personDao.create(person);
        personDao.delete(person.getId());

        // Vérification que l'objet a été correctement supprimé
        assertNull(personDao.findById(person.getId()));
    }

    @Test
    public void testFindAll() {
        // Récupération de toutes les personnes
        personDao.create(person);
        Person person2 = new Person("Jane", "Doe");
        personDao.create(person2);
        List<Person> people = personDao.findAll();

        // Vérification que la liste contient les deux personnes
        assertNotNull(people);
        assertEquals(2, people.size());
        assertTrue(people.contains(person));
        assertTrue(people.contains(person2));
    }

}*/