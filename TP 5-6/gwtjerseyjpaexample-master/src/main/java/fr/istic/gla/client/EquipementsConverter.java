package fr.istic.gla.client;

import com.google.gwt.core.client.GWT;
import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanCodex;
import com.google.web.bindery.autobean.shared.AutoBeanUtils;

import fr.istic.gla.shared.Book;
import fr.istic.gla.shared.BookItf;
import fr.istic.gla.shared.Equipements;
import fr.istic.gla.shared.Home;
import fr.istic.gla.shared.Person;
import fr.istic.gla.shared.humain;
import fr.istic.gla.shared.maison;
import fr.istic.gla.shared.materiel;

public class EquipementsConverter {

	private EquipementsConverter() {
	}
	
	private static EquipementsConverter instance = new EquipementsConverter();
	
	
	  // Instantiate the factory
	  fr.istic.gla.shared.MyFactory factory = GWT.create(fr.istic.gla.shared.MyFactory.class);
	  // In non-GWT code, use AutoBeanFactorySource.create(MyFactory.class);

	  public materiel makeEquipements() {
	    // Construct the AutoBean
	    AutoBean<materiel> Equipements = factory.Equipements();

	    // Return the Book interface shim
	    return Equipements.as();
	  }

	  String serializeToJson(Equipements Equipements) {
	    // Retrieve the AutoBean controller
	    AutoBean<materiel> bean = AutoBeanUtils.getAutoBean(Equipements);

	    return AutoBeanCodex.encode(bean).getPayload();
	  }

	  materiel deserializeFromJson(String json) {
	    AutoBean<materiel> bean = AutoBeanCodex.decode(factory, materiel.class, json);
	    return bean.as();
	  }

	public static EquipementsConverter getInstance() {
		return instance;
	}
}
