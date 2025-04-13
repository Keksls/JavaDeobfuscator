/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.apache.log4j.Logger;

/*
 * Renamed from bnQ
 */
public final class bnq_2 {
    private static final Logger g = Logger.getLogger(bnq_2.class);
    private static final int h = 1042;
    private static final int i = 1043;
    private static final int j = 5050;
    public static final String a = "AnimChrage1-Debut";
    public static final String b = "AnimChrage2-Debut";
    public static final String c = "AnimStatique02-Debut";
    public static final String d = "AnimChrage1-Fin";
    public static final String e = "AnimChrage2-Fin";
    public static final String f = "AnimStatique02-Fin";
    private static final int k = 40;
    private static final int l = 20;
    private int m = -1;
    Anm n;
    Anm o;
    private boolean p = true;

    public void a(blx_1 blx_12) {
    }

    private boolean b(blx_1 blx_12) {
        fiO fiO2 = blx_12.dz();
        if (fiO2 == null) {
            return false;
        }
        return fiO2.c(5050);
    }

    public void a(int n) {
        this.m = n;
    }

    int c(blx_1 blx_12) {
        epa_1 epa_12 = blx_12.a_(eps_0.b);
        if (epa_12.c() == 0) {
            return 0;
        }
        int n = epa_12.a() * 100 / epa_12.c();
        int n2 = 0;
        if (this.b(n)) {
            if (this.m < 40) {
                n2 = this.m < 20 ? this.f(blx_12) : this.e(blx_12);
            }
        } else if (this.c(n) && !this.c(this.m)) {
            n2 = this.d(this.m) ? this.d(blx_12) : this.g(blx_12);
        } else if (this.d(n)) {
            if (this.c(this.m)) {
                n2 = this.h(blx_12);
            } else if (this.b(this.m)) {
                n2 = this.i(blx_12);
            }
        }
        this.m = n;
        return n2;
    }

    private boolean b(int n) {
        return n > 40;
    }

    private boolean c(int n) {
        return n <= 40 && n > 20;
    }

    private boolean d(int n) {
        return n <= 20;
    }

    private int d(blx_1 blx_12) {
        biI biI2 = blx_12.bv();
        if (biI2.bQ().a() != 2) {
            biI2.a(this.o);
            this.o = null;
            return 0;
        }
        biI2.e(e);
        biI2.a(new bns_2(this, biI2));
        return biI2.j(e);
    }

    private int e(blx_1 blx_12) {
        biI biI2 = blx_12.bv();
        if (biI2.bQ().a() != 2) {
            biI2.a(this.n);
            this.n = null;
            return 0;
        }
        biI2.e(d);
        biI2.a(new bnt_2(this, biI2));
        return biI2.j(d);
    }

    private int f(blx_1 blx_12) {
        biI biI2 = blx_12.bv();
        if (biI2.bQ().a() != 2) {
            biI2.a(this.n);
            biI2.a(this.o);
            this.n = null;
            this.o = null;
            return 0;
        }
        biI2.e(f);
        biI2.a(new bnu_2(this, biI2));
        return biI2.j(f);
    }

    private int g(blx_1 blx_12) {
        biI biI2 = blx_12.bv();
        try {
            this.n = biI2.d(biE.k(1043));
        }
        catch (gm_0 gm_02) {
            g.error((Object)"Exception levee", (Throwable)gm_02);
        }
        if (biI2.bQ().a() == 2) {
            biI2.a(this.n, new bnv_2(this, biI2));
            return biI2.j(a);
        }
        return 0;
    }

    private int h(blx_1 blx_12) {
        biI biI2 = blx_12.bv();
        try {
            this.o = biI2.d(biE.k(1042));
        }
        catch (gm_0 gm_02) {
            g.error((Object)"Exception levee", (Throwable)gm_02);
        }
        if (biI2.bQ().a() == 2) {
            biI2.e(b);
            return biI2.j(b);
        }
        return 0;
    }

    private int i(blx_1 blx_12) {
        biI biI2 = blx_12.bv();
        try {
            this.n = biI2.d(biE.k(1043));
            this.o = biI2.d(biE.k(1042));
        }
        catch (gm_0 gm_02) {
            g.error((Object)"Exception levee", (Throwable)gm_02);
        }
        if (biI2.bQ().a() == 2) {
            biI2.e(c);
            return biI2.j(c);
        }
        return 0;
    }

    public void a() {
        this.m = -1;
    }

    public void b() {
        this.p = false;
    }

    public void c() {
        this.p = true;
    }
}

