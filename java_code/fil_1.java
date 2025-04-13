/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIL
 */
public class fil_1
extends fyg_0 {
    public static final String TAG = "popup";
    private frs_0 f = frs_0.a;
    private frs_0 g = frs_0.i;
    private boolean h = true;
    private fvE i;
    private int j;
    private int k;
    public static final int a = 92903173;
    public static final int b = 1905963320;
    public static final int c = -1472313529;
    public static final int d = 1485313835;
    public static final int e = -1922149780;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fvE) {
            this.i = (fvE)fyb_02;
            this.i.setIsATemplate(true);
            super.add(fyb_02, false);
        } else {
            super.add(fyb_02);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public frs_0 getHotSpotPosition() {
        return this.f;
    }

    public void setHotSpotPosition(frs_0 frs_02) {
        this.f = frs_02;
    }

    public frs_0 getAlign() {
        return this.g;
    }

    public void setAlign(frs_0 frs_02) {
        this.g = frs_02;
    }

    public boolean getHideOnClick() {
        return this.h;
    }

    public void setHideOnClick(boolean bl) {
        this.h = bl;
    }

    public void setXOffset(int n) {
        this.j = n;
    }

    public void setYOffset(int n) {
        this.k = n;
    }

    public fvE getContent() {
        return this.i;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fil_1 fil_12 = (fil_1)fyo2;
        super.copyElement(fyo2);
        fil_12.setAlign(this.g);
        fil_12.setHotSpotPosition(this.f);
        fil_12.setHideOnClick(this.h);
    }

    public void a(fjw_1 fjw_12) {
        this.a(fjw_12, fta_0.getInstance().getPopupContainer());
    }

    public void a(fjw_1 fjw_12, ftn_0 ftn_02) {
        if (ftn_02 != null) {
            if (!ftn_02.getVisible()) {
                this.b(fjw_12, ftn_02);
            } else {
                fil_1.a(ftn_02);
            }
        }
    }

    public void b(fjw_1 fjw_12) {
        ftn_0 ftn_02 = fta_0.getInstance().getPopupContainer();
        this.b(fjw_12, ftn_02);
    }

    public void b(fjw_1 fjw_12, ftn_0 ftn_02) {
        if (ftn_02 != null && fjw_12.getElementMap() != null) {
            ftn_02.setAlign(this.g);
            ftn_02.setHotSpotPosition(this.f);
            ftn_02.setContent(this.i);
            ftn_02.setClient(fjw_12);
            ftn_02.setHideOnClick(this.h);
            ftn_02.setXOffset(this.j);
            ftn_02.setYOffset(this.k);
            ftn_02.a();
            fza_0.a().i();
        }
    }

    public static void a() {
        fil_1.a(fta_0.getInstance().getPopupContainer());
    }

    public static void a(ftn_0 ftn_02) {
        if (ftn_02 != null) {
            ftn_02.b();
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        if (this.i != null) {
            this.i = null;
        }
        this.g = null;
        this.f = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.h = true;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 92903173) {
            this.setAlign(frs_0.a(string));
        } else if (n == 1905963320) {
            this.setHotSpotPosition(frs_0.a(string));
        } else if (n == -1472313529) {
            this.setHideOnClick(Co.a(string));
        } else if (n == 1485313835) {
            this.setXOffset(Co.c(string));
        } else if (n == -1922149780) {
            this.setYOffset(Co.c(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -1472313529) {
            return super.setPropertyAttribute(n, object);
        }
        this.setHideOnClick(Co.b(object));
        return true;
    }
}

