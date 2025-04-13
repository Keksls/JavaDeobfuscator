/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

class frF
implements fzu {
    final /* synthetic */ frB a;

    frF(frB frB2) {
        this.a = frB2;
    }

    @Override
    public boolean run(fzs fzs2) {
        Point point = this.a.getOrientedMouseCoodinates((fck_2)fzs2);
        abo_2<fxH, fxF> abo_22 = this.a.getTextBuilder().b(point.x, -point.y);
        fxH fxH2 = abo_22.a();
        if (fxH2 != null) {
            int n = 0;
            switch (abo_22.b()) {
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
            this.a.a(fxH2, n);
        }
        return false;
    }
}

