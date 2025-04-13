/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from fgr
 */
public abstract class fgr_0
implements fgq_0 {
    protected final fgy_0 a;
    protected final TIntObjectHashMap<aeo_2> b;
    protected final TIntObjectHashMap<aeo_2> c;
    private fgl_0 g;
    protected int d;
    protected int e;
    protected fgk_0 f;
    static final ahh_2 h = new ahh_2();

    public fgr_0(fgy_0 fgy_02) {
        this.a = fgy_02;
        this.d = -1;
        this.e = -1;
        this.f = fgk_0.a;
        this.b = new TIntObjectHashMap();
        this.c = new TIntObjectHashMap();
    }

    public void a(int n, aeo_2 aeo_22) {
        this.b.put(n, (Object)aeo_22);
    }

    public void b(int n, aeo_2 aeo_22) {
        this.c.put(n, (Object)aeo_22);
    }

    public TIntObjectHashMap<aeo_2> b() {
        return this.b;
    }

    public TIntObjectHashMap<aeo_2> c() {
        return this.c;
    }

    @Override
    public int d() {
        return this.d;
    }

    @Override
    public int e() {
        return this.e;
    }

    @Override
    public fgk_0 f() {
        return this.f;
    }

    public void a(fgk_0 fgk_02) {
        this.f = fgk_02;
    }

    public void a(fgl_0 fgl_02) {
        this.g = fgl_02;
    }

    public void a(TIntIntHashMap tIntIntHashMap) {
        h.b();
        this.b.forEachEntry((TIntObjectProcedure)new fgs_0(this, tIntIntHashMap));
        int n = h.c();
        if (n != this.d) {
            this.d = n;
            if (this.g != null) {
                this.g.a(this.a);
            }
            this.a();
        }
    }

    public void b(TIntIntHashMap tIntIntHashMap) {
        h.b();
        this.c.forEachEntry((TIntObjectProcedure)new fgt_0(this, tIntIntHashMap));
        int n = h.c();
        if (n != this.e) {
            this.e = n;
            if (this.g != null) {
                this.g.a(this.a);
            }
            this.a();
        }
    }

    public void c(int n) {
        this.d = n;
    }

    public void d(int n) {
        this.e = n;
    }

    protected abstract void a();
}

