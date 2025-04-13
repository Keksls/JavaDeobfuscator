/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bPt
 */
public abstract class bpt_0
extends Enum<bpt_0> {
    public static final /* enum */ bpt_0 a = new bpu_0();
    public static final /* enum */ bpt_0 b = new bpv_0();
    public static final /* enum */ bpt_0 c = new bpw_0();
    public static final /* enum */ bpt_0 d = new bPx();
    public static final /* enum */ bpt_0 e = new bPy();
    public static final /* enum */ bpt_0 f = new bPz();
    public static final /* enum */ bpt_0 g = new bPA();
    private static final Logger h;
    private static final /* synthetic */ bpt_0[] i;

    public static bpt_0[] values() {
        return (bpt_0[])i.clone();
    }

    public static bpt_0 valueOf(String string) {
        return Enum.valueOf(bpt_0.class, string);
    }

    public abstract short a();

    public static bpt_0 a(short s2) {
        switch (s2) {
            case 1: {
                return b;
            }
            case 2: {
                return c;
            }
            case 3: {
                return d;
            }
            case 4: {
                return e;
            }
            case 5: {
                return f;
            }
            case 6: {
                return g;
            }
            case 0: {
                return a;
            }
        }
        h.warn((Object)("Mauvais type de display " + s2));
        return null;
    }

    public String toString() {
        return bae.h().a(String.format("%s%s", "spellsTab.filterType.", this.a()), new Object[0]);
    }

    static {
        i = new bpt_0[]{a, b, c, d, e, f, g};
        h = Logger.getLogger(bpt_0.class);
    }
}

