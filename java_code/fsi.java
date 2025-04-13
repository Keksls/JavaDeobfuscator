/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;

public class fsi
extends fso
implements ayp_2,
fqu {
    public static final String TAG = "colorPicker";
    private static final int e = 20;
    private static final int f = 14;
    private static final int g = 11;
    public static final int a = 5;
    private static final Insets h = new Insets(0, 0, 0, 0);
    private static final String i = "slider";
    private static final String j = "cursor";
    final fwh k = new fwh();
    private fxb_0 l;
    private fxb_0 m;
    private boolean n;
    boolean o;
    private fsk_0 p;
    private fsk_0 q;
    private boolean r;
    private boolean s;
    float t;
    float u;
    float v;
    public static final int b = 111972721;
    public static final int c = "pixmap".hashCode();
    public static final int d = -1415151326;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqv) {
            this.setPixmap((fqv)fyb_02);
        }
        super.add(fyb_02);
    }

    @Override
    protected void addInnerMeshes() {
        if (this.m_entity != null) {
            if (this.l.n() != null) {
                this.m_entity.a(this.l.n());
            }
            if (this.m.n() != null) {
                this.m_entity.a(this.m.n());
            }
        }
        super.addInnerMeshes();
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.l == null || this.m == null) {
            return bl;
        }
        if (this.n || this.l.f() != null && this.l.f().p()) {
            this.a();
            this.b();
            try {
                this.l.a(this.m_size, h, h, h);
            }
            catch (NullPointerException nullPointerException) {
                m_logger.error((Object)("imageMesh = " + this.l), (Throwable)nullPointerException);
            }
            try {
                this.m.a(this.m_size, h, h, h);
            }
            catch (NullPointerException nullPointerException) {
                m_logger.error((Object)("imageMesh = " + this.m), (Throwable)nullPointerException);
            }
            this.n = false;
        }
        return bl;
    }

    @Override
    public void validate() {
        if (this.l != null) {
            this.a();
            this.b();
            this.l.a(this.m_size, h, h, h);
            this.m.a(this.m_size, h, h, h);
        }
        super.validate();
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.o = true;
    }

    private void a() {
        if (this.l == null) {
            return;
        }
        ayo_2 ayo_22 = this.l.f();
        if (ayo_22 == null) {
            return;
        }
        this.l.a(0);
        this.l.b(0);
        this.l.d(this.getColorTextureWidth());
        this.l.c(this.getColorTextureHeight());
    }

    private void b() {
        if (this.m == null) {
            return;
        }
        ayo_2 ayo_22 = this.m.f();
        if (ayo_22 == null) {
            return;
        }
        this.m.a(this.m_appearance.getContentWidth() - 20);
        this.m.b(0);
        this.m.d(this.getSliderTextureWidth());
        this.m.c(this.getSliderTextureHeight());
    }

    @Override
    public void setPixmap(fqv fqv2) {
        if (this.l != null) {
            if (this.l.f() != null) {
                this.l.f().b(this);
            }
            if (fqv2.getPixmap() != null) {
                fqv2.getPixmap().a(this);
            }
            this.l.a(fqv2.getPixmap());
            this.n = true;
            this.setNeedsToPreProcess();
        }
    }

    public void setPixmap(ayo_2 ayo_22) {
        if (this.l != null) {
            ayo_2 ayo_23 = this.l.f();
            if (ayo_23 != null) {
                ayo_23.b(this);
            }
            this.l.a(ayo_22);
            ayo_22.a(this);
            this.n = true;
            this.setNeedsToPreProcess();
        }
    }

    private void setSliderPixmap(ayo_2 ayo_22) {
        if (this.m != null) {
            ayo_2 ayo_23 = this.m.f();
            if (ayo_23 != null) {
                ayo_23.b(this);
            }
            this.m.a(ayo_22);
            ayo_22.a(this);
            this.n = true;
            this.setNeedsToPreProcess();
        }
    }

    @Override
    public void a(ayo_2 ayo_22) {
        this.n = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
    }

    @Override
    public azj_2 getModulationColor() {
        return null;
    }

    int getColorTextureWidth() {
        return this.getWidth() - 20;
    }

    int getColorTextureHeight() {
        return this.getHeight() + 1;
    }

    int getSliderTextureWidth() {
        return 20;
    }

    int getSliderTextureHeight() {
        return this.getHeight() + 1;
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (i.equalsIgnoreCase(string)) {
            return this.q;
        }
        if (j.equalsIgnoreCase(string)) {
            return this.p;
        }
        return this;
    }

    @Override
    public void onCheckIn() {
        ayo_2 ayo_22;
        super.onCheckIn();
        this.o = false;
        this.p = null;
        this.q = null;
        if (this.l != null) {
            ayo_22 = this.l.f();
            if (ayo_22 != null) {
                ayo_22.b(this);
            }
            this.l.l();
            this.l = null;
        }
        if (this.m != null) {
            ayo_22 = this.m.f();
            if (ayo_22 != null) {
                ayo_22.b(this);
            }
            this.m.l();
            this.m = null;
        }
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = 0.0f;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.o = true;
        fsj fsj2 = new fsj(this);
        fsj2.onCheckOut();
        this.add(fsj2);
        this.l = new fxb_0();
        this.l.m();
        this.m = new fxb_0();
        this.m.m();
        this.m_nonBlocking = false;
        this.p = new fsk_0();
        this.p.onCheckOut();
        this.p.setSize(11, 11, true);
        this.add(this.p);
        this.q = new fsk_0();
        this.q.onCheckOut();
        this.q.setSize(20, 14, true);
        this.add(this.q);
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = 0.0f;
        this.addEventListener(frd_0.A, fzs2 -> {
            if (!(fzs2 instanceof fck_2)) {
                return false;
            }
            fck_2 fck_22 = (fck_2)fzs2;
            this.r = this.isWithinColorTexture(fck_22.a(this), fck_22.b(this));
            if (this.r) {
                this.a(fck_22.a(this), fck_22.b(this));
                return false;
            }
            this.s = this.isWithinSliderTexture(fck_22.a(this), fck_22.b(this));
            if (this.s) {
                this.a(fck_22.b(this));
                return false;
            }
            return false;
        }, false);
        this.addEventListener(frd_0.w, fzs2 -> {
            if (!(fzs2 instanceof fck_2)) {
                return false;
            }
            if (this.r) {
                fck_2 fck_22 = (fck_2)fzs2;
                this.a(fck_22.a(this), fck_22.b(this));
                return false;
            }
            if (this.s) {
                fck_2 fck_23 = (fck_2)fzs2;
                this.a(fck_23.b(this));
                return false;
            }
            return false;
        }, true);
        this.addEventListener(frd_0.B, fzs2 -> {
            this.s = false;
            this.r = false;
            return false;
        }, true);
        this.addEventListener(frd_0.E, fzs2 -> {
            if (!(fzs2 instanceof fck_2)) {
                return false;
            }
            int n = ((fck_2)fzs2).z() * -1;
            int n2 = n * 5;
            this.b(n2);
            return false;
        }, true);
    }

    private void a(int n, int n2) {
        int n3 = Hw.a(n, 0, this.getColorTextureWidth());
        int n4 = Hw.a(n2, 0, this.getColorTextureHeight());
        int n5 = n3 * 360 / this.getColorTextureWidth();
        int n6 = n4 * 100 / this.getColorTextureHeight();
        int n7 = Math.round(this.v);
        azf_2 azf_22 = azf_2.a(n5, n6, n7);
        float[] fArray = azf_22.y();
        this.t = fArray[0];
        this.u = fArray[1];
        this.v = fArray[2];
        this.setCursorPosition(n3, n4);
        fct_1 fct_12 = new fct_1(this);
        fct_12.a(azf_22);
        this.dispatchEvent(fct_12);
        this.b(20, this.getAppearance().getContentHeight());
    }

    private void a(int n) {
        int n2 = Hw.a(n, 0, this.getSliderTextureHeight());
        this.v = (float)n2 * 100.0f / (float)this.getColorTextureHeight();
        this.setSliderPosition(n2);
        azf_2 azf_22 = azf_2.b(this.t, this.u, this.v, 1.0f);
        fct_1 fct_12 = new fct_1(this);
        fct_12.a(azf_22);
        this.dispatchEvent(fct_12);
    }

    private void b(int n) {
        this.v = Hw.b(this.v + (float)n, 0.0f, 100.0f);
        int n2 = Hw.b(this.v * (float)this.getColorTextureHeight() / 100.0f);
        this.setSliderPosition(n2);
        azf_2 azf_22 = azf_2.b(this.t, this.u, this.v, 1.0f);
        fct_1 fct_12 = new fct_1(this);
        fct_12.a(azf_22);
        this.dispatchEvent(fct_12);
    }

    private boolean isWithinColorTexture(int n, int n2) {
        if (n < 0 || n > this.getColorTextureWidth()) {
            return false;
        }
        return n2 >= 0 && n2 <= this.getColorTextureHeight();
    }

    private boolean isWithinSliderTexture(int n, int n2) {
        if (n < this.getColorTextureWidth() || n > this.getColorTextureWidth() + 20) {
            return false;
        }
        return n2 >= 0 && n2 <= this.getColorTextureHeight();
    }

    void setCursorPosition(int n, int n2) {
        this.p.setPosition(n - 5, n2 - 5);
    }

    void setSliderPosition(int n) {
        this.q.setPosition(this.getAppearance().getContentWidth() - 20, n - 7);
    }

    public void setValue(azj_2 azj_22) {
        if (azj_22 == null) {
            return;
        }
        float[] fArray = azj_22.y();
        this.t = fArray[0];
        this.u = fArray[1];
        this.v = fArray[2];
        int n = Math.round(this.t * (float)this.getColorTextureWidth() / 360.0f);
        int n2 = Math.round(this.u * (float)this.getColorTextureHeight() / 100.0f);
        this.setCursorPosition(n, n2);
        int n3 = Math.round(this.v * (float)this.getColorTextureHeight() / 100.0f);
        this.setSliderPosition(n3);
        this.b(this.getSliderTextureWidth(), this.getSliderTextureHeight());
        this.setNeedsToPreProcess();
    }

    void b(int n, int n2) {
        if (n <= 0 || n2 <= 0) {
            return;
        }
        ays_2 ays_22 = this.k.a(n, n2, "colorPickerSliderTexture" + n + n2 + this.t + this.u, this.t / 360.0f, this.u / 100.0f);
        this.setSliderPixmap(new ayo_2(ays_22));
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fyo2.setNeedsToPreProcess();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -1415151326) {
            this.setOnValueChange(fze2.a(fdl_1.class, string));
        } else if (n == 111972721) {
            this.setValue(fze2.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == c) {
            this.setPixmap((ayo_2)object);
        } else if (n == 111972721) {
            this.setValue((azj_2)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

