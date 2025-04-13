/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJb
 */
class bjb_2
extends fdc_2 {
    final /* synthetic */ bja_2 a;

    bjb_2(bja_2 bja_22) {
        this.a = bja_22;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (fzs2 == null || fzs2 instanceof fck_2 && ((fck_2)fzs2).x() == 3) {
            dei.a().b(this);
            fta_0.getInstance().removeEventListener(frd_0.B, this, true);
            fyt_0.a().c();
        }
        return false;
    }
}

