package com.lnk.pojo;

import com.lnk.pojo.Follows;
import com.lnk.pojo.Foods;
import com.lnk.pojo.Menus;
import com.lnk.pojo.Orders;
import com.lnk.pojo.Revenuestatistics;
import com.lnk.pojo.Reviews;
import com.lnk.pojo.Users;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-07T22:34:12", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Stores.class)
public class Stores_ { 

    public static volatile SetAttribute<Stores, Foods> foodsSet;
    public static volatile SingularAttribute<Stores, BigDecimal> latitude;
    public static volatile SetAttribute<Stores, Orders> ordersSet;
    public static volatile SingularAttribute<Stores, Integer> storeId;
    public static volatile SingularAttribute<Stores, Users> userId;
    public static volatile SetAttribute<Stores, Reviews> reviewsSet;
    public static volatile SetAttribute<Stores, Revenuestatistics> revenuestatisticsSet;
    public static volatile SingularAttribute<Stores, String> imgfoodstore;
    public static volatile SingularAttribute<Stores, String> name;
    public static volatile SingularAttribute<Stores, String> location;
    public static volatile SetAttribute<Stores, Follows> followsSet;
    public static volatile SetAttribute<Stores, Menus> menusSet;
    public static volatile SingularAttribute<Stores, BigDecimal> longitude;

}