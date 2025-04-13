/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bRF
 */
public final class brf_0 {
    protected static final Logger a = Logger.getLogger(brf_0.class);
    private float b;
    private float c;
    private float d;
    private float[] e;
    private float f;
    private fjt_0 g = fjt_0.a;
    private fjr_0 h = fjr_0.b;
    private float i;
    private cbz_1 j = cbz_1.a;
    private boolean k = true;
    private Yf l = Yf.a;
    private boolean m = true;
    private fjt_0 n = fjt_0.a;
    private cbz_1 o = cbz_1.a;
    private float p;
    private float q;

    public float a() {
        return this.d;
    }

    public void a(float f2) {
        this.d = f2;
    }

    public float b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }

    public float d() {
        return this.e != null ? this.e[0] : 0.0f;
    }

    public float e() {
        return this.e != null ? this.e[1] : 0.0f;
    }

    public float f() {
        return this.f;
    }

    public float g() {
        return this.i;
    }

    public fjt_0 h() {
        return this.g;
    }

    public fjr_0 i() {
        return this.h;
    }

    public cbz_1 j() {
        return this.j;
    }

    public static cbz_1 b(float f2) {
        if (f2 < 0.33f) {
            return cbz_1.a;
        }
        if (f2 < 0.66f) {
            return cbz_1.b;
        }
        return cbz_1.c;
    }

    public void a(float f2, float f3, float f4, float f5, float[] fArray, Yf yf, float f6, float f7) {
        this.l = yf;
        fjt_0 fjt_02 = fju_0.a(yf, f2 + f5, f6 + f7);
        if (fjt_02 != this.g) {
            this.k = true;
            this.g = fjt_02;
        }
        this.h = fjr_0.a(yf);
        this.d = f2;
        this.b = f3;
        this.c = f4;
        this.e = fArray;
        this.f = f5;
        this.i = f6;
        cbz_1 cbz_12 = brf_0.b(f6);
        if (this.j != cbz_12) {
            this.j = cbz_12;
            this.k = true;
        }
    }

    public void a(float f2, float f3, float f4, float f5, float f6, Yf yf) {
        cbz_1 cbz_12;
        this.p = f2 + f4;
        this.q = f3 + f4;
        float f7 = f5 + f6;
        fjt_0 fjt_02 = fju_0.a(yf, (this.p + this.q) * 0.5f, f7);
        if (fjt_02 != this.n) {
            this.m = true;
            this.n = fjt_02;
        }
        if ((cbz_12 = brf_0.b(f7)) != this.o) {
            this.m = true;
            this.o = cbz_12;
        }
    }

    public void a(bMn bMn2) {
        brh_0.a().a(this);
        cbt_1.a.a(this.g);
        cbt_1.a.b(this.i);
        if (this.m) {
            this.m = false;
            bmo_0 bmo_02 = (bmo_0)bmt_0.f.b();
            bmo_02.a(bMn2);
            fgV.a.a(bmo_02);
        }
        if (this.k) {
            this.k = false;
        }
        a.debug((Object)("****** Mise \u00e0 jour des vues relatives \u00e0 la m\u00e9t\u00e9o : " + this.toString()));
    }

    public Yf k() {
        return this.l;
    }

    public String toString() {
        return "Weather {\n\ttemperature : " + this.d + "\u00b0\n\ttendance : " + this.g.toString() + "\n\train : d=" + this.l + "\twind : " + this.i + " / 1.0\n}\n";
    }
}

