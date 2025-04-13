/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIP
 */
public class fip_1
extends fyg_0 {
    public static final String TAG = "tooltip";
    public static azj_2 a = azf_2.f;
    public static azj_2 b = new azf_2(1.0f, 1.0f, 1.0f, 0.7f);
    public static azj_2 c = new azf_2(0.06f, 0.04f, 0.03f, 0.4f);
    public static ayn_2 d;
    public static float e;
    public String f = "";
    public int g = 0;
    public int h = 0;
    public float i = e;
    public int j = aiQ.a();
    public float k = -1.0f;
    public azj_2 l = a;
    public azj_2 m = b;
    public azj_2 n = c;
    public ayn_2 o = d;
    public aiO p = aiO.a;
    public frs_0 q = frs_0.a;
    public static final int r = 3556653;
    public static final int s = 1287124693;
    public static final int t = 722830999;
    public static final int u;
    public static final int v = -1992012396;
    public static final int w = 967345036;
    public static final int x = 400381634;
    public static final int y = 0x2C929929;
    public static final int z;
    public static final int A = 1485313835;
    public static final int B = -1922149780;

    @Override
    public void copyElement(fyo fyo2) {
        fip_1 fip_12 = (fip_1)fyo2;
        super.copyElement(fyo2);
        fip_12.f = this.f;
        fip_12.g = this.g;
        fip_12.h = this.h;
        fip_12.j = this.j;
        fip_12.k = this.k;
        fip_12.setTextColor(this.l);
        fip_12.setBackgroundColor(this.m);
        fip_12.setBorderColor(this.n);
        fip_12.o = this.o;
        fip_12.p = this.p;
        fip_12.q = this.q;
        fip_12.i = this.i;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setDuration(int n) {
        this.j = n * 1000;
    }

    public azj_2 getBackgroundColor() {
        return this.m;
    }

    public azj_2 getBorderColor() {
        return this.n;
    }

    public float getBorderWidth() {
        return this.i;
    }

    public int getDuration() {
        return this.j;
    }

    public ayn_2 getFont() {
        return this.o;
    }

    public aiO getHotPointPosition() {
        return this.p;
    }

    public float getMaxWidth() {
        return this.k;
    }

    public frs_0 getPosition() {
        return this.q;
    }

    public String getText() {
        return this.f;
    }

    public azj_2 getTextColor() {
        return this.l;
    }

    public Integer getXOffset() {
        return this.g;
    }

    public int getYOffset() {
        return this.h;
    }

    public void setBackgroundColor(azj_2 azj_22) {
        if (this.m == azj_22) {
            return;
        }
        this.m = azj_22;
    }

    public void setBorderColor(azj_2 azj_22) {
        if (this.n == azj_22) {
            return;
        }
        this.n = azj_22;
    }

    public void setBorderWidth(float f2) {
        this.i = f2;
    }

    public void setHotPointPosition(aiO aiO2) {
        this.p = aiO2;
    }

    public void setMaxWidth(float f2) {
        this.k = f2;
    }

    public void setPosition(frs_0 frs_02) {
        this.q = frs_02;
    }

    public void setText(String string) {
        this.f = string;
    }

    public void setTextColor(azj_2 azj_22) {
        if (this.l == azj_22) {
            return;
        }
        this.l = azj_22;
    }

    public void setXOffset(int n) {
        this.g = n;
    }

    public void setYOffset(int n) {
        this.h = n;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 3556653) {
            this.setText(fze2.a(string, this.m_elementMap));
        } else if (n == 1287124693) {
            this.setBackgroundColor(fze2.a(string));
        } else if (n == 722830999) {
            this.setBorderColor(fze2.a(string));
        } else if (n == -1992012396) {
            this.setDuration(Co.c(string));
        } else if (n == 967345036) {
            this.setHotPointPosition(aiO.a(string));
        } else if (n == 400381634) {
            this.setMaxWidth(Co.e(string));
        } else if (n == 0x2C929929) {
            this.setPosition(frs_0.a(string));
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
        if (n == 3556653) {
            this.setText(String.valueOf(object));
        } else if (n == 1287124693) {
            this.setBackgroundColor((azj_2)object);
        } else if (n == 722830999) {
            this.setBorderColor((azj_2)object);
        } else if (n == -1992012396) {
            this.setDuration(Co.c(object));
        } else if (n == 967345036) {
            this.setHotPointPosition((aiO)((Object)object));
        } else if (n == 400381634) {
            this.setMaxWidth(Co.e(object));
        } else if (n == 0x2C929929) {
            this.setPosition((frs_0)((Object)object));
        } else if (n == 1485313835) {
            this.setXOffset(Co.c(object));
        } else if (n == -1922149780) {
            this.setYOffset(Co.c(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.l = null;
        this.m = null;
        this.n = null;
    }

    static {
        e = 1.5f;
        u = "borderWidth".hashCode();
        z = "textColor".hashCode();
    }
}

