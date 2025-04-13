/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class fde<E extends fdg> {
    protected static final Logger a = Logger.getLogger(fde.class);
    private final long b;
    private final int c;
    private final int d;
    private final boolean e;
    private final int f;
    private int g;

    protected fde(long l, int n, int n2, boolean bl, Iterable<fdf_0> iterable) {
        this.b = l;
        this.c = n;
        this.d = n2;
        this.e = bl;
        this.f = fdf_0.a(iterable);
    }

    public long a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public void a(int n) {
        this.g = n;
    }

    public int e() {
        return this.g;
    }

    public boolean f() {
        return this.a(fdf_0.a);
    }

    public boolean g() {
        return this.a(fdf_0.b);
    }

    public boolean h() {
        return this.a(fdf_0.c);
    }

    private boolean a(fdf_0 fdf_02) {
        return (this.f & fdf_02.d) == fdf_02.d;
    }

    public abstract void a(List<aot_2> var1);

    public abstract fdj_0 i();

    public abstract boolean a(E var1);

    public static List<fde> b(List<fde> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        for (int k = list.size() - 1; k >= 0; --k) {
            fde fde2 = list.get(k);
            if (fde2.b() >= 0) continue;
            list.remove(fde2);
        }
        return list;
    }

    public static List<fde> c(List<fde> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        for (int k = list.size() - 1; k >= 0; --k) {
            fde fde2 = list.get(k);
            if (fde2.b() <= 0) continue;
            list.remove(fde2);
        }
        return list;
    }
}

