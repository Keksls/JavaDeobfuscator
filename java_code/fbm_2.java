/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBm
 */
public abstract class fbm_2
extends fbk_1
implements fbj_1 {
    protected String r = null;
    public static final int s = 102727412;
    public static final int t = 109757585;

    @Override
    public void setLabel(String string) {
        this.r = string;
    }

    @Override
    public void setState(String string) {
        this.setLabel(string);
    }

    @Override
    public String getLabel() {
        return this.r;
    }

    @Override
    public String getState() {
        return this.getLabel();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.r = null;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fbm_2 fbm_22 = (fbm_2)fyo2;
        super.copyElement(fbm_22);
        fbm_22.r = this.r;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != 102727412 && n != 109757585) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setLabel(fze2.a(string, this.m_elementMap));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 102727412 && n != 109757585) {
            return super.setPropertyAttribute(n, object);
        }
        this.setLabel(String.valueOf(object));
        return true;
    }
}

