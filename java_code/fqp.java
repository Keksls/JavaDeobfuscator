/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class fqp
extends fqj
implements abq_1 {
    private static final Logger c = Logger.getLogger(fqp.class);
    public static final String TAG = "ImageAppearance";
    private boolean d;
    private boolean e;
    private fqv f;
    private azj_2 g;
    private String h;
    private static final ObjectPool i = new abm_1(new fqq());
    public static final int a = -908189606;
    public static final int b = -903579675;

    public static fqp checkOut() {
        fqp fqp2;
        try {
            fqp2 = (fqp)i.borrowObject();
            fqp2.m_currentPool = i;
        }
        catch (Exception exception) {
            c.error((Object)"Probl\u00e8me au borrowObject.");
            fqp2 = new fqp();
            fqp2.onCheckOut();
        }
        return fqp2;
    }

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqv) {
            this.f = (fqv)fyb_02;
            if (this.I instanceof fsk_0) {
                ((fsk_0)this.I).setPixmap((fqv)fyb_02);
                if (this.e) {
                    ((fsk_0)this.I).setScaled(this.d);
                }
            } else if (this.I != null) {
                c.error((Object)("Un " + this.I.getClass() + " poss\u00e8de une ImageAppearance et ne peut pas recevoir de Pixmap"));
            }
        }
        super.add(fyb_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public azj_2 getModulationColor() {
        return this.g;
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        if (this.g == azj_22) {
            return;
        }
        this.g = azj_22;
        if (this.I instanceof fsk_0) {
            ((fsk_0)this.I).setModulationColor(azj_22);
        }
    }

    public boolean isScaled() {
        return this.d;
    }

    public void setScaled(boolean bl) {
        this.d = bl;
        this.e = true;
        if (this.I instanceof fsk_0) {
            ((fsk_0)this.I).setScaled(this.d);
        }
    }

    @Override
    public void setWidget(fvE fvE2) {
        super.setWidget(fvE2);
        if (fvE2 instanceof fsk_0) {
            fsk_0 fsk_02 = (fsk_0)fvE2;
            if (this.e) {
                fsk_02.setScaled(this.d);
            }
            if (this.g != null) {
                fsk_02.setModulationColor(this.g);
            }
            this.setShader(this.h);
        }
    }

    @Override
    public boolean preProcess(int n) {
        if (this.H && this.I instanceof fsk_0) {
            fsk_0 fsk_02 = (fsk_0)this.I;
            if (this.f != null) {
                fsk_02.setPixmap(this.f);
            }
            if (this.e) {
                fsk_02.setScaled(this.d);
            }
        }
        return super.preProcess(n);
    }

    @Override
    public void l() {
        for (int k = this.v.size() - 1; k >= 0; --k) {
            fbk_2 fbk_22 = (fbk_2)this.v.get(k);
            if (!(fbk_22 instanceof fqv)) continue;
            this.I.getEntity().c();
        }
        super.l();
    }

    @Override
    public void copyElement(fyo fyo2) {
        fqp fqp2 = (fqp)fyo2;
        super.copyElement(fqp2);
        if (this.e) {
            fqp2.setScaled(this.d);
        }
        fqp2.setShader(this.h);
        fqp2.setModulationColor(this.g);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.f = null;
        this.g = null;
        this.h = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.d = false;
        this.e = false;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -908189606) {
            this.setScaled(Co.a(string));
        } else if (n == -903579675) {
            this.setShader(string);
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    public void setShader(String string) {
        this.h = string;
        fvE fvE2 = this.getWidget();
        if (fvE2 == null) {
            return;
        }
        ((fsk_0)fvE2).setShader(string);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -908189606) {
            this.setScaled(Co.b(object));
        } else if (n == -903579675) {
            this.setShader(object.toString());
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

