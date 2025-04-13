/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fqd
 */
public class fqd_0
extends fqh_0 {
    private static final Logger ac = Logger.getLogger(fqd_0.class);
    public static final String TAG = "ButtonAppearance";
    public static final String a = r;
    public static final String b = fqp_0.c.c();
    public static final String c = fqp_0.g.c();
    public static final String d = fqp_0.e.c();
    private static final ObjectPool ad = new abm_1(new fqe_0());
    protected int e = 5;
    protected int f = -3;
    protected boolean g = false;
    protected boolean h = false;
    protected boolean i = true;
    public static final int j = 102102;
    public static final int k = -1466575902;

    public static fqd_0 checkOut() {
        fqd_0 fqd_02;
        try {
            fqd_02 = (fqd_0)ad.borrowObject();
            fqd_02.m_currentPool = ad;
        }
        catch (Exception exception) {
            ac.error((Object)"Probl\u00e8me au borrowObject.");
            fqd_02 = new fqd_0();
            fqd_02.onCheckOut();
        }
        return fqd_02;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public int getGap() {
        return this.e;
    }

    public void setGap(int n) {
        this.e = n;
    }

    public int getClickSoundId() {
        return this.f;
    }

    public void setClickSoundId(int n) {
        this.f = n;
        fru_0 fru_02 = (fru_0)this.I;
        if (fru_02 != null && this.f != -3) {
            fru_02.setClickSoundId(this.f);
        }
    }

    @Override
    public void setWidget(fvE fvE2) {
        super.setWidget(fvE2);
        fru_0 fru_02 = (fru_0)this.I;
        if (this.f != -3) {
            fru_02.setClickSoundId(this.f);
        }
    }

    public boolean isOver() {
        return this.h;
    }

    public boolean isArmed() {
        return this.g;
    }

    public void a() {
        this.h = true;
        this.g();
    }

    public void b() {
        this.h = false;
        this.g();
    }

    public void c() {
        this.g = true;
        this.g();
    }

    public void d() {
        if (this.g) {
            this.g = false;
            this.g();
        }
    }

    public void e() {
        if (this.i) {
            this.i = false;
            this.g();
        }
    }

    public void f() {
        if (!this.i) {
            this.i = true;
            this.g();
        }
    }

    protected void g() {
        this.n();
        this.h();
    }

    protected void h() {
        if (this.i) {
            if (this.h) {
                if (this.g) {
                    this.setEnabled(d, true);
                } else {
                    this.setEnabled(c, true);
                }
            } else {
                this.setEnabled(a, true);
            }
        } else {
            this.setEnabled(b, true);
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        fqd_0 fqd_02 = (fqd_0)fyo2;
        super.copyElement(fyo2);
        fqd_02.e = this.e;
        fqd_02.f = this.f;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.e = 5;
        this.f = -3;
        this.g = false;
        this.h = false;
        this.i = true;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.e = 5;
        this.f = -3;
        this.g = false;
        this.h = false;
        this.i = true;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 102102) {
            this.setGap(Co.c(string));
        } else if (n == -1466575902) {
            this.setClickSoundId(Co.c(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 102102) {
            return super.setPropertyAttribute(n, object);
        }
        this.setGap(Co.c(object));
        return true;
    }
}

