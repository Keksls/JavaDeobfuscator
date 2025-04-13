/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cok
 */
public class cok_0
extends Pw {
    private final String a;
    private final String b;
    private final String c;

    public cok_0(String string, String string2, String string3) {
        this.a = string;
        this.b = string2;
        this.c = string3;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        byte[] byArray = Cz.a(this.a);
        abx_22.a((byte)byArray.length);
        abx_22.b(byArray);
        byte[] byArray2 = Cz.a(this.b);
        abx_22.a((byte)byArray2.length);
        abx_22.b(byArray2);
        byte[] byArray3 = Cz.a(this.c);
        abx_22.a((byte)byArray3.length);
        abx_22.b(byArray3);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13210;
    }
}

