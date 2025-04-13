/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from coe
 */
public class coe_0
extends Pw {
    private String a;
    private long b;
    private String c;
    private Integer e;

    public coe_0(String string, long l, String string2, Integer n) {
        this.a = string;
        this.b = l;
        this.c = string2;
        this.e = n;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        byte[] byArray = Cz.a(this.a);
        abx_22.a((byte)byArray.length);
        abx_22.b(byArray);
        abx_22.a(this.b);
        byte[] byArray2 = Cz.a(this.c);
        abx_22.a((byte)byArray2.length);
        abx_22.b(byArray2);
        abx_22.a(this.e);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12480;
    }
}

