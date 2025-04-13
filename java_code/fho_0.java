/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fhO
 */
public final class fho_0 {
    private final short b;
    private int c;
    private int d;
    private short e;
    private byte f;
    private boolean g;
    private boolean h;

    public fho_0(short s2) {
        this.b = s2;
    }

    public fho_0(short s2, int n, int n2, short s3, byte by, boolean bl, boolean bl2) {
        this.b = s2;
        this.c = n;
        this.d = n2;
        this.e = s3;
        this.f = by;
        this.g = bl;
        this.h = bl2;
    }

    public short a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public short d() {
        return this.e;
    }

    public byte e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public boolean g() {
        return this.h;
    }

    int a(short s2, short s3) {
        int n = this.c - s2 * 18;
        int n2 = this.d - s3 * 18;
        if (n < 0 || n >= 18) {
            throw new RuntimeException("relativeX invalide: " + n + ", " + this);
        }
        if (n2 < 0 || n2 >= 18) {
            throw new RuntimeException("relativeY invalide: " + n2 + ", " + this);
        }
        int n3 = n * 18 + n2;
        assert ((n3 & 0x1FF) == n3) : "relativeXY invalide: " + n3;
        int n4 = this.e & 0xFFFF;
        int n5 = this.f & 0x1F;
        if ((this.f & 0x1F) != this.f) {
            throw new RuntimeException("EvolutionStep trop grand: " + this.f + ", " + this);
        }
        int n6 = this.g ? 1 : 0;
        int n7 = this.h ? 1 : 0;
        return n7 << 31 | n6 << 30 | n5 << 25 | n4 << 9 | n3;
    }

    void a(int n, short s2, short s3) {
        int n2 = n & 0x1FF;
        this.c = s2 * 18 + n2 / 18;
        this.d = s3 * 18 + n2 % 18;
        this.e = (short)(n >>> 9 & 0xFFFF);
        this.f = (byte)(n >>> 25 & 0x1F);
        this.g = (n >>> 30 & 1) == 1;
        this.h = n >>> 31 == 1;
    }

    public String toString() {
        return "ResourceInfo{m_refId=" + this.b + ", m_resourceX=" + this.c + ", m_resourceY=" + this.d + ", m_resourceZ=" + this.e + ", m_evolutionStep=" + this.f + ", m_autoRespawn=" + this.g + ", m_justGrowth=" + this.h + "}";
    }
}

