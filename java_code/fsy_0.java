/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fsy
 */
public class fsy_0
extends fso {
    public static final String TAG = "drawer";
    public static final String a = "staticContainer";
    public static final String b = "popupContainer";
    boolean f = false;
    boolean g = true;
    private fzu h;
    private fzu i;
    boolean j = true;
    fso k = null;
    fso l = null;
    private frs_0 m = frs_0.h;
    private frs_0 n = frs_0.b;
    public static final int c = 92903173;
    public static final int d = 1905963320;
    public static final int e = 1597976017;

    @Override
    public void add(fyb_0 fyb_02) {
        fso fso2;
        String string;
        boolean bl = true;
        if (fyb_02 instanceof fso && (string = (fso2 = (fso)fyb_02).getThemeElementName()) != null) {
            if (string.equals(b)) {
                if (this.k != null) {
                    this.k.release();
                }
                bl = false;
                this.k = fso2;
                this.k.setModalLevel((short)30000);
                this.a(this.k);
            } else if (string.equals(a)) {
                if (this.l != null) {
                    this.l.destroySelfFromParent();
                }
                this.l = fso2;
            }
        }
        if (bl) {
            super.add(fyb_02);
        }
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (a.equalsIgnoreCase(string)) {
            if (this.l != null) {
                return this.l;
            }
        } else if (b.equalsIgnoreCase(string) && this.k != null) {
            return this.k;
        }
        return null;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setElementMap(fyy_0 fyy_02) {
        super.setElementMap(fyy_02);
        if (this.k != null) {
            this.k.setElementMap(fyy_02);
        }
    }

    public void setCloseOnClick(boolean bl) {
        this.j = bl;
    }

    public void setHotSpotPosition(frs_0 frs_02) {
        if (frs_02 != null) {
            this.n = frs_02;
        }
    }

    public void setAlign(frs_0 frs_02) {
        if (frs_02 != null) {
            this.m = frs_02;
        }
    }

    @Override
    public void addedToWidgetTree() {
        super.addedToWidgetTree();
        this.setFocusable(true);
    }

    public void a(fta_0 fta_02) {
        this.h = new fsz(this);
        fta_02.addEventListener(frd_0.A, this.h, false);
        this.i = new fsa_0(this);
        fta_02.addEventListener(frd_0.B, this.i, false);
    }

    public void a(fso fso2) {
        fso2.addEventListener(frd_0.C, new fsb_0(this), false);
    }

    public boolean isPopupIsBeingDisplayed() {
        return this.f;
    }

    public void a() {
        if (this.f) {
            this.b();
        } else {
            this.c();
        }
    }

    void b() {
        if (this.f) {
            this.k.removeSelfFromParent();
            this.f = false;
            fza_0.a().d();
        }
    }

    private void c() {
        if (!this.f) {
            int n;
            fjf_2 fjf_22 = this.k.getPrefSize();
            int n2 = fjf_22.width;
            int n3 = fjf_22.height;
            int n4 = this.getDisplayX();
            int n5 = this.getDisplayY();
            fta_0 fta_02 = fta_0.getInstance();
            frs_0 frs_02 = this.m;
            frs_0 frs_03 = this.n;
            int n6 = this.getDisplayY() + frs_02.b(this.getHeight()) - frs_03.b(n3);
            if (n6 < 0 || n6 > fta_02.getAppearance().getContentHeight() - n3) {
                frs_02 = frs_02.f();
                frs_03 = frs_03.f();
            }
            n6 = this.getDisplayY() + frs_02.b(this.getHeight()) - frs_03.b(n3);
            n6 = Math.max(0, Math.min(n6, fta_02.getAppearance().getContentHeight() - n3));
            if (n5 - n3 < 0 && n5 + this.getHeight() + n3 > fta_02.getHeight()) {
                n3 = n5;
                n6 = 0;
            }
            if ((n = n4 + frs_02.a(this.getWidth()) - frs_03.a(n2)) < 0 || n > fta_02.getAppearance().getContentWidth() - n2) {
                frs_02 = frs_02.e();
                frs_03 = frs_03.e();
            }
            n = this.getDisplayX() + frs_02.a(this.getWidth()) - frs_03.a(n2);
            n = Math.max(0, Math.min(n, fta_02.getAppearance().getContentWidth() - n2));
            if (n4 - n2 < 0 && n4 + this.getWidth() + n2 > fta_02.getWidth()) {
                n2 = n4;
                n = 0;
            }
            this.k.setSizeToPrefSize();
            n2 = Math.max(this.k.getWidth(), n2);
            n3 = Math.max(this.k.getHeight(), n3);
            this.k.setSize(n2, n3);
            this.k.setPosition(n, n6);
            this.k.setNonBlocking(false);
            fta_02.getLayeredContainer().a(this.k, 30000);
            this.f = true;
            this.g = true;
            fza_0.a().c();
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        fta_0.getInstance().removeEventListener(frd_0.A, this.h, false);
        fta_0.getInstance().removeEventListener(frd_0.B, this.i, false);
        this.i = null;
        this.h = null;
        this.m = null;
        this.n = null;
        this.j = true;
        this.k.destroySelfFromParent();
        this.k = null;
        this.l = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fsC fsC2 = new fsC(this);
        fsC2.onCheckOut();
        this.add(fsC2);
        this.k = fso.checkOut();
        this.l = fso.checkOut();
        this.m_nonBlocking = false;
        this.a(fta_0.getInstance());
    }

    @Override
    public void copyElement(fyo fyo2) {
        fsy_0 fsy_02 = (fsy_0)fyo2;
        super.copyElement(fsy_02);
        fsy_02.j = this.j;
        fvE fvE2 = (fvE)this.k.cloneElementStructure();
        fvE2.m_styleIsDirty = false;
        fvE2.removeAllEventListeners();
        fsy_02.add(fvE2);
        fsy_02.removeEventListener(frd_0.A, this.h, false);
        fsy_02.removeEventListener(frd_0.B, this.i, false);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1597976017) {
            this.setCloseOnClick(Co.a(string));
        } else if (n == 92903173) {
            this.setAlign(frs_0.a(string));
        } else if (n == 1905963320) {
            this.setHotSpotPosition(frs_0.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1597976017) {
            this.setCloseOnClick(Co.b(object));
        } else if (n == 92903173) {
            this.setAlign((frs_0)((Object)object));
        } else if (n == 1905963320) {
            this.setHotSpotPosition((frs_0)((Object)object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

