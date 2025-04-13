/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from bGZ
 */
public abstract class bgz_0
extends bgy_0
implements bHp {
    public static final boolean l = false;
    public static final String m = "collapsedView";
    public static final String n = "collapsible";
    public static final String o = "collapsed";
    public static final String p = "collapsingIgnoreSize";
    public static final String[] q;
    protected boolean r = false;
    protected boolean s = false;
    protected boolean t = false;
    protected final agr_0 u = new bha_1(this);
    protected final aja_1 v = ajz_12 -> {
        boolean bl = ajz_12.l();
        if (bl == this.t) {
            return;
        }
        this.a(bl, false);
    };

    protected abstract ags_0 b();

    protected abstract String e();

    protected bmr_1 f() {
        throw new UnsupportedOperationException("Please implement this method if you need to retrieve the associated character");
    }

    public bgz_0() {
        this.g();
    }

    protected void g() {
        if (this.s) {
            return;
        }
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        if (bvx_02 != null) {
            bvx_02.a(this.u);
            this.s = true;
        }
    }

    protected void h() {
        if (!this.s) {
            return;
        }
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        if (bvx_02 != null) {
            bvx_02.b(this.u);
            this.s = false;
        }
    }

    protected void i() {
        ajb_1 ajb_12 = this.k();
        if (ajb_12 == null) {
            return;
        }
        this.a(ajb_12);
    }

    protected void a(ajb_1 ajb_12) {
        if (this.r) {
            return;
        }
        ajb_12.a(this.e(), this.v);
        this.r = true;
    }

    protected void j() {
        ajb_1 ajb_12 = this.k();
        if (ajb_12 == null) {
            return;
        }
        this.b(ajb_12);
    }

    protected void b(ajb_1 ajb_12) {
        if (!this.r) {
            return;
        }
        ajb_12.b(this.e(), this.v);
        this.r = false;
    }

    protected ajb_1 k() {
        ags_0 ags_02 = this.b();
        if (ags_02 == null) {
            return null;
        }
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        if (ags_02 == ags_0.d) {
            bmr_1 bmr_12 = this.f();
            if (bmr_12 == null) {
                return null;
            }
            return bvx_02.b(bmr_12.a_());
        }
        return bvx_02.a(ags_02);
    }

    protected void c(ajb_1 ajb_12) {
        this.a(ajb_12, this.e());
    }

    protected void a(ajb_1 ajb_12, String string) {
        boolean bl = ajb_12.n(string);
        if (bl == this.t) {
            return;
        }
        this.a(bl, false);
    }

    protected void l() {
        ajb_1 ajb_12 = this.k();
        if (ajb_12 == null) {
            return;
        }
        this.c(ajb_12);
    }

    protected void m() {
        if (this.r) {
            return;
        }
        ajb_1 ajb_12 = this.k();
        if (ajb_12 == null) {
            return;
        }
        this.a(ajb_12);
        this.c(ajb_12);
    }

    @Override
    public String[] d() {
        return q;
    }

    @Override
    public Object b(String string) {
        if (string.equals(o)) {
            return this.a();
        }
        return null;
    }

    protected void b(boolean bl) {
        ajb_1 ajb_12 = this.k();
        if (ajb_12 == null) {
            return;
        }
        ajb_12.b(this.e(), bl);
    }

    public void n() {
        ajb_1 ajb_12 = this.k();
        if (ajb_12 == null) {
            return;
        }
        ajb_12.d(this.e());
    }

    @Override
    public boolean a() {
        return this.t;
    }

    public void a(boolean bl, boolean bl2) {
        this.t = bl;
        fis_1.a().a((ajf_1)this, o);
        if (bl2) {
            this.b(bl);
        }
    }

    @Override
    public void a(boolean bl) {
        this.a(bl, true);
    }

    static {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(bgy_0.k));
        arrayList.add(n);
        arrayList.add(o);
        arrayList.add(p);
        q = arrayList.toArray(new String[0]);
    }
}

