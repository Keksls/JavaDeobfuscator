/*
 * Decompiled with CFR 0.152.
 */
public class bbo
extends alc_1 {
    private final int e;
    private final int f;
    private final long g;

    public bbo(crc crc2) {
        super(bbo.q(), emd_1.W.a(), 0);
        this.g = crc2.d();
        this.e = crc2.b();
        this.f = crc2.c();
    }

    @Override
    protected long o() {
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(this.g);
        if (bmr_12 == null) {
            return 0L;
        }
        bmr_12.eu().a(this.e, this.f);
        return 0L;
    }

    @Override
    protected void l() {
    }
}

