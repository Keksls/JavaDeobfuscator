/*
 * Decompiled with CFR 0.152.
 */
public class cAj
extends Pw {
    private final int a;
    private final fhx b;

    public cAj(int n, fhx fhx2) {
        this.a = n;
        this.b = fhx2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        fhv.a(this.b, abx_22);
        return this.a((byte)6, abx_22.c());
    }

    @Override
    public int a() {
        return 15372;
    }
}

