/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import org.apache.log4j.Logger;

public class bWj {
    private static final Logger e = Logger.getLogger(bWj.class);
    static final bWj a = new bWj();
    private static final String f = "type";
    private static final String g = "version";
    static final String b = "setProperty";
    static final String c = "removeProperty";
    static final String d = "resetChat";
    private final HashMap<String, bWi> h = new HashMap();

    private bWj() {
        this.h.put(b, new bWl());
        this.h.put(d, new bWh());
        this.h.put(c, new bWk());
    }

    bWi a(aqx_2 aqx_22, int n) {
        aqx_2 aqx_23 = aqx_22.f(f);
        if (aqx_23 == null) {
            e.warn((Object)"Action sans type");
            return null;
        }
        int n2 = bWj.a(aqx_22);
        if (n2 <= n) {
            return null;
        }
        String string = aqx_23.c();
        bWi bWi2 = this.h.get(string);
        if (bWi2 == null) {
            e.warn((Object)("Type d'action inexistant : " + string));
            return null;
        }
        bWi bWi3 = bWi2.a();
        bWi3.a(aqx_22);
        return bWi3;
    }

    private static int a(aqx_2 aqx_22) {
        aqx_2 aqx_23 = aqx_22.f(g);
        if (aqx_23 == null) {
            e.warn((Object)"Action sans num\u00e9ro de version");
            return -1;
        }
        return aqx_23.g();
    }

    public String toString() {
        return "CheckerActionFactory{}";
    }
}

