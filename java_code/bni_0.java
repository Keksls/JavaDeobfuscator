/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bNi
 */
public class bni_0
extends exy_2 {
    private fgi_0 b;
    private int d;

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean a(wf_2 wf_22) {
        throw new UnsupportedOperationException("Un item d'inventaire de protecteur ne doit pas \u00eatre s\u00e9rialis\u00e9 par le client");
    }

    @Override
    public boolean b(wf_2 wf_22) {
        this.l = new exk_2();
        if (!this.l.b(wf_22.a)) {
            return false;
        }
        this.a((long)wf_22.c);
        fev_0 fev_02 = fev_0.a(wf_22.b);
        if (fev_02 != null) {
            this.a(fev_02);
            return true;
        }
        c.error((Object)("Impossible de trouver le pack \u00e0 " + wf_22.b + " items"));
        return false;
    }

    public fgi_0 c() {
        return this.b;
    }

    public void a(fgi_0 fgi_02) {
        this.b = fgi_02;
    }

    public int d() {
        return this.d;
    }

    public void a(int n) {
        this.d = n;
    }

    @Override
    public void b(short s2) {
    }

    public bnl_0 k() {
        switch (this.b) {
            case a: {
                return new bnf_0(this, this.d);
            }
            case b: {
                return new bng_0(this, this.d);
            }
        }
        return null;
    }
}

