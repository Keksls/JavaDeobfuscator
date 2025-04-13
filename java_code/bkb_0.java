/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkb
 */
public class bkb_0 {
    private static final Logger a = Logger.getLogger(bkb_0.class);

    public static void a(ejh_0 ejh_02, String string, String string2, String string3) {
        bjh_0 bjh_02 = bjh_0.a(string);
        if (bjh_02 == null) {
            a.error((Object)("Mauvais param\u00e8tres " + string + "ne correspondant \u00e0 aucun HMIProviderType"), (Throwable)new IllegalArgumentException());
            return;
        }
        bji_0 bji_02 = bji_0.a(string3);
        if (bji_02 == null) {
            a.error((Object)("Mauvais param\u00e8tres " + string3 + "ne correspondant \u00e0 aucun HMIPropertyValueType"), (Throwable)new IllegalArgumentException());
            return;
        }
        Object object = bkb_0.a(ejh_02, bji_02);
        bkb_0.a(bjh_02, object);
    }

    private static void a(bjh_0 bjh_02, Object object) {
        bmr_1 bmr_12 = azu_0.j().k();
        switch (bjh_02) {
            case a: {
                a.warn((Object)"TODO prison : refaire le system de HMI Action de prison");
            }
        }
    }

    public static void a(String string, String string2, String string3) {
        bjh_0 bjh_02 = bjh_0.a(string);
        if (bjh_02 == null) {
            a.error((Object)("Mauvais param\u00e8tres " + string + "ne correspondant \u00e0 aucun HMIProviderType"), (Throwable)new IllegalArgumentException());
            return;
        }
        bkb_0.a(bjh_02);
    }

    private static void a(bjh_0 bjh_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        switch (bjh_02) {
            case a: {
                a.warn((Object)"TODO prison : refaire le system de HMI Action de prison");
            }
        }
    }

    private static Object a(ejh_0 ejh_02, bji_0 bji_02) {
        Long l = null;
        switch (bji_02) {
            case a: {
                l = ejh_02.bo_();
            }
        }
        return l;
    }
}

