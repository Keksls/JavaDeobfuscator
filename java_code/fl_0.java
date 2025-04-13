/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from FL
 */
public final class fl_0 {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 16;
    private byte f;
    private byte g = (byte)25;

    public void a(byte by) {
        this.g = by;
    }

    public byte a() {
        return this.f;
    }

    public void b(byte by) {
        this.f = by;
    }

    public byte b() {
        return this.g;
    }

    public boolean c() {
        return (this.f & 1) != 0;
    }

    public boolean d() {
        return (this.f & 2) != 0;
    }

    public void e() {
        this.f = (byte)(this.f | 2);
    }

    public boolean f() {
        return (this.f & 4) == 4;
    }

    public void g() {
        this.f = (byte)(this.f | 4);
    }

    public boolean h() {
        return (this.f & 0x10) == 16;
    }

    public void i() {
        this.f = (byte)(this.f | 0x10);
    }

    public boolean j() {
        return (this.f & 8) == 8;
    }

    public void k() {
        this.f = (byte)(this.f | 8);
    }

    public void l() {
        this.f = 0;
        this.g = 0;
    }
}

