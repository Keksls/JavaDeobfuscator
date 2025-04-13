/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eAc
 */
public class eac_0 {
    private final long a;
    private long b;
    private String c;
    private short d;
    private long e;
    private byte f;
    private eb g;

    public eac_0(long l) {
        this.a = l;
    }

    public void a(eac_0 eac_02) {
        if (this.a != eac_02.a) {
            throw new IllegalStateException("Trying to merge a data from another with a different ID");
        }
        this.c = eac_02.c;
        this.b = eac_02.b;
        this.d = eac_02.d;
        this.e = eac_02.e;
        this.f = eac_02.f;
        this.g = eac_02.g;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public void a(long l) {
        this.b = l;
    }

    public String c() {
        return this.c;
    }

    public void a(String string) {
        this.c = string;
    }

    public short d() {
        return this.d;
    }

    public void a(short s2) {
        this.d = s2;
    }

    public long e() {
        return this.e;
    }

    public void b(long l) {
        this.e = l;
    }

    public byte f() {
        return this.f;
    }

    public void a(byte by) {
        this.f = by;
    }

    public void a(eb eb2) {
        this.g = eb2;
    }

    public eb g() {
        return this.g;
    }
}

