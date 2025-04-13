/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eKY
 */
public enum eky_0 implements ru_0
{

    private final byte b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    private eky_0(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.b = (byte)n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = n6;
        this.g = n7;
    }

    @Override
    public byte a() {
        return this.b;
    }

    @Override
    public byte b() {
        return 2;
    }

    @Override
    public int c() {
        return this.c;
    }

    @Override
    public int g() {
        return this.d;
    }

    @Override
    public int h() {
        return this.e;
    }

    @Override
    public int i() {
        return this.f;
    }

    @Override
    public int j() {
        return this.g;
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public int m() {
        return -1;
    }

    public static eky_0 a(Byte by) {
        for (eky_0 eky_02 : eky_0.values()) {
            if (eky_02.a() != by.byteValue()) continue;
            return eky_02;
        }
        return null;
    }
}

