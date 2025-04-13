/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

class cKn
implements fkd_1 {
    final /* synthetic */ fso a;
    final /* synthetic */ cks_2 b;
    final /* synthetic */ fvk_0 c;

    cKn(fso fso2, cks_2 cks_22, fvk_0 fvk_02) {
        this.a = fso2;
        this.b = cks_22;
        this.c = fvk_02;
    }

    @Override
    public void a() {
        int n = this.a.getWidth() / 2;
        int n2 = Math.max(0, Math.min(this.b.getWidth() - this.a.getWidth(), cKl.j - n));
        int n3 = Math.min(this.b.getHeight() - this.a.getHeight(), cKl.k + 15);
        this.a.setPosition(new Point(n2, n3));
        this.a.setVisible(true);
        this.c.b(this);
        cdw_0.n().c(600072L);
    }
}

