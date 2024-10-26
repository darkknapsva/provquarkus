package org.acme.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.model.Person;

@ApplicationScoped
public class PersonRepository implements PanacheRepositoryBase<Person, Long> {
}
