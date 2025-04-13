/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBo
 */
public abstract class fbo_2
extends fbk_1
implements fbp_2 {
    private frd_0 b;
    public static final int a = -2108778994;

    @Override
    public frd_0 getTriggerAction() {
        return this.b;
    }

    @Override
    public void setTriggerAction(frd_0 frd_02) {
        this.b = frd_02;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.b = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != -2108778994) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setTriggerAction(frd_0.a(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -2108778994) {
            return super.setPropertyAttribute(n, object);
        }
        this.setTriggerAction((frd_0)((Object)object));
        return true;
    }
}

