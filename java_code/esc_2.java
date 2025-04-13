/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eSC
 */
class esc_2
implements esa_2 {
    private final short a;
    private final short b;
    private short c;
    private short d;
    private short e;
    private short f;

    esc_2(short s2, short s3) {
        this.a = s2;
        this.b = s3;
    }

    esc_2(short s2, short s3, short s4, short s5, short s6, short s7) {
        this(s2, s3);
        this.c = s4;
        this.d = s5;
        this.e = s6;
        this.f = s7;
    }

    @Override
    public short a() {
        return this.a;
    }

    @Override
    public short b() {
        return this.b;
    }

    @Override
    public short c() {
        return this.c;
    }

    @Override
    public short d() {
        return this.d;
    }

    @Override
    public short e() {
        return this.e;
    }

    @Override
    public short f() {
        return this.f;
    }

    public boolean a(short s2, short s3, short s4, short s5) {
        boolean bl = this.c != s2 || this.d != s3 || this.e != s4 || this.f != s5;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        return bl;
    }

    public String toString() {
        return "PartitionModel{m_x=" + this.a + ", m_y=" + this.b + "}";
    }
}

