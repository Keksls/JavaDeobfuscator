/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import org.jetbrains.annotations.NotNull;

public abstract class fdb
extends fda {
    private fcu_0 g = null;
    protected final TIntIntHashMap c = new TIntIntHashMap();
    protected int d = -1;
    protected fbj_0 e;
    protected boolean f;

    protected fdb(faU faU2) {
        super(faU2);
    }

    @Override
    public int c(int n) {
        return this.c.get(n);
    }

    public boolean g(int n) {
        return this.c.containsKey(n);
    }

    @Override
    public fcu_0 w() {
        return this.g;
    }

    @Override
    public void a(fcu_0 fcu_02) {
        this.g = fcu_02;
    }

    @Override
    public boolean b(fcu_0 fcu_02) {
        return this.g != null && this.g == fcu_02;
    }

    @Override
    public boolean d(int n) {
        return this.e(n);
    }

    @Override
    public boolean t() {
        return this.e(((epq_2)this.b).fI());
    }

    @Override
    public boolean e(int n) {
        faX faX2 = fbc_0.a.a(n);
        if (faX2 == null) {
            return false;
        }
        int n2 = this.c.get(n);
        return fbo_0.a().a(n2).a(fbs_0.g);
    }

    @Override
    public boolean s() {
        return this.d(((epq_2)this.b).fI());
    }

    @Override
    public int A() {
        return this.c.get(this.d);
    }

    @Override
    public int B() {
        return this.d;
    }

    @Override
    public int f(int n) {
        int n2 = this.c.adjustOrPutValue(this.d, n, n);
        if (n2 >= 0) {
            this.c.remove(this.d);
        }
        return n2;
    }

    public int b(int n, int n2) {
        int n3 = n2;
        if (n != this.n() && n2 > 0) {
            n3 = 0;
        }
        return this.c.put(n, n3);
    }

    public TIntIntIterator C() {
        return this.c.iterator();
    }

    public void D() {
        this.c.remove(this.d);
    }

    public int[] E() {
        return this.c.keys();
    }

    @Override
    public abstract void a(int var1);

    @Override
    public void b(@NotNull faX faX2) {
        super.b(faX2);
        this.b(true);
    }

    @Override
    public void b(boolean bl) {
        this.f = bl;
    }

    @Override
    public boolean u() {
        return this.f;
    }
}

