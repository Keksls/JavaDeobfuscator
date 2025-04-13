/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBw
 */
public class abw_1 {
    private int a;
    private byte[] b;

    public abw_1(int n) {
        this.b = new byte[n / 8 + 1];
        this.a = 0;
    }

    public void a(boolean bl) {
        this.b(1);
        int n = this.a / 8;
        int n2 = this.a % 8;
        if (bl) {
            int n3 = n;
            this.b[n3] = (byte)(this.b[n3] | 1 << n2);
        } else {
            int n4 = n;
            this.b[n4] = (byte)(this.b[n4] & ~(1 << n2));
        }
        ++this.a;
    }

    public void a(byte by) {
        this.b(8);
        for (int k = 0; k < 8; ++k) {
            int n = this.a / 8;
            int n2 = this.a % 8;
            int n3 = n;
            this.b[n3] = (byte)(this.b[n3] + ((by >> k & 1) << n2));
            ++this.a;
        }
    }

    public void a(short s2) {
        this.b(16);
        for (int k = 0; k < 16; ++k) {
            int n = this.a / 8;
            int n2 = this.a % 8;
            int n3 = n;
            this.b[n3] = (byte)(this.b[n3] + ((s2 >> k & 1) << n2));
            ++this.a;
        }
    }

    public void a(int n) {
        this.b(32);
        for (int k = 0; k < 32; ++k) {
            int n2 = this.a / 8;
            int n3 = this.a % 8;
            int n4 = n2;
            this.b[n4] = (byte)(this.b[n4] + ((n >> k & 1) << n3));
            ++this.a;
        }
    }

    public void a(long l, int n) {
        this.b(n);
        for (int k = 0; k < n; ++k) {
            int n2 = this.a / 8;
            int n3 = this.a % 8;
            int n4 = n2;
            this.b[n4] = (byte)((long)this.b[n4] + ((l >> k & 1L) << n3));
            ++this.a;
        }
    }

    public void b(int n) {
        int n2 = this.a + n - this.b.length * 8;
        if (n2 > 0) {
            int n3 = (int)Math.ceil((float)n2 / 8.0f);
            int n4 = this.b.length;
            byte[] byArray = new byte[n4 + n3];
            System.arraycopy(this.b, 0, byArray, 0, n4);
            this.b = byArray;
        }
    }

    public void a(abw_1 abw_12) {
        this.b(abw_12.a());
        for (int k = 0; k < abw_12.a(); ++k) {
            int n = this.a / 8;
            int n2 = this.a % 8;
            int n3 = n;
            this.b[n3] = (byte)(this.b[n3] + (abw_12.c(k) << n2));
            ++this.a;
        }
    }

    public int c(int n) {
        int n2 = n / 8;
        int n3 = n % 8;
        return this.b[n2] >> n3;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return (int)Math.ceil((float)this.a / 8.0f);
    }

    public byte[] c() {
        return this.b;
    }
}

