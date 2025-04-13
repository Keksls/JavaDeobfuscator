/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fsv
 */
public class fsv_0
extends fso {
    public static final String TAG = "dndc";
    private fdg_1 e = null;
    boolean f = true;
    private boolean g = true;
    private boolean h = false;
    private boolean i = true;
    public static final int a = 1080770853;
    public static final int b = -287739027;
    public static final int c = -1316873902;
    public static final int d = 1713834839;

    public void setDragEnabled(boolean bl) {
        this.f = bl;
    }

    public void setDropEnabled(boolean bl) {
        this.g = bl;
    }

    public boolean isDragEnabled() {
        return this.f;
    }

    public boolean isDropEnabled() {
        return this.g;
    }

    public boolean isDisplayCopy() {
        return this.i;
    }

    public void setDisplayCopy(boolean bl) {
        this.i = bl;
    }

    public void setValidateDrop(fdg_1 fdg_12) {
        this.e = fdg_12;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fvE getWidget(int n, int n2) {
        if (this.isCopy()) {
            return null;
        }
        return super.getWidget(n, n2);
    }

    public boolean isCopy() {
        return this.h;
    }

    public void setCopy(boolean bl) {
        this.h = bl;
    }

    public void a(Object object) {
        if (!this.f) {
            return;
        }
        fcp_1 fcp_12 = fcp_1.a(fta_0.getInstance().getCurrentMouseEvent(), this, object);
        this.dispatchEvent(fcp_12);
    }

    public void a(fsv_0 fsv_02, Object object, int n) {
        if (!this.g) {
            return;
        }
        fcv_2 fcv_22 = fcv_2.a(fta_0.getInstance().getCurrentMouseEvent(), this, fsv_02, object);
        fcv_22.a(n);
        this.dispatchEvent(fcv_22);
    }

    public void b(Object object) {
        if (!this.g) {
            return;
        }
        fcx_1 fcx_12 = fcx_1.a(fta_0.getInstance().getCurrentMouseEvent(), this, object);
        this.dispatchEvent(fcx_12);
    }

    public void a(fsv_0 fsv_02, Object object) {
        if (!this.f) {
            return;
        }
        fcr_1 fcr_12 = fcr_1.a(fta_0.getInstance().getCurrentMouseEvent(), this, fsv_02, object);
        this.dispatchEvent(fcr_12);
    }

    public void b(fsv_0 fsv_02, Object object) {
        if (!this.f) {
            return;
        }
        fza_0.a().h();
        fct_2 fct_22 = fct_2.a(fta_0.getInstance().getCurrentMouseEvent(), this, fsv_02, object);
        this.dispatchEvent(fct_22);
    }

    public boolean isDropValid(fsv_0 fsv_02, Object object) {
        Object object2;
        if (!this.g) {
            return false;
        }
        if (this.e != null && (object2 = this.e.b(fsv_02, this, object)) != null) {
            return (Boolean)object2;
        }
        return true;
    }

    @Override
    public void removedFromWidgetTree() {
        super.removedFromWidgetTree();
    }

    @Override
    public void copyElement(fyo fyo2) {
        fsv_0 fsv_02 = (fsv_0)fyo2;
        super.copyElement(fyo2);
        fsv_02.e = this.e;
        fsv_02.f = this.f;
        fsv_02.g = this.g;
        fsv_02.i = this.i;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.e = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.h = false;
        this.addEventListener(frd_0.w, new fsw(this), false);
        this.addEventListener(frd_0.w, new fsx_0(this), true);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1080770853) {
            this.setValidateDrop(fze2.a(fdg_1.class, string));
        } else if (n == -287739027) {
            this.setDragEnabled(Co.a(string));
        } else if (n == -1316873902) {
            this.setDropEnabled(Co.a(string));
        } else if (n == 1713834839) {
            this.setDisplayCopy(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -287739027) {
            this.setDragEnabled(Co.b(object));
        } else if (n == -1316873902) {
            this.setDropEnabled(Co.b(object));
        } else if (n == 1713834839) {
            this.setDisplayCopy(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

