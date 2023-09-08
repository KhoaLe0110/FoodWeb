package com.lnk.pojo;

import com.lnk.pojo.Foods;
import com.lnk.pojo.Stores;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-07T22:34:12", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Menus.class)
public class Menus_ { 

    public static volatile SetAttribute<Menus, Foods> foodsSet;
    public static volatile SingularAttribute<Menus, String> name;
    public static volatile SingularAttribute<Menus, Date> publishDate;
    public static volatile SingularAttribute<Menus, Integer> menuId;
    public static volatile SingularAttribute<Menus, String> description;
    public static volatile SingularAttribute<Menus, Stores> storeId;

}