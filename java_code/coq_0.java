/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from coq
 */
public class coq_0
extends Pw {
    private long a;
    private long b;
    private byte c;
    private String e;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        byte[] byArray = Cz.a(this.e);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return this.a((byte)3, abx_22.c());
    }

    public void a(long l) {
        this.a = l;
    }

    public void b(long l) {
        this.b = l;
    }

    public void a(String string) {
        this.e = string;
    }

    public void a(byte by) {
        this.c = by;
    }

    @Override
    public int a() {
        return 12911;
    }
}

