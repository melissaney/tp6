
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
import fr.istic.gla.shared.Home;
import fr.istic.gla.shared.Person;
import fr.istic.gla.shared.humain;
import fr.istic.gla.shared.maison;

/*
 * This class is an example of services class
 */

@Path("/homes")
public class HomeResource {

    private List<Home> homes = new ArrayList<Home>();

    	
    public HomeResource() {
        Home blanche = new Home(62, "boulevard de cesson", "192.168.1.2");
        Home verte = new Home(170,"avenue leclerc","192.168.1.4");
        Home violette = new Home(90,"square vern","192.168.1.3");
        Home bleu = new Home(40,"rue tour","192.168.1.54");
        Home rouge = new Home(50, "rue versailles", "192.168.1.1");
        homes.add(blanche);
        homes.add(verte);
        homes.add(violette);
        homes.add(bleu);
        homes.add(rouge);
        
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Collection<Home> list() {
        return homes;
    }
    
    @GET @Path("search/{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public maison findById(@PathParam("id") String arg0) {
        return homes.get(Integer.parseInt(arg0));
    }

    @DELETE @Path("delete/{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public maison deleteById(@PathParam("id") String arg0) {
        return homes.remove(Integer.parseInt(arg0));
    }

    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
      return "Hello Jersey Home";
    }
    
}
