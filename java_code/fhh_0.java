/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from fhH
 */
public class fhh_0<TCollect extends ecl_0> {
    private final byte a;
    private final acy_2<TCollect> b = new acy_2(0);

    public fhh_0(byte by) {
        this.a = by;
    }

    public final void a(int n) {
        this.b.a(n);
    }

    public final void a(TCollect TCollect) {
        this.b.a(((ecl_0)TCollect).g(), TCollect);
    }

    public final TCollect b(int n) {
        return (TCollect)((ecl_0)this.b.g(n));
    }

    public final TCollect c(int n) {
        return (TCollect)((ecl_0)this.b.h(n));
    }

    public int f() {
        int n = Integer.MAX_VALUE;
        Iterator<TCollect> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            n = Math.min(n, ((ecl_0)iterator.next()).k());
        }
        return n;
    }

    public final int g() {
        return this.b.d();
    }

    public final byte h() {
        return this.a;
    }
}

