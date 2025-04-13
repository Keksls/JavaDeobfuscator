/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

class frG
implements fzu {
    final /* synthetic */ frB a;

    frG(frB frB2) {
        this.a = frB2;
    }

    @Override
    public boolean run(fzs fzs2) {
        fck_2 fck_22 = (fck_2)fzs2;
        Point point = this.a.getOrientedMouseCoodinates(fck_22);
        abo_2<fxH, fxF> abo_22 = this.a.getTextBuilder().b(point.x, -point.y);
        fxH fxH2 = abo_22.a();
        fxF fxF2 = abo_22.b();
        if (fxH2 != null) {
            int n = 0;
            switch (fxF2) {
                case a: 
                case b: {
                    n = 0;
                    break;
                }
                case c: {
                    n = fxH2.a(this.a.getTextBuilder().c(), point.x - fxH2.b() - fxH2.a().g());
                    break;
                }
                case d: 
                case e: {
                    n = fxH2.f();
                }
            }
            if (fck_22.y() % 2 != 0) {
                this.a.b(fxH2, n);
            }
        }
        return false;
    }
}

