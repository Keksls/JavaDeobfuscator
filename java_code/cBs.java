/*
 * Decompiled with CFR 0.152.
 */
public class cBs
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
        return this.a((byte)2, abx_22.c());
    }

    @Override
    public int a() {
        return 23052;
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(String string) {
        this.b = string;
    }
}

