/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fvh
 */
class fvh_0
implements fzu {
    final /* synthetic */ fvb_0 a;

    fvh_0(fvb_0 fvb_02) {
        this.a = fvb_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        ArrayList<fru_0> arrayList = this.a.q.get((int)this.a.r).b;
        for (int k = 0; k < arrayList.size(); ++k) {
            arrayList.get(k).setVisible(false);
        }
        this.a.r = (byte)(this.a.r == 0 ? this.a.q.size() - 1 : this.a.r - 1);
        fcs_1 fcs_12 = new fcs_1(this.a, this.a.r);
        fcs_12.onCheckOut();
        this.a.dispatchEvent(fcs_12);
        arrayList = this.a.q.get((int)this.a.r).b;
        for (int k = 0; k < arrayList.size(); ++k) {
            arrayList.get(k).setVisible(true);
        }
        this.a.invalidateMinSize();
        return true;
    }
}

