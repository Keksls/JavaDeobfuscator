/*
 * Decompiled with CFR 0.152.
 */
public class ftF
extends fso
implements fqf_0,
fqm,
fqt {
    public static final String TAG = "progressText";
    public static final String a = " / ";
    public static final String b = "\u00af";
    public static final String c = "%";
    fsM n;
    fsM o;
    fsM p;
    private frh_0 q = frh_0.c;
    private azj_2 r = null;
    private ayf_2 s = null;
    boolean t = true;
    private fqz_0 u = fqz_0.d;
    private boolean v = true;
    public static final float d = 0.0f;
    public static final float e = 1.0f;
    private float w = 0.0f;
    private float x = 1.0f;
    private float y = 0.0f;
    public static final int f = 1606398415;
    public static final int g = 3148879;
    public static final int h = 1387629604;
    public static final int i = 381182586;
    public static final int j = -1395014068;
    public static final int k = 404338535;
    public static final int l = 728975971;
    public static final int m = 111972721;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return fqj2 instanceof fqh_0;
    }

    @Override
    public fqh_0 getAppearance() {
        return (fqh_0)this.m_appearance;
    }

    public void setTextOrientation(frh_0 frh_02) {
        this.q = frh_02;
        if (this.n != null) {
            this.n.setOrientation(frh_02);
        }
        if (this.o != null) {
            this.o.setOrientation(frh_02);
        }
        if (this.p != null) {
            this.p.setOrientation(frh_02);
        }
    }

    @Override
    public void setFont(ayf_2 ayf_22) {
        if (this.n != null) {
            this.n.setFont(ayf_22);
        }
        if (this.o != null) {
            this.o.setFont(ayf_22);
        }
        if (this.p != null) {
            this.p.setFont(ayf_22);
        }
        this.s = ayf_22;
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        if (this.n != null) {
            this.n.setModulationColor(azj_22);
        }
        if (this.o != null) {
            this.o.setModulationColor(azj_22);
        }
        if (this.p != null) {
            this.p.setModulationColor(azj_22);
        }
    }

    @Override
    public azj_2 getModulationColor() {
        if (this.n != null) {
            return this.n.getModulationColor();
        }
        return null;
    }

    @Override
    public void setColor(azj_2 azj_22, String string) {
        if (string == null || string.equalsIgnoreCase("text")) {
            if (this.r == azj_22) {
                return;
            }
            this.r = azj_22;
            if (this.n != null) {
                this.n.setColor(this.r, null);
            }
            if (this.o != null) {
                this.o.setColor(this.r, null);
            }
            if (this.p != null) {
                this.p.setColor(this.r, null);
            }
        }
    }

    private void setText(String string) {
        this.setText(string, null);
    }

    private void setText(String object, String string) {
        if (!(this.v || object == null || ((String)object).isEmpty() || string == null || string.isEmpty())) {
            object = (String)object + a + string;
            if (this.o != null) {
                this.destroy(this.o);
                this.o = null;
            }
            if (this.p != null) {
                this.destroy(this.p);
                this.p = null;
            }
        }
        if (object == null || ((String)object).isEmpty()) {
            if (this.n != null) {
                this.destroy(this.n);
                this.n = null;
            }
            if (this.o != null) {
                this.destroy(this.o);
                this.o = null;
            }
            if (this.p != null) {
                this.destroy(this.p);
                this.p = null;
            }
            return;
        }
        if (this.n == null) {
            this.n = new fsM();
            this.n.onCheckOut();
            this.a(this.n);
            this.add(this.n);
        }
        this.n.c((String)object);
        if (!this.v) {
            return;
        }
        if (string != null && !string.isEmpty()) {
            if (this.o == null) {
                this.o = new fsM();
                this.o.onCheckOut();
                this.a(this.o);
                this.add(this.o);
                this.o.c(b);
            }
            if (this.p == null) {
                this.p = new fsM();
                this.p.onCheckOut();
                this.a(this.p);
                this.add(this.p);
            }
            this.p.c(string);
        } else {
            if (this.o != null) {
                this.destroy(this.o);
                this.o = null;
            }
            if (this.p != null) {
                this.destroy(this.p);
                this.p = null;
            }
        }
    }

    private String getText() {
        if (this.n != null) {
            return this.n.getText();
        }
        return "";
    }

    public float getMinBound() {
        return this.w;
    }

    public void setMinBound(float f2) {
        this.w = f2;
        if (this.y < this.w) {
            this.y = this.w;
        }
        this.a();
    }

    public float getMaxBound() {
        return this.x;
    }

    public void setMaxBound(float f2) {
        this.x = f2;
        if (this.y > this.x) {
            this.y = this.x;
        }
        this.a();
    }

    public float getPercentage() {
        return (this.y - this.w) / (this.x - this.w);
    }

    public float getValue() {
        return this.y;
    }

    public void setValue(float f2) {
        if (f2 < this.w) {
            f2 = this.w;
        }
        if (f2 > this.x) {
            f2 = this.x;
        }
        this.y = f2;
        this.a();
    }

    public boolean isHorizontal() {
        return this.t;
    }

    public void setHorizontal(boolean bl) {
        if (this.t != bl) {
            this.t = bl;
        }
        this.invalidateMinSize();
    }

    public boolean getSplitText() {
        return this.v;
    }

    public void setSplitText(boolean bl) {
        this.v = bl;
    }

    public fqz_0 getDisplayValue() {
        return this.u;
    }

    public void setDisplayValue(fqz_0 fqz_02) {
        this.u = fqz_02;
        this.a();
    }

    private void a(fsM fsM2) {
        fsM2.setExpandable(false);
        fsM2.setAlign(frs_0.e);
        fsM2.setFont(this.s);
        fsM2.setOrientation(this.q);
        fsM2.setColor(this.r, null);
    }

    @Override
    public void validate() {
        super.validate();
    }

    private void a() {
        switch (this.u) {
            case a: {
                if ((double)this.y - Math.floor(this.y) != 0.0) {
                    this.setText(Float.toString(this.y));
                    break;
                }
                this.setText(Integer.toString((int)this.y));
                break;
            }
            case b: {
                this.setText(Integer.toString((int)(this.getPercentage() * 100.0f)) + c);
                break;
            }
            case c: {
                String string = (double)this.y - Math.floor(this.y) != 0.0 ? Float.toString(this.y) : Integer.toString((int)this.y);
                String string2 = (double)this.x - Math.floor(this.x) != 0.0 ? Float.toString(this.x) : Integer.toString((int)this.x);
                this.setText(string, string2);
                break;
            }
            default: {
                this.setText("");
            }
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        ftF ftF2 = (ftF)fyo2;
        ftF2.setHorizontal(this.t);
        ftF2.setValue(this.y);
        ftF2.setMaxBound(this.x);
        ftF2.setMinBound(this.w);
        ftF2.setSplitText(this.v);
        ftF2.setTextOrientation(this.q);
        ftF2.setText(this.getText(), this.p != null ? this.p.getText() : "");
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.q = null;
        this.s = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.r = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fqh_0 fqh_02 = fqh_0.checkOut();
        fqh_02.setWidget(this);
        this.add(fqh_02);
        fth_0 fth_02 = new fth_0(this);
        fth_02.onCheckOut();
        this.add(fth_02);
        this.setNonBlocking(false);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1606398415) {
            this.setDisplayValue(fqz_0.a(string));
        } else if (n == 381182586) {
            this.setMaxBound(Co.e(string));
        } else if (n == -1395014068) {
            this.setMinBound(Co.e(string));
        } else if (n == 3148879) {
            this.setFont(fze2.e(string));
        } else if (n == 1387629604) {
            this.setHorizontal(Co.a(string));
        } else if (n == 404338535) {
            this.setSplitText(Co.a(string));
        } else if (n == 728975971) {
            this.setTextOrientation(frh_0.a(string));
        } else if (n == 111972721) {
            this.setValue(Co.e(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1606398415) {
            this.setDisplayValue((fqz_0)((Object)object));
        } else if (n == 381182586) {
            this.setMaxBound(Co.e(object));
        } else if (n == -1395014068) {
            this.setMinBound(Co.e(object));
        } else if (n == 3148879) {
            this.setFont((ays_1)object);
        } else if (n == 1387629604) {
            this.setHorizontal(Co.b(object));
        } else if (n == 404338535) {
            this.setSplitText(Co.b(object));
        } else if (n == 728975971) {
            this.setTextOrientation((frh_0)((Object)object));
        } else if (n == 111972721) {
            this.setValue(Co.e(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

