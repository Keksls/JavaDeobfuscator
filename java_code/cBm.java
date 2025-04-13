/*
 * Decompiled with CFR 0.152.
 */
public class cBm
extends Pw {
    private String a;

    public void a(String string) {
        this.a = string;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a.length());
        byte[] byArray = Cz.a(this.a);
        abx_22.b(byArray);
        return this.a((byte)2, abx_22.c());
    }

    @Override
    public int a() {
        return 23243;
    }
}

