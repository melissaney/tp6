package fr.istic.gla.shared;

public class maisonAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<fr.istic.gla.shared.maison> {
  private final fr.istic.gla.shared.maison shim = new fr.istic.gla.shared.maison() {
    public int getSuperficie()  {
      int toReturn = maisonAutoBean.this.getWrapped().getSuperficie();
      return toReturn;
    }
    public java.lang.Long getId()  {
      java.lang.Long toReturn = maisonAutoBean.this.getWrapped().getId();
      return toReturn;
    }
    public java.lang.String getAdress()  {
      java.lang.String toReturn = maisonAutoBean.this.getWrapped().getAdress();
      return toReturn;
    }
    public java.lang.String getIp()  {
      java.lang.String toReturn = maisonAutoBean.this.getWrapped().getIp();
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
  public maisonAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public maisonAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, fr.istic.gla.shared.maison wrapped) {
    super(wrapped, factory);
  }
  public fr.istic.gla.shared.maison as() {return shim;}
  public Class<fr.istic.gla.shared.maison> getType() {return fr.istic.gla.shared.maison.class;}
  @Override protected fr.istic.gla.shared.maison createSimplePeer() {
    return new fr.istic.gla.shared.maison() {
      private final com.google.web.bindery.autobean.shared.Splittable data = fr.istic.gla.shared.maisonAutoBean.this.data;
      public int getSuperficie()  {
        java.lang.Integer toReturn = maisonAutoBean.this.getOrReify("superficie");
        return toReturn == null ? 0 : toReturn;
      }
      public java.lang.Long getId()  {
        return (java.lang.Long) maisonAutoBean.this.getOrReify("id");
      }
      public java.lang.String getAdress()  {
        return (java.lang.String) maisonAutoBean.this.getOrReify("adress");
      }
      public java.lang.String getIp()  {
        return (java.lang.String) maisonAutoBean.this.getOrReify("ip");
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    fr.istic.gla.shared.maison as = as();
    value = as.getSuperficie();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(maisonAutoBean.this, "superficie"),
      int.class
    );
    if (visitor.visitValueProperty("superficie", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("superficie", value, propertyContext);
    value = as.getId();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(maisonAutoBean.this, "id"),
      java.lang.Long.class
    );
    if (visitor.visitValueProperty("id", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("id", value, propertyContext);
    value = as.getAdress();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(maisonAutoBean.this, "adress"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("adress", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("adress", value, propertyContext);
    value = as.getIp();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(maisonAutoBean.this, "ip"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("ip", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("ip", value, propertyContext);
  }
}
