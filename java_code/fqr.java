/*
 * Decompiled with CFR 0.152.
 */
public class fqr
extends fqj
implements fqf_0 {
    public static final String TAG = "ListAppearance";
    public static final String a = "selection";
    private azj_2 b;

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
        if (fyb_02 instanceof fqg_0) {
            this.setColor(((fqg_0)fyb_02).getColor(), null);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setColor(azj_2 azj_22, String string) {
        if (string == null || string.equalsIgnoreCase(a)) {
            this.b = azj_22;
            if (this.I instanceof fsQ) {
                ((fsQ)this.I).setMouseOverColor(this.b);
                ((fsQ)this.I).setSelectedColor(this.b);
            }
        } else {
            super.setColor(azj_22, string);
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.b = null;
    }
}

