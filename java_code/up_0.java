/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from UP
 */
public class up_0 {
    private int c = 0;
    private int d = -1;
    private byte e = (byte)-1;
    private boolean f = true;
    public final int[] a = new int[32];

    public up_0() {
    }

    public up_0(int n, byte by, int n2, boolean bl) {
        this.e = by;
        this.c = n;
        this.d = n2;
        this.f = bl;
    }

    public final int a() {
        return this.c;
    }

    public final void a(int n, byte by, int n2, boolean bl) {
        this.c = n;
        this.d = n2;
        this.e = by;
        this.f = bl;
    }

    public final int b() {
        return this.d;
    }

    public byte c() {
        return this.e;
    }

    public final int a(int n, int n2, int n3, ys_0[] ys_0Array, int n4, int n5, ys_0[] ys_0Array2) {
        assert (this.c > 0) : "no moverHeight defined";
        assert (this.d >= 0) : "no jump capacity defined";
        assert (ys_0Array != null && ys_0Array2 != null) : "startCellData and nextCellData can't be null";
        assert (n2 >= 0 && n3 > 0 && n2 + n3 < ys_0Array.length) : "startCell indexes out of bounds";
        assert (n4 >= 0 && n5 > 0 && n4 + n5 < ys_0Array2.length) : "nextCell indexes out of bounds";
        assert (n >= n2 && n < n2 + n3) : "startCellIndex out of bounds";
        assert (yu_0.a(n, n2, n3, ys_0Array, this.c)) : "incoming position is not valid : " + ys_0Array[n].a + "," + ys_0Array[n].b + ", " + ys_0Array[n].c;
        ys_0 ys_02 = ys_0Array[n];
        if (n5 == 1) {
            ys_0 ys_03 = ys_0Array2[n4];
            if (ys_03.z == -1 || ys_03.e) {
                return 0;
            }
            int n6 = ys_03.c - ys_02.c;
            if (!(this.f && ys_02.m() && ys_03.m() || (n6 < 0 ? -n6 : n6) <= this.d)) {
                return 0;
            }
            if (!up_0.a(ys_02, ys_03)) {
                return 0;
            }
            if (n6 <= 0) {
                this.a[0] = n4;
                return 1;
            }
            if (n == n2 + n3 - 1) {
                this.a[0] = n4;
                return 1;
            }
            int n7 = ys_03.c + this.c;
            for (int k = n + 1; k < n2 + n3; ++k) {
                ys_0 ys_04 = ys_0Array[k];
                if (ys_04.c - ys_04.d >= n7) {
                    this.a[0] = n4;
                    return 1;
                }
                if (ys_04.e) continue;
                return 0;
            }
            this.a[0] = n4;
            return 1;
        }
        int n8 = 0;
        block1: for (int k = n4; k < n4 + n5; ++k) {
            ys_0 ys_05 = ys_0Array2[k];
            if (ys_05.z == -1 || ys_05.e) continue;
            int n9 = ys_05.c - ys_02.c;
            if ((!this.f || !ys_02.m() || !ys_05.m()) && (n9 < 0 ? -n9 : n9) > this.d || !up_0.a(ys_02, ys_05)) continue;
            int n10 = ys_05.c + this.c;
            int n11 = Math.max(n10, ys_02.c + this.c);
            block2: for (int i2 = k + 1; i2 < n4 + n5; ++i2) {
                ys_0 ys_06 = ys_0Array2[i2];
                int n12 = ys_06.c - ys_06.d;
                if (n12 >= n11) {
                    if (n9 <= 0 || n == n2 + n3 - 1) break;
                    for (int i3 = n + 1; i3 < n2 + n3; ++i3) {
                        ys_0 ys_07 = ys_0Array[i3];
                        if (ys_07.c - ys_07.d >= n10) break block2;
                        if (!ys_05.e) continue block1;
                    }
                }
                if (!ys_06.e) continue block1;
            }
            this.a[n8++] = k;
        }
        return n8;
    }

    public final boolean a(int n, int n2, int n3, ys_0[] ys_0Array, int n4, int n5, int n6, ys_0[] ys_0Array2) {
        int n7 = this.a(n, n2, n3, ys_0Array, n5, n6, ys_0Array2);
        if (n7 == 0) {
            return false;
        }
        for (int k = 0; k < n7; ++k) {
            if (this.a[k] != n4) continue;
            return true;
        }
        return false;
    }

    public static boolean a(ys_0 ys_02, ys_0 ys_03) {
        int n;
        assert (ys_02 != null) : "Can't check murfin movement validity for null cell";
        assert (ys_03 != null) : "Can't check murfin movement validity for null cell";
        int n2 = ys_02.d();
        if (n2 == (n = ys_03.d())) {
            return true;
        }
        if (!up_0.a(ys_02.e(), ys_03.e())) {
            return false;
        }
        if (ys_02.f() == ys_03.f()) {
            return true;
        }
        int n3 = ys_02.c();
        int n4 = ys_03.c();
        switch (n3) {
            case 0: {
                return n4 == 0 || n4 == 64;
            }
            case 128: {
                return ys_02.g() == ys_03.g() && (n4 == 128 || n4 == 192);
            }
            case 64: {
                return n4 == 0 || n4 == 64 || n4 == 192 && ys_02.g() == ys_03.g();
            }
            case 192: {
                return ys_02.g() == ys_03.g() && (n4 == 64 || n4 == 128 || n4 == 192);
            }
        }
        assert (false) : "Type de Cellule non connu poru valider un murfin : " + n3;
        return false;
    }

    private static boolean a(int n, int n2) {
        if (n == n2) {
            return true;
        }
        return (n | n2) == 48;
    }
}

