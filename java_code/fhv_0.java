/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

/*
 * Renamed from fhV
 */
public class fhv_0 {
    private boolean a;
    private Predicate<exk_2> b;
    private final Set<Integer> c = new HashSet<Integer>();
    private final Set<Long> d = new HashSet<Long>();
    private fhw_0 e = fhw_0.d;

    public fhv_0 a(boolean bl) {
        this.a = bl;
        return this;
    }

    public fhv_0 a(Predicate<exk_2> predicate) {
        this.b = predicate;
        return this;
    }

    public fhv_0 a(int n) {
        this.c.add(n);
        return this;
    }

    public fhv_0 a(long l) {
        this.d.add(l);
        return this;
    }

    public fhv_0 a(fhw_0 fhw_02) {
        this.e = fhw_02;
        return this;
    }

    boolean a() {
        return this.a;
    }

    public Predicate<? super exk_2> b() {
        return this.b;
    }

    Set<Integer> c() {
        return this.c;
    }

    Set<Long> d() {
        return this.d;
    }

    public fhw_0 e() {
        return this.e;
    }
}

