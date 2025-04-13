/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fqc
 */
public class fqc_0
extends fqj {
    public static final String TAG = "appearanceContainer";
    private fqj b;
    private String c;
    public static final int a = -1618432855;

    public String getIdentifier() {
        return this.c;
    }

    public void setIdentifier(String string) {
        this.c = string;
    }

    public fqj getInnerAppearance() {
        return this.b;
    }

    @Override
    public void setWidget(fvE fvE2) {
        l.warn((Object)String.format("%s(%s) has been set as a Widget, that's not its purpose. What happened ?", this, this.getClass()));
        super.setWidget(fvE2);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqj) {
            this.b = (fqj)fyb_02;
        }
        super.add(fyb_02);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.c = null;
        if (this.b != null) {
            this.b.destroySelfFromParent();
            this.b = null;
        }
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fqc_0 fqc_02 = (fqc_0)fyo2;
        fqc_02.c = this.c;
        fqc_02.b = this.b != null ? (fqj)this.b.cloneElementStructure() : null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        switch (n) {
            case -1618432855: {
                this.setIdentifier(string);
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fze2);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case -1618432855: {
                this.setIdentifier(String.valueOf(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

