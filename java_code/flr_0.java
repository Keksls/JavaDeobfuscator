/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from flr
 */
public class flr_0
extends flp_0 {
    private final float e;

    public flr_0(wu_0 wu_02, float f2, short s2, long l) {
        super(wu_02, s2, l);
        this.e = f2;
    }

    @Override
    public void a(wq_0 wq_02) {
        fls_0.a.a(this.c, this.d, this.e);
    }

    public String toString() {
        return "Facteur=" + this.e + " appliqu? " + this.b.s();
    }
}

