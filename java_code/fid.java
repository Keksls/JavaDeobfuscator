/*
 * Decompiled with CFR 0.152.
 */
public enum fid {
    a(new fic(), 8, 4, true),
    b(new fih(), 6, 4, true),
    c(new fih(), 8, 1, false);

    private static int e;
    private static int f;
    public static final fid[] d;
    private final tt_0 g;
    private final short h;
    private final byte i;
    private byte j;
    private byte k;
    private final boolean l;

    private fid(tt_0 tt_02, short s2, byte by, boolean bl) {
        this.g = tt_02;
        this.h = s2;
        this.i = by;
        this.l = bl;
    }

    public tt_0 a() {
        return this.g;
    }

    public boolean b() {
        return this.l;
    }

    public short c() {
        return this.h;
    }

    public byte d() {
        return this.i;
    }

    public short e() {
        return this.j;
    }

    public short f() {
        return this.k;
    }

    public static int g() {
        return e;
    }

    public static int h() {
        return f;
    }

    public static fid[] i() {
        return d;
    }

    public static byte a(fid fid2) {
        byte by = 0;
        for (fid fid3 : fid.values()) {
            if (fid3 == fid2) break;
            by = (byte)(by + fid3.d());
        }
        return by;
    }

    public static byte b(fid fid2) {
        byte by = 0;
        for (fid fid3 : fid.i()) {
            if (fid3 == fid2) break;
            by = (byte)(by + fid3.d());
        }
        return by;
    }

    static {
        e = 0;
        f = 0;
        int n = 0;
        for (fid fid2 : fid.values()) {
            fid2.j = fid.a(fid2);
            e += fid2.d();
            if (!fid2.b()) continue;
            ++n;
            f += fid2.d();
        }
        d = new fid[n];
        int n2 = 0;
        for (fid fid3 : fid.values()) {
            if (!fid3.b()) continue;
            fid.d[n2] = fid3;
            ++n2;
        }
        for (fid fid3 : fid.i()) {
            fid3.k = fid.b(fid3);
        }
    }
}

