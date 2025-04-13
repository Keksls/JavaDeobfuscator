/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eog
 */
public enum eog_0 {
    a(0, "admin_channel"),
    b(1, "all_channel"),
    c(3, "trade"),
    d(4, "community", Ow.a),
    e(5, "community", Ow.b),
    f(6, "community", Ow.c),
    g(7, "community", Ow.d),
    h(8, "recruitment", Ow.a),
    i(9, "recruitment", Ow.b),
    j(10, "recruitment", Ow.c),
    k(11, "recruitment", Ow.d);

    public static final List<eog_0> l;
    public static final List<eog_0> m;
    private final int n;
    private final String o;
    private final Ow p;

    private eog_0(int n2, String string2) {
        this(n2, string2, null);
    }

    private eog_0(int n2, String string2, Ow ow) {
        this.n = n2;
        this.o = string2;
        this.p = ow;
    }

    public int a() {
        return this.n;
    }

    public String b() {
        return this.o;
    }

    public Ow c() {
        return this.p;
    }

    @Nullable
    public static eog_0 a(int n) {
        for (eog_0 eog_02 : eog_0.values()) {
            if (eog_02.n != n) continue;
            return eog_02;
        }
        return null;
    }

    public boolean d() {
        switch (this) {
            case a: 
            case b: {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static eog_0 a(byte by) {
        for (eog_0 eog_02 : l) {
            if (eog_02.p.c() != by) continue;
            return eog_02;
        }
        return null;
    }

    @Nullable
    public static eog_0 b(byte by) {
        for (eog_0 eog_02 : m) {
            if (eog_02.p.c() != by) continue;
            return eog_02;
        }
        return null;
    }

    static {
        l = List.of(d, e, f, g);
        m = List.of(h, i, j, k);
    }
}

