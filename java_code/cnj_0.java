/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cnj
 */
public class cnj_0
extends Pw {
    private long a;
    private int b;
    private int c;
    private short e;
    private boolean f = false;
    private int g = 2;
    private boolean h = true;
    private byte i = 1;
    private aff_1 j = null;
    private int[] k = null;
    private aff_1 l;
    private aff_1 m;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(this.e);
        abx_22.a(this.f ? (byte)1 : 0);
        abx_22.a(this.g);
        abx_22.a(this.h ? (byte)1 : 0);
        abx_22.a(this.i);
        if (this.j == null) {
            abx_22.a((byte)0);
        } else {
            abx_22.a((byte)1);
            abx_22.a(this.j.d());
            abx_22.a(this.j.e());
            abx_22.a(this.j.f());
        }
        if (this.k == null) {
            abx_22.a((byte)0);
        } else {
            abx_22.a((byte)this.k.length);
            for (int n = 0; n < this.k.length; n = (int)((byte)(n + 1))) {
                abx_22.a(this.k[n]);
            }
        }
        if (this.l == null) {
            abx_22.a((byte)0);
        } else {
            abx_22.a((byte)1);
            abx_22.a(this.l.d());
            abx_22.a(this.l.e());
            abx_22.a(this.l.f());
        }
        if (this.m == null) {
            abx_22.a((byte)0);
        } else {
            abx_22.a((byte)1);
            abx_22.a(this.m.d());
            abx_22.a(this.m.e());
            abx_22.a(this.m.f());
        }
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13137;
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(int n, int n2, short s2) {
        this.b = n;
        this.c = n2;
        this.e = s2;
    }

    public void a(aff_1 aff_12) {
        this.j = aff_12;
    }

    public void a(byte by) {
        this.i = by;
    }

    public void a(int[] nArray) {
        this.k = nArray;
    }

    public void b(int n) {
        this.g = n;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    public void b(boolean bl) {
        this.h = bl;
    }

    public aff_1 c() {
        return this.l;
    }

    public void b(aff_1 aff_12) {
        this.l = aff_12;
    }

    public aff_1 d() {
        return this.m;
    }

    public void c(aff_1 aff_12) {
        this.m = aff_12;
    }
}

