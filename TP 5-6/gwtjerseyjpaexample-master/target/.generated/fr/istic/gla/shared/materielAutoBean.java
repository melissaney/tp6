package fr.istic.gla.shared;

public class materielAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<fr.istic.gla.shared.materiel> {
  private final fr.istic.gla.shared.materiel shim = new fr.istic.gla.shared.materiel() {
    public fr.istic.gla.shared.Home getHabitation()  {
      fr.istic.gla.shared.Home toReturn = materielAutoBean.this.getWrapped().getHabitation();
      if (toReturn != null) {
        if (materielAutoBean.this.isWrapped(toReturn)) {
          toReturn = materielAutoBean.this.getFromWrapper(toReturn);
        } else {
        }
      }
      return toReturn;
    }
    public java.lang.Long getId()  {
      java.lang.Long toReturn = materielAutoBean.this.getWrapped().getId();
      return toReturn;
    }
    public java.lang.String getConsomation()  {
      java.lang.String toReturn = materielAutoBean.this.getWrapped().getConsomation();
      return toReturn;
    }
    public java.lang.String getGenre()  {
      java.lang.String toReturn = materielAutoBean.this.getWrapped().getGenre();
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
  public materielAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public materielAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, fr.istic.gla.shared.materiel wrapped) {
    super(wrapped, factory);
  }
  public fr.istic.gla.shared.materiel as() {return shim;}
  public Class<fr.istic.gla.shared.materiel> getType() {return fr.istic.gla.shared.materiel.class;}
  @Override protected fr.istic.gla.shared.materiel createSimplePeer() {
    return new fr.istic.gla.shared.materiel() {
      private final com.google.web.bindery.autobean.shared.Splittable data = fr.istic.gla.shared.materielAutoBean.this.data;
      public fr.istic.gla.shared.Home getHabitation()  {
        return (fr.istic.gla.shared.Home) materielAutoBean.this.getOrReify("habitation");
      }
      public java.lang.Long getId()  {
        return (java.lang.Long) materielAutoBean.this.getOrReify("id");
      }
      public java.lang.String getConsomation()  {
        return (java.lang.String) materielAutoBean.this.getOrReify("consomation");
      }
      public java.lang.String getGenre()  {
        return (java.lang.String) materielAutoBean.this.getOrReify("genre");
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    fr.istic.gla.shared.materiel as = as();
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getHabitation());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(materielAutoBean.this, "habitation"),
      fr.istic.gla.shared.Home.class
    );
    if (visitor.visitReferenceProperty("habitation", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("habitation", bean, propertyContext);
    value = as.getId();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(materielAutoBean.this, "id"),
      java.lang.Long.class
    );
    if (visitor.visitValueProperty("id", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("id", value, propertyContext);
    value = as.getConsomation();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(materielAutoBean.this, "consomation"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("consomation", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("consomation", value, propertyContext);
    value = as.getGenre();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(materielAutoBean.this, "genre"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("genre", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("genre", value, propertyContext);
  }
}
