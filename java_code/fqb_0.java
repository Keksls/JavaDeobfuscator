/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fqB
 */
public class fqb_0
extends fqj_0 {
    public static final String TAG = "RadioButtonAppearance";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean o() {
        if (this.ag) {
            return false;
        }
        fim_1 fim_12 = this.I.getElementMap().f(((ftI)this.I).getGroupId());
        if (fim_12 == null) {
            return false;
        }
        fim_12.a(new fqC(this));
        return super.o();
    }

    public void p() {
        if (this.ag) {
            super.o();
        }
    }
}

