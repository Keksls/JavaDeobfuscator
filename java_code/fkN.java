/*
 * Decompiled with CFR 0.152.
 */
public abstract class fkN {
    protected final fkt_0 a;

    protected fkN(fkt_0 fkt_02) {
        this.a = fkt_02;
    }

    public fkt_0 c() {
        return this.a;
    }

    public afe_1 d() {
        return this.a.b();
    }

    public abstract fkO a();

    public boolean a(fkN fkN2) {
        if (this == fkN2) {
            return true;
        }
        if (fkN2 == null || this.getClass() != fkN2.getClass()) {
            return false;
        }
        return this.a.equals(fkN2.a);
    }
}

