/*
 * Decompiled with CFR 0.152.
 */
public class cnr
extends Pw {
    private final String a;

    public cnr(String string) {
        this.a = string;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        byte[] byArray = Cz.a(this.a);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13028;
    }
}

