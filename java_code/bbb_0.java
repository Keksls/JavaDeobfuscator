/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbB
 */
public class bbb_0
extends alc_1 {
    private final long e;
    private final aff_1 f;
    private final aej_2 g;

    public bbb_0(long l, aff_1 aff_12, aej_2 aej_22) {
        super(bbb_0.q(), emd_1.Y.a(), 0);
        this.e = l;
        this.f = aff_12;
        this.g = aej_22;
    }

    @Override
    protected long o() {
        this.n();
        return 0L;
    }

    @Override
    protected void l() {
    }

    private void n() {
        blx_1 blx_12 = bmf_2.a().c(this.e);
        if (blx_12 == null) {
            return;
        }
        cef_0.a().a(blx_12, this.f, this.g);
    }
}

