/*
 * Decompiled with CFR 0.152.
 */
public class fhB {
    private final long a;
    private fha_0 b;
    private long c;

    public fhB(long l) {
        this.a = l;
    }

    public long a() {
        return this.a;
    }

    public void a(fha_0 fha_02) {
        this.b = fha_02;
    }

    public fha_0 b() {
        return this.b;
    }

    public void a(long l) {
        this.c = l;
    }

    public void a(wt_0 wt_02) {
        this.c = wt_02.h();
    }

    public long c() {
        return this.c;
    }

    public wt_0 d() {
        return wt_0.b(this.c);
    }

    public void e() {
        switch (this.b) {
            case a: {
                break;
            }
            case b: {
                break;
            }
            case c: {
                this.c = wc_0.p().e() + fhE.b;
                break;
            }
            case d: {
                this.c = wc_0.p().e() + fhE.c;
                break;
            }
            case e: {
                this.c = wc_0.p().e() + fhE.d;
            }
        }
    }
}

