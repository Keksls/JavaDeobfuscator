/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fCc
 */
public class fcc_1
extends fbu_1 {
    private final ayo_2[] h = new ayo_2[16];
    private boolean i;

    public void a(ayo_2 ayo_22, frk_0 frk_02) {
        switch (frk_02) {
            case a: {
                this.h[0] = ayo_22;
                break;
            }
            case b: {
                this.h[1] = ayo_22;
                break;
            }
            case c: {
                this.h[2] = ayo_22;
                break;
            }
            case d: {
                this.h[3] = ayo_22;
                break;
            }
            case e: {
                this.h[4] = ayo_22;
                break;
            }
            case f: {
                this.h[5] = ayo_22;
                break;
            }
            case g: {
                this.h[6] = ayo_22;
                break;
            }
            case h: {
                this.h[7] = ayo_22;
                break;
            }
            case j: {
                this.h[8] = ayo_22;
                break;
            }
            case k: {
                this.h[9] = ayo_22;
                break;
            }
            case l: {
                this.h[10] = ayo_22;
                break;
            }
            case m: {
                this.h[11] = ayo_22;
                break;
            }
            case n: {
                this.h[12] = ayo_22;
                break;
            }
            case o: {
                this.h[13] = ayo_22;
                break;
            }
            case p: {
                this.h[14] = ayo_22;
                break;
            }
            case q: {
                this.h[15] = ayo_22;
            }
        }
        this.e();
    }

    public void a(ayo_2 ayo_22, ayo_2 ayo_23, ayo_2 ayo_24, ayo_2 ayo_25, ayo_2 ayo_26, ayo_2 ayo_27, ayo_2 ayo_28, ayo_2 ayo_29, ayo_2 ayo_210, ayo_2 ayo_211, ayo_2 ayo_212, ayo_2 ayo_213, ayo_2 ayo_214, ayo_2 ayo_215, ayo_2 ayo_216, ayo_2 ayo_217) {
        this.h[0] = ayo_22;
        this.h[1] = ayo_23;
        this.h[2] = ayo_24;
        this.h[3] = ayo_25;
        this.h[4] = ayo_26;
        this.h[5] = ayo_27;
        this.h[6] = ayo_28;
        this.h[7] = ayo_29;
        this.h[8] = ayo_210;
        this.h[9] = ayo_211;
        this.h[10] = ayo_212;
        this.h[11] = ayo_213;
        this.h[12] = ayo_214;
        this.h[13] = ayo_215;
        this.h[14] = ayo_216;
        this.h[15] = ayo_217;
        this.e();
    }

    public void a(ayo_2[] ayo_2Array) {
        this.h[0] = ayo_2Array[0];
        this.h[1] = ayo_2Array[1];
        this.h[2] = ayo_2Array[2];
        this.h[3] = ayo_2Array[3];
        this.h[4] = ayo_2Array[4];
        this.h[5] = ayo_2Array[5];
        this.h[6] = ayo_2Array[6];
        this.h[7] = ayo_2Array[7];
        this.h[8] = ayo_2Array[8];
        this.h[9] = ayo_2Array[9];
        this.h[10] = ayo_2Array[10];
        this.h[11] = ayo_2Array[11];
        this.h[12] = ayo_2Array[12];
        this.h[13] = ayo_2Array[13];
        this.h[14] = ayo_2Array[14];
        this.h[15] = ayo_2Array[15];
        this.e();
    }

    public final boolean d() {
        return this.i;
    }

    public void b(Insets insets) {
        if (insets != null) {
            insets.top = Math.max(this.h[0].d(), Math.max(this.h[2].d(), Math.max(this.h[4].d(), Math.max(this.h[1].d(), this.h[3].d()))));
            insets.bottom = Math.max(this.h[11].d(), Math.max(this.h[13].d(), Math.max(this.h[15].d(), Math.max(this.h[12].d(), this.h[14].d()))));
            insets.left = Math.max(this.h[0].e(), Math.max(this.h[7].e(), Math.max(this.h[11].e(), Math.max(this.h[5].e(), this.h[9].e()))));
            insets.right = Math.max(this.h[4].e(), Math.max(this.h[8].e(), Math.max(this.h[15].e(), Math.max(this.h[6].e(), this.h[10].e()))));
        }
    }

    @Override
    public final void h() {
        this.e.u();
        this.e = null;
    }

    @Override
    public final void i() {
        this.e();
        assert (this.e == null);
        this.e = (Entity3D)Entity3D.c.d();
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        if (!this.i) {
            return;
        }
        this.e.c();
        this.a(this.h.length);
        for (int k = 0; k < this.h.length; ++k) {
            int n = this.a(dimension, insets, insets2, k);
            int n2 = this.b(dimension, insets, insets2, k);
            int n3 = this.c(dimension, insets, insets2, k);
            int n4 = this.d(dimension, insets, insets2, k);
            this.a(n, n2, n3, n4, this.h[k]);
        }
        this.c();
    }

    private int a(Dimension dimension, Insets insets, Insets insets2, int n) {
        if (n == 0 || n == 5 || n == 7 || n == 9 || n == 11) {
            return insets.left;
        }
        if (n == 1 || n == 12) {
            return insets.left + insets2.left;
        }
        if (n == 2 || n == 13) {
            return insets.left + insets2.left + this.h[n - 1].e();
        }
        if (n == 3 || n == 14) {
            return dimension.width - insets.left - insets.right - insets2.right - this.h[n].e();
        }
        if (n == 4 || n == 6 || n == 8 || n == 10 || n == 15) {
            return dimension.width - insets.left - insets.right - insets2.right;
        }
        assert (false) : "We should never end here";
        return 0;
    }

    private int b(Dimension dimension, Insets insets, Insets insets2, int n) {
        if (n == 0 || n == 1 || n == 2 || n == 3 || n == 4) {
            return dimension.height - insets.top;
        }
        if (n == 5 || n == 6) {
            return dimension.height - (insets.top + insets2.top);
        }
        if (n == 7 || n == 8) {
            return dimension.height - (insets.top + insets2.top + this.h[n - 2].d());
        }
        if (n == 9 || n == 10) {
            return insets.bottom + insets2.bottom + this.h[n].d();
        }
        if (n == 11 || n == 12 || n == 13 || n == 14 || n == 15) {
            return insets.bottom + insets2.bottom;
        }
        assert (false) : "We should never end here";
        return 0;
    }

    private int c(Dimension dimension, Insets insets, Insets insets2, int n) {
        if (n == 0 || n == 5 || n == 7 || n == 9 || n == 11) {
            return insets2.left;
        }
        if (n == 1 || n == 12) {
            return this.h[n].e();
        }
        if (n == 2) {
            return dimension.width - insets.left - insets.right - insets2.left - insets2.right - this.h[1].e() - this.h[3].e();
        }
        if (n == 13) {
            return dimension.width - insets.left - insets.right - insets2.left - insets2.right - this.h[12].e() - this.h[14].e();
        }
        if (n == 3 || n == 14) {
            return this.h[n].e();
        }
        if (n == 4 || n == 6 || n == 8 || n == 10 || n == 15) {
            return insets2.right;
        }
        assert (false) : "We should never end here";
        return 0;
    }

    private int d(Dimension dimension, Insets insets, Insets insets2, int n) {
        if (n == 0 || n == 1 || n == 2 || n == 3 || n == 4) {
            return insets2.top;
        }
        if (n == 5 || n == 6) {
            return this.h[n].d();
        }
        if (n == 7) {
            return dimension.height - insets.top - insets.bottom - insets2.top - insets2.bottom - this.h[5].d() - this.h[9].d();
        }
        if (n == 8) {
            return dimension.height - insets.top - insets.bottom - insets2.top - insets2.bottom - this.h[6].d() - this.h[10].d();
        }
        if (n == 9 || n == 10) {
            return this.h[n].d();
        }
        if (n == 11 || n == 12 || n == 13 || n == 14 || n == 15) {
            return insets2.bottom;
        }
        assert (false) : "We should never end here";
        return 0;
    }

    private void e() {
        for (int k = this.h.length - 1; k >= 0; --k) {
            if (this.h[k] != null) continue;
            this.i = false;
            return;
        }
        this.i = true;
    }
}

