/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ckC
 */
public class ckc_1
extends Pw {
    private long a;
    private String b;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        byte[] byArray = Cz.a(this.b);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return this.a((byte)8, abx_22.c());
    }

    public void a(long l) {
        this.a = l;
    }

    @Override
    public int a() {
        return 441;
    }

    public void a(String string) {
        this.b = string;
    }
}

