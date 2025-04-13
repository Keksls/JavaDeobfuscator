/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBk
 */
public abstract class fbk_1
extends fyg_0
implements fbq_1 {
    protected fvE l;
    protected fqj m;
    protected boolean n = false;
    protected boolean o = true;
    public static final int p = -1609594047;
    public static final int q = 1282258139;

    @Override
    public boolean isEnabled() {
        return this.n;
    }

    @Override
    public void setEnabled(boolean bl) {
        this.n = bl;
        if (this.m != null) {
            this.m.setNeedsToResetMeshes();
        }
    }

    @Override
    public void setWidget(fvE fvE2) {
        this.l = fvE2;
    }

    @Override
    public fvE getWidget() {
        return this.l;
    }

    @Override
    public void setDecoratorAppearance(fqj fqj2) {
        this.m = fqj2;
    }

    @Override
    public fqj getDecoratorAppearance() {
        return this.m;
    }

    @Override
    public boolean isRemovable() {
        return this.o;
    }

    @Override
    public void setRemovable(boolean bl) {
        this.o = bl;
    }

    @Override
    public void b() {
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.l = null;
        this.m = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.n = false;
        this.o = true;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fbk_1 fbk_12 = (fbk_1)fyo2;
        super.copyElement(fbk_12);
        fbk_12.n = this.n;
        fbk_12.o = this.o;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -1609594047) {
            this.setEnabled(Co.a(string));
        } else if (n == 1282258139) {
            this.setRemovable(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1609594047) {
            this.setEnabled(Co.b(object));
        } else if (n == 1282258139) {
            this.setRemovable(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

