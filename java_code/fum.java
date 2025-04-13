/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class fum
extends fso
implements fqu {
    public static final String TAG = "Slider";
    public static final String a = "horizontalButton";
    public static final String b = "verticalButton";
    public static final String c = "horizontalSeparator";
    public static final String d = "verticalSeparator";
    float r = 0.0f;
    private float s = 0.0f;
    private int t = 0;
    private int u = 1;
    private int v = Integer.MIN_VALUE;
    private int w = Integer.MAX_VALUE;
    boolean x = true;
    boolean y = true;
    boolean z = false;
    int A = 0;
    boolean B = false;
    private boolean C = false;
    boolean D = true;
    private float E = 0.15f;
    float F = 0.05f;
    fru_0 G;
    int H;
    int I;
    private fzu J = null;
    private fzu K = null;
    private fzu L;
    ArrayList<fsk_0> M = new ArrayList();
    fqv N = null;
    azj_2 O = null;
    boolean P = false;
    boolean Q = false;
    private boolean R;
    public static final int e = -867683742;
    public static final int f = -293147356;
    public static final int g = 1387629604;
    public static final int h = 381182586;
    public static final int i = -1395014068;
    public static final int j = -1638048016;
    public static final int k = 880722626;
    public static final int l = 3273774;
    public static final int m = 1106146434;
    public static final int n = 111972721;
    public static final int o = -56707504;
    public static final int p = -575832990;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fru_0 && this.G != fyb_02) {
            if (this.G != null) {
                this.destroy(this.G);
            }
            this.G = (fru_0)fyb_02;
            this.G.setUsePositionTween(this.B && this.C);
        } else if (fyb_02 instanceof fqv) {
            this.setPixmap((fqv)fyb_02);
        }
        super.add(fyb_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public float getValue() {
        return this.a(this.r);
    }

    public void setValue(float f2) {
        this.setValue(f2, false);
    }

    public void setValue(float f2, boolean bl) {
        if (!bl && f2 == this.r) {
            return;
        }
        int n = this.getEffectiveMinBound();
        int n2 = this.getEffectiveMaxBound();
        this.s = f2;
        if (f2 < (float)n) {
            f2 = n;
        } else if (f2 > (float)n2) {
            f2 = n2;
        }
        this.r = f2;
        fcq_1 fcq_12 = new fcq_1(this);
        fcq_12.a(f2);
        this.dispatchEvent(fcq_12);
        this.x = true;
        this.setNeedsToMiddleProcess();
    }

    public void setNumFixedValues(int n) {
        assert (n >= 0) : "Invalid value. numFixedValues must be >= 0";
        if (n == this.A) {
            return;
        }
        this.A = n;
        this.z = this.A != 0;
        this.Q = true;
        if (this.z) {
            this.setValue(this.s);
        }
    }

    public int getMinBound() {
        return this.t;
    }

    public void setMinBound(int n) {
        this.t = n;
    }

    public int getMaxBound() {
        return this.u;
    }

    public void setMaxBound(int n) {
        this.u = n;
    }

    public int getInnerMinBound() {
        return this.v;
    }

    public void setInnerMinBound(int n) {
        this.v = n;
    }

    public int getInnerMaxBound() {
        return this.w;
    }

    public void setInnerMaxBound(int n) {
        this.w = n;
    }

    public double getJump() {
        return this.F;
    }

    public void setJump(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.F = f2;
    }

    public boolean isHorizontal() {
        return this.D;
    }

    public void setHorizontal(boolean bl) {
        this.D = bl;
    }

    public double getSliderSize() {
        return this.E;
    }

    public void setSliderSize(float f2) {
        this.E = f2 = Math.min(1.0f, Math.max(f2, 0.01f));
        this.y = true;
        this.setNeedsToMiddleProcess();
    }

    public boolean getScrollOnMouseWheel() {
        return this.R;
    }

    public void setScrollOnMouseWheel(boolean bl) {
        this.R = bl;
    }

    public fru_0 getButton() {
        return this.G;
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if ((this.D || bl) && a.equalsIgnoreCase(string)) {
            return this.G;
        }
        if ((!this.D || bl) && b.equalsIgnoreCase(string)) {
            return this.G;
        }
        return null;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.G.setEnabled(bl);
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        this.G.setNetEnabled(bl);
    }

    public boolean getReadOnly() {
        return this.B;
    }

    public void setReadOnly(boolean bl) {
        this.B = bl;
        this.G.setUsePositionTween(this.B && this.C);
    }

    public void setUseTween(boolean bl) {
        this.C = bl;
        this.G.setUsePositionTween(this.B && this.C);
    }

    @Override
    public void setPixmap(fqv fqv2) {
        if (fqv2 != this.N) {
            this.N = fqv2;
            this.P = true;
            this.setNeedsToPreProcess();
        }
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        if (this.O == azj_22) {
            return;
        }
        this.O = azj_22;
        for (int k = this.M.size() - 1; k >= 0; --k) {
            this.M.get(k).setModulationColor(azj_22);
        }
    }

    @Override
    public void setNonBlocking(boolean bl) {
        this.setNonBlocking(bl, true);
    }

    @Override
    public azj_2 getModulationColor() {
        return this.O;
    }

    void d() {
        if (this.A <= 1 || !this.z || this.M.size() <= 0) {
            return;
        }
        if (this.D) {
            int n = this.M.get(0).getWidth();
            int n2 = this.G.getWidth() / 2 - n / 2;
            float f2 = (float)(this.getAppearance().getContentWidth() - this.G.getWidth()) / (float)(this.A - 1);
            for (int k = 0; k < this.M.size(); ++k) {
                fsk_0 fsk_02 = this.M.get(k);
                fsk_02.setPosition((int)(f2 * (float)k + (float)n2), 0);
            }
        } else {
            int n = this.M.get(0).getHeight();
            int n3 = this.G.getHeight() / 2 - n / 2;
            float f3 = (float)(this.getAppearance().getContentHeight() - this.G.getHeight()) / (float)(this.A - 1);
            for (int k = 0; k < this.M.size(); ++k) {
                fsk_0 fsk_03 = this.M.get(k);
                fsk_03.setPosition(0, (int)(f3 * (float)k + (float)n3));
            }
        }
        this.Q = false;
        this.setNeedsToMiddleProcess();
    }

    @Override
    public void invalidate() {
        this.y = true;
        this.x = true;
        this.Q = true;
        this.setNeedsToMiddleProcess();
        super.invalidate();
    }

    private int getEffectiveMinBound() {
        if (this.v > this.t && this.v < this.w && this.v < this.u) {
            return this.v;
        }
        return this.t;
    }

    private int getEffectiveMaxBound() {
        int n;
        int n2 = n = this.z ? this.t + this.A - 1 : this.u;
        if (this.w < n && this.w > this.t && this.w > this.v) {
            return this.w;
        }
        return n;
    }

    float a(float f2) {
        int n = this.t;
        int n2 = this.z ? this.t + this.A - 1 : this.u;
        float f3 = f2 * (float)(n2 - n) + (float)n;
        if (this.z) {
            f3 = Math.round(f3);
        }
        return f3;
    }

    float b(float f2) {
        int n = this.t;
        int n2 = this.z ? this.t + this.A - 1 : this.u;
        return (f2 - (float)n) / (float)(n2 - n);
    }

    public void a() {
        int n;
        int n2;
        fjf_2 fjf_22 = this.G.getPrefSize();
        if (this.D) {
            n2 = this.getAppearance().getContentHeight();
            n = Math.max((int)((float)this.getAppearance().getContentWidth() * this.E), fjf_22.width);
        } else {
            n = this.getAppearance().getContentWidth();
            n2 = Math.max((int)((float)this.getAppearance().getContentHeight() * this.E), fjf_22.height);
        }
        this.G.setSize(n, n2);
        if (this.M != null && this.M.size() > 0) {
            fjf_2 fjf_23 = this.M.get(0).getPrefSize();
            int n3 = this.D ? fjf_23.width : n;
            int n4 = this.D ? n2 : fjf_23.height;
            for (fsk_0 fsk_02 : this.M) {
                fsk_02.setSize(n3, n4);
            }
        }
        this.y = false;
        this.setNeedsToMiddleProcess();
    }

    public void b() {
        int n;
        int n2;
        if (this.D) {
            n2 = 0;
            n = (int)(this.b(this.r) * (float)Math.max(0, this.getAppearance().getContentWidth() - this.G.getWidth()));
        } else {
            n = 0;
            n2 = (int)(this.b(this.r) * (float)Math.max(0, this.getAppearance().getContentHeight() - this.G.getHeight()));
        }
        this.G.setPosition(n, n2);
        this.x = false;
        this.setNeedsToMiddleProcess();
    }

    public void c() {
        this.J = new fun_0(this);
        this.addEventListener(frd_0.A, this.J, false);
        this.K = new fuo(this);
        this.addEventListener(frd_0.w, this.K, true);
        this.L = fzs2 -> {
            if (this.B) {
                return false;
            }
            if (!this.R) {
                return false;
            }
            float f2 = this.z ? 1.0f / (float)this.A + 0.001f : this.F;
            int n = ((fck_2)fzs2).z() * -1;
            float f3 = f2 * (float)n;
            this.setValue(this.a(this.b(this.r) + f3));
            return false;
        };
        this.addEventListener(frd_0.E, this.L, false);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.G = null;
        this.M.clear();
        this.y = false;
        this.N = null;
        this.Q = false;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fup fup2 = new fup(this);
        fup2.onCheckOut();
        this.add(fup2);
        this.G = new fru_0();
        this.G.onCheckOut();
        this.G.setCanBeCloned(false);
        this.add(this.G);
        this.H = 0;
        this.I = 0;
        this.m_nonBlocking = false;
        this.c();
    }

    @Override
    public boolean middleProcess(int n) {
        boolean bl = super.middleProcess(n);
        if (this.y || this.x) {
            this.invalidate();
        }
        return bl;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fum fum2 = (fum)fyo2;
        super.copyElement(fum2);
        fum2.r = this.r;
        fum2.t = this.t;
        fum2.u = this.u;
        fum2.v = this.v;
        fum2.w = this.w;
        fum2.z = this.z;
        fum2.A = this.A;
        fum2.s = this.s;
        fum2.D = this.D;
        fum2.F = this.F;
        fum2.E = this.E;
        fum2.M = this.M;
        fum2.setReadOnly(this.B);
        fum2.setUseTween(this.C);
        fum2.setModulationColor(this.O);
        fum2.setScrollOnMouseWheel(this.R);
        fum2.removeEventListener(frd_0.A, this.J, true);
        fum2.removeEventListener(frd_0.w, this.K, true);
        fum2.removeEventListener(frd_0.E, this.L, true);
        fum2.m_styleIsDirty = true;
        fum2.setNeedsToPreProcess();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1387629604) {
            this.setHorizontal(Co.a(string));
        } else if (n == -867683742) {
            this.setReadOnly(Co.a(string));
        } else if (n == -293147356) {
            this.setUseTween(Co.a(string));
        } else if (n == 381182586) {
            this.setMaxBound(Co.c(string));
        } else if (n == -1395014068) {
            this.setMinBound(Co.c(string));
        } else if (n == -1638048016) {
            this.setInnerMaxBound(Co.c(string));
        } else if (n == 880722626) {
            this.setInnerMinBound(Co.c(string));
        } else if (n == 3273774) {
            this.setJump(Co.e(string));
        } else if (n == 1106146434) {
            this.setSliderSize(Co.e(string));
        } else if (n == 111972721) {
            this.setValue(Co.e(string));
        } else if (n == -56707504) {
            this.setNumFixedValues(Co.c(string));
        } else if (n == -575832990) {
            this.setScrollOnMouseWheel(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1387629604) {
            this.setHorizontal(Co.b(object));
        } else if (n == -867683742) {
            this.setReadOnly(Co.b(object));
        } else if (n == -293147356) {
            this.setUseTween(Co.b(object));
        } else if (n == 381182586) {
            this.setMaxBound(Co.c(object));
        } else if (n == -1395014068) {
            this.setMinBound(Co.c(object));
        } else if (n == -1638048016) {
            this.setInnerMaxBound(Co.c(object));
        } else if (n == 880722626) {
            this.setInnerMinBound(Co.c(object));
        } else if (n == 3273774) {
            this.setJump(Co.e(object));
        } else if (n == 1106146434) {
            this.setSliderSize(Co.e(object));
        } else if (n == 111972721) {
            this.setValue(Co.e(object));
        } else if (n == -56707504) {
            this.setNumFixedValues(Co.c(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

