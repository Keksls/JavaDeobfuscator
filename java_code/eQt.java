/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;
import java.util.Iterator;

public enum eQt {
    a(1),
    b(2, true),
    c(3, true),
    d(4, true),
    e(5),
    f(6),
    g(7),
    h(8),
    i(9),
    j(10),
    k(11),
    l(12),
    m(13),
    n(14),
    o(15),
    p(16),
    q(17),
    r(18),
    s(19),
    t(20),
    u(21),
    v(22),
    w(23),
    x(24),
    y(25),
    z(26),
    A(27);

    public static final long B;
    public static final long C;
    public final byte D;
    public final boolean E;

    private eQt(int n2) {
        this(n2, false);
    }

    private eQt(int n2, boolean bl) {
        this.D = (byte)n2;
        this.E = bl;
    }

    public boolean a(short s2, short s3) {
        if (!this.E || s2 == 0) {
            return true;
        }
        return s2 < s3;
    }

    public static long a(Iterable<eQt> iterable) {
        long l = 0L;
        Iterator<eQt> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            int n = 1 << iterator.next().D;
            l |= (long)n;
        }
        return l;
    }

    public static EnumSet<eQt> a(long l) {
        EnumSet<eQt> enumSet = EnumSet.noneOf(eQt.class);
        for (eQt eQt2 : eQt.values()) {
            int n = 1 << eQt2.D;
            if ((l & (long)n) != (long)n) continue;
            enumSet.add(eQt2);
        }
        return enumSet;
    }

    static {
        B = eQt.a(EnumSet.allOf(eQt.class));
        C = eQt.a(EnumSet.noneOf(eQt.class));
    }
}

