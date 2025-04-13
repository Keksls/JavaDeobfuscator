/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from czg
 */
public class czg_1
extends Pw {
    private byte a;
    private int b;
    private String c;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        byte[] byArray = Cz.a(this.c);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return this.a((byte)6, abx_22.c());
    }

    public void a(byte by) {
        this.a = by;
    }

    public void a(String string) {
        this.c = string;
    }

    @Override
    public int a() {
        return 15407;
    }

    public void b(int n) {
        this.b = n;
    }
}

