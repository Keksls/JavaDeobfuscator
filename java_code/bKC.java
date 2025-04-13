/*
 * Decompiled with CFR 0.152.
 */
public enum bKC {
    a(0, faI.b, faI.c, faI.e, faI.d),
    b(1, faI.f, faI.t, faI.k, faI.y, faI.i, faI.w, faI.m, faI.A, faI.g, faI.u),
    c(2, faI.F, faI.G, faI.H, faI.I, faI.J, faI.K, faI.L, faI.M),
    d(3, faI.o, faI.C, faI.p, faI.D, faI.q, faI.r, faI.N, faI.O, faI.E, faI.s);

    private final int e;
    private final faI[] f;

    private bKC(int n2, faI ... faIArray) {
        this.e = n2;
        this.f = faIArray;
    }

    public int a() {
        return this.e;
    }

    public faI[] b() {
        return this.f;
    }
}

