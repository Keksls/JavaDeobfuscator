/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.util.Stack;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class fqn
extends fbn_2
implements abq_1 {
    private static final Logger c = Logger.getLogger(fqn.class);
    public static final String TAG = "Font";
    private ayf_2 d = null;
    private static final ObjectPool e = new abm_1(new fqo(), 500);
    public static final int a = -494845757;
    public static final int b = 112787;

    public static fqn checkOut() {
        fqn fqn2;
        try {
            fqn2 = (fqn)e.borrowObject();
            fqn2.m_currentPool = e;
        }
        catch (Exception exception) {
            c.error((Object)"Probl\u00e8me au borrowObject.");
            fqn2 = new fqn();
            fqn2.onCheckOut();
        }
        return fqn2;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setRenderer(ayf_2 ayf_22) {
        this.d = ayf_22;
    }

    public ayf_2 getRenderer() {
        return this.d;
    }

    @Override
    public void setup(fbl_1 fbl_12) {
        if (fbl_12 instanceof fqm) {
            ((fqm)fbl_12).setFont(this.d);
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.d = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
    }

    @Override
    public void copyElement(fyo fyo2) {
        fqn fqn2 = (fqn)fyo2;
        super.copyElement(fqn2);
        fqn2.d = this.d;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -494845757) {
            this.setRenderer(fze2.e(string));
        }
        if (n != 112787) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setRenderer(fpm_0.b().g().d(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -494845757) {
            return super.setPropertyAttribute(n, object);
        }
        this.setRenderer((ays_1)object);
        return true;
    }

    @Override
    public void preApplyAttributes(aqx_2 aqx_22, fyb_0 fyb_02, Stack<fyy_0> stack, fya_0 fya_02) {
        super.preApplyAttributes(aqx_22, fyb_02, stack, fya_02);
        aqx_2 aqx_23 = aqx_22.f("ref");
        if (aqx_23 != null) {
            this.setRenderer(fpm_0.b().g().d(aqx_23.c()));
        }
        aqx_22.b(aqx_23);
    }
}

