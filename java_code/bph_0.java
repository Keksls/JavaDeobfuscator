/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

/*
 * Renamed from bPh
 */
public class bph_0
extends fin_0
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "description";
    public static final String d = "smallIconUrl";
    public static final String e = "bigIconUrl";
    public static final String f = "id";
    public static final String g = "unlockLevel";
    public static final String[] h = new String[]{"name", "description", "smallIconUrl", "bigIconUrl", "id"};
    private final int j;
    private final boolean k;
    private final boolean l;
    private final int m;
    private final boolean n;
    private boolean o;

    public bph_0(fib_0 fib_02) {
        super(fib_02);
        this.j = fib_02.H();
        this.k = fib_02.I();
        this.l = fib_02.K();
        this.m = fib_02.L();
        this.n = fib_02.Q();
    }

    public static Predicate<bph_0> a(efa_0 efa_02) {
        return new bpi_0(efa_02);
    }

    public int a() {
        return this.j;
    }

    public String b() {
        return bae.h().a(3, (long)this.i(), new Object[0]);
    }

    public String c() {
        return bae.h().a(4, (long)this.i(), new Object[0]);
    }

    public boolean e() {
        return this.k;
    }

    public boolean f() {
        return this.l;
    }

    public boolean g() {
        return this.n;
    }

    public int h() {
        return this.m;
    }

    @Override
    public String[] d() {
        return h;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.b();
        }
        if (string.equals(b)) {
            return this.c();
        }
        if (string.equals(d)) {
            return azs_0.a().g(this.m);
        }
        if (string.equals(e)) {
            return azs_0.a().h(this.m);
        }
        if (string.equals(f)) {
            return this.i();
        }
        if (string.equals(g)) {
            return this.m();
        }
        return null;
    }

    public boolean equals(Object object) {
        return super.equals(object) || object instanceof bpl_0 && this.equals(((bpl_0)object).r());
    }
}

