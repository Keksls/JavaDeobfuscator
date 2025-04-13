/*
 * Decompiled with CFR 0.152.
 */
public class fsM
extends ful_0 {
    public static final String TAG = "Label";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public String getStyleTag() {
        return "textWidget";
    }

    @Override
    public fqh_0 getAppearance() {
        return (fqh_0)this.m_appearance;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fqh_0 fqh_02 = fqh_0.checkOut();
        fqh_02.setWidget(this);
        this.add(fqh_02);
        this.setTextBuilder(new fxD(new fxO()));
        this.getTextBuilder().a(this);
        this.setMultiline(false);
    }
}

