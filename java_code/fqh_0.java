/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from fqH
 */
public class fqh_0
extends fqj {
    public static final String TAG = "TextWidgetAppearance";
    public static final String T = "TextViewAppearance";
    public static final String U = "LabelAppearance";
    public static final String V = "text";
    private static final ObjectPool a = new abm_1(new fqi_0());
    private frs_0 b;
    private ayf_2 c;
    private azj_2 d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    public static final int W = 92903173;
    public static final int X = 1767875043;
    public static final int Y = -1249482096;
    public static final int Z = 3148879;
    public static final int aa = -1063571914;
    public static final int ab = 1153931755;

    public static fqh_0 checkOut() {
        fqh_0 fqh_02;
        try {
            fqh_02 = (fqh_0)a.borrowObject();
            fqh_02.m_currentPool = a;
        }
        catch (Exception exception) {
            l.error((Object)"Probl\u00e8me au borrowObject.");
            fqh_02 = new fqh_0();
            fqh_02.onCheckOut();
        }
        return fqh_02;
    }

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setWidget(fvE fvE2) {
        if (this.b != null && fvE2 instanceof fpz_0) {
            ((fpz_0)((Object)fvE2)).setAlign(this.b);
        }
        if (this.c != null && fvE2 instanceof fqm) {
            ((fqm)((Object)fvE2)).setFont(this.c);
        }
        if (this.d != null && fvE2 instanceof fqf_0) {
            ((fqf_0)((Object)fvE2)).setColor(this.d, null);
        }
        if (this.f && this.I instanceof fxz) {
            ((fxz)((Object)this.I)).setUseHighContrast(this.e);
        }
        if (this.h && this.I instanceof fxz) {
            ((fxz)((Object)this.I)).setJustify(this.g);
        }
        super.setWidget(fvE2);
    }

    public void setUseHighContrast(boolean bl) {
        this.e = bl;
        this.f = true;
        if (this.I != null && this.I instanceof ful_0) {
            ((ful_0)this.I).setUseHighContrast(this.e);
        }
    }

    public boolean getUseHighContrast() {
        return this.e;
    }

    public boolean getJustify() {
        return this.g;
    }

    public void setJustify(boolean bl) {
        this.g = bl;
        this.h = true;
        if (this.I != null && this.I instanceof ful_0) {
            ((ful_0)this.I).setJustify(bl);
        }
    }

    public void setAlign(frs_0 frs_02) {
        this.b = frs_02;
        if (this.b != null && this.I != null && this.I instanceof fpz_0) {
            ((fpz_0)((Object)this.I)).setAlign(frs_02);
        }
    }

    public frs_0 getAlign() {
        return this.b;
    }

    @Deprecated
    public void setAlignment(frs_0 frs_02) {
        this.setAlign(frs_02);
    }

    @Deprecated
    public frs_0 getAlignment() {
        fbk_2 fbk_22;
        int n;
        int n2 = this.v.size();
        for (n = 0; n < n2; ++n) {
            fbk_22 = (fbk_2)this.v.get(n);
            if (!(fbk_22 instanceof fqa_0) || !fbk_22.getState().equalsIgnoreCase(this.x)) continue;
            return ((fqa_0)fbk_22).getAlignment();
        }
        n2 = this.v.size();
        for (n = 0; n < n2; ++n) {
            fbk_22 = (fbk_2)this.v.get(n);
            if (!(fbk_22 instanceof fqa_0) || !fbk_22.getState().equalsIgnoreCase(r)) continue;
            return ((fqa_0)fbk_22).getAlignment();
        }
        return this.b;
    }

    public void setFont(ayf_2 ayf_22) {
        this.c = ayf_22;
        if (this.I instanceof fqm) {
            ((fqm)((Object)this.I)).setFont(ayf_22);
        }
    }

    public ayf_2 getFont() {
        fbk_2 fbk_22;
        int n;
        int n2 = this.v.size();
        for (n = 0; n < n2; ++n) {
            fbk_22 = (fbk_2)this.v.get(n);
            if (!(fbk_22 instanceof fqn) || !fbk_22.getState().equalsIgnoreCase(this.x)) continue;
            return ((fqn)fbk_22).getRenderer();
        }
        n2 = this.v.size();
        for (n = 0; n < n2; ++n) {
            fbk_22 = (fbk_2)this.v.get(n);
            if (!(fbk_22 instanceof fqn) || !fbk_22.getState().equalsIgnoreCase(r)) continue;
            return ((fqn)fbk_22).getRenderer();
        }
        return this.c;
    }

    @Override
    public void setColor(azj_2 azj_22, String string) {
        if (string == null || V.equals(string)) {
            this.setTextColor(azj_22);
        } else {
            super.setColor(azj_22, string);
        }
    }

    public void setTextColor(azj_2 azj_22) {
        if (this.d == azj_22) {
            return;
        }
        this.d = azj_22;
        if (this.I instanceof fqf_0) {
            ((fqf_0)((Object)this.I)).setColor(azj_22, null);
        }
    }

    public azj_2 getTextColor() {
        fbk_2 fbk_22;
        int n;
        int n2 = this.v.size();
        for (n = 0; n < n2; ++n) {
            fbk_22 = (fbk_2)this.v.get(n);
            if (!(fbk_22 instanceof fqg_0) || !fbk_22.getState().equalsIgnoreCase(this.x)) continue;
            return ((fqg_0)fbk_22).getColor();
        }
        n2 = this.v.size();
        for (n = 0; n < n2; ++n) {
            fbk_22 = (fbk_2)this.v.get(n);
            if (!(fbk_22 instanceof fqg_0) || !fbk_22.getState().equalsIgnoreCase(r)) continue;
            return ((fqg_0)fbk_22).getColor();
        }
        return this.d;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.e = false;
        this.f = false;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fqh_0 fqh_02 = (fqh_0)fyo2;
        super.copyElement(fqh_02);
        if (this.b != null) {
            fqh_02.setAlign(this.b);
        }
        if (this.c != null) {
            fqh_02.setFont(this.c);
        }
        if (this.d != null) {
            fqh_02.setTextColor(this.d);
        }
        if (this.f) {
            fqh_02.setUseHighContrast(this.e);
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 92903173 || n == 1767875043) {
            this.setAlign(frs_0.a(string));
        } else if (n == -1249482096) {
            this.setJustify(Co.a(string));
        } else if (n == 3148879) {
            this.setFont(fze2.e(string));
        } else if (n == -1063571914) {
            this.setTextColor(fze2.a(string));
        } else if (n == 1153931755) {
            this.setUseHighContrast(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1063571914) {
            this.setTextColor((azj_2)object);
        } else if (n == 92903173 || n == 1767875043) {
            this.setAlign((frs_0)((Object)object));
        } else if (n == -1249482096) {
            this.setJustify(Co.b(object));
        } else if (n == 3148879) {
            this.setFont((ays_1)object);
        } else if (n == 1153931755) {
            this.setUseHighContrast(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

