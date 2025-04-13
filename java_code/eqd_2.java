/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eqD
 */
public class eqd_2 {
    private long a;
    private final short b;
    private final short c;
    private final short d;
    private final short e;

    public eqd_2(short s2, short s3, short s4, short s5) {
        this.b = s2;
        this.d = s3;
        this.c = s4;
        this.e = s5;
        this.f();
    }

    public eqd_2(long l) {
        this.a = l;
        int n = Hw.g(l);
        int n2 = Hw.h(l);
        this.b = Hw.b(n);
        this.c = Hw.c(n);
        this.d = Hw.b(n2);
        this.e = Hw.c(n2);
    }

    public short a() {
        return this.b;
    }

    public short b() {
        return this.d;
    }

    public short c() {
        return this.c;
    }

    public short d() {
        return this.e;
    }

    public long e() {
        if (this.a == 0L) {
            this.f();
        }
        return this.a;
    }

    private void f() {
        int n = Hw.c(this.b, this.c);
        int n2 = Hw.c(this.d, this.e);
        this.a = Hw.c(n, n2);
    }

    public String toString() {
        return "GuildBlazon{m_shapeId=" + this.b + ", m_symbolId=" + this.c + ", m_shapeColor=" + this.d + ", m_symbolColor=" + this.e + "}";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eqd_2)) {
            return false;
        }
        eqd_2 eqd_22 = (eqd_2)object;
        return this.a == eqd_22.a;
    }

    public int hashCode() {
        return (int)(this.a ^ this.a >>> 32);
    }
}

