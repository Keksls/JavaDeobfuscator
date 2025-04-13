/*
 * Decompiled with CFR 0.152.
 */
public class cBo
extends Pw {
    private long a;
    private short b;
    private String c;
    private eb e;
    private boolean f;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        byte[] byArray = Cz.a(this.c);
        abx_22.a((byte)byArray.length);
        abx_22.b(byArray);
        abx_22.a(this.f ? (byte)1 : 0);
        byte[] byArray2 = this.e.toByteArray();
        abx_22.a((short)byArray2.length);
        abx_22.b(byArray2);
        return this.a((byte)2, abx_22.c());
    }

    @Override
    public int a() {
        return 22630;
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(eb eb2) {
        this.e = eb2;
    }

    public void a(short s2) {
        this.b = s2;
    }

    public void a(String string) {
        this.c = string;
    }

    public void a(boolean bl) {
        this.f = bl;
    }
}

