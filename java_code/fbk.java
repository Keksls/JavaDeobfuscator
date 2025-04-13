/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public enum fbk {
    a(fbz.c),
    b(fbD.c),
    c(fbB.c),
    d(fbF.c),
    e(fbv.c),
    f(fbl.c),
    g(fbn.c),
    h(fbr.h),
    i(fbt.c),
    j(fbx.e),
    k(fbp.c),
    l(fbH.c);

    private static final Logger m;
    private final fbj n;

    private fbk(fbj fbj2) {
        this.n = fbj2;
    }

    public static fbi_0 a(byte by) {
        fbk[] fbkArray = fbk.values();
        if (by < 0 || by > fbkArray.length) {
            m.error((Object)("Impossible de cr\u00e9er une requ\u00eate \u00e0 partir de son ordinal : rodinal en dehors des limites : " + fbk.values().length + " max, " + by + " demand\u00e9"));
            return null;
        }
        fbk fbk2 = fbk.values()[by];
        if (fbk2.n != null) {
            return fbk2.n.a();
        }
        return null;
    }

    static {
        m = Logger.getLogger(fbk.class);
    }
}

