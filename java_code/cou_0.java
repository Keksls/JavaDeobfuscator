/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cou
 */
public class cou_0
extends Pw {
    private final int a;
    private final int b;
    private final long c;
    private long e = -1L;
    private short f = (short)-1;

    public cou_0(int n, int n2, long l) {
        this.a = n;
        this.b = n2;
        this.c = l;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        if (this.e != -1L) {
            abx_22.a(this.e);
            abx_22.a(this.f);
        }
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12090;
    }

    public void a(long l) {
        this.e = l;
    }

    public void a(short s2) {
        this.f = s2;
    }
}

