/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from blK
 */
public class blk_2
implements ajh_1 {
    private static final Logger d = Logger.getLogger(blk_2.class);
    public static final String a = "iconUrl";
    public static final String[] b = new String[]{"iconUrl"};
    private aff_1 e;
    private aff_1 f;
    private afv g;
    private afv h;
    private int i;
    private int j;
    private final afk_0 k = new bll_1(this);
    private final afk_0 l = new blm_1(this);

    public blk_2(aff_1 aff_12, aff_1 aff_13, int n) {
        this.a(aff_12, aff_13, n);
    }

    public blk_2(aff_1 aff_12, afv afv2, int n) {
        this.h = afv2;
        this.h.c(this.k);
        this.h.c(this.l);
        this.h.a(this.l);
        this.a(aff_12, afv2.ap(), n);
    }

    public blk_2(afv afv2, aff_1 aff_12, int n) {
        this.g = afv2;
        this.g.c(this.k);
        this.g.c(this.l);
        this.g.a(this.k);
        this.a(afv2.ap(), aff_12, n);
    }

    public blk_2(afv afv2, afv afv3, int n) {
        this.g = afv2;
        this.g.c(this.k);
        this.g.c(this.l);
        this.g.a(this.k);
        this.h = afv3;
        this.h.c(this.k);
        this.h.c(this.l);
        this.h.a(this.l);
        this.a(afv2.ap(), afv3.ap(), n);
    }

    private void b() {
        fis_1.a().a((ajf_1)this, a);
    }

    private void a(aff_1 aff_12, aff_1 aff_13, int n) {
        this.j = n;
        this.a(aff_12);
        this.b(aff_13);
    }

    public void a(aff_1 aff_12) {
        if (aff_12 != this.e) {
            this.e = aff_12;
            this.c();
            this.b();
        }
    }

    public void b(aff_1 aff_12) {
        if (aff_12 != this.f) {
            this.f = aff_12;
            this.c();
            this.b();
        }
    }

    private void c() {
        if (this.f != null && this.e != null) {
            double d2;
            double d3;
            double d4 = 1.0 * (double)(this.f.d() - this.e.d());
            double d5 = d4 / (d3 = (double)afq_2.b((float)d4, (float)(d2 = -1.0 * (double)(this.f.e() - this.e.e()))));
            if (d5 > Math.cos(0.39269908169872414)) {
                this.i = aej_2.b.l;
                return;
            }
            if (d5 > Math.cos(1.1780972450961724)) {
                if (d2 < 0.0) {
                    this.i = aej_2.c.l;
                    return;
                }
                this.i = aej_2.a.l;
                return;
            }
            if (d5 > Math.cos(1.9634954084936207)) {
                if (d2 < 0.0) {
                    this.i = aej_2.d.l;
                    return;
                }
                this.i = aej_2.h.l;
                return;
            }
            if (d5 > Math.cos(2.748893571891069)) {
                if (d2 < 0.0) {
                    this.i = aej_2.e.l;
                    return;
                }
                this.i = aej_2.g.l;
                return;
            }
            this.i = aej_2.f.l;
        }
    }

    private void a(int n) {
        double d2;
        if (n % 2 != 0) {
            d.warn((Object)"Le calcul des indices de la boussole n'est pas pr\u00e9vue pour un chiffre impair.");
            return;
        }
        if (this.f == null || this.e == null) {
            return;
        }
        double d3 = 1.0 * (double)(this.f.d() - this.e.d());
        double d4 = afq_2.b((float)d3, (float)(d2 = -1.0 * (double)(this.f.e() - this.e.e())));
        if (d4 <= 0.0) {
            return;
        }
        double d5 = d2 == 0.0 && d3 < 0.0 ? Math.PI : Math.signum(d2) * Math.acos(d3 / d4);
        double d6 = 57.29577951308232 * d5;
        double d7 = 180 / n;
        int n2 = (int)(d6 + d7) / (int)(2.0 * d7);
        this.i = n2 = (n2 + 3) % n;
        this.b();
    }

    @Override
    public Object b(String string) {
        if (string.equalsIgnoreCase(a)) {
            try {
                return String.format(azs_0.a().a("compassIconsPath"), this.i);
            }
            catch (gm_0 gm_02) {
                d.error((Object)"PropertyException during getFieldValue for ICON_URL_FIELD", (Throwable)gm_02);
            }
        }
        return null;
    }

    @Override
    public String[] d() {
        return b;
    }

    public void a() {
        if (this.g != null) {
            this.g.c(this.k);
            this.g.c(this.l);
        }
        if (this.h != null) {
            this.h.c(this.k);
            this.h.c(this.l);
        }
    }
}

