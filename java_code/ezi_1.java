/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ezI
 */
public enum ezi_1 {
    a(-1),
    b(20),
    c(35),
    d(50),
    e(65),
    f(80),
    g(95),
    h(110),
    i(125),
    j(140),
    k(155),
    l(170),
    m(185),
    n(200),
    o(215),
    p(230);

    public static final ezi_1[] q;
    private final short r;

    private ezi_1(int n2) {
        this.r = (short)n2;
    }

    public short a() {
        return this.r;
    }

    public static ezi_1 a(int n) {
        for (ezi_1 ezi_12 : q) {
            if (ezi_12.r != n) continue;
            return ezi_12;
        }
        return null;
    }

    public static short a(short s2) {
        ezi_1 ezi_12 = null;
        for (ezi_1 ezi_13 : q) {
            if (ezi_13.r == s2) {
                return ezi_13.r;
            }
            if (ezi_13.r < s2) continue;
            int n = Math.abs(ezi_13.r - s2);
            if (ezi_12 == null) {
                ezi_12 = ezi_13;
                continue;
            }
            if (n >= Math.abs(ezi_12.r - s2)) continue;
            ezi_12 = ezi_13;
        }
        return ezi_12 != null ? ezi_12.r : (short)enp_2.a.b(ens_2.v);
    }

    @NotNull
    public static ezi_1 b(short s2) {
        ezi_1 ezi_12 = null;
        for (ezi_1 ezi_13 : q) {
            if (ezi_13.r == s2) {
                return ezi_13;
            }
            if (ezi_13.r > s2) continue;
            int n = Math.abs(ezi_13.r - s2);
            if (ezi_12 == null) {
                ezi_12 = ezi_13;
                continue;
            }
            if (n >= Math.abs(ezi_12.r - s2)) continue;
            ezi_12 = ezi_13;
        }
        return ezi_12 != null ? ezi_12 : a;
    }

    public static Cm<Short, Short> c(short s2) {
        for (int k = 0; k < q.length - 1; ++k) {
            if (ezi_1.q[k].r >= s2 || ezi_1.q[k + 1].r < s2) continue;
            return new Cm<Short, Short>((short)(ezi_1.q[k].r + 1), ezi_1.q[k + 1].r);
        }
        return new Cm<Short, Short>(ezi_1.q[ezi_1.q.length - 1].r, (short)enp_2.a.b(ens_2.v));
    }

    public String toString() {
        return "BuildSheetLevelEnum{m_level=" + this.r + "}";
    }

    static {
        q = ezi_1.values();
    }
}

