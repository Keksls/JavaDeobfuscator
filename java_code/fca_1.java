/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fCa
 */
public class fca_1
extends fbt_2 {
    private boolean f = false;

    public void a(ayo_2 ayo_22, ayo_2 ayo_23, ayo_2 ayo_24, ayo_2 ayo_25, ayo_2 ayo_26, ayo_2 ayo_27, ayo_2 ayo_28, ayo_2 ayo_29, ayo_2 ayo_210, ayo_2 ayo_211, ayo_2 ayo_212, ayo_2 ayo_213, ayo_2 ayo_214, ayo_2 ayo_215, ayo_2 ayo_216, ayo_2 ayo_217, ayo_2 ayo_218) {
        this.b = new ayo_2[17];
        this.b[0] = ayo_22;
        this.b[1] = ayo_23;
        this.b[2] = ayo_24;
        this.b[3] = ayo_25;
        this.b[4] = ayo_26;
        this.b[5] = ayo_27;
        this.b[6] = ayo_28;
        this.b[7] = ayo_29;
        this.b[8] = ayo_210;
        this.b[9] = ayo_211;
        this.b[10] = ayo_212;
        this.b[11] = ayo_213;
        this.b[12] = ayo_214;
        this.b[13] = ayo_215;
        this.b[14] = ayo_216;
        this.b[15] = ayo_217;
        this.b[16] = ayo_218;
    }

    public void a(ayo_2 ayo_22) {
        this.b = new ayo_2[1];
        this.b[0] = ayo_22;
    }

    public void a(ayo_2[] ayo_2Array) {
        this.b = new ayo_2[17];
        this.b = ayo_2Array;
    }

    public boolean c() {
        return this.f;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        int n = insets.left + insets2.left + insets3.left;
        int n2 = insets.right + insets2.right + insets3.right;
        int n3 = insets.top + insets2.top + insets3.top;
        int n4 = insets.bottom + insets2.bottom + insets3.bottom;
        if (this.b.length == 1) {
            return;
        }
        this.c.c();
        this.a(this.b.length);
        for (int k = 0; k < this.b.length; ++k) {
            int n5 = this.a(n, n2, k);
            int n6 = this.b(n4, n3, k);
            int n7 = this.c(n, n2, k);
            int n8 = this.d(n4, n3, k);
            this.a(n5, n6, n7, n8, this.b[k]);
        }
        this.b();
    }

    private int a(int n, int n2, int n3) {
        if (n3 == 0 || n3 == 5 || n3 == 7 || n3 == 10 || n3 == 12) {
            return n;
        }
        if (n3 == 1 || n3 == 8 || n3 == 13) {
            return n + this.b[0].e();
        }
        if (n3 == 2 || n3 == 14) {
            return n + this.b[0].e() + this.b[1].e();
        }
        if (n3 == 3 || n3 == 15) {
            return n2 - this.b[3].e() - this.b[4].e();
        }
        if (n3 == 4 || n3 == 6 || n3 == 9 || n3 == 11 || n3 == 16) {
            return n2 - this.b[4].e();
        }
        assert (false) : "We should never end here";
        return n;
    }

    private int b(int n, int n2, int n3) {
        if (n3 == 0 || n3 == 1 || n3 == 2 || n3 == 3 || n3 == 4) {
            return n2;
        }
        if (n3 == 5 || n3 == 6 || n3 == 8) {
            return n2 - this.b[0].d();
        }
        if (n3 == 7 || n3 == 9) {
            return n2 - this.b[0].d() - this.b[5].d();
        }
        if (n3 == 10 || n3 == 11) {
            return n + this.b[10].e() + this.b[12].e();
        }
        if (n3 == 12 || n3 == 13 || n3 == 14 || n3 == 15 || n3 == 16) {
            return n + this.b[12].e();
        }
        assert (false) : "We should never end here";
        return n2;
    }

    private int c(int n, int n2, int n3) {
        if (n3 == 2 || n3 == 14) {
            return n2 - n - (this.b[0].e() + this.b[1].e() + this.b[3].e() + this.b[4].e());
        }
        if (n3 == 8 && this.f) {
            return n2 - n - (this.b[7].e() + this.b[9].e());
        }
        return this.b[n3].e();
    }

    private int d(int n, int n2, int n3) {
        if (n3 == 7 || n3 == 9) {
            return n2 - n - (this.b[0].d() + this.b[5].d() + this.b[10].d() + this.b[12].d());
        }
        if (n3 == 8 && this.f) {
            return n2 - n - (this.b[2].d() + this.b[14].d());
        }
        return this.b[n3].d();
    }
}

