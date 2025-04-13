/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

public class cSX
extends cto_0 {
    public static final int a = 0;
    public static final int m = 1;
    public static final int n = 3;
    public static final int o = 4;
    protected final TIntHashSet p = new TIntHashSet();
    String q;
    private boolean s;
    String r;
    private boolean t;

    public cSX b() {
        return new cSX();
    }

    @Override
    public boolean d() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!emj_0.b.a(new emh_0[]{bmr_12})) {
            this.p.add(1);
            return false;
        }
        if (!this.s) {
            return false;
        }
        if (this.t) {
            return false;
        }
        return super.d();
    }

    @Override
    public String q() {
        String string = this.f();
        ani_2 ani_22 = new ani_2().a((CharSequence)string);
        if (this.q != null && !this.q.isEmpty()) {
            ani_22.m().a((CharSequence)this.q);
        }
        if (this.r != null && !this.r.isEmpty()) {
            ani_22.m().a((CharSequence)this.r);
        }
        return ani_22.r();
    }

    public void a(String string) {
        this.q = string;
    }

    public void a(boolean bl) {
        this.s = bl;
    }

    public void d(boolean bl) {
        this.t = bl;
    }

    public void b(String string) {
        this.r = string;
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.b();
    }
}

