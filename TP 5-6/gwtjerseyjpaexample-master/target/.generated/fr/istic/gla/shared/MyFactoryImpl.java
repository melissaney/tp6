package fr.istic.gla.shared;

public class MyFactoryImpl extends com.google.web.bindery.autobean.gwt.client.impl.AbstractAutoBeanFactory implements fr.istic.gla.shared.MyFactory {
  @Override protected void initializeCreatorMap(com.google.web.bindery.autobean.gwt.client.impl.JsniCreatorMap map) {
    map.add(fr.istic.gla.shared.materiel.class, getConstructors_fr_istic_gla_shared_materiel());
    map.add(fr.istic.gla.shared.maison.class, getConstructors_fr_istic_gla_shared_maison());
    map.add(fr.istic.gla.shared.humain.class, getConstructors_fr_istic_gla_shared_humain());
    map.add(fr.istic.gla.shared.BookItf.class, getConstructors_fr_istic_gla_shared_BookItf());
  }
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_fr_istic_gla_shared_materiel() /*-{
    return [
      @fr.istic.gla.shared.materielAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;),
      @fr.istic.gla.shared.materielAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Lfr/istic/gla/shared/materiel;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_fr_istic_gla_shared_maison() /*-{
    return [
      @fr.istic.gla.shared.maisonAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;),
      @fr.istic.gla.shared.maisonAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Lfr/istic/gla/shared/maison;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_fr_istic_gla_shared_humain() /*-{
    return [
      @fr.istic.gla.shared.humainAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;),
      @fr.istic.gla.shared.humainAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Lfr/istic/gla/shared/humain;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_fr_istic_gla_shared_BookItf() /*-{
    return [
      @fr.istic.gla.shared.BookItfAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;),
      @fr.istic.gla.shared.BookItfAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Lfr/istic/gla/shared/BookItf;)
    ];
  }-*/;
  @Override protected void initializeEnumMap() {
  }
  public com.google.web.bindery.autobean.shared.AutoBean Equipements() {
    return new fr.istic.gla.shared.materielAutoBean(MyFactoryImpl.this);
  }
  public com.google.web.bindery.autobean.shared.AutoBean Home() {
    return new fr.istic.gla.shared.maisonAutoBean(MyFactoryImpl.this);
  }
  public com.google.web.bindery.autobean.shared.AutoBean Person() {
    return new fr.istic.gla.shared.humainAutoBean(MyFactoryImpl.this);
  }
  public com.google.web.bindery.autobean.shared.AutoBean book() {
    return new fr.istic.gla.shared.BookItfAutoBean(MyFactoryImpl.this);
  }
}
