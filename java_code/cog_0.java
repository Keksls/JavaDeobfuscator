/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cog
 */
public class cog_0
extends Pw {
    private final String a;

    public cog_0(String string) {
        this.a = string;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        byte[] byArray = Cz.a(this.a);
        abx_22.a((byte)byArray.length);
        abx_22.b(byArray);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13363;
    }
}

