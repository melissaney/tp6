package fr.istic.gla.client;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

import fr.istic.gla.shared.BookItf;
import fr.istic.gla.shared.Equipements;
import fr.istic.gla.shared.Person;
import fr.istic.gla.shared.humain;
import fr.istic.gla.shared.maison;
import fr.istic.gla.shared.materiel;

import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.view.client.ListDataProvider;


public class glagerseygwt implements EntryPoint {

	
	 private static List<Person> persons =  new ArrayList<Person>();
		

	 
 
	 
	 
	 
	 
	 
	public void onModuleLoad() {
		
		
		
		RootPanel rootPanel = RootPanel.get();
		rootPanel.setStyleName("h1");
		
		VerticalPanel panneaux = new VerticalPanel();
		rootPanel.add(panneaux, 0, 10);
		
				final TextBox areaBook = new TextBox();
				panneaux.add(areaBook);
				areaBook.setWidth("100%");
				 
				

    

    

				com.google.gwt.user.client.ui.Button book_bouton = new Button("Book ");
				panneaux.add(book_bouton);
				book_bouton.setWidth("100%");
				final TextBox text_maison = new TextBox();
				panneaux.add(text_maison);
				text_maison.setWidth("100%");
				com.google.gwt.user.client.ui.Button maison_bouton = new Button("maison ");
				panneaux.add(maison_bouton);
				maison_bouton.setWidth("100%");
				final TextBox text_person = new TextBox();
				panneaux.add(text_person);
				text_person.setWidth("100%");
				com.google.gwt.user.client.ui.Button person_bouton = new Button("Person ");
				panneaux.add(person_bouton);
				person_bouton.setWidth("100%");
				final TextBox equipement_text = new TextBox();
				panneaux.add(equipement_text);
				equipement_text.setWidth("100%");
				com.google.gwt.user.client.ui.Button equipement_bouton = new Button("materiel");
				panneaux.add(equipement_bouton);
				equipement_bouton.setWidth("100%");
				 
				
				
 
				
			 
			    CellTable<Person> tableau_list_person = new CellTable<Person>();
			    panneaux.add(tableau_list_person);
			     
			    ListDataProvider<Person> dataProvider = new ListDataProvider<Person>();
			    
			    			    TextColumn<Person> colone_prenom = new TextColumn<Person>() {
			    			      @Override
			    			      public String getValue(Person Person) {
			    			        return Person.getPrenom();
			    			      }
			    			    };
			    			     
			    			    			    
			    			    			    		 
			    			    			    			    
			    TextColumn<Person> colone_nom = new TextColumn<Person>() {
				      @Override
				      public String getValue(Person Person) {
				        return Person.getNom();
				      }
				    };
			    			    			    			    
			    
					    TextColumn<Person> fbprofColumn = new TextColumn<Person>() {
						      @Override
						      public String getValue(Person Person) {
						        return Person.getFacebook();
						      }
						    };
					    

			 
			    tableau_list_person.addColumn(colone_prenom, "nom");
			    tableau_list_person.addColumn(colone_nom,"prenom");
			    tableau_list_person.addColumn(fbprofColumn,"facebook ");
			    
			    final List<Person> list = dataProvider.getList();
			dataProvider.addDataDisplay(tableau_list_person);
			    			    
			    			    
			    			    			  
		

				 
				
				equipement_bouton.addClickHandler(new ClickHandler() {

					public void onClick(ClickEvent event) {
						RequestBuilder rb = new RequestBuilder(RequestBuilder.GET, GWT
								.getHostPageBaseURL() + "rest/equipements/search/" + text_person.getText());
						rb.setCallback(new RequestCallback() {

							public void onError(Request request, Throwable exception) {
								Window.alert(exception.getMessage());
							}

							public void onResponseReceived(Request request,
									Response response) {
								if (200 == response.getStatusCode()) {
									materiel b = EquipementsConverter.getInstance()
							.deserializeFromJson(response.getText());
									Window.alert("get the equip from :" +b.getId()
											+ " type : " + b.getGenre()
											+ " conso : " + b.getConsomation()
										 
											
											);

								}
							}
						});
						try {
							rb.send();
						} catch (RequestException e) {
							e.printStackTrace();
						}

					}
				});
				equipement_text.setValue("1");
				
				person_bouton.addClickHandler(new ClickHandler() {

					public void onClick(ClickEvent event) {
						RequestBuilder rb = new RequestBuilder(RequestBuilder.GET, GWT
								.getHostPageBaseURL() + "rest/persons/search/" + text_person.getText());
						rb.setCallback(new RequestCallback() {

							public void onError(Request request, Throwable exception) {
								Window.alert(exception.getMessage());
							}

							public void onResponseReceived(Request request,
									Response response) {
								if (200 == response.getStatusCode()) {
									humain b = PersonConverter.getInstance()
							.deserializeFromJson(response.getText());
									Window.alert("get the person from :" +b.getId()
											+ " nom : " + b.getNom()
											+ " prenom : " + b.getPrenom()
										
											+ " facebook  : " + b.getFacebook()
											
											);

								}
							}
						});
						try {
							rb.send();
						} catch (RequestException e) {
							e.printStackTrace();
						}

					}
				});
				text_person.setValue("1");
				

			 
				maison_bouton.addClickHandler(new ClickHandler() {

					public void onClick(ClickEvent event) {
						RequestBuilder rb = new RequestBuilder(RequestBuilder.GET, GWT
								.getHostPageBaseURL() + "rest/homes/search/" + text_maison.getText());
						rb.setCallback(new RequestCallback() {

							public void onError(Request request, Throwable exception) {
								Window.alert(exception.getMessage());
							}

							public void onResponseReceived(Request request,
									Response response) {
								if (200 == response.getStatusCode()) {
									maison b = HomeConverter.getInstance()
	 						.deserializeFromJson(response.getText());
									Window.alert("get the home from :" + b.getId()
											+ " adress: " + b.getAdress()
											
											+ " superficie : " + b.getSuperficie()
									
											);

								}
							}
						});
						try {
							rb.send();
						} catch (RequestException e) {
							e.printStackTrace();
						}

					}
				});
				text_maison.setValue("1");
				
				
				book_bouton.addClickHandler(new ClickHandler() {

					public void onClick(ClickEvent event) {
						RequestBuilder rb = new RequestBuilder(RequestBuilder.GET, GWT
								.getHostPageBaseURL() + "rest/books/search/" + areaBook.getText());
						rb.setCallback(new RequestCallback() {

							public void onError(Request request, Throwable exception) {
								Window.alert(exception.getMessage());
							}

							public void onResponseReceived(Request request,
									Response response) {
								if (200 == response.getStatusCode()) {
									BookItf b = BookJsonConverter.getInstance()
							.deserializeFromJson(response.getText());
									Window.alert("get the book from :" + b.getAuthor()
											+ " isbn : " + b.getIsbn().toString());

								}
							}
						});
						try {
							rb.send();
						} catch (RequestException e) {
							e.printStackTrace();
						}

					}
				});
			
		 
				
				areaBook.setValue("1");
			    

			    
			    for (Person Person : persons) {
			      list.add(Person);
			    }
			    
				 for (int i =0;i<5;i++){
				 RequestBuilder rb = new RequestBuilder(RequestBuilder.GET, GWT
							.getHostPageBaseURL() + "rest/persons/search/" + i);
				 
					rb.setCallback(new RequestCallback() {

						public void onError(Request request, Throwable exception) {
							Window.alert(exception.getMessage());
						}

						public void onResponseReceived(Request request,
								Response response) {
							
							if (200 == response.getStatusCode()) {
								humain b = PersonConverter.getInstance()
		 						.deserializeFromJson(response.getText());
								list.add(new Person(b.getPrenom(), b.getNom()));
								
								 
							}
						}
					});
					try {
						rb.send();
					} catch (RequestException e) {
						e.printStackTrace();
					}
				 }

			 
			    

	}
}