/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from SV
 */
public class sv_0 {
    private final sw_0 a;
    private long[] b;

    public sv_0(sw_0 sw_02, long[] lArray) {
        this.a = sw_02;
        this.b = lArray;
    }

    public sw_0 a() {
        return this.a;
    }

    public void a(int n, int n2) {
        if (this.b != null && this.b.length > n) {
            this.b[n] = n2;
        }
    }

    public void a(long[] lArray) {
        this.b = lArray;
    }

    public long a(int n) {
        if (this.b != null && this.b.length > n) {
            return this.b[n];
        }
        return -1L;
    }
}

