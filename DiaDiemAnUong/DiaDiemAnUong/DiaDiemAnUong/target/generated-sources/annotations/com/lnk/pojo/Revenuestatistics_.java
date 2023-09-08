package com.lnk.pojo;

import com.lnk.pojo.Stores;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-07T22:34:12", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Revenuestatistics.class)
public class Revenuestatistics_ { 

    public static volatile SingularAttribute<Revenuestatistics, Integer> statId;
    public static volatile SingularAttribute<Revenuestatistics, BigDecimal> revenue;
    public static volatile SingularAttribute<Revenuestatistics, Integer> month;
    public static volatile SingularAttribute<Revenuestatistics, Integer> year;
    public static volatile SingularAttribute<Revenuestatistics, Stores> storeId;

}