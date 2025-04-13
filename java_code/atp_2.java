/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from atP
 */
public class atp_2 {
    public static final atp_2 a = new atq_1();
    private final TIntProcedure c = new atr_2(this);
    final TIntHashSet d = new TIntHashSet();
    private final TIntHashSet e = new TIntHashSet();
    private final TIntHashSet f = new TIntHashSet();
    private final TIntHashSet g = new TIntHashSet();
    final TIntHashSet h = new TIntHashSet();
    private boolean i = false;
    private boolean j = true;

    public void a(int n) {
        this.j |= this.e.add(n);
    }

    public void b(int n) {
        this.j |= this.f.add(n);
    }

    public void c(int n) {
        this.j |= this.f.remove(n);
    }

    public void d(int n) {
        this.j |= this.g.add(n);
        this.i = true;
    }

    public void e(int n) {
        this.j |= this.g.remove(n);
        this.i = !this.g.isEmpty();
    }

    public void f(int n) {
        this.j |= this.h.add(n);
    }

    public void g(int n) {
        this.j |= this.h.remove(n);
    }

    public void a() {
        if (!this.j) {
            return;
        }
        this.d.clear();
        this.e.forEach(this.c);
        this.f.forEach(this.c);
        this.j = false;
    }

    public void b() {
        this.d.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i = false;
        this.e.clear();
    }

    boolean h(int n) {
        assert (!this.j);
        if (this.i) {
            return !this.g.contains(n);
        }
        return !this.d.isEmpty() && this.d.contains(n);
    }

    void c() {
        this.e.clear();
        this.j = true;
    }

    public atp_2 d() {
        atp_2 atp_22 = new atp_2();
        atp_22.d.addAll(this.d.toArray());
        atp_22.e.addAll(this.e.toArray());
        atp_22.f.addAll(this.f.toArray());
        atp_22.h.addAll(this.h.toArray());
        atp_22.j = this.j;
        return atp_22;
    }
}

