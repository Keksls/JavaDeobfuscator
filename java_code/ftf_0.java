/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from ftf
 */
class ftf_0
implements fzu {
    final /* synthetic */ fte_0 a;

    ftf_0(fte_0 fte_02) {
        this.a = fte_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        fck_2 fck_22 = (fck_2)fzs2;
        this.a.s = new Point(fck_22.a(this.a), fck_22.b(this.a));
        this.a.removeTweensOfType(ftk_0.class);
        this.a.r = false;
        return false;
    }
}

