/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clP
 */
public final class clp_1
extends Pw {
    private long a;
    private int b;
    private String c;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        byte[] byArray = Cz.a(this.c);
        abx_22.a(this.c.length());
        abx_22.b(byArray);
        return this.a((byte)3, abx_22.c());
    }

    public void a(long l) {
        this.a = l;
    }

    public void b(int n) {
        this.b = n;
    }

    public void a(String string) {
        this.c = string;
    }

    @Override
    public int a() {
        return 13161;
    }
}

