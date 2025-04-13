/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMb
 */
public class amb_1 {
    private long a;
    private long b;
    private byte c;
    private short d;
    private byte e;
    private int f;

    public amb_1() {
    }

    public amb_1(long l, byte by, short s2, byte by2) {
        this(l, by, s2, by2, 1);
    }

    public amb_1(long l, byte by, short s2, byte by2, int n) {
        this(l, l, by, s2, by2, n);
    }

    public amb_1(long l, long l2, byte by, short s2, byte by2, int n) {
        this.a = l;
        this.b = l2;
        this.c = by;
        this.d = s2;
        this.e = by2;
        this.f = n;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b == -1L ? this.a : this.b;
    }

    public byte c() {
        return this.c;
    }

    public short d() {
        return this.d;
    }

    public byte e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public void a(arf_1 arf_12) {
        this.a = arf_12.j();
        this.b = arf_12.j();
        this.c = arf_12.a();
        this.d = arf_12.b();
        this.e = arf_12.a();
        this.f = arf_12.c();
    }

    public void a(gk_0 gk_02) {
        gk_02.c(this.a);
        gk_02.c(this.b);
        gk_02.a(this.c);
        gk_02.a(this.d);
        gk_02.a(this.e);
        gk_02.a(this.f);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof amb_1)) {
            return false;
        }
        amb_1 amb_12 = (amb_1)object;
        return this.a == amb_12.a && this.b == amb_12.b && this.c == amb_12.c && this.d == amb_12.d && this.e == amb_12.e && this.f == amb_12.f;
    }
}

