/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from czO
 */
public class czo_2
extends Pw {
    private String a;
    private int b;
    private boolean c;
    private boolean e;

    public czo_2() {
        this("", 1, true, true);
    }

    public czo_2(String string, int n, boolean bl, boolean bl2) {
        this.a = string.toLowerCase();
        this.b = n;
        this.c = bl;
        this.e = bl2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        byte[] byArray = Cz.a(this.a);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        abx_22.a(this.b);
        abx_22.a(this.c ? (byte)1 : 0);
        abx_22.a(this.e ? (byte)1 : 0);
        return this.a((byte)6, abx_22.c());
    }

    @Override
    public int a() {
        return 1170;
    }
}

