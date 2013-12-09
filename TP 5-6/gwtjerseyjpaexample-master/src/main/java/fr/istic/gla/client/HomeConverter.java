package fr.istic.gla.client;

import com.google.gwt.core.client.GWT;
import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanCodex;
import com.google.web.bindery.autobean.shared.AutoBeanUtils;

import fr.istic.gla.shared.Book;
import fr.istic.gla.shared.BookItf;
import fr.istic.gla.shared.Home;
import fr.istic.gla.shared.Person;
import fr.istic.gla.shared.humain;
import fr.istic.gla.shared.maison;

public class HomeConverter {

	private HomeConverter() {
	}
	
	private static HomeConverter instance = new HomeConverter();
	
	
	  // Instantiate the factory
	  fr.istic.gla.shared.MyFactory factory = GWT.create(fr.istic.gla.shared.MyFactory.class);
	  // In non-GWT code, use AutoBeanFactorySource.create(MyFactory.class);

	  public maison makeHome() {
	    // Construct the AutoBean
	    AutoBean<maison> Home = factory.Home();

	    // Return the Book interface shim
	    return Home.as();
	  }

	  String serializeToJson(Home Home) {
	    // Retrieve the AutoBean controller
	    AutoBean<maison> bean = AutoBeanUtils.getAutoBean(Home);

	    return AutoBeanCodex.encode(bean).getPayload();
	  }

	  maison deserializeFromJson(String json) {
	    AutoBean<maison> bean = AutoBeanCodex.decode(factory, maison.class, json);
	    return bean.as();
	  }

	public static HomeConverter getInstance() {
		return instance;
	}
}
