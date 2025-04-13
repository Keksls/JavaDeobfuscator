/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bTV
 */
public class btv_2
implements ajh_1,
bQA {
    public static final String a = "remainingTime";
    public static final String b = "constructionDate";
    public static final String d = "customItem";
    public static final String e = "isDeco";
    public static final String f = "canBeEvolved";
    public static final String g = "performedConstructionDuration";
    public static final String h = "constructionDurationAsMinute";
    private final bth_2 i;
    private final long j;
    private final wu_0 k;
    private exk_2 l;

    private btv_2(bth_2 bth_22, long l, exk_2 exk_22, wu_0 wu_02) {
        this.i = bth_22;
        this.j = l;
        this.k = wu_02;
        this.a(exk_22);
    }

    public static btv_2 a(bth_2 bth_22, long l, int n, wu_0 wu_02) {
        exk_2 exk_22 = null;
        if (n != 0) {
            exk_22 = eyo_1.g().g(n);
        }
        return new btv_2(bth_22, l, exk_22, wu_02);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a(true);
        }
        if (string.equals(b)) {
            return bae.h().c(this.k);
        }
        if (string.equals(d)) {
            return this.l;
        }
        if (string.equals(e)) {
            return this.i.g().i();
        }
        if (string.equals(f)) {
            etw_2 etw_22 = this.i.g();
            if (etw_22 == null) {
                return false;
            }
            etg_2 etg_22 = eti_2.a.b(etw_22.a());
            if (etg_22 == null) {
                return false;
            }
            etw_2 etw_23 = eti_2.a.a(etg_22.c());
            if (etw_23 == null) {
                return false;
            }
            return etw_22.d() != etw_23.d();
        }
        if (string.equals(g)) {
            wx_0 wx_02 = this.b();
            if (wx_02 == null) {
                return 0;
            }
            return (eta_2.a(this.i.g()).g() - wx_02.g()) / 60L;
        }
        if (string.equals(h)) {
            return eta_2.a(this.i.g()).g() / 60L;
        }
        return this.i.b(string);
    }

    private boolean k() {
        return this.j > 0L;
    }

    public wu_0 a() {
        etg_2 etg_22 = eti_2.a.b(this.i.g().a());
        if (etg_22 == null) {
            return null;
        }
        return fkb_0.a(bua_2.a.a(), etg_22, this.k.h());
    }

    public wx_0 b() {
        if (!this.k()) {
            return null;
        }
        wu_0 wu_02 = this.a();
        if (wu_02 == null) {
            return null;
        }
        ww_0 ww_02 = wc_0.p().a().g(wu_02);
        if (!ww_02.e()) {
            return null;
        }
        if (ww_02.c(wx_0.e)) {
            return wx_0.e;
        }
        return ww_02;
    }

    public String a(boolean bl) {
        wx_0 wx_02 = this.b();
        if (wx_02 == null) {
            return null;
        }
        return bl ? wa_0.d(wx_02) : wa_0.c(wx_02);
    }

    public String e() {
        return this.i.c();
    }

    public bue_2 f() {
        return bua_2.a.b(this.i.g().d());
    }

    public long g() {
        return this.j;
    }

    public void h() {
        wx_0 wx_02 = this.i.b();
        if (!wx_02.e()) {
            return;
        }
        bqz_1.a.a(this);
    }

    public void i() {
        bqz_1.a.b(this);
    }

    @Override
    public void c() {
        fis_1.a().a((ajf_1)this, a, g);
    }

    public bth_2 j() {
        return this.i;
    }

    public void a(exk_2 exk_22) {
        this.l = exk_22;
        fis_1.a().a((ajf_1)this, d);
    }
}

