/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHn
 */
public abstract class ahn_1 {
    private static final int a = 1;
    private static final int b = 2;
    private int c;
    private ahp_1 d;
    private String[] e;
    private ahc_2[] f;
    private int g = -1;
    private boolean h = false;

    protected void a(String ... stringArray) {
        this.e = stringArray;
        this.c = 1;
    }

    public void a() {
        this.e = null;
        this.c = 2;
    }

    protected void a(ahp_1 ahp_12) {
        this.d = ahp_12;
    }

    protected void a(ahc_2 ... ahc_2Array) {
        this.f = ahc_2Array;
    }

    protected void a(int n) {
        this.g = n;
    }

    protected void b() {
        this.h = true;
    }

    protected static ahc_2 a(String string, Object object) {
        return new ahf_2(string, object);
    }

    protected static ahc_2 a(String string, Integer n) {
        return new ahi_1(string, n);
    }

    protected static ahc_2 b(String string, Integer n) {
        return new ahj_1(string, n);
    }

    protected static ahc_2 c(String string, Integer n) {
        return new ahg_2(string, n);
    }

    protected static ahc_2 d(String string, Integer n) {
        return new ahh_1(string, n);
    }

    protected static ahc_2 a(String string, String string2, float f2) {
        return new aho_1(string, string2, f2);
    }

    protected static ahc_2 a(String string, String string2) {
        return new ahk_1(string, string2);
    }

    protected static ahc_2 a(ahc_2 ahc_22) {
        return new ahl_1(ahc_22);
    }

    protected static ahc_2 b(ahc_2 ... ahc_2Array) {
        return new ahb_2(ahc_2Array);
    }

    protected static ahc_2 c(ahc_2 ... ahc_2Array) {
        return new ahm_1(ahc_2Array);
    }

    public ahp_1 c() {
        switch (this.c) {
            case 1: {
                ahp_1 ahp_12 = this.d.a(this.e, this.f, this.g, this.h);
                return ahp_12;
            }
            case 2: {
                this.d.a(this.f);
            }
        }
        return this.d;
    }
}

