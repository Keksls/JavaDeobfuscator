/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class fvk
extends fso {
    public static final String TAG = "valueSelector";
    public static final String a = "increaseButton";
    public static final String b = "decreaseButton";
    public static final String c = "textEditor";
    fug_0 h;
    private fru_0 i;
    private fru_0 j;
    int k;
    int l;
    int m;
    private String n;
    public static final int d = 381182586;
    public static final int e = -1395014068;
    public static final int f = 111972721;
    public static final int g = 2108744537;

    @Override
    public String getTag() {
        return TAG;
    }

    public int getValue() {
        return this.k;
    }

    public void setValue(int n) {
        boolean bl = (n = Hw.a(n, this.l, this.m)) != this.k;
        int n2 = this.k;
        this.k = n;
        this.a();
        if (bl) {
            fct_1 fct_12 = new fct_1(this);
            fct_12.onCheckOut();
            fct_12.a(this.k);
            fct_12.b(n2);
            this.dispatchEvent(fct_12);
        }
    }

    public int getMinBound() {
        return this.l;
    }

    public void setMinBound(int n) {
        if (this.l == n) {
            return;
        }
        this.l = n;
        if (this.k < this.l) {
            this.setValue(n);
        }
    }

    public int getMaxBound() {
        return this.m;
    }

    public void setMaxBound(int n) {
        if (this.m == n) {
            return;
        }
        this.m = n;
        if (this.k > this.m) {
            this.setValue(n);
        }
    }

    public String getDisplayFormat() {
        return this.n;
    }

    public void setDisplayFormat(String string) {
        this.n = string;
        this.a();
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (string.equals(a)) {
            return this.i;
        }
        if (string.equals(b)) {
            return this.j;
        }
        if (string.equals(c)) {
            return this.h;
        }
        return null;
    }

    public void a() {
        this.h.c(String.format(this.n, this.k));
    }

    private void b() {
        this.h = new fug_0();
        this.h.onCheckOut();
        this.h.c(String.valueOf(this.k));
        this.h.addEventListener(frd_0.p, new fvl(this), false);
        this.add(this.h);
        fso fso2 = fso.checkOut();
        fso2.setExpandable(false);
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        fin_22.setAlign(frs_0.e);
        fso2.add(fin_22);
        this.i = new fru_0();
        this.i.onCheckOut();
        this.i.addEventListener(frd_0.C, new fvm_0(this), false);
        this.i.setClickSoundId(fza_0.a().k());
        this.j = new fru_0();
        this.j.onCheckOut();
        this.j.addEventListener(frd_0.C, new fvn_0(this), false);
        this.j.setClickSoundId(fza_0.a().l());
        fso2.add(this.i);
        fso2.add(this.j);
        this.add(fso2);
    }

    @Override
    public void copyElement(fyo fyo2) {
        int n;
        super.copyElement(fyo2);
        fvk fvk2 = (fvk)fyo2;
        fvk2.n = this.n;
        fvk2.setMinBound(this.l);
        fvk2.setMaxBound(this.m);
        fvk2.setValue(this.k);
        ArrayList<fzu> arrayList = this.i.getListeners(frd_0.C, false);
        if (arrayList != null) {
            for (n = arrayList.size() - 1; n >= 0; --n) {
                fvk2.i.removeEventListener(frd_0.C, arrayList.get(n), false);
            }
        }
        if ((arrayList = this.j.getListeners(frd_0.C, false)) != null) {
            for (n = arrayList.size() - 1; n >= 0; --n) {
                fvk2.j.removeEventListener(frd_0.C, arrayList.get(n), false);
            }
        }
        if ((arrayList = this.h.getListeners(frd_0.p, false)) != null) {
            for (n = arrayList.size() - 1; n >= 0; --n) {
                fvk2.h.removeEventListener(frd_0.p, arrayList.get(n), false);
            }
        }
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b();
        this.l = 0;
        this.m = 100;
        this.k = 0;
        this.n = "%d";
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 381182586) {
            this.setMaxBound(Co.c(string));
        } else if (n == -1395014068) {
            this.setMinBound(Co.c(string));
        } else if (n == 111972721) {
            this.setValue(Co.c(string));
        } else if (n == 2108744537) {
            this.setDisplayFormat(string);
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 381182586) {
            this.setMaxBound(Co.c(object));
        } else if (n == -1395014068) {
            this.setMinBound(Co.c(object));
        } else if (n == 111972721) {
            this.setValue(Co.c(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

