/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eCy
 */
public class ecy_0 {
    private final int a;
    private long b;
    private boolean c;

    public ecy_0(int n) {
        this.a = n;
    }

    public int a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public void a(long l) {
        this.b = l;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public void b(long l) {
        this.b += l;
    }

    public short d() {
        return eDh.a(this.b);
    }

    public byte[] e() {
        return eCC.a(this);
    }
}

