/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TIntHashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from fgp
 */
public abstract class fgp_0 {
    protected static final Logger a = Logger.getLogger(fgp_0.class);
    protected static final float b = 0.05f;
    protected static final float c = 0.05f;
    protected final fgy_0 d;
    protected final TIntHashSet e;
    protected final TIntHashSet f;

    protected fgp_0(fgy_0 fgy_02) {
        this.d = fgy_02;
        this.e = new TIntHashSet();
        this.f = new TIntHashSet();
    }

    public boolean i(int n) {
        return this.e.contains(n);
    }

    public boolean j(int n) {
        return this.f.contains(n);
    }

    public boolean k(int n) {
        this.e.add(n);
        return true;
    }

    public boolean l(int n) {
        this.f.add(n);
        return true;
    }

    public boolean m(int n) {
        this.e.remove(n);
        return true;
    }

    public boolean n(int n) {
        this.f.remove(n);
        return true;
    }

    public abstract boolean g(int var1);

    public abstract boolean h(int var1);

    public abstract boolean a(epq_2 var1, int var2);

    public abstract boolean b(epq_2 var1, int var2);

    public TIntHashSet b() {
        return this.e;
    }

    public TIntHashSet c() {
        return this.f;
    }
}

