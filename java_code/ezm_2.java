/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ezm
 */
public class ezm_2 {
    private static final Logger a = Logger.getLogger(ezm_2.class);

    public boolean a(long l, byte by, int n) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown, characterId id=" + l));
            return false;
        }
        ezy_2 ezy_22 = ((epq_2)t).dA();
        if (ezy_22 == null) {
            return false;
        }
        ezy_22.a((int)by, n);
        return true;
    }

    public static boolean a(long l, byte by, byte by2, int n) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown, characterId id=" + l));
            return false;
        }
        ezy_2 ezy_22 = ((epq_2)t).dA();
        if (ezy_22 == null) {
            return false;
        }
        ezu_1 ezu_12 = new ezu_1();
        if (by2 >= 0) {
            ezj_1 ezj_12 = ((epq_2)t).dx().a((int)by2);
            if (ezj_12 == null) {
                ezy_22.a((int)by, ezu_12);
                return true;
            }
            ezu_12.b((short)n);
        }
        ezy_22.a((int)by, ezu_12);
        return true;
    }

    public static boolean a(long l, byte by, ezx_2 ezx_22) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown, characterId id=" + l));
            return false;
        }
        ezy_2 ezy_22 = ((epq_2)t).dA();
        if (ezy_22 == null) {
            return false;
        }
        ezy_22.a((int)by, ezx_22);
        return true;
    }
}

