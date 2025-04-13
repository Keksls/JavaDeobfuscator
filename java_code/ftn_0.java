/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ftn
 */
public class ftn_0
extends fso {
    private fzu c = null;
    private frs_0 d = frs_0.a;
    private frs_0 e = frs_0.i;
    fjw_1 f;
    private fvE g;
    String h = null;
    boolean i = true;
    private boolean j = true;
    private boolean k = true;
    private int l;
    private int m;
    public static final int a = 92903173;
    public static final int b = 1905963320;

    @Override
    public void addedToWidgetTree() {
        this.c = new fto_0(this);
        fta_0.getInstance().addEventListener(frd_0.A, this.c, false);
        this.addEventListener(frd_0.A, new ftp_0(this), false);
        this.addEventListener(frd_0.B, new ftq_0(this), false);
    }

    @Override
    public void removedFromWidgetTree() {
        fta_0.getInstance().removeEventListener(frd_0.A, this.c, false);
    }

    public void a() {
        if (!this.getVisible()) {
            this.setVisible(true);
            this.setSizeToPrefSize();
            this.setPositionToOptimal();
        }
    }

    @Override
    public void validate() {
        super.validate();
        this.setPositionToOptimal();
    }

    public void setPositionToOptimal() {
        if (this.f != null && this.e != null && this.d != null) {
            int n = this.f.getDisplayX();
            int n2 = this.f.getDisplayY();
            frs_0 frs_02 = this.e;
            frs_0 frs_03 = this.d;
            int n3 = n + frs_02.a(this.f.getWidth()) - frs_03.a(this.m_size.width);
            int n4 = n2 + frs_02.b(this.f.getHeight()) - frs_03.b(this.m_size.height);
            if (this.j && (n3 < 0 || n3 > this.m_containerParent.getAppearance().getContentWidth() - this.m_size.width)) {
                frs_02 = frs_02.e();
                frs_03 = frs_03.e();
            }
            if (this.k && (n4 < 0 || n4 > this.m_containerParent.getAppearance().getContentHeight() - this.m_size.height)) {
                frs_02 = frs_02.f();
                frs_03 = frs_03.f();
            }
            n3 = n + frs_02.a(this.f.getWidth()) - frs_03.a(this.m_size.width);
            n4 = n2 + frs_02.b(this.f.getHeight()) - frs_03.b(this.m_size.height);
            n3 = Math.max(0, Math.min(n3, this.m_containerParent.getAppearance().getContentWidth() - this.m_size.width));
            n4 = Math.max(0, Math.min(n4, this.m_containerParent.getAppearance().getContentHeight() - this.m_size.height));
            if (n >= n3 && n2 >= n4 && n < n3 + this.m_size.width && n2 < n4 + this.m_size.height) {
                n3 = n - this.m_size.width;
                n3 = Math.max(0, Math.min(n3, this.m_containerParent.getAppearance().getContentWidth() - this.m_size.width));
            }
            this.setPosition(n3 + this.l, n4 + this.m);
        }
    }

    public void b() {
        this.setVisible(false);
        this.i = true;
    }

    public fjw_1 getClient() {
        return this.f;
    }

    public void setClient(fjw_1 fjw_12) {
        this.h = null;
        this.f = fjw_12;
        if (this.f != null) {
            fyy_0 fyy_02 = this.f.getElementMap();
            while (fyy_02.e() != null) {
                fyy_02 = fyy_02.e();
            }
            this.h = fyy_02.c();
        }
    }

    public frs_0 getHotSpotPosition() {
        return this.d;
    }

    public void setHotSpotPosition(frs_0 frs_02) {
        if (frs_02 != null) {
            this.d = frs_02;
        }
    }

    public boolean getHideOnClick() {
        return this.i;
    }

    public void setHideOnClick(boolean bl) {
        this.i = bl;
    }

    public frs_0 getAlign() {
        return this.e;
    }

    public void setAlign(frs_0 frs_02) {
        this.e = frs_02;
    }

    public void setXOffset(int n) {
        this.l = n;
    }

    public void setYOffset(int n) {
        this.m = n;
    }

    public void setContent(fvE fvE2) {
        if (this.g != fvE2) {
            for (int k = this.m_widgetChildren.size() - 1; k >= 0; --k) {
                ((fvE)this.m_widgetChildren.get(k)).destroySelfFromParent();
            }
            if (fvE2 != null) {
                fvE2 = (fvE)fvE2.cloneElementStructure();
                this.add(fvE2);
            }
            this.g = fvE2;
        }
    }

    public fvE getContent() {
        return this.g;
    }

    public boolean getEnableSwitchXAlign() {
        return this.j;
    }

    public void setEnableSwitchXAlign(boolean bl) {
        this.j = bl;
    }

    public boolean getEnableSwitchYAlign() {
        return this.k;
    }

    public void setEnableSwitchYAlign(boolean bl) {
        this.k = bl;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        this.add(fid_12);
        this.setVisible(false);
        fpm_0.b().a(new ftr_0(this));
        this.i = true;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.e = null;
        this.d = null;
        this.h = null;
        this.c = null;
        this.g = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 92903173) {
            this.setAlign(frs_0.a(string));
        } else if (n == 1905963320) {
            this.setHotSpotPosition(frs_0.a(string));
        } else if (n == 466743410) {
            this.setVisible(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 92903173) {
            this.setAlign((frs_0)((Object)object));
        } else if (n == 1905963320) {
            this.setHotSpotPosition((frs_0)((Object)object));
        } else if (n == 466743410) {
            this.setVisible(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

