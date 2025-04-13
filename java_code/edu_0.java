/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eDU
 */
public class edu_0
extends edn_0 {
    public static final eds_0 b = new edu_0();
    private static final Logger c = Logger.getLogger(edu_0.class);

    private edu_0() {
    }

    @Override
    Object[] a(efh_0 efh_02, short s2) {
        Object[] objectArray = super.a(efh_02, s2);
        if (efh_02.F() < 3) {
            c.error((Object)("Unable to compute exponential parameters : need 3 values, only " + efh_02.F() + " available"));
            return objectArray;
        }
        float f2 = efh_02.a(0, s2);
        float f3 = efh_02.a(1, s2);
        float f4 = efh_02.a(2, s2);
        double d2 = (double)f2 + (double)f3 * Math.pow(s2, f4);
        double d3 = f3 >= 0.0f ? Math.floor(d2) : Math.ceil(d2);
        objectArray[0] = new Hz((long)d3, d2);
        return objectArray;
    }
}

