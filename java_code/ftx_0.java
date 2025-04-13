/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ftX
 */
public class ftx_0
extends fso {
    private static Logger j = Logger.getLogger(ftx_0.class);
    public static final String TAG = "ScrollBar";
    public static final String a = "horizontalSlider";
    public static final String b = "verticalSlider";
    public static final String c = "horizontalIncreaseButton";
    public static final String d = "verticalIncreaseButton";
    public static final String e = "horizontalDecreaseButton";
    public static final String f = "verticalDecreaseButton";
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    int n;
    private fzu o;
    private fzu p;
    private fzu q;
    private fzu r;
    final fud_0 s = new fud_0(this);
    boolean t;
    float u = 0.05f;
    fru_0 v;
    fru_0 w;
    fum x;
    public static final int g = 1387629604;
    public static final int h = 358262400;
    public static final int i = 111972721;

    @Override
    public String getTag() {
        return TAG;
    }

    public float getValue() {
        return this.x.getValue();
    }

    public void setValue(float f2) {
        this.x.setValue(f2);
    }

    public float getButtonJump() {
        return this.u;
    }

    public void setButtonJump(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.u = f2;
    }

    public boolean isHorizontal() {
        return this.t;
    }

    public void setHorizontal(boolean bl) {
        this.t = bl;
        this.x.setHorizontal(bl);
    }

    public fum getSlider() {
        return this.x;
    }

    public void setSlider(fum fum2) {
        this.x = fum2;
    }

    public void setSliderSize(float f2) {
        this.x.setSliderSize(f2);
        boolean bl = f2 != 1.0f;
        this.x.getButton().setVisible(bl);
        this.v.setEnabled(bl);
        this.w.setEnabled(bl);
    }

    public fru_0 getDecreaseButton() {
        return this.w;
    }

    public void setDecreaseButton(fru_0 fru_02) {
        this.w = fru_02;
    }

    public void setIncreaseButton(fru_0 fru_02) {
        this.v = fru_02;
    }

    public fru_0 getIncreaseButton() {
        return this.v;
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (this.t || bl) {
            if (a.equalsIgnoreCase(string)) {
                return this.x;
            }
            if (e.equalsIgnoreCase(string)) {
                return this.w;
            }
            if (c.equalsIgnoreCase(string)) {
                return this.v;
            }
        }
        if (!this.t || bl) {
            if (b.equalsIgnoreCase(string)) {
                return this.x;
            }
            if (f.equalsIgnoreCase(string)) {
                return this.w;
            }
            if (d.equalsIgnoreCase(string)) {
                return this.v;
            }
        }
        return null;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.v.setEnabled(bl);
        this.w.setEnabled(bl);
        this.x.setEnabled(bl);
        this.x.setVisible(this.x.isEnabledFull());
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        this.v.setNetEnabled(bl);
        this.w.setNetEnabled(bl);
        this.x.setNetEnabled(bl);
        this.x.setVisible(this.isEnabledFull());
    }

    public void a() {
        int n = 0;
        int n2 = 0;
        if (this.t) {
            this.w.setPosition(n, n2);
            this.x.setPosition(n + this.w.getWidth(), n2);
            n = this.getAppearance().getContentWidth() - this.w.getWidth();
            this.v.setPosition(n, n2);
        } else {
            n2 = this.getAppearance().getContentHeight() - this.v.getHeight();
            this.v.setPosition(n, n2);
            n2 = 0;
            this.w.setPosition(n, n2);
            this.x.setPosition(n, n2 + this.w.getHeight());
        }
    }

    void c() {
        if (this.n != 0) {
            adi_2.a().a(this.s);
            adi_2.a().a(this.s, 150L, this.n, 1L);
        }
    }

    public void b() {
        this.o = new ftY(this);
        this.p = new ftz_0(this);
        this.q = new fua(this);
        this.r = new fub(this);
        fta_0.getInstance().addEventListener(frd_0.B, this.o, false);
        this.addEventListener(frd_0.C, this.p, false);
        this.v.addEventListener(frd_0.z, this.o, false);
        this.v.addEventListener(frd_0.A, this.q, false);
        this.v.addEventListener(frd_0.y, this.q, false);
        this.w.addEventListener(frd_0.z, this.o, false);
        this.w.addEventListener(frd_0.A, this.r, false);
        this.w.addEventListener(frd_0.y, this.r, false);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.v = null;
        this.w = null;
        this.x = null;
        fta_0.getInstance().removeEventListener(frd_0.B, this.o, false);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fuc fuc2 = new fuc(this);
        fuc2.onCheckOut();
        this.add(fuc2);
        this.v = new fru_0();
        this.v.onCheckOut();
        this.v.setCanBeCloned(false);
        this.v.setClickSoundId(fza_0.a().k());
        this.w = new fru_0();
        this.w.onCheckOut();
        this.w.setCanBeCloned(false);
        this.w.setClickSoundId(fza_0.a().l());
        this.x = new fum();
        this.x.onCheckOut();
        this.x.setCanBeCloned(false);
        this.m_nonBlocking = false;
        this.add(this.w);
        this.add(this.v);
        this.add(this.x);
        this.b();
    }

    @Override
    public void copyElement(fyo fyo2) {
        ftx_0 ftx_02 = (ftx_0)fyo2;
        super.copyElement(ftx_02);
        ftx_02.t = this.t;
        ftx_02.u = this.u;
        ftx_02.removeEventListener(frd_0.C, this.p, false);
        ftx_02.getIncreaseButton().removeEventListener(frd_0.y, this.q, false);
        ftx_02.getIncreaseButton().removeEventListener(frd_0.A, this.q, false);
        ftx_02.getIncreaseButton().removeEventListener(frd_0.z, this.o, false);
        ftx_02.getDecreaseButton().removeEventListener(frd_0.y, this.r, false);
        ftx_02.getDecreaseButton().removeEventListener(frd_0.A, this.r, false);
        ftx_02.getDecreaseButton().removeEventListener(frd_0.z, this.o, false);
        ftx_02.m_styleIsDirty = true;
        ftx_02.setNeedsToPreProcess();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1387629604) {
            this.setHorizontal(Co.a(string));
        } else if (n == 358262400) {
            this.setButtonJump(Co.e(string));
        } else if (n == 111972721) {
            this.setValue(Co.e(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1387629604) {
            this.setHorizontal(Co.b(object));
        } else if (n == 358262400) {
            this.setButtonJump(Co.e(object));
        } else if (n == 111972721) {
            this.setValue(Co.e(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

