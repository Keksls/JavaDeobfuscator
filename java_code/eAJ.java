/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;

public enum eAJ {
    a(1, 1),
    b(2, 7, 23),
    c(3, 10),
    d(4, 2),
    e(5, 16),
    f(6, 20, 22),
    g(7, 24),
    h(8, 25);

    public static final wx_0 i;
    public static final wx_0 j;
    public static final ImmutableSet<eAJ> k;
    private final byte l;
    private final short m;
    private final short n;

    private eAJ(byte by, short s2) {
        this.l = by;
        this.m = s2;
        this.n = (short)-1;
    }

    private eAJ(byte by, short s2, short s3) {
        this.l = by;
        this.m = s2;
        this.n = s3;
    }

    public byte a() {
        return this.l;
    }

    public short b() {
        return this.m;
    }

    public static eAJ a(short s2) {
        eAJ[] eAJArray = eAJ.values();
        for (int k = 0; k < eAJArray.length; ++k) {
            eAJ eAJ2 = eAJArray[k];
            if (eAJ2.m != s2 && eAJ2.n != s2) continue;
            return eAJ2;
        }
        return null;
    }

    public static eAJ b(short s2) {
        eAJ[] eAJArray = eAJ.values();
        for (int k = 0; k < eAJArray.length; ++k) {
            eAJ eAJ2 = eAJArray[k];
            if (eAJ2.l != s2) continue;
            return eAJ2;
        }
        return null;
    }

    public boolean c() {
        switch (this) {
            case a: 
            case c: 
            case d: {
                return true;
            }
        }
        return false;
    }

    static {
        i = ww_0.a(300L);
        j = ww_0.a(60L);
        k = ImmutableSet.builder().add((Object)a).add((Object)c).add((Object)d).add((Object)e).add((Object)h).build();
    }
}

