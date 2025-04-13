/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Yv
 */
public abstract class yv_0 {
    public static final int a = 32;
    public static final byte b = -1;
    public static final byte c = 7;
    public int d;
    public int e;
    public short f;

    public abstract boolean a(int var1, int var2);

    public boolean b(int n, int n2) {
        return n >= this.d && n < this.d + this.a() && n2 >= this.e && n2 < this.e + this.b();
    }

    protected int a() {
        return 18;
    }

    protected int b() {
        return 18;
    }

    public abstract int a(int var1, int var2, ys_0[] var3, int var4);

    public abstract short c(int var1, int var2);

    public abstract int a(int var1, int var2, yt_0[] var3, int var4);

    public void a(arf_1 arf_12) {
        this.d = arf_12.b() * 18;
        this.e = arf_12.b() * 18;
        this.f = arf_12.b();
    }

    protected final boolean a(int n, int n2, ys_0[] ys_0Array) {
        assert (ys_0Array != null);
        assert (ys_0Array.length >= 1) : "cellPathData array must have a size at least equal to one";
        assert (ys_0Array[0] != null) : "cellpathData array seems not to be initialized";
        assert (this.b(n, n2)) : "The cell (" + n + ", " + n2 + ") doesn't belong to the map. Make sure that isInMap(x, y) is true before calling getPathData";
        return true;
    }

    protected final boolean a(int n, int n2, yt_0[] yt_0Array) {
        assert (yt_0Array != null);
        assert (yt_0Array.length >= 1) : "cellVisibilityData array must have a size at least equal to one";
        assert (yt_0Array[0] != null) : "cellVisibilityData array seems not to be initialized";
        assert (this.b(n, n2)) : "The cell (" + n + ", " + n2 + ") doesn't belong to the map. Make sure that isInMap(x, y) is true before calling getVisibilityData";
        return true;
    }

    public boolean c() {
        return false;
    }
}

