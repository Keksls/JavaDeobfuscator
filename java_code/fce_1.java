/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fCe
 */
public class fce_1
extends fbu_1 {
    public fce_1() {
        this.c = new ayo_2[8];
    }

    @Override
    public void a(Insets insets) {
    }

    public ayo_2 d() {
        return this.c[4];
    }

    public void a(ayo_2 ayo_22) {
        this.c[4] = ayo_22;
        this.p();
    }

    public ayo_2 e() {
        return this.c[1];
    }

    public void b(ayo_2 ayo_22) {
        this.c[1] = ayo_22;
        this.p();
    }

    public ayo_2 f() {
        return this.c[2];
    }

    public void c(ayo_2 ayo_22) {
        this.c[2] = ayo_22;
        this.p();
    }

    public ayo_2 j() {
        return this.c[0];
    }

    public void d(ayo_2 ayo_22) {
        this.c[0] = ayo_22;
        this.p();
    }

    public ayo_2 k() {
        return this.c[6];
    }

    public void e(ayo_2 ayo_22) {
        this.c[6] = ayo_22;
        this.p();
    }

    public ayo_2 l() {
        return this.c[7];
    }

    public void f(ayo_2 ayo_22) {
        this.c[7] = ayo_22;
        this.p();
    }

    public ayo_2 m() {
        return this.c[5];
    }

    public void g(ayo_2 ayo_22) {
        this.c[5] = ayo_22;
        this.p();
    }

    public ayo_2 n() {
        return this.c[3];
    }

    public void h(ayo_2 ayo_22) {
        this.c[3] = ayo_22;
        this.p();
    }

    public void a(ayo_2 ayo_22, ayo_2 ayo_23, ayo_2 ayo_24, ayo_2 ayo_25, ayo_2 ayo_26, ayo_2 ayo_27, ayo_2 ayo_28, ayo_2 ayo_29) {
        this.c[0] = ayo_22;
        this.c[1] = ayo_23;
        this.c[2] = ayo_24;
        this.c[3] = ayo_25;
        this.c[4] = ayo_26;
        this.c[5] = ayo_27;
        this.c[6] = ayo_28;
        this.c[7] = ayo_29;
        this.p();
    }

    public boolean o() {
        return this.d;
    }

    public void b(Insets insets) {
        if (insets != null) {
            insets.top = Math.max(this.c[0].d(), Math.max(this.c[1].d(), this.c[2].d()));
            insets.bottom = Math.max(this.c[5].d(), Math.max(this.c[6].d(), this.c[7].d()));
            insets.left = Math.max(this.c[0].e(), Math.max(this.c[3].e(), this.c[5].e()));
            insets.right = Math.max(this.c[2].e(), Math.max(this.c[4].e(), this.c[7].e()));
        }
    }

    private void p() {
        for (int k = this.c.length - 1; k >= 0; --k) {
            if (this.c[k] != null) continue;
            this.d = false;
            return;
        }
        this.d = true;
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        int n = insets.left + insets2.left;
        int n2 = insets.right + insets2.right;
        int n3 = insets.top + insets2.top;
        int n4 = insets.bottom + insets2.bottom;
        this.e.c();
        int[] nArray = new int[3];
        int[] nArray2 = new int[3];
        int n5 = insets.left;
        int n6 = dimension.height - insets.top;
        nArray[0] = insets2.left;
        nArray[1] = dimension.width - n - n2;
        nArray[2] = insets2.right;
        nArray2[0] = insets2.top;
        nArray2[1] = dimension.height - n3 - n4;
        nArray2[2] = insets2.bottom;
        int n7 = n6;
        int n8 = 0;
        this.a(9);
        for (int k = 0; k < 3; ++k) {
            int n9 = n5;
            for (int i2 = 0; i2 < 3; ++i2) {
                if (i2 != 1 || k != 1) {
                    this.a(n9, n7, nArray[i2], nArray2[k], this.c[n8]);
                    ++n8;
                }
                n9 += nArray[i2];
            }
            n7 -= nArray2[k];
        }
        this.c();
    }
}

