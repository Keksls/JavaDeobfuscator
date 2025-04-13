/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bII
 */
class bii_1
extends fdc_2 {
    final /* synthetic */ bih_1 a;

    bii_1(bih_1 bih_12) {
        this.a = bih_12;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (fzs2 == null || fzs2 instanceof fck_2 && ((fck_2)fzs2).x() == 3) {
            dei.a().b(this);
            fta_0.getInstance().removeEventListener(frd_0.B, this, true);
        }
        return false;
    }
}

