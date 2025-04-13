/*
 * Decompiled with CFR 0.152.
 */
public class cAb
extends Pw {
    private String a;
    private long b;

    public void a(String string) {
        this.a = string;
    }

    public void a(long l) {
        this.b = l;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2(2 + this.a.length() + 4);
        abx_22.a(this.a);
        abx_22.a(this.b);
        return this.a((byte)6, abx_22.c());
    }

    @Override
    public int a() {
        return 14273;
    }
}

