/*
 * Decompiled with CFR 0.152.
 */
public class bap
extends ban {
    private final blx_1 f;
    private final bwu_0 g;

    public bap(int n, int n2, int n3, int n4, long l, bwu_0 bwu_02) {
        super(n, n2, n3, n4);
        this.f = this.d(l);
        this.g = bwu_02;
    }

    @Override
    protected long o() {
        if (this.f == null) {
            return 0L;
        }
        if (!this.f.bm()) {
            return 0L;
        }
        biI biI2 = this.f.bv();
        return biI2.b(this.g);
    }
}

