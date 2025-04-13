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
 * Renamed from fqg
 */
public class fqg_0
extends fbn_2
implements abq_1 {
    private static final Logger e = Logger.getLogger(fqg_0.class);
    public static final String TAG = "Color";
    public static final String a = "NamedColor";
    private azj_2 f = null;
    private frf_0 g = null;
    private String h = null;
    private static final ObjectPool i = new abm_1(new fqh(), 800);
    public static final int b = 94842723;
    public static final int c = 3373707;
    public static final int d = 0x2C929929;

    public static fqg_0 checkOut() {
        fqg_0 fqg_02;
        try {
            fqg_02 = (fqg_0)i.borrowObject();
            fqg_02.m_currentPool = i;
        }
        catch (Exception exception) {
            e.error((Object)"Probl\u00e8me au borrowObject.");
            fqg_02 = new fqg_0();
            fqg_02.onCheckOut();
        }
        return fqg_02;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setColor(azj_2 azj_22) {
        if (this.f == azj_22) {
            return;
        }
        this.f = azj_22;
        this.dispatchEvent(new fcm_2(this));
    }

    public azj_2 getColor() {
        return this.f;
    }

    public frf_0 getPosition() {
        return this.g;
    }

    public void setPosition(frf_0 frf_02) {
        this.g = frf_02;
        this.dispatchEvent(new fcm_2(this));
    }

    public String getName() {
        return this.h;
    }

    public void setName(String string) {
        this.h = string;
        this.dispatchEvent(new fcm_2(this));
    }

    @Override
    public void setup(fbl_1 fbl_12) {
        if (fbl_12 instanceof fqf_0) {
            ((fqf_0)fbl_12).setColor(this.f, this.h);
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.f = null;
        this.h = null;
        this.g = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
    }

    @Override
    public void copyElement(fyo fyo2) {
        fqg_0 fqg_02 = (fqg_0)fyo2;
        super.copyElement(fqg_02);
        fqg_02.setColor(this.getColor());
        fqg_02.h = this.h;
        fqg_02.g = this.g;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 94842723) {
            this.setColor(fze2.a(string));
        } else if (n == 3373707) {
            this.setName(fze2.a(string, this.m_elementMap));
        } else if (n == 0x2C929929) {
            this.setPosition(frf_0.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 94842723) {
            this.setColor((azj_2)object);
        } else if (n == 3373707) {
            this.setName(String.valueOf(object));
        } else if (n == 0x2C929929) {
            this.setPosition((frf_0)((Object)object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

