/*
 * Decompiled with CFR 0.152.
 */
public class cUK {
    public static final cUK a = new cUK();
    private cSQ b = null;

    private cUK() {
    }

    public boolean a() {
        return this.b != null;
    }

    public void a(aNF aNF2, int n, int n2) {
        if (this.b != null) {
            this.b.a(aNF2, n, n2);
        }
    }

    public void b(aNF aNF2, int n, int n2) {
        if (this.b != null) {
            this.b.b(aNF2, n, n2);
            this.b = null;
        }
    }

    public void a(frb_0 frb_02, frb_0 frb_03, cuh_0 cuh_02) {
        this.b = new cSQ(frb_02, frb_03, cuh_02);
        this.b.a();
    }

    public void b() {
        if (this.b != null) {
            this.b.b();
            this.b = null;
        }
    }
}

