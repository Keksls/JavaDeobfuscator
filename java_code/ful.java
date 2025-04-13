/*
 * Decompiled with CFR 0.152.
 */
public class ful
extends fsk_0 {
    public static final String TAG = "Separator";
    private boolean t = true;
    private boolean u = false;
    public static final int a = 1387629604;

    @Override
    public String getTag() {
        return TAG;
    }

    public boolean isHorizontal() {
        return this.t;
    }

    public void setHorizontal(boolean bl) {
        this.t = bl;
        this.u = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean a() {
        boolean bl = super.a();
        if (this.b.f() != null) {
            if (this.t) {
                this.setMinSize(new fjf_2(0, this.b.f().d()));
            } else {
                this.setMinSize(new fjf_2(this.b.f().e(), 0));
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.u) {
            if (this.a()) {
                this.m_containerParent.invalidateMinSize();
            }
            this.u = false;
        }
        return bl;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != 1387629604) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setHorizontal(Co.a(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }
}

