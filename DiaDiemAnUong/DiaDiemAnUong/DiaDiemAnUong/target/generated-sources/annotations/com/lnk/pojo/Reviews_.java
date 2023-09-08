package com.lnk.pojo;

import com.lnk.pojo.Foods;
import com.lnk.pojo.Stores;
import com.lnk.pojo.Users;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-08T17:41:38", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Reviews.class)
public class Reviews_ { 

    public static volatile SingularAttribute<Reviews, Foods> foodId;
    public static volatile SingularAttribute<Reviews, Integer> rating;
    public static volatile SingularAttribute<Reviews, String> comment;
    public static volatile SingularAttribute<Reviews, Stores> storeId;
    public static volatile SingularAttribute<Reviews, Integer> reviewId;
    public static volatile SingularAttribute<Reviews, Users> userId;

}