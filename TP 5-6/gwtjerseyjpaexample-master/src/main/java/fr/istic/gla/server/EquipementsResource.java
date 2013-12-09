
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
import fr.istic.gla.shared.Equipements;
import fr.istic.gla.shared.Home;
import fr.istic.gla.shared.Person;
import fr.istic.gla.shared.humain;
import fr.istic.gla.shared.maison;
import fr.istic.gla.shared.materiel;

/*
 * This class is an example of services class
 */

@Path("/equipements")
public class EquipementsResource {

    private List<Equipements> equipements = new ArrayList<Equipements>();

    	
    public EquipementsResource() {
    	
    	
    	
        Equipements television = new Equipements("sony", "10", null );
        Equipements machine_a_laver = new Equipements("samsung", "25", null);
        Equipements chauffage = new Equipements("edf", "60", null);
        Equipements pc = new Equipements("mac","40", null);
        Equipements plaques = new Equipements("toshiba", "35", null);
        equipements.add(television);
        equipements.add(machine_a_laver);
        equipements.add(chauffage);
        equipements.add(pc);
        equipements.add(plaques);
        
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Collection<Equipements> list() {
        return equipements;
    }
    
    @GET @Path("search/{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public materiel findById(@PathParam("id") String arg0) {
        return equipements.get(Integer.parseInt(arg0));
    }

    @DELETE @Path("delete/{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public materiel deleteById(@PathParam("id") String arg0) {
        return equipements.remove(Integer.parseInt(arg0));
    }

    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
      return "Hello Jersey Home";
    }
    
}
