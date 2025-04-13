/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKW
 */
public class fkw_2 {
    public byte[] a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    private final fku_2 h = new fku_2();
    private final byte[] i = new byte[4];

    public int a() {
        this.a = null;
        return 0;
    }

    public void b() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    public int a(int n) {
        if (this.d != 0) {
            this.c -= this.d;
            if (this.c > 0) {
                System.arraycopy(this.a, this.d, this.a, 0, this.c);
            }
            this.d = 0;
        }
        if (n > this.b - this.c) {
            int n2 = n + this.c + 4096;
            if (this.a != null) {
                byte[] byArray = new byte[n2];
                System.arraycopy(this.a, 0, byArray, 0, this.a.length);
                this.a = byArray;
            } else {
                this.a = new byte[n2];
            }
            this.b = n2;
        }
        return this.c;
    }

    public int b(int n) {
        if (this.c + n > this.b) {
            return -1;
        }
        this.c += n;
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int a(fku_2 fku_22) {
        int n = this.d;
        int n2 = this.c - this.d;
        if (this.f == 0) {
            if (n2 < 27) {
                return 0;
            }
            if (this.a[n] != 79 || this.a[n + 1] != 103 || this.a[n + 2] != 103 || this.a[n + 3] != 83) {
                this.f = 0;
                this.g = 0;
                int n3 = 0;
                for (int k = 0; k < n2 - 1; ++k) {
                    if (this.a[n + 1 + k] != 79) continue;
                    n3 = n + 1 + k;
                    break;
                }
                if (n3 == 0) {
                    n3 = this.c;
                }
                this.d = n3;
                return -(n3 - n);
            }
            int n4 = (this.a[n + 26] & 0xFF) + 27;
            if (n2 < n4) {
                return 0;
            }
            for (int k = 0; k < (this.a[n + 26] & 0xFF); ++k) {
                this.g += this.a[n + 27 + k] & 0xFF;
            }
            this.f = n4;
        }
        if (this.g + this.f > n2) {
            return 0;
        }
        byte[] byArray = this.i;
        synchronized (this.i) {
            System.arraycopy(this.a, n + 22, this.i, 0, 4);
            this.a[n + 22] = 0;
            this.a[n + 23] = 0;
            this.a[n + 24] = 0;
            this.a[n + 25] = 0;
            fku_2 fku_23 = this.h;
            fku_23.a = this.a;
            fku_23.b = n;
            fku_23.c = this.f;
            fku_23.d = this.a;
            fku_23.e = n + this.f;
            fku_23.f = this.g;
            fku_23.i();
            if (this.i[0] != this.a[n + 22] || this.i[1] != this.a[n + 23] || this.i[2] != this.a[n + 24] || this.i[3] != this.a[n + 25]) {
                System.arraycopy(this.i, 0, this.a, n + 22, 4);
                this.f = 0;
                this.g = 0;
                int n5 = 0;
                for (int k = 0; k < n2 - 1; ++k) {
                    if (this.a[n + 1 + k] != 79) continue;
                    n5 = n + 1 + k;
                    break;
                }
                if (n5 == 0) {
                    n5 = this.c;
                }
                this.d = n5;
                // ** MonitorExit[var5_9] (shouldn't be in output)
                return -(n5 - n);
            }
            // ** MonitorExit[var5_9] (shouldn't be in output)
            n = this.d;
            if (fku_22 != null) {
                fku_22.a = this.a;
                fku_22.b = n;
                fku_22.c = this.f;
                fku_22.d = this.a;
                fku_22.e = n + this.f;
                fku_22.f = this.g;
            }
            this.e = 0;
            n2 = this.f + this.g;
            this.d += n2;
            this.f = 0;
            this.g = 0;
            return n2;
        }
    }

    public int b(fku_2 fku_22) {
        do {
            int n;
            if ((n = this.a(fku_22)) > 0) {
                return 1;
            }
            if (n != 0) continue;
            return 0;
        } while (this.e != 0);
        this.e = 1;
        return -1;
    }

    public int c() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        return 0;
    }

    public void d() {
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.c;
    }
}

