package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.model.Gender;
import org.acme.model.Person;
import org.acme.repositories.CrudImpl;
import org.acme.repositories.PersonRepository;

import java.util.List;

@ApplicationScoped
public class PersonService implements CrudImpl<Person> {


    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> findAll() {
        return personRepository.listAll();
    }

    @Override
    public Person save(Person person) {
         personRepository.persist(person);
         return person;

    }

    @Override
    public Person findOne(long id) {
        return personRepository.findById(id);
    }

    @Override
    public Person update(long id, Person person) {
        var exists = personRepository.findById(id);
        exists.setAge(person.getAge());
        exists.setFirstname(person.getFirstname());
        exists.setGender(person.getGender());
        exists.setLastname(person.getLastname());
        exists.setPhonenumber(person.getPhonenumber());
        personRepository.persist(exists);
        return exists;
    }

    @Override
    public void delete(long id) {
        var person = personRepository.findById(id);
        System.out.println("Deleted person: " + person.toString());
        personRepository.deleteById(id);
    }
}
