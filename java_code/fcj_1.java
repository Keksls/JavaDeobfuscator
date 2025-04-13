/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fCj
 */
public class fcj_1
extends fcb_1 {
    boolean e = true;
    boolean f = true;

    public fcj_1() {
        this.b = new ayo_2[1];
    }

    public ayo_2 q() {
        return this.b[0];
    }

    public void k(ayo_2 ayo_22) {
        this.b[0] = ayo_22;
    }

    public void c(boolean bl) {
        this.e = bl;
    }

    public void d(boolean bl) {
        this.f = bl;
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        int n = insets.left + insets2.left;
        int n2 = insets.right + insets2.right;
        int n3 = insets.top + insets2.top;
        int n4 = insets.bottom + insets2.bottom;
        int n5 = dimension.width - n - n2;
        int n6 = dimension.height - n3 - n4;
        this.c.c();
        if (this.b[0] != null) {
            int n7;
            int n8;
            int n9 = this.e ? this.b[0].e() : n5;
            int n10 = this.f ? this.b[0].d() : n6;
            float f2 = (float)n5 / (float)n9;
            float f3 = (float)n6 / (float)n10;
            int n11 = this.e ? n5 / n9 + (n5 % n9 > 0 ? 1 : 0) : (n8 = 1);
            int n12 = this.f ? n6 / n10 + (n6 % n10 > 0 ? 1 : 0) : 1;
            int n13 = n;
            int n14 = n7 = dimension.height - n3;
            this.a(n12 * n8);
            for (int k = 0; k < n12; ++k) {
                int n15 = n13;
                float f4 = k == n12 - 1 ? f3 - (float)k : 1.0f;
                for (int i2 = 0; i2 < n8; ++i2) {
                    float f5 = i2 == n8 - 1 ? f2 - (float)i2 : 1.0f;
                    this.a(n15, n14, (int)((float)n9 * f5), (int)((float)n10 * f4), f5, f4, this.b[0]);
                    n15 += n9;
                }
                n14 -= n10;
            }
            this.b();
        }
    }

    protected void a(int n, int n2, int n3, int n4, float f2, float f3, ayo_2 ayo_22) {
        if (n3 == 0 || n4 == 0 || ayo_22 == null || ayo_22.a() == null) {
            return;
        }
        float f4 = ayo_22.i() - ayo_22.h();
        float f5 = ayo_22.j() - ayo_22.k();
        float f6 = ayo_22.h() + f4 * (ayo_22.n().a() ? f3 : f2);
        float f7 = ayo_22.k() + f5 * (ayo_22.n().a() ? f2 : f3);
        this.a(n, n2, n3, n4, ayo_22, ayo_22.k(), ayo_22.h(), f7, f6);
    }
}

