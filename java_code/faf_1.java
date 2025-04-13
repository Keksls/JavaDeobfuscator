/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAF
 */
public class faf_1
extends faq_2
implements fjc_1 {
    public static final String TAG = "propertyExists";
    private boolean c;
    private String m;
    private boolean n;
    public static final int a = 103145323;
    public static final int b = 3373707;

    @Override
    public String getTag() {
        return TAG;
    }

    public String getName() {
        return this.m;
    }

    public boolean getLocal() {
        return this.n;
    }

    public void setName(String string) {
        if (this.m != null && !this.m.equalsIgnoreCase(string) || string != null && !string.equalsIgnoreCase(this.m)) {
            this.m = string;
            this.setNeedsToPreProcess();
        }
    }

    public void setLocal(boolean bl) {
        if (this.n != bl) {
            this.n = bl;
            this.setNeedsToPreProcess();
        }
    }

    @Override
    public boolean isValid(Object object) {
        if (this.g) {
            object = this.f;
        }
        return this.c;
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        boolean bl2 = this.c;
        fit_1 fit_12 = fis_1.a().e(this.m, this.n ? this.getElementMap() : null);
        boolean bl3 = this.c = fit_12 != null && fit_12.d();
        if (bl2 != this.c) {
            this.a(true);
        }
        return bl;
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        faf_1 faf_12 = (faf_1)fyo2;
        faf_12.m = this.m;
        faf_12.n = this.n;
    }

    @Override
    public void a(fja_1 fja_12) {
        fit_1 fit_12 = fja_12.b();
        if (fit_12 != null && fit_12.a().equalsIgnoreCase(this.m) && (!this.n || fit_12.e() == this.m_elementMap)) {
            switch (fja_12.a()) {
                case c: {
                    this.c = true;
                    this.a(true);
                    break;
                }
                case b: {
                    this.c = false;
                    this.a(true);
                    break;
                }
            }
        }
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.c = false;
        this.n = false;
        fis_1.a().a(this);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        fis_1.a().b(this);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 103145323) {
            this.setLocal(Co.a(string));
        } else if (n == 3373707) {
            this.setName(fze2.a(string, this.m_elementMap));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 103145323) {
            this.setLocal(Co.b(object));
        } else if (n == 3373707) {
            this.setName(String.valueOf(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

