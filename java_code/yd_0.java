/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from YD
 */
public class yd_0
extends yv_0 {
    private byte i;
    private byte j;
    private short k;

    @Override
    public final boolean a(int n, int n2) {
        return this.i == -1;
    }

    @Override
    public final int a(int n, int n2, ys_0[] ys_0Array, int n3) {
        assert (this.a(n, n2, ys_0Array));
        ys_0 ys_02 = ys_0Array[n3];
        ys_02.a = n;
        ys_02.b = n2;
        ys_02.c = this.f;
        ys_02.z = this.i;
        ys_02.e = false;
        ys_02.d = 0;
        ys_02.A = this.j;
        ys_02.B = this.k;
        return 1;
    }

    @Override
    public short c(int n, int n2) {
        return this.k;
    }

    @Override
    public int a(int n, int n2, yt_0[] yt_0Array, int n3) {
        assert (this.a(n, n2, yt_0Array));
        yt_0 yt_02 = yt_0Array[n3];
        yt_02.a = n;
        yt_02.b = n2;
        yt_02.c = this.f;
        yt_02.e = false;
        yt_02.d = 0;
        return 1;
    }

    @Override
    public void a(arf_1 arf_12) {
        super.a(arf_12);
        this.i = arf_12.a();
        this.j = arf_12.a();
        this.k = arf_12.b();
    }
}

