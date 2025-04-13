/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clK
 */
public final class clk_0
extends Pw {
    private byte a;
    private long b;
    private String c;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        byte[] byArray = Cz.a(this.c);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return this.a((byte)3, abx_22.c());
    }

    public void a(long l) {
        this.b = l;
    }

    public void a(byte by) {
        this.a = by;
    }

    public void a(String string) {
        this.c = string;
    }

    @Override
    public int a() {
        return 13871;
    }
}

