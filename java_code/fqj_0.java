/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fqJ
 */
public class fqj_0
extends fqd_0 {
    public static final String TAG = "ToggleButtonAppearance";
    public static final String ac = fqp_0.b.c();
    public static final String ad = fqp_0.d.c();
    public static final String ae = fqp_0.h.c();
    public static final String af = fqp_0.f.c();
    protected boolean ag;

    @Override
    public String getTag() {
        return TAG;
    }

    public boolean isChecked() {
        return this.ag;
    }

    public boolean o() {
        this.ag = !this.ag;
        fcp_2 fcp_22 = new fcp_2(this.I, this.ag);
        boolean bl = this.I.dispatchEvent(fcp_22);
        this.g();
        return bl;
    }

    @Override
    protected void h() {
        if (this.ag) {
            this.setEnabled(this.getEnableLabel(), true);
        } else {
            super.h();
        }
    }

    private String getEnableLabel() {
        if (!this.i) {
            return ad;
        }
        if (!this.h) {
            return ac;
        }
        if (!this.g) {
            return ae;
        }
        return af;
    }

    @Override
    public void prepareRender() {
        this.ag = false;
        this.g();
    }

    @Override
    public void copyElement(fyo fyo2) {
        fqj_0 fqj_02 = (fqj_0)fyo2;
        super.copyElement(fqj_02);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.ag = false;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.ag = false;
    }
}

