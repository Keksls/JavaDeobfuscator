/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cod
 */
public class cod_0
extends Pw {
    private final String a;
    private final Integer b;
    private final long c;
    private final short e;

    public cod_0(String string, Integer n, long l, short s2) {
        this.a = string;
        this.b = n;
        this.c = l;
        this.e = s2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        byte[] byArray = Cz.a(this.a);
        abx_22.a((byte)byArray.length);
        abx_22.b(byArray);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(this.e);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13212;
    }
}

