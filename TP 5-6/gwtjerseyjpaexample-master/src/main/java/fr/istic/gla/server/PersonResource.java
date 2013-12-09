
package fr.istic.gla.server;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.istic.gla.shared.Book;
import fr.istic.gla.shared.BookItf;
import fr.istic.gla.shared.Person;
import fr.istic.gla.shared.humain;

/*
 * This class is an example of services class
 */

@Path("/persons")
public class PersonResource {

    private List<Person> persons = new ArrayList<Person>();

    	
    public PersonResource() {
        Person patrick = new Person("patrick", "poivre D.");
        Person bocar = new Person("Daffy", "duck");
        Person vladimir = new Person("vladimir", "gamarra rupa");
        Person alice = new Person("alice", "rault");
        Person bob = new Person("bob", "eponge");
        persons.add(patrick);
        persons.add(bocar);
        persons.add(vladimir);
        persons.add(alice);
        persons.add(bob);
        
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Collection<Person> list() {
        return persons;
    }
    
    @GET @Path("search/{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public humain findById(@PathParam("id") String arg0) {
        return persons.get(Integer.parseInt(arg0));
    }

    @DELETE @Path("delete/{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public humain deleteById(@PathParam("id") String arg0) {
        return persons.remove(Integer.parseInt(arg0));
    }

    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
      return "Hello Jersey person";
    }
    
}
