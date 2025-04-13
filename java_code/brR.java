/*
 * Decompiled with CFR 0.152.
 */
public class brR
extends brr_0 {
    private int p;
    private final int q;

    public brR(int n, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2, int n7, float f2) {
        super(n, n2, n5, n6, bl, eAJ.e, bl2, n7, f2);
        this.p = n4;
        this.q = n3;
    }

    @Override
    public String i() {
        return bae.h().a(38, (long)this.q, new Object[0]);
    }

    @Override
    public int j() {
        return this.p;
    }

    @Override
    public void b(int n) {
        this.p = n;
    }

    @Override
    public brs_1 k() {
        return brs_1.b;
    }
}

