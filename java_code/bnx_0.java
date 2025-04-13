/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bNx
 */
public class bnx_0
implements ajh_1 {
    protected static final Logger a = Logger.getLogger(bnx_0.class);
    public static final long b = 10000L;
    public static final String d = "remainingSlots";
    public static final String e = "validLevel";
    public static final String f = "canDoAlone";
    public static final String g = "slots";
    public static final String h = "iconskill";
    public static final String i = "wait";
    public static final String j = "drawNumber";
    private static final short k = 100;
    private static final String[] l = new String[]{"validLevel", "remainingSlots", "canDoAlone", "slots", "iconskill", "wait"};
    private byte m = (byte)-1;
    private long n;
    private ftv o;
    private ftv p;
    private boolean q;
    private int r;
    private long s;
    private boolean t;
    private bNz u;
    private brw_1 v;
    private final adv_1 w = new bNy(this);

    @Override
    public String[] d() {
        return l;
    }

    @Override
    public Object b(String string) {
        if (string.equals(h)) {
            return this.j();
        }
        if (string.equals(j)) {
            return this.v == null ? 1 : this.v.j() - this.m;
        }
        if (string.equals(e)) {
            return false;
        }
        if (string.equals(d)) {
            return this.m;
        }
        if (string.equals(f)) {
            return this.g();
        }
        if (string.equals(g)) {
            if (this.m == 1 && !this.q) {
                return 0;
            }
            return this.m;
        }
        if (string.equals(i)) {
            return this.q;
        }
        return null;
    }

    public void a(boolean bl) {
        this.t = bl;
    }

    public final void a() {
        if (this.n != 0L) {
            this.m = (byte)-1;
            this.v = null;
            this.u = null;
            adi_2.a().a(this.n);
            if (this.t) {
                this.o = null;
                this.p = null;
                fpm_0.b().o("collectingProgressDialog");
            }
            this.n = 0L;
        }
    }

    private void a(String string) {
        fis_1.a().a((ajf_1)this, string);
    }

    public final void a(bNK bNK2, brw_1 brw_12, long l, byte by, boolean bl, double d2) {
        adi_2.a().a(this.n);
        this.n = 0L;
        this.v = brw_12;
        long l2 = System.currentTimeMillis();
        if (bl) {
            this.u = new bND(true, l2, d2);
        } else if (l > 0L) {
            this.u = new bNE(true, l2, d2, (1.0 - d2) / (double)l);
        } else {
            this.a();
            this.k();
            return;
        }
        this.n = adi_2.a().a(this.w, 100L, 1, -1L);
        boolean bl2 = this.q = bl && this.v.j() > 1;
        if (bl) {
            this.i();
        }
        this.m = by;
        if (fpm_0.b().q("help" + bNK2.a())) {
            fpm_0.b().o("help" + bNK2.a());
        }
        fpm_0.b().a("collectingProgressDialog", cfi_0.a("collectingProgressDialog"), 73856L, (short)10000);
        fpm_0.b().a("collectingProgressDialog", azu_0.j().k().bv());
        this.h();
        fis_1.a().a("collectInProgress", (Object)this, "collectingProgressDialog");
        this.a(f);
        this.a(d);
    }

    private boolean g() {
        return !this.q;
    }

    private void h() {
        fyy_0 fyy_02 = fpm_0.b().h().d("collectingProgressDialog");
        if (fyy_02 == null) {
            return;
        }
        this.p = (ftv)fyy_02.a("progressBarWait");
        this.o = (ftv)fyy_02.a("progressBar");
        if (this.u != null && this.o != null && this.p != null) {
            this.u.a(this.o, this.p);
        }
    }

    void b() {
        if (this.u == null) {
            return;
        }
        long l = System.currentTimeMillis();
        if (this.o != null && this.p != null) {
            this.u.a(l, this.o, this.p);
        }
        this.a(g);
        this.a(j);
        this.a(i);
        if (this.u.a(l) >= 1.0) {
            if (this.u.d) {
                this.a();
            } else {
                this.k();
            }
        }
    }

    private void i() {
        String string = this.v.j() <= 1 ? "occupation.error.levelRequired" : "collect.warning.needHelp";
        aUh.a(string, new Object[0]);
    }

    private String j() {
        if (this.v != null) {
            switch (this.v.h()) {
                case 4: 
                case 22: {
                    return "iconaxe";
                }
                case 3: 
                case 7: 
                case 8: 
                case 18: 
                case 19: 
                case 23: {
                    return "iconcollect";
                }
                case 2: {
                    return "iconreap";
                }
                case 9: {
                    return "iconpickaxe";
                }
                case 16: {
                    return "iconpick";
                }
            }
        }
        return "iconbag";
    }

    private void k() {
        azu_0.j().k().dN();
        bqg_2.a().b();
    }

    public final void a(brw_1 brw_12, long l) {
        this.a();
        this.v = brw_12;
        long l2 = System.currentTimeMillis();
        if (l > Integer.MAX_VALUE) {
            this.u = new bND(true, l2, 0.0);
            this.i();
        } else if (l > 0L) {
            this.u = new bNE(true, l2, 0.0, 1.0 / (double)l);
        } else {
            this.a();
            this.k();
            return;
        }
        this.n = adi_2.a().a(this.w, 100L, 1, -1L);
        this.m = 0;
        fpm_0.b().a("collectingProgressDialog", cfi_0.a("collectingProgressDialog"), 73856L, (short)10000);
        fpm_0.b().a("collectingProgressDialog", azu_0.j().k().bv());
        fis_1.a().a("collectInProgress", (Object)this, "collectingProgressDialog");
        this.h();
        this.a(f);
        this.a(d);
    }

    public void a(long l, long l2) {
        this.a();
        this.s = l;
        this.u = new bNE(true, System.currentTimeMillis(), 0.0, 1.0 / (double)l2);
        this.n = adi_2.a().a(this.w, 100L, 1, -1L);
        this.m = 0;
        fpm_0.b().a("collectingProgressDialog", cfi_0.a("collectingProgressDialog"), 73856L, (short)10000);
        fpm_0.b().a("collectingProgressDialog", azu_0.j().k().bv());
        fis_1.a().a("collectInProgress", (Object)this, "collectingProgressDialog");
        this.h();
        this.a(f);
    }

    public void a(long l) {
        this.a();
        this.u = new bNE(true, System.currentTimeMillis(), 0.0, 1.0 / (double)l, true);
        this.n = adi_2.a().a(this.w, 100L, 1, -1L);
        this.m = 0;
        fpm_0.b().a("collectingProgressDialog", cfi_0.a("collectingProgressDialog"), 73856L, (short)10000);
        fpm_0.b().a("collectingProgressDialog", azu_0.j().k().bv());
        fis_1.a().a("collectInProgress", (Object)this, "collectingProgressDialog");
        this.h();
        this.a(f);
    }

    public void a(long l, int n) {
        this.a();
        this.r = n;
        bmr_1 bmr_12 = azu_0.j().k();
        this.u = new bNE(false, System.currentTimeMillis(), 0.0, 1.0 / (double)l);
        this.n = adi_2.a().a(this.w, 100L, 1, -1L);
        this.m = 0;
        fpm_0.b().a("collectingProgressDialog", cfi_0.a("collectingProgressDialog"), 73856L, (short)10000);
        fpm_0.b().a("collectingProgressDialog", bmr_12.bv());
        fis_1.a().a("collectInProgress", (Object)this, "collectingProgressDialog");
        this.h();
        this.a(f);
    }

    public void b(long l) {
        this.a();
        bmr_1 bmr_12 = azu_0.j().k();
        this.u = new bNE(false, System.currentTimeMillis(), 0.0, 1.0 / (double)l);
        this.n = adi_2.a().a(this.w, 100L, 1, -1L);
        this.m = 0;
        fpm_0.b().a("collectingProgressDialog", cfi_0.a("collectingProgressDialog"), 73856L, (short)10000);
        fpm_0.b().a("collectingProgressDialog", bmr_12.bv());
        fis_1.a().a("collectInProgress", (Object)this, "collectingProgressDialog");
        this.h();
        this.a(f);
    }

    public void c() {
        if (this.t) {
            this.o = null;
            this.p = null;
            fpm_0.b().o("collectingProgressDialog");
        }
        adi_2.a().a(this.n);
    }

    public int e() {
        return this.v == null ? this.r : this.v.l();
    }

    public long f() {
        return this.s;
    }

    public void a(int n) {
        this.m = (byte)n;
    }
}

