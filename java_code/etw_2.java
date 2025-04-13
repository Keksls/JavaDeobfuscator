/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eTw
 */
public abstract class etw_2 {
    protected final short a;
    protected final short b;
    protected final int c;
    protected final byte d;
    protected final int e;
    protected final int f;
    protected final int g;
    protected final boolean h;

    protected etw_2(short s2, short s3, int n, byte by, int n2, int n3, int n4, boolean bl) {
        this.a = s2;
        this.b = s3;
        this.c = n;
        this.d = by;
        this.e = n2;
        this.f = n3;
        this.g = n4;
        this.h = bl;
    }

    public short a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.f;
    }

    public abstract int a(int var1);

    public short d() {
        return this.b;
    }

    public byte e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public int g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean a(TObjectProcedure<eth_2> var1);

    public abstract boolean b(int var1);

    public abstract int[] k();
}

