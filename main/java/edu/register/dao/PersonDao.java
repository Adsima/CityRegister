package edu.register.dao;

import edu.register.domain.Person;
import javax.persistence.*;
import java.util.List;

public class PersonDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> findPersons() {
        Query query = entityManager.createNamedQuery("Person.findPersons");
        return query.getResultList();
    }

    public void addPerson(Person person) {
        entityManager.persist(person);
        entityManager.flush();
        System.out.println(person.getPersonId());
    }
}
