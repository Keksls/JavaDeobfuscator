/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fuP
 */
public class fup_0
extends fru_0 {
    public static final String TAG = "CheckBox";
    public static final String y = "ToggleButton";
    protected fzu z;
    protected boolean A = true;
    public static final int B = 1191572123;
    public static final int C = -607653549;

    @Override
    public String getTag() {
        return TAG;
    }

    public void setSelected(boolean bl) {
        fqj_0 fqj_02 = this.getAppearance();
        if (fqj_02 != null && bl != fqj_02.isChecked()) {
            fqj_02.o();
        }
    }

    public boolean getSelected() {
        return this.getAppearance().isChecked();
    }

    public void setOverrideClickSound(boolean bl) {
        this.A = bl;
    }

    @Override
    public void setClickSoundId(int n) {
        super.setClickSoundId(n);
        this.A = false;
    }

    @Override
    public fqj_0 getAppearance() {
        return (fqj_0)this.m_appearance;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return fqj2 instanceof fqj_0;
    }

    @Override
    public void b() {
        super.b();
        this.z = new fuQ(this);
        this.addEventListener(frd_0.C, this.z, true);
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        ((fup_0)fyo2).A = this.A;
        ((fup_0)fyo2).removeEventListener(frd_0.C, this.z, true);
    }

    @Override
    protected void processEventForSound(fzs fzs2, boolean bl) {
        if (this.A) {
            switch (fzs2.f()) {
                case C: 
                case D: 
                case j: 
                case k: {
                    return;
                }
            }
        }
        super.processEventForSound(fzs2, bl);
    }

    @Override
    public void prepareRender() {
        super.prepareRender();
        this.getAppearance().prepareRender();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.z = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.A = true;
        fqj_0 fqj_02 = new fqj_0();
        fqj_02.onCheckOut();
        fqj_02.setWidget(this);
        this.add(fqj_02);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1191572123) {
            this.setSelected(Co.a(string));
        } else if (n == -607653549) {
            this.setOverrideClickSound(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 1191572123) {
            return super.setPropertyAttribute(n, object);
        }
        this.setSelected(Co.b(object));
        return true;
    }
}

