/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLb
 */
public class flb_1 {
    private static final byte[] e = "vorbis".getBytes();
    private static final byte[] f = "Xiphophorus libVorbis I 20000508".getBytes();
    private static final int g = -130;
    public byte[][] a;
    public int[] b;
    public int c;
    public byte[] d;

    public void a() {
        this.a = null;
        this.c = 0;
        this.d = null;
    }

    public void a(String string) {
        this.a(string.getBytes());
    }

    private void a(byte[] byArray) {
        byte[][] byArrayArray = new byte[this.c + 2][];
        if (this.a != null) {
            System.arraycopy(this.a, 0, byArrayArray, 0, this.c);
        }
        this.a = byArrayArray;
        int[] nArray = new int[this.c + 2];
        if (this.b != null) {
            System.arraycopy(this.b, 0, nArray, 0, this.c);
        }
        this.b = nArray;
        byte[] byArray2 = new byte[byArray.length + 1];
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        this.a[this.c] = byArray2;
        this.b[this.c] = byArray.length;
        ++this.c;
        this.a[this.c] = null;
    }

    public void a(String string, String string2) {
        if (string2 == null) {
            string2 = "";
        }
        this.a(string + "=" + string2);
    }

    static boolean a(byte[] byArray, byte[] byArray2, int n) {
        for (int k = 0; k < n; ++k) {
            byte by = byArray[k];
            byte by2 = byArray2[k];
            if (90 >= by && by >= 65) {
                by = (byte)(by - 65 + 97);
            }
            if (90 >= by2 && by2 >= 65) {
                by2 = (byte)(by2 - 65 + 97);
            }
            if (by == by2) continue;
            return false;
        }
        return true;
    }

    public String b(String string) {
        return this.a(string, 0);
    }

    public String a(String string, int n) {
        int n2 = this.a(string.getBytes(), n);
        if (n2 == -1) {
            return null;
        }
        byte[] byArray = this.a[n2];
        for (int k = 0; k < this.b[n2]; ++k) {
            if (byArray[k] != 61) continue;
            return new String(byArray, k + 1, this.b[n2] - (k + 1));
        }
        return null;
    }

    private int a(byte[] byArray, int n) {
        int n2 = 0;
        int n3 = 0;
        int n4 = byArray.length + 1;
        byte[] byArray2 = new byte[n4];
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        byArray2[byArray.length] = 61;
        for (n2 = 0; n2 < this.c; ++n2) {
            if (!flb_1.a(this.a[n2], byArray2, n4)) continue;
            if (n == n3) {
                return n2;
            }
            ++n3;
        }
        return -1;
    }

    int a(fks_2 fks_22) {
        int n = fks_22.c(32);
        if (n < 0) {
            this.b();
            return -1;
        }
        this.d = new byte[n + 1];
        fks_22.a(this.d, n);
        this.c = fks_22.c(32);
        if (this.c < 0) {
            this.b();
            return -1;
        }
        this.a = new byte[this.c + 1][];
        this.b = new int[this.c + 1];
        for (int k = 0; k < this.c; ++k) {
            int n2 = fks_22.c(32);
            if (n2 < 0) {
                this.b();
                return -1;
            }
            this.b[k] = n2;
            this.a[k] = new byte[n2 + 1];
            fks_22.a(this.a[k], n2);
        }
        if (fks_22.c(1) != 1) {
            this.b();
            return -1;
        }
        return 0;
    }

    int b(fks_2 fks_22) {
        fks_22.a(3, 8);
        fks_22.a(e);
        fks_22.a(f.length, 32);
        fks_22.a(f);
        fks_22.a(this.c, 32);
        if (this.c != 0) {
            for (int k = 0; k < this.c; ++k) {
                if (this.a[k] != null) {
                    fks_22.a(this.b[k], 32);
                    fks_22.a(this.a[k]);
                    continue;
                }
                fks_22.a(0, 32);
            }
        }
        fks_22.a(1, 1);
        return 0;
    }

    public int a(fkt_2 fkt_22) {
        fks_2 fks_22 = new fks_2();
        fks_22.a();
        if (this.b(fks_22) != 0) {
            return -130;
        }
        fkt_22.a = new byte[fks_22.g()];
        fkt_22.b = 0;
        fkt_22.c = fks_22.g();
        System.arraycopy(fks_22.i(), 0, fkt_22.a, 0, fkt_22.c);
        fkt_22.d = 0;
        fkt_22.e = 0;
        fkt_22.f = 0L;
        return 0;
    }

    void b() {
        for (int k = 0; k < this.c; ++k) {
            this.a[k] = null;
        }
        this.a = null;
        this.d = null;
    }

    public String c() {
        return new String(this.d, 0, this.d.length - 1);
    }

    public String a(int n) {
        if (this.c <= n) {
            return null;
        }
        return new String(this.a[n], 0, this.a[n].length - 1);
    }

    public String toString() {
        String string = "Vendor: " + new String(this.d, 0, this.d.length - 1);
        for (int k = 0; k < this.c; ++k) {
            string = string + "\nComment: " + new String(this.a[k], 0, this.a[k].length - 1);
        }
        string = string + "\n";
        return string;
    }
}

