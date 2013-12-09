package fr.istic.gla.shared;

public class humainAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<fr.istic.gla.shared.humain> {
  private final fr.istic.gla.shared.humain shim = new fr.istic.gla.shared.humain() {
    public java.lang.Long getId()  {
      java.lang.Long toReturn = humainAutoBean.this.getWrapped().getId();
      return toReturn;
    }
    public java.lang.String getFacebook()  {
      java.lang.String toReturn = humainAutoBean.this.getWrapped().getFacebook();
      return toReturn;
    }
    public java.lang.String getNom()  {
      java.lang.String toReturn = humainAutoBean.this.getWrapped().getNom();
      return toReturn;
    }
    public java.lang.String getPrenom()  {
      java.lang.String toReturn = humainAutoBean.this.getWrapped().getPrenom();
      return toReturn;
    }
    @Override public boolean equals(Object o) {
      return this == o || getWrapped().equals(o);
    }
    @Override public int hashCode() {
      return getWrapped().hashCode();
    }
    @Override public String toString() {
      return getWrapped().toString();
    }
  };
  { com.google.gwt.core.client.impl.WeakMapping.set(shim, com.google.web.bindery.autobean.shared.AutoBean.class.getName(), this); }
  public humainAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public humainAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, fr.istic.gla.shared.humain wrapped) {
    super(wrapped, factory);
  }
  public fr.istic.gla.shared.humain as() {return shim;}
  public Class<fr.istic.gla.shared.humain> getType() {return fr.istic.gla.shared.humain.class;}
  @Override protected fr.istic.gla.shared.humain createSimplePeer() {
    return new fr.istic.gla.shared.humain() {
      private final com.google.web.bindery.autobean.shared.Splittable data = fr.istic.gla.shared.humainAutoBean.this.data;
      public java.lang.Long getId()  {
        return (java.lang.Long) humainAutoBean.this.getOrReify("id");
      }
      public java.lang.String getFacebook()  {
        return (java.lang.String) humainAutoBean.this.getOrReify("facebook");
      }
      public java.lang.String getNom()  {
        return (java.lang.String) humainAutoBean.this.getOrReify("nom");
      }
      public java.lang.String getPrenom()  {
        return (java.lang.String) humainAutoBean.this.getOrReify("prenom");
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    fr.istic.gla.shared.humain as = as();
    value = as.getId();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(humainAutoBean.this, "id"),
      java.lang.Long.class
    );
    if (visitor.visitValueProperty("id", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("id", value, propertyContext);
    value = as.getFacebook();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(humainAutoBean.this, "facebook"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("facebook", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("facebook", value, propertyContext);
    value = as.getNom();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(humainAutoBean.this, "nom"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("nom", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("nom", value, propertyContext);
    value = as.getPrenom();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(humainAutoBean.this, "prenom"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("prenom", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("prenom", value, propertyContext);
  }
}
