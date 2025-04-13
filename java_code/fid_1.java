/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fID
 */
public class fid_1
extends fif_1 {
    public static final String TAG = "StaticLayoutData";
    public static final String a = "sld";
    private fjf_2 o;
    private frk_0 p;
    private int q = 0;
    private int r = 0;
    private fjv_1 s;
    private fjv_1 t;
    private int u = 0;
    private int v = 0;
    private boolean w = false;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;
    private boolean A = false;
    private boolean B = true;
    private fvE C = null;
    private String D = null;
    private boolean E = false;
    public static final int b = 92903173;
    public static final int c = 1767875043;
    public static final int d = 196702412;
    public static final int e = 2049815893;
    public static final int f = -266541503;
    public static final int g = 3530753;
    public static final int h = -836164360;
    public static final int i = 120;
    public static final int j = 1485313835;
    public static final int k = 113306494;
    public static final int l = 121;
    public static final int m = -1922149780;
    public static final int n = 114230015;

    @Override
    public String getTag() {
        return TAG;
    }

    public boolean isInitValue() {
        return this.A;
    }

    public void setInitValue(boolean bl) {
        this.A = bl;
        this.B = true;
    }

    @Deprecated
    public void setResizeOnce(boolean bl) {
        this.setInitValue(bl);
    }

    public boolean isAutoPositionable() {
        return this.C != null;
    }

    public boolean isCascadePositionable() {
        return this.E;
    }

    public fvE getReferentWidget() {
        return this.C;
    }

    public void setReferentWidget(fvE fvE2) {
        this.C = fvE2;
    }

    public void setCascadeMethodEnabled(boolean bl) {
        this.E = bl;
    }

    public String getControlGroup() {
        return this.D;
    }

    public void setControlGroup(String string) {
        this.D = string;
    }

    public int getX() {
        return this.q;
    }

    public fjv_1 getXPerc() {
        return this.s;
    }

    public void setXPerc(fjv_1 fjv_12) {
        this.s = fjv_12;
    }

    public fjv_1 getYPerc() {
        return this.t;
    }

    public void setYPerc(fjv_1 fjv_12) {
        this.t = fjv_12;
    }

    public void setX(int n) {
        this.w = true;
        this.q = n;
    }

    public boolean isXInit() {
        return this.w;
    }

    public int getY() {
        return this.r;
    }

    public void setY(int n) {
        this.x = true;
        this.r = n;
    }

    public boolean isYInit() {
        return this.x;
    }

    public int getXOffset() {
        return this.u;
    }

    public void setXOffset(int n) {
        this.y = true;
        this.u = n;
    }

    public int getYOffset() {
        return this.v;
    }

    public void setYOffset(int n) {
        this.z = true;
        this.v = n;
    }

    public boolean isXOffsetInit() {
        return this.y;
    }

    public boolean isYOffsetInit() {
        return this.z;
    }

    public fjf_2 getSize() {
        return this.o;
    }

    public void setSize(fjf_2 fjf_22) {
        this.o = fjf_22;
    }

    public frk_0 getAlignment() {
        return this.p;
    }

    public void setAlignment(frk_0 frk_02) {
        this.p = frk_02;
    }

    public void setAlign(frk_0 frk_02) {
        this.p = frk_02;
    }

    public void setUsable(boolean bl) {
        this.B = bl;
    }

    public boolean isUsable() {
        return !this.A || this.B;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.q = 0;
        this.r = 0;
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.E = false;
        this.B = true;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.C = null;
        this.o = null;
        this.p = null;
        this.D = null;
        this.s = null;
        this.t = null;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fid_1 fid_12 = (fid_1)fyo2;
        super.copyElement(fid_12);
        fid_12.p = this.p;
        if (this.o != null) {
            fid_12.o = (fjf_2)this.o.clone();
        }
        if (this.w) {
            fid_12.setX(this.q);
        }
        if (this.x) {
            fid_12.setY(this.r);
        }
        if (this.y) {
            fid_12.setXOffset(this.u);
        }
        if (this.z) {
            fid_12.setYOffset(this.v);
        }
        if (this.s != null) {
            fid_12.setXPerc((fjv_1)this.s.clone());
        }
        if (this.t != null) {
            fid_12.setYPerc((fjv_1)this.t.clone());
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 92903173 || n == 1767875043) {
            this.setAlign(frk_0.a(string));
        } else if (n == 196702412) {
            this.setCascadeMethodEnabled(Co.a(string));
        } else if (n == 2049815893 || n == -266541503) {
            this.setInitValue(Co.a(string));
        } else if (n == 3530753) {
            this.setSize(fze2.b(string));
        } else if (n == -836164360) {
            this.setUsable(Co.a(string));
        } else if (n == 120) {
            this.setX(Co.c(string));
        } else if (n == 1485313835) {
            this.setXOffset(Co.c(string));
        } else if (n == 113306494) {
            this.setXPerc(fze2.f(string));
        } else if (n == 121) {
            this.setY(Co.c(string));
        } else if (n == -1922149780) {
            this.setYOffset(Co.c(string));
        } else if (n == 114230015) {
            this.setYPerc(fze2.f(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 113306494) {
            this.setXPerc((fjv_1)object);
        } else if (n == 114230015) {
            this.setYPerc((fjv_1)object);
        } else if (n == 3530753) {
            this.setSize((fjf_2)object);
        } else if (n == 1485313835) {
            this.setXOffset((Integer)object);
        } else if (n == -1922149780) {
            this.setYOffset((Integer)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

