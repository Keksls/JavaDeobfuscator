/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bQD
 */
public class bqd_0
implements ajh_1,
fjg_0,
fjh {
    private static final String a = "progressBarWait";
    private static final String b = "progressBar";
    private static final short d = 100;
    private static fjg_0 e;
    private ftv f;
    private ftv g;
    private long h;
    private bNz i;
    private Long j;
    private final adv_1 k = new bqe_0(this);

    public static bqd_0 a(long l) {
        bqd_0 bqd_02 = new bqd_0();
        bqd_02.j = l;
        return bqd_02;
    }

    public void b() {
        fjh.super.a(azu_0.j().k(), this);
    }

    @Override
    public long c() {
        if (this.j == null) {
            return fjh.super.c();
        }
        return this.j;
    }

    @Override
    public void e() {
        this.i();
        this.a(this.c(), 0.0);
        if (e != null) {
            e.e();
        }
    }

    @Override
    public void f() {
        if (e != null) {
            e.f();
        }
        this.h();
    }

    @Override
    public void a() {
        if (e != null) {
            e.a();
        }
        this.h();
    }

    private void i() {
        fyy_0 fyy_02 = fpm_0.b().h().d("collectingProgressDialog");
        if (fyy_02 == null) {
            return;
        }
        this.g = (ftv)fyy_02.a(a);
        this.f = (ftv)fyy_02.a(b);
        if (this.i == null || this.f == null || this.g == null) {
            return;
        }
        this.i.a(this.f, this.g);
    }

    public final void a(long l, double d2) {
        adi_2.a().a(this.h);
        this.h = 0L;
        long l2 = System.currentTimeMillis();
        if (l <= 0L) {
            this.a();
            return;
        }
        this.i = new bNE(true, l2, d2, (1.0 - d2) / (double)l);
        this.h = adi_2.a().a(this.k, 100L, 1, -1L);
        fpm_0.b().a("collectingProgressDialog", cfi_0.a("collectingProgressDialog"), 73856L, (short)10000);
        fpm_0.b().a("collectingProgressDialog", azu_0.j().k().bv());
        this.i();
        fis_1.a().a("collectInProgress", (Object)this, "collectingProgressDialog");
    }

    void g() {
        if (this.i == null) {
            return;
        }
        long l = System.currentTimeMillis();
        if (this.f != null && this.g != null) {
            this.i.a(l, this.f, this.g);
        }
        if (this.i.a(l) < 1.0) {
            return;
        }
        this.a();
    }

    public static void a(fjg_0 fjg_02) {
        e = fjg_02;
    }

    public final void h() {
        if (this.h == 0L) {
            return;
        }
        this.i = null;
        adi_2.a().a(this.h);
        this.f = null;
        this.g = null;
        if (fpm_0.b().q("collectingProgressDialog")) {
            fpm_0.b().o("collectingProgressDialog");
        }
        this.h = 0L;
        e = null;
    }

    @Override
    public String[] d() {
        return new String[]{"drawNumber", "iconskill", "slots", "wait"};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if ("drawNumber".equals(string)) {
            return 1;
        }
        if ("iconskill".equals(string)) {
            return "iconfight";
        }
        if ("slots".equals(string)) {
            return 0;
        }
        if ("wait".equals(string)) {
            return false;
        }
        return null;
    }
}

