/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eUE
 */
public final class eue_1 {
    private static final Logger a = Logger.getLogger(eue_1.class);

    public static eui_1 a(short s2) {
        switch (s2) {
            case 1: {
                return new eug_1();
            }
            case 2: {
                return new euh_1();
            }
            case 3: {
                return new euj_1();
            }
            case 4: {
                return new euk_1();
            }
        }
        a.error((Object)("Type d'action inconnue " + s2));
        return null;
    }
}

