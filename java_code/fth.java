/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

class fth
implements fzu {
    final /* synthetic */ fte_0 a;

    fth(fte_0 fte_02) {
        this.a = fte_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        fck_2 fck_22 = (fck_2)fzs2;
        if (!this.a.z) {
            return false;
        }
        this.a.r = true;
        int n = fck_22.a(this.a) - this.a.s.x;
        int n2 = fck_22.b(this.a) - this.a.s.y;
        int n3 = this.a.g + n;
        int n4 = this.a.h + n2;
        this.a.v = n;
        this.a.w = n2;
        this.a.setDeltaX(n3);
        this.a.setDeltaY(n4);
        this.a.s = new Point(fck_22.a(this.a), fck_22.b(this.a));
        return false;
    }
}

