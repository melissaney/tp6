package fr.istic.gla.shared;

public class BookItfAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<fr.istic.gla.shared.BookItf> {
  private final fr.istic.gla.shared.BookItf shim = new fr.istic.gla.shared.BookItf() {
    public int getNote()  {
      int toReturn = BookItfAutoBean.this.getWrapped().getNote();
      return toReturn;
    }
    public java.lang.Integer getIsbn()  {
      java.lang.Integer toReturn = BookItfAutoBean.this.getWrapped().getIsbn();
      return toReturn;
    }
    public java.lang.String getAuthor()  {
      java.lang.String toReturn = BookItfAutoBean.this.getWrapped().getAuthor();
      return toReturn;
    }
    public java.lang.String getTitle()  {
      java.lang.String toReturn = BookItfAutoBean.this.getWrapped().getTitle();
      return toReturn;
    }
    public void setAuthor(java.lang.String author)  {
      BookItfAutoBean.this.getWrapped().setAuthor(author);
      BookItfAutoBean.this.set("setAuthor", author);
    }
    public void setIsbn(java.lang.Integer isbn)  {
      BookItfAutoBean.this.getWrapped().setIsbn(isbn);
      BookItfAutoBean.this.set("setIsbn", isbn);
    }
    public void setNote(int note)  {
      BookItfAutoBean.this.getWrapped().setNote(note);
      BookItfAutoBean.this.set("setNote", note);
    }
    public void setTitle(java.lang.String title)  {
      BookItfAutoBean.this.getWrapped().setTitle(title);
      BookItfAutoBean.this.set("setTitle", title);
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
  public BookItfAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public BookItfAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, fr.istic.gla.shared.BookItf wrapped) {
    super(wrapped, factory);
  }
  public fr.istic.gla.shared.BookItf as() {return shim;}
  public Class<fr.istic.gla.shared.BookItf> getType() {return fr.istic.gla.shared.BookItf.class;}
  @Override protected fr.istic.gla.shared.BookItf createSimplePeer() {
    return new fr.istic.gla.shared.BookItf() {
      private final com.google.web.bindery.autobean.shared.Splittable data = fr.istic.gla.shared.BookItfAutoBean.this.data;
      public int getNote()  {
        java.lang.Integer toReturn = BookItfAutoBean.this.getOrReify("note");
        return toReturn == null ? 0 : toReturn;
      }
      public java.lang.Integer getIsbn()  {
        return (java.lang.Integer) BookItfAutoBean.this.getOrReify("isbn");
      }
      public java.lang.String getAuthor()  {
        return (java.lang.String) BookItfAutoBean.this.getOrReify("author");
      }
      public java.lang.String getTitle()  {
        return (java.lang.String) BookItfAutoBean.this.getOrReify("title");
      }
      public void setAuthor(java.lang.String author)  {
        BookItfAutoBean.this.setProperty("author", author);
      }
      public void setIsbn(java.lang.Integer isbn)  {
        BookItfAutoBean.this.setProperty("isbn", isbn);
      }
      public void setNote(int note)  {
        BookItfAutoBean.this.setProperty("note", note);
      }
      public void setTitle(java.lang.String title)  {
        BookItfAutoBean.this.setProperty("title", title);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    fr.istic.gla.shared.BookItf as = as();
    value = as.getNote();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(BookItfAutoBean.this, "note"),
      int.class
    );
    if (visitor.visitValueProperty("note", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("note", value, propertyContext);
    value = as.getIsbn();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(BookItfAutoBean.this, "isbn"),
      java.lang.Integer.class
    );
    if (visitor.visitValueProperty("isbn", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("isbn", value, propertyContext);
    value = as.getAuthor();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(BookItfAutoBean.this, "author"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("author", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("author", value, propertyContext);
    value = as.getTitle();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(BookItfAutoBean.this, "title"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("title", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("title", value, propertyContext);
  }
}
