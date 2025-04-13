/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

public class ftv
extends fso
implements fqt {
    public static final String TAG = "progressBar";
    private fwk_0 r;
    boolean s = true;
    private float t = 1.0f;
    private float u = 1.5707964f;
    public static final float a = 0.0f;
    public static final float b = 1.0f;
    private float v = 0.0f;
    private float w = 1.0f;
    private float x = 0.0f;
    private float y = 0.0f;
    float z = 0.0f;
    private boolean A = true;
    private boolean B = true;
    private ftw_0 C;
    private boolean D = false;
    float[] E = null;
    final ArrayList<fsk_0> F = new ArrayList();
    boolean G = false;
    fqv H = null;
    private long I = -1L;
    private fjw_2 J;
    public static final int c = 1387629604;
    public static final int d = 825634873;
    public static final int e = 1615814651;
    public static final int f = 381182586;
    public static final int g = -1395014068;
    public static final int h = 1714350876;
    public static final int i = -407672363;
    public static final int j = -2079976199;
    public static final int k = 111972721;
    public static final int l = -418368371;
    public static final int m = 627673908;
    public static final int n = "markers".hashCode();
    public static final int o = 145579295;
    public static final int p = -627831160;
    public static final int q = 2139943149;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqv) {
            this.setPixmap((fqv)fyb_02);
        }
        super.add(fyb_02);
    }

    public void setPixmap(fqv fqv2) {
        if (fqv2 != this.H) {
            this.H = fqv2;
            this.setNeedsToPreProcess();
        }
    }

    @Override
    public void invalidate() {
        this.G = true;
        super.invalidate();
    }

    @Override
    protected void addInnerMeshes() {
        super.addInnerMeshes();
        this.m_entity.a(this.r.a());
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return fqj2 instanceof fqx;
    }

    @Override
    public fqx getAppearance() {
        return (fqx)this.m_appearance;
    }

    public boolean getUseIncreaseProgressTween() {
        return this.A;
    }

    public void setUseIncreaseProgressTween(boolean bl) {
        this.A = bl;
    }

    public boolean getUseDecreaseProgressTween() {
        return this.B;
    }

    public void setUseDecreaseProgressTween(boolean bl) {
        this.B = bl;
    }

    public void setPixmaps(fqv fqv2, fqv fqv3, fqv fqv4, fqv fqv5, fqv fqv6, fqv fqv7, fqv fqv8, fqv fqv9, fqv fqv10) {
        if (this.C == ftw_0.a) {
            this.setDisplayType(ftw_0.b);
        }
        this.r.a(fqv2.getPixmap(), fqv3.getPixmap(), fqv4.getPixmap(), fqv5.getPixmap(), fqv6.getPixmap(), fqv7.getPixmap(), fqv8.getPixmap(), fqv9.getPixmap(), fqv10.getPixmap());
        int n = fqv2.getPixmap().e() + fqv4.getPixmap().e();
        int n2 = fqv2.getPixmap().d() + fqv8.getPixmap().d();
        this.setMinSize(new fjf_2(n, n2));
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        if (this.r != null) {
            this.r.setModulationColor(azj_22);
        }
        for (int k = this.F.size() - 1; k >= 0; --k) {
            this.F.get(k).setModulationColor(azj_22);
        }
    }

    @Override
    public azj_2 getModulationColor() {
        if (this.r != null) {
            return this.r.getModulationColor();
        }
        return null;
    }

    public void setColor(azj_2 azj_22, String string) {
        if (string == null || string.equalsIgnoreCase(TAG)) {
            this.r.a(azj_22);
            this.setMinSize(new fjf_2(0, 0));
        } else if (string.equals("progressBarBorder")) {
            this.r.b(azj_22);
        }
    }

    public void setInnerPosition(frs_0 frs_02) {
        if (this.r != null) {
            this.r.a(frs_02);
        }
    }

    public void setInnerBorder(Insets insets) {
        if (this.r != null) {
            this.r.a(insets);
        }
        this.setMinSize(new fjf_2(insets.left + insets.right, insets.bottom + insets.top));
    }

    public float getMinBound() {
        return this.v;
    }

    public void setMinBound(float f2) {
        this.v = f2;
        if (this.x < this.v) {
            this.setValue(this.v);
        }
        this.a();
    }

    public float getMaxBound() {
        return this.w;
    }

    public void setMaxBound(float f2) {
        this.w = f2;
        if (this.x > this.w) {
            this.setValue(this.w);
        }
        this.a();
    }

    public float getPercentage() {
        return Math.max(0.0f, Math.min(1.0f, (this.x - this.v) / (this.w - this.v)));
    }

    private float getVisualPercentage() {
        return Math.max(0.0f, Math.min(1.0f, (this.z - this.v) / (this.w - this.v)));
    }

    public float getValue() {
        return this.x;
    }

    public fjg_2 setValue(float f2) {
        f2 = Hw.b(f2, this.v, this.w);
        boolean bl = this.A && f2 > this.x || this.B && f2 < this.x;
        this.removeTweensOfType(ftE.class);
        ftE ftE2 = new ftE(this, this.D ? this.w - this.z : this.z, this.D ? this.w - f2 : f2, this, 0, bl ? (int)(this.I != -1L ? this.I : 500L) : 0, this.J);
        this.addTween(ftE2);
        this.x = f2;
        return ftE2;
    }

    public fjw_2 getTweenFunction() {
        return this.J;
    }

    public void setTweenFunction(@NotNull fjw_2 fjw_22) {
        this.J = fjw_22;
    }

    public float getInitialValue() {
        return this.y;
    }

    public void setInitialValue(float f2) {
        this.y = f2;
        this.z = f2;
        this.x = this.y;
        this.a();
    }

    public float getFullCirclePercentage() {
        return this.t;
    }

    public void setFullCirclePercentage(float f2) {
        this.t = f2;
        if (this.r != null) {
            this.r.a(f2);
        }
    }

    public float getDeltaAngle() {
        return this.u;
    }

    public void setDeltaAngle(float f2) {
        this.u = f2;
        if (this.r != null) {
            this.r.b(f2);
        }
    }

    public ftw_0 getDisplayType() {
        return this.C;
    }

    public void setDisplayType(ftw_0 ftw_02) {
        if (this.C != ftw_02 || this.r == null) {
            this.C = ftw_02;
            azj_2 azj_22 = null;
            azj_2 azj_23 = null;
            azj_2 azj_24 = null;
            Insets insets = null;
            if (this.r != null) {
                azj_22 = this.r.d();
                azj_23 = this.r.e();
                azj_24 = this.r.getModulationColor();
                insets = this.r.i();
                this.r.c();
            }
            this.r = this.C.a();
            this.r.b();
            this.r.a(this.s);
            this.r.a(azj_22);
            this.r.b(azj_23);
            this.r.setModulationColor(azj_24);
            if (insets != null) {
                this.r.a(insets);
            }
            this.r.a(this.t);
            this.r.b(this.u);
            if (this.m_appearance != null) {
                fqx fqx2 = (fqx)this.m_appearance;
                fqx2.a();
            }
        }
    }

    public boolean isHorizontal() {
        return this.s;
    }

    public void setHorizontal(boolean bl) {
        this.s = bl;
        if (this.r != null) {
            this.r.a(bl);
        }
    }

    public boolean isInversed() {
        return this.D;
    }

    public void setInversed(boolean bl) {
        this.D = bl;
    }

    public void setInnerRadiusFactor(float f2) {
        if (this.r instanceof fwn_0) {
            ((fwn_0)this.r).c(f2);
        }
    }

    public void setOuterRadiusFactor(float f2) {
        if (this.r instanceof fwn_0) {
            ((fwn_0)this.r).d(f2);
        }
    }

    public void setMarkers(float[] fArray) {
        if (this.E != null && Arrays.equals(this.E, fArray)) {
            return;
        }
        this.E = fArray;
        this.invalidate();
    }

    public void setTweenDuration(long l) {
        this.I = l;
    }

    public fwk_0 getProgressBarMesh() {
        return this.r;
    }

    @Override
    public void validate() {
        super.validate();
        this.a();
    }

    public void a() {
        if (this.r != null) {
            int n;
            int n2;
            int n3 = this.m_appearance.getContentWidth();
            int n4 = this.m_appearance.getContentHeight();
            float f2 = this.getVisualPercentage();
            if (this.s) {
                if (this.D) {
                    n2 = this.m_appearance.getLeftInset() + (int)((float)n3 * f2) + 1;
                    f2 = 1.0f - f2;
                } else {
                    n2 = this.m_appearance.getLeftInset();
                }
                n = this.m_appearance.getBottomInset();
            } else {
                if (this.D) {
                    n = this.m_appearance.getBottomInset() + (int)((float)n4 * f2) + 1;
                    f2 = 1.0f - f2;
                } else {
                    n = this.m_appearance.getBottomInset();
                }
                n2 = this.m_appearance.getLeftInset();
            }
            this.r.a(n2, n, n3, n4, f2);
        }
    }

    @Override
    public boolean middleProcess(int n) {
        boolean bl = super.middleProcess(n);
        if (this.G) {
            this.invalidate();
        }
        return bl;
    }

    @Override
    public void copyElement(fyo fyo2) {
        ftv ftv2 = (ftv)fyo2;
        super.copyElement(fyo2);
        ftv2.setDisplayType(this.getDisplayType());
        ftv2.setUseIncreaseProgressTween(this.A);
        ftv2.setUseDecreaseProgressTween(this.B);
        ftv2.setHorizontal(this.s);
        ftv2.setValue(this.x);
        ftv2.setInitialValue(this.y);
        ftv2.setMaxBound(this.w);
        ftv2.setMinBound(this.v);
        ftv2.setFullCirclePercentage(this.t);
        ftv2.setDeltaAngle(this.u);
        ftv2.H = this.H;
        ftv2.setInversed(this.D);
        ftv2.setTweenDuration(this.I);
        ftv2.setNeedsToPreProcess();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.r.c();
        this.r = null;
        this.F.clear();
        this.G = false;
        this.H = null;
        this.E = null;
        this.I = -1L;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fqx fqx2 = new fqx();
        fqx2.onCheckOut();
        fqx2.setWidget(this);
        this.add(fqx2);
        ftD ftD2 = new ftD(this);
        ftD2.onCheckOut();
        this.add(ftD2);
        this.t = 1.0f;
        this.u = 1.5707964f;
        this.s = true;
        this.B = true;
        this.A = true;
        this.D = false;
        this.setDisplayType(ftw_0.a);
        this.setNonBlocking(false);
        this.J = fjw_2.a;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1387629604) {
            this.setHorizontal(Co.a(string));
        } else if (n == 1615814651) {
            this.setDeltaAngle(Co.e(string));
        } else if (n == 381182586) {
            this.setMaxBound(Co.e(string));
        } else if (n == 825634873) {
            this.setFullCirclePercentage(Co.e(string));
        } else if (n == -1395014068) {
            this.setMinBound(Co.e(string));
        } else if (n == -407672363) {
            this.setUseIncreaseProgressTween(Co.a(string));
        } else if (n == -2079976199) {
            this.setUseDecreaseProgressTween(Co.a(string));
        } else if (n == 111972721) {
            this.setValue(Co.e(string));
        } else if (n == -418368371) {
            this.setInitialValue(Co.e(string));
        } else if (n == 1714350876) {
            this.setDisplayType(ftw_0.a(string));
        } else if (n == 627673908) {
            this.setInversed(Co.a(string));
        } else if (n == -627831160) {
            this.setInnerRadiusFactor(Co.e(string));
        } else if (n == 2139943149) {
            this.setOuterRadiusFactor(Co.e(string));
        } else if (n == 145579295) {
            this.setTweenDuration(Co.f(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 381182586) {
            this.setMaxBound(Co.e(object));
            return true;
        } else if (n == -1395014068) {
            this.setMinBound(Co.e(object));
            return true;
        } else if (n == 111972721) {
            this.setValue(Co.e(object));
            return true;
        } else if (n == -418368371) {
            this.setInitialValue(Co.e(object));
            return true;
        } else if (n == 627673908) {
            this.setInversed(Co.b(object));
            return true;
        } else if (n == ftv.n) {
            if (object != null && !(object instanceof float[])) return false;
            this.setMarkers((float[])object);
            return true;
        } else {
            if (n != 145579295) return super.setPropertyAttribute(n, object);
            this.setTweenDuration(Co.f(object));
        }
        return true;
    }
}

