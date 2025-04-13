/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brY
 */
public class bry_0
extends brr_0 {
    private int p;

    public bry_0(int n, int n2, int n3, int n4, int n5, boolean bl, eAJ eAJ2, boolean bl2, int n6, float f2) {
        super(n, n2, n4, n5, bl, eAJ2, bl2, n6, f2);
        this.p = n3;
    }

    @Override
    public String i() {
        return bae.h().a(12, (long)this.p, new Object[0]);
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
        return brs_1.a;
    }
}

