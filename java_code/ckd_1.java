/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ckD
 */
public class ckd_1
extends Pw {
    private byte[] a;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a.length);
        abx_22.b(this.a);
        return this.a((byte)8, abx_22.c());
    }

    @Override
    public int a() {
        return 446;
    }

    public void a(byte[] byArray) {
        this.a = (byte[])byArray.clone();
    }
}

