package com.lnk.pojo;

import com.lnk.pojo.Stores;
import com.lnk.pojo.Users;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-08T17:41:38", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Follows.class)
public class Follows_ { 

    public static volatile SingularAttribute<Follows, Integer> followId;
    public static volatile SingularAttribute<Follows, Date> followDate;
    public static volatile SingularAttribute<Follows, Stores> storeId;
    public static volatile SingularAttribute<Follows, Users> userId;

}