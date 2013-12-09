package fr.istic.gla.client;

import com.google.gwt.core.client.GWT;
import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanCodex;
import com.google.web.bindery.autobean.shared.AutoBeanUtils;

import fr.istic.gla.shared.Book;
import fr.istic.gla.shared.BookItf;
import fr.istic.gla.shared.Person;
import fr.istic.gla.shared.humain;

public class PersonConverter {

	private PersonConverter() {
	}
	
	private static PersonConverter instance = new PersonConverter();
	
	
	  // Instantiate the factory
	  fr.istic.gla.shared.MyFactory factory = GWT.create(fr.istic.gla.shared.MyFactory.class);
	  // In non-GWT code, use AutoBeanFactorySource.create(MyFactory.class);

	  public humain makeperson() {
	    // Construct the AutoBean
	    AutoBean<humain> Person = factory.Person();

	    // Return the Book interface shim
	    return Person.as();
	  }

	  String serializeToJson(Person Person) {
	    // Retrieve the AutoBean controller
	    AutoBean<humain> bean = AutoBeanUtils.getAutoBean(Person);

	    return AutoBeanCodex.encode(bean).getPayload();
	  }

	  humain deserializeFromJson(String json) {
	    AutoBean<humain> bean = AutoBeanCodex.decode(factory, humain.class, json);
	    return bean.as();
	  }

	public static PersonConverter getInstance() {
		return instance;
	}
}
