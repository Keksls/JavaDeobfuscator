/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aop
 */
public class aop_1
extends aoi_1 {
    protected static final Logger a = Logger.getLogger(aop_1.class);
    aom_2 b;

    public aop_1(aom_2 aom_22) {
        this.b = aom_22;
    }

    public void a(aom_2 aom_22) {
        this.b = aom_22;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (this.b == null) {
            return -5;
        }
        try {
            Object object5 = this.b.a(object, object2, object3, object4);
            if (!(object5 instanceof Boolean)) {
                return -2;
            }
            if (((Boolean)object5).booleanValue()) {
                return 0;
            }
            return -1;
        }
        catch (aoh_1 aoh_12) {
            a.error((Object)"CriteriaException during getValidity", (Throwable)aoh_12);
            return -3;
        }
    }
}

