/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azg
 */
public abstract class azg_2
implements azh_2 {
    protected byte a;
    protected byte b;
    protected byte c;
    protected byte d;
    protected byte e;
    protected byte f;
    protected byte g;
    protected byte h;
    protected boolean i = false;

    protected azg_2(byte by, byte by2, byte by3, byte by4, byte by5, byte by6, byte by7, byte by8, boolean bl) {
        this.a = by;
        this.b = by2;
        this.c = by3;
        this.d = by4;
        this.e = by5;
        this.f = by6;
        this.g = by7;
        this.h = by8;
        this.i = bl;
    }

    @Override
    public void a(byte by, byte by2, byte by3, byte by4) {
        this.a = by;
        this.b = by2;
        this.c = by3;
        this.d = by4;
    }

    @Override
    public void b(byte by, byte by2, byte by3, byte by4) {
        this.e = by;
        this.f = by2;
        this.g = by3;
        this.h = by4;
    }

    @Override
    public void a(int n) {
        if (n == 32) {
            this.i = true;
        }
    }
}

