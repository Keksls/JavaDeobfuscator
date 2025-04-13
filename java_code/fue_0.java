/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fue
 */
public class fue_0
extends fso {
    public static final String TAG = "ScrollContainer";
    public static final String a = "horizontalScrollBar";
    public static final String b = "verticalScrollBar";
    ftx_0 n;
    ftx_0 o;
    fra_0 p = fra_0.a;
    fra_0 q = fra_0.a;
    boolean r = false;
    boolean s = false;
    frs_0 t = null;
    boolean u = true;
    float v = 1.0f;
    boolean w = false;
    boolean x = false;
    fzj y;
    boolean z;
    float A;
    float B;
    frm_0 C = frm_0.c;
    frm_0 D = frm_0.b;
    private boolean E = false;
    fvE F;
    float G;
    private fzm H;
    public static final int c = -1806562365;
    public static final int d = -701523813;
    public static final int e = 971572077;
    public static final int f = -1755568757;
    public static final int g = 1346443385;
    public static final int h = 1472700865;
    public static final int i = -1149170541;
    public static final int j = -1986013536;
    public static final int k = 577708274;
    public static final int l = -537903381;
    public static final int m = 740886190;

    @Override
    public void addWidget(fvE fvE2) {
        if (fvE2 != this.n && fvE2 != this.o) {
            if (this.F != null) {
                this.destroy(this.F);
            }
            this.F = fvE2;
            this.F.setSize(this.F.getPrefSize());
        }
        super.addWidget(fvE2);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public frm_0 getVerticalScrollBarAlignment() {
        return this.C;
    }

    public void setVerticalScrollBarAlignment(frm_0 frm_02) {
        this.C = frm_02;
    }

    public frm_0 getHorizontalScrollBarAlignment() {
        return this.D;
    }

    public void setHorizontalScrollBarAlignment(frm_0 frm_02) {
        this.D = frm_02;
    }

    public fra_0 getVerticalScrollBarBehaviour() {
        return this.p;
    }

    public void setVerticalScrollBarBehaviour(fra_0 fra_02) {
        if (this.p == null || !this.p.equals((Object)fra_02)) {
            this.p = fra_02;
            this.E = true;
            this.setNeedsToPreProcess();
        }
    }

    public void setVerticalScrollBarPosition(float f2) {
        this.n.setValue(f2);
    }

    public fra_0 getHorizontalScrollBarBehaviour() {
        return this.q;
    }

    public void setHorizontalScrollBarBehaviour(fra_0 fra_02) {
        if (this.q == null || !this.q.equals((Object)fra_02)) {
            this.q = fra_02;
            this.E = true;
            this.setNeedsToPreProcess();
        }
    }

    public void setHorizontalScrollBarPosition(float f2) {
        this.o.setValue(f2);
    }

    public boolean isEnableScrollBar() {
        return this.u;
    }

    public void setEnableScrollBar(boolean bl) {
        this.u = bl;
        this.E = true;
        this.setNeedsToPreProcess();
    }

    public frs_0 getInnerWidgetAlign() {
        return this.t;
    }

    public void setInnerWidgetAlign(frs_0 frs_02) {
        this.t = frs_02;
    }

    public ftx_0 getVerticalScrollBar() {
        return this.n;
    }

    public ftx_0 getHorizontalScrollBar() {
        return this.o;
    }

    public float getPageJumpRatio() {
        return this.G;
    }

    public void setAutoScrollVertical(boolean bl) {
        this.w = bl;
    }

    public void setAutoScrollHorizontal(boolean bl) {
        this.x = bl;
    }

    public void setDndListenerContentValidator(fzj fzj2) {
        this.y = fzj2;
        if (this.H == null) {
            this.H = new fuf_0(this);
            fzn.a().a(this.H);
        }
    }

    public void setPageJumpRatio(float f2) {
        this.G = f2;
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (a.equalsIgnoreCase(string)) {
            return this.o;
        }
        if (b.equalsIgnoreCase(string)) {
            return this.n;
        }
        return null;
    }

    @Override
    public azt_1 getScissor(fvE fvE2) {
        if (fvE2 == this.n || fvE2 == this.o) {
            return azt_1.a(this.getScreenX() + this.m_appearance.getLeftInset(), this.getScreenY() + this.m_appearance.getBottomInset(), this.m_size.width - this.m_appearance.getLeftInset() - this.m_appearance.getRightInset(), this.m_size.height - this.m_appearance.getBottomInset() - this.m_appearance.getTopInset());
        }
        return azt_1.a(this.getScreenX() + this.m_appearance.getLeftInset() + (this.r && this.C.equals((Object)frm_0.d) ? this.n.getWidth() : 0), this.getScreenY() + this.m_appearance.getBottomInset() + (this.s && this.D.equals((Object)frm_0.b) ? this.o.getHeight() : 0), this.m_size.width - this.m_appearance.getLeftInset() - this.m_appearance.getRightInset() - (this.r ? this.n.getWidth() : 0), (int)(this.v * (float)(this.m_size.height - this.m_appearance.getBottomInset() - this.m_appearance.getTopInset() - (this.s ? this.o.getHeight() : 0))));
    }

    @Override
    public fvE getWidget(int n, int n2) {
        if (this.m_unloading || !this.m_visible || !this.getAppearance().a(n, n2) || fta_0.getInstance().isMovePointMode()) {
            return null;
        }
        fvE fvE2 = null;
        if (this.s && !this.o.isUnloading() && (fvE2 = this.o.getWidget((n -= this.getAppearance().getLeftInset()) - this.o.m_position.x, (n2 -= this.getAppearance().getBottomInset()) - this.o.m_position.y)) != null) {
            return fvE2;
        }
        if (this.r && !this.n.isUnloading() && (fvE2 = this.n.getWidget(n - this.n.m_position.x, n2 - this.n.m_position.y)) != null) {
            return fvE2;
        }
        if (this.r && this.s && n2 < this.n.getY()) {
            return this.m_nonBlocking ? null : this;
        }
        if (this.F != null && !this.F.isUnloading()) {
            fvE2 = this.F.getWidget(n - this.F.m_position.x, n2 - this.F.m_position.y);
        }
        return fvE2 != null ? fvE2 : (this.m_nonBlocking ? null : this);
    }

    public void a(float f2) {
        this.n.setValue(f2);
    }

    public void b(float f2) {
        this.o.setValue(f2);
    }

    @Override
    public void invalidate() {
        super.invalidate();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.n = null;
        this.o = null;
        if (this.H != null) {
            fzn.a().b(this.H);
            this.H = null;
        }
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fuj_0 fuj_02 = new fuj_0(this);
        fuj_02.onCheckOut();
        this.add(fuj_02);
        this.m_nonBlocking = false;
        this.enableEvent(frd_0.A, false);
        this.enableEvent(frd_0.B, false);
        this.enableEvent(frd_0.C, false);
        this.enableEvent(frd_0.D, false);
        this.enableEvent(frd_0.w, false);
        this.enableEvent(frd_0.v, false);
        this.enableEvent(frd_0.x, false);
        this.v = 1.0f;
        this.G = 0.5f;
        this.n = new ftx_0();
        this.n.onCheckOut();
        this.n.setCanBeCloned(false);
        this.n.setHorizontal(false);
        this.add(this.n);
        this.n.addEventListener(frd_0.I, new fug(this), false);
        this.o = new ftx_0();
        this.o.onCheckOut();
        this.o.setCanBeCloned(false);
        this.o.setHorizontal(true);
        this.add(this.o);
        this.o.addEventListener(frd_0.I, new fuh(this), false);
        this.addEventListener(frd_0.E, new fui_0(this), false);
        this.u = true;
        this.m_needsScissor = true;
    }

    public void a() {
        this.removeTweensOfType(fuk.class);
        this.v = 1.0f;
    }

    public void b() {
        this.addTween(new fuk(this, this.v, 0.0f, this, 10000, 5000, fjw_2.b));
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.E) {
            this.invalidateMinSize();
            this.E = false;
        }
        if (this.z) {
            this.n.setValue(Hw.b(this.n.getValue() + this.A, 0.0f, 1.0f));
            this.o.setValue(Hw.b(this.o.getValue() + this.B, 0.0f, 1.0f));
            return true;
        }
        return bl;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fue_0 fue_02 = (fue_0)fyo2;
        super.copyElement(fue_02);
        fue_02.q = this.q;
        fue_02.p = this.p;
        fue_02.t = this.t;
        fue_02.u = this.u;
        fue_02.G = this.G;
        fue_02.y = this.y;
        fue_02.w = this.w;
        fue_02.x = this.x;
        fue_02.m_styleIsDirty = true;
        fue_02.setNeedsToPreProcess();
    }

    void e() {
        this.a((double)this.o.getSlider().getValue());
        this.b((double)this.n.getSlider().getValue());
    }

    void a(double d2) {
        int n = this.F.getSize().width;
        int n2 = this.m_appearance.getContentWidth();
        if (this.r) {
            n2 = (int)((double)n2 - this.n.getSize().getWidth());
        }
        int n3 = this.t == null || n - n2 > 0 ? -((int)((double)(n - n2) * d2)) : this.t.a(n, n2);
        if (this.r && this.C.equals((Object)frm_0.d)) {
            n3 = (int)((double)n3 + this.n.getSize().getWidth());
        }
        this.F.setX(n3);
    }

    void b(double d2) {
        int n = this.F.getSize().height;
        int n2 = this.m_appearance.getContentHeight();
        if (this.s) {
            n2 = (int)((double)n2 - this.o.getSize().getHeight());
        }
        int n3 = this.t == null || n - n2 > 0 ? -((int)((double)(n - n2) * d2)) : this.t.b(n, n2);
        if (this.s && this.D.equals((Object)frm_0.b)) {
            n3 = (int)((double)n3 + this.o.getSize().getHeight());
        }
        this.F.setY(n3);
    }

    public boolean c() {
        return (double)this.getAppearance().getContentHeight() < this.F.getPrefSize().getHeight();
    }

    public boolean d() {
        return (double)this.getAppearance().getContentWidth() < this.F.getPrefSize().getWidth();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -1806562365) {
            this.setEnableScrollBar(Co.a(string));
        } else if (n == -701523813) {
            this.setHorizontalScrollBarBehaviour(fra_0.a(string));
        } else if (n == 971572077) {
            this.setVerticalScrollBarBehaviour(fra_0.a(string));
        } else if (n == -537903381) {
            this.setInnerWidgetAlign(frs_0.a(string));
        } else if (n == -1755568757) {
            this.setHorizontalScrollBarPosition(Co.e(string));
        } else if (n == 1346443385) {
            this.setVerticalScrollBarPosition(Co.e(string));
        } else if (n == 1472700865) {
            this.setHorizontalScrollBarAlignment(frm_0.a(string));
        } else if (n == -1149170541) {
            this.setVerticalScrollBarAlignment(frm_0.a(string));
        } else if (n == 740886190) {
            this.setPageJumpRatio(Co.e(string));
        } else if (n == -1986013536) {
            this.setAutoScrollHorizontal(Co.a(string));
        } else if (n == 577708274) {
            this.setAutoScrollVertical(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1806562365) {
            this.setEnableScrollBar(Co.b(object));
        } else if (n == -701523813) {
            this.setHorizontalScrollBarBehaviour((fra_0)((Object)object));
        } else if (n == 971572077) {
            this.setVerticalScrollBarBehaviour((fra_0)((Object)object));
        } else if (n == -1755568757) {
            this.setHorizontalScrollBarPosition(Co.e(object));
        } else if (n == 1346443385) {
            this.setVerticalScrollBarPosition(Co.e(object));
        } else if (n == -537903381) {
            this.setInnerWidgetAlign((frs_0)((Object)object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

