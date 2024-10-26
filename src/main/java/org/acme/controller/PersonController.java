package org.acme.controller;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.model.Person;
import org.acme.repositories.CrudImpl;
import org.acme.service.PersonService;

import java.util.List;

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GET
    public List<Person> findAll() {
        return personService.findAll();
    }

    @POST
    @Transactional
    public Person save(Person person) {
        return personService.save(person);
    }

    @GET
    @Path("/{id}")
    public Person findOne(@PathParam("id") long id) {
        return personService.findOne(id);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response update(@PathParam("id") long id, Person person) {
        personService.update(id, person);
        return Response.ok("Person updated successfully").build(); // HTTP 200 OK
    }

    @DELETE
    @Transactional
    @Path("/{id}")
    public void delete(long id) {
        personService.delete(id);
    }
}
