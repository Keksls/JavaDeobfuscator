/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blI
 */
public class bli_2
extends bll_2 {
    private final int w;

    public bli_2(int n) {
        this.w = n;
    }

    @Override
    public int v() {
        return this.w;
    }

    @Override
    protected bls_2 u() {
        return blc_2.a().b(this.w);
    }
}

