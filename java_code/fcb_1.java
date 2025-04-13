/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fCb
 */
public class fcb_1
extends fbt_2 {
    private boolean e = false;
    private boolean f = false;

    public fcb_1() {
        this.b = new ayo_2[9];
    }

    public boolean c() {
        return this.e;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public boolean d() {
        return this.f;
    }

    public void b(boolean bl) {
        this.f = bl;
    }

    public ayo_2 e() {
        return this.b[5];
    }

    public void a(ayo_2 ayo_22) {
        this.b[5] = ayo_22;
    }

    public ayo_2 f() {
        return this.b[1];
    }

    public void b(ayo_2 ayo_22) {
        this.b[1] = ayo_22;
    }

    public ayo_2 j() {
        return this.b[2];
    }

    public void c(ayo_2 ayo_22) {
        this.b[2] = ayo_22;
    }

    public ayo_2 k() {
        return this.b[0];
    }

    public void d(ayo_2 ayo_22) {
        this.b[0] = ayo_22;
    }

    public ayo_2 l() {
        return this.b[7];
    }

    public void e(ayo_2 ayo_22) {
        this.b[7] = ayo_22;
    }

    public ayo_2 m() {
        return this.b[8];
    }

    public void f(ayo_2 ayo_22) {
        this.b[8] = ayo_22;
    }

    public ayo_2 n() {
        return this.b[6];
    }

    public void g(ayo_2 ayo_22) {
        this.b[6] = ayo_22;
    }

    public ayo_2 o() {
        return this.b[3];
    }

    public void h(ayo_2 ayo_22) {
        this.b[3] = ayo_22;
    }

    public ayo_2 p() {
        return this.b[4];
    }

    public void i(ayo_2 ayo_22) {
        this.b[4] = ayo_22;
    }

    public void a(ayo_2 ayo_22, ayo_2 ayo_23, ayo_2 ayo_24, ayo_2 ayo_25, ayo_2 ayo_26, ayo_2 ayo_27, ayo_2 ayo_28, ayo_2 ayo_29, ayo_2 ayo_210) {
        this.b[0] = ayo_22;
        this.b[1] = ayo_23;
        this.b[2] = ayo_24;
        this.b[3] = ayo_25;
        this.b[4] = ayo_26;
        this.b[5] = ayo_27;
        this.b[6] = ayo_28;
        this.b[7] = ayo_29;
        this.b[8] = ayo_210;
    }

    public void j(ayo_2 ayo_22) {
        this.b[4] = ayo_22;
    }

    public void a(ayo_2[] ayo_2Array) {
        this.b[0] = ayo_2Array[0];
        this.b[1] = ayo_2Array[1];
        this.b[2] = ayo_2Array[2];
        this.b[3] = ayo_2Array[3];
        this.b[4] = ayo_2Array[4];
        this.b[5] = ayo_2Array[5];
        this.b[6] = ayo_2Array[6];
        this.b[7] = ayo_2Array[7];
        this.b[8] = ayo_2Array[8];
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        int n = insets.left + insets2.left;
        int n2 = insets.right + insets2.right;
        int n3 = insets.top + insets2.top;
        int n4 = insets.bottom + insets2.bottom;
        this.c.c();
        if (this.b[0] == null) {
            this.a(dimension, n, n2, n3, n4);
            return;
        }
        if (this.f) {
            this.b(dimension, insets);
        } else {
            this.a(dimension, insets);
        }
    }

    private void a(Dimension dimension, Insets insets) {
        int[] nArray = new int[3];
        int[] nArray2 = new int[3];
        int[] nArray3 = new int[3];
        int[] nArray4 = new int[3];
        int n = insets.left;
        int n2 = dimension.height - insets.top;
        nArray[0] = this.b[0].e();
        nArray[2] = this.b[2].e();
        nArray[1] = dimension.width - (nArray[0] + nArray[2] + insets.left + insets.right);
        nArray2[0] = this.b[0].d();
        nArray2[2] = this.b[6].d();
        nArray2[1] = dimension.height - (nArray2[0] + nArray2[2] + insets.top + insets.bottom);
        nArray3[0] = n;
        nArray3[1] = nArray3[0] + nArray[0];
        nArray3[2] = nArray3[1] + nArray[1];
        nArray4[0] = n2;
        nArray4[1] = nArray4[0] - nArray2[0];
        nArray4[2] = nArray4[1] - nArray2[1];
        this.a(9);
        for (int k = 0; k < 3; ++k) {
            for (int i2 = 0; i2 < 3; ++i2) {
                if (k == 1 && i2 == 1 && !this.e) {
                    ayo_2 ayo_22 = this.b[k * 3 + i2];
                    int n3 = n + (dimension.width - (insets.left + insets.right) - ayo_22.e()) / 2;
                    int n4 = n2 - (dimension.height - (insets.top + insets.bottom) + ayo_22.d()) / 2;
                    this.a(n3, n4, ayo_22.e(), ayo_22.d(), ayo_22);
                    continue;
                }
                this.a(nArray3[i2], nArray4[k], nArray[i2], nArray2[k], this.b[k * 3 + i2]);
            }
        }
        this.b();
    }

    private void a(Dimension dimension, int n, int n2, int n3, int n4) {
        if (this.e) {
            int n5 = dimension.width - n2 - n;
            int n6 = dimension.height - n3 - n4;
            this.a(1);
            this.a(n, dimension.height - n3, n5, n6, this.b[4]);
            this.b();
        } else if (this.b[4] != null) {
            int n7 = this.b[4].e();
            int n8 = this.b[4].d();
            int n9 = (dimension.width - n2 - n - n7) / 2;
            int n10 = (dimension.height - n3 - n4 - n8) / 2;
            this.a(1);
            this.a(n + n9, dimension.height - n3 - n10, n7, n8, this.b[4]);
            this.b();
        }
    }

    private void b(Dimension dimension, Insets insets) {
        int[] nArray = new int[3];
        int[] nArray2 = new int[3];
        int[] nArray3 = new int[3];
        int[] nArray4 = new int[3];
        nArray[0] = this.b[0].e();
        nArray[2] = this.b[2].e();
        nArray[1] = Math.max(dimension.width - (nArray[0] + nArray[2] + insets.left + insets.right), -nArray[0]);
        nArray2[0] = this.b[0].d();
        nArray2[2] = this.b[6].d();
        nArray2[1] = Math.max(dimension.height - (nArray2[0] + nArray2[2] + insets.top + insets.bottom), -nArray2[0]);
        if (!this.e) {
            if (this.b[1].e() > 0) {
                nArray[1] = nArray[1] - nArray[1] % this.b[1].e();
            }
            if (this.b[3].d() > 0) {
                nArray2[1] = nArray2[1] - nArray2[1] % this.b[3].d();
            }
        }
        nArray3[0] = insets.left;
        nArray3[1] = nArray3[0] + nArray[0];
        nArray3[2] = nArray3[1] + nArray[1];
        nArray4[0] = dimension.height - insets.top;
        nArray4[1] = nArray4[0] - nArray2[0];
        nArray4[2] = nArray4[1] - nArray2[1];
        int n = nArray2[1] > 0 && this.b[5].d() > 0 ? nArray2[1] / this.b[5].d() : 0;
        int n2 = nArray2[1] > 0 && this.b[3].d() > 0 ? nArray2[1] / this.b[3].d() : 0;
        int n3 = nArray[1] > 0 && this.b[1].e() > 0 ? nArray[1] / this.b[1].e() : 0;
        int n4 = nArray[1] > 0 && this.b[7].e() > 0 ? nArray[1] / this.b[7].e() : 0;
        int n5 = 5 + n + n2 + n3 + n4;
        this.a(n5);
        this.a(nArray3[0], nArray4[0], nArray[0], nArray2[0], this.b[0]);
        this.b(n3, nArray3[1], nArray4[0], this.b[1].e(), nArray2[0], this.b[1]);
        this.a(nArray3[2], nArray4[0], nArray[2], nArray2[0], this.b[2]);
        this.a(n2, nArray3[0], nArray4[1], nArray[0], this.b[3].d(), this.b[3]);
        this.a(nArray3[1], nArray4[1], nArray[1], nArray2[1], this.b[4]);
        this.a(n, nArray3[2], nArray4[1], nArray[2], this.b[5].d(), this.b[5]);
        this.a(nArray3[0], nArray4[2], nArray[0], nArray2[2], this.b[6]);
        this.b(n4, nArray3[1], nArray4[2], this.b[7].e(), nArray2[2], this.b[7]);
        this.a(nArray3[2], nArray4[2], nArray[2], nArray2[2], this.b[8]);
        this.b();
    }

    private void a(int n, int n2, int n3, int n4, int n5, ayo_2 ayo_22) {
        int n6 = n3;
        for (int k = 0; k < n; ++k) {
            this.a(n2, n6, n4, n5, ayo_22);
            n6 -= n5;
        }
    }

    private void b(int n, int n2, int n3, int n4, int n5, ayo_2 ayo_22) {
        int n6 = n2;
        for (int k = 0; k < n; ++k) {
            this.a(n6, n3, n4, n5, ayo_22);
            n6 += n4;
        }
    }
}

