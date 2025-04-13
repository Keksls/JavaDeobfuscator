/*
 * Decompiled with CFR 0.152.
 */
class cHY
implements fjv_2 {
    final /* synthetic */ fup_0 a;
    final /* synthetic */ fjg_2 b;

    cHY(fup_0 fup_02, fjg_2 fjg_22) {
        this.a = fup_02;
        this.b = fjg_22;
    }

    @Override
    public void onTweenEvent(fjg_2 fjg_22, fju_2 fju_22) {
        switch (fju_22) {
            case a: {
                cht_0.e = false;
                this.a.setSelected(false);
                this.b.b(this);
            }
        }
    }
}

