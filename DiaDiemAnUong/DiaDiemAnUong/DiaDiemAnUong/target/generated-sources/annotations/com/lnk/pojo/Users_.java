package com.lnk.pojo;

import com.lnk.pojo.Follows;
import com.lnk.pojo.Orders;
import com.lnk.pojo.Reviews;
import com.lnk.pojo.Stores;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-08T17:41:38", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> lastName;
    public static volatile SingularAttribute<Users, String> role;
    public static volatile SingularAttribute<Users, String> avatar;
    public static volatile SetAttribute<Users, Orders> ordersSet;
    public static volatile SingularAttribute<Users, Integer> userId;
    public static volatile SingularAttribute<Users, Boolean> confirmed;
    public static volatile SetAttribute<Users, Reviews> reviewsSet;
    public static volatile SingularAttribute<Users, String> firstName;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, String> phone;
    public static volatile SetAttribute<Users, Stores> storesSet;
    public static volatile SetAttribute<Users, Follows> followsSet;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, String> username;

}