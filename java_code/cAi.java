/*
 * Decompiled with CFR 0.152.
 */
public class cAi
extends Pw {
    private final String a;

    public cAi(String string) {
        this.a = string;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.a);
        abx_2 abx_22 = new abx_2();
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return this.a((byte)6, abx_22.c());
    }

    @Override
    public int a() {
        return 14787;
    }
}

