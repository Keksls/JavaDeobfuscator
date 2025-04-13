/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXN
 */
public enum exn_2 implements ru_0
{
    b(1, 0, Integer.MAX_VALUE, 0, 50, 50);

    private final byte c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    private exn_2(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.c = (byte)n2;
        this.d = n3;
        this.e = n4;
        this.f = n5;
        this.g = n6;
        this.h = n7;
    }

    @Override
    public byte a() {
        return this.c;
    }

    @Override
    public byte b() {
        return 1;
    }

    @Override
    public int c() {
        return this.d;
    }

    @Override
    public int g() {
        return this.e;
    }

    @Override
    public int h() {
        return this.f;
    }

    @Override
    public int i() {
        return this.g;
    }

    @Override
    public int j() {
        return this.h;
    }

    @Override
    public boolean k() {
        return true;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public int m() {
        return -1;
    }

    public static exn_2 a(Byte by) {
        for (exn_2 exn_22 : exn_2.values()) {
            if (exn_22.a() != by.byteValue()) continue;
            return exn_22;
        }
        return null;
    }
}

