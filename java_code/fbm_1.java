/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;

/*
 * Renamed from fBM
 */
public class fbm_1
extends fbs_2 {
    public static final String TAG = "SwitchingPlainBackground";
    private final fci_1 c = new fci_1();
    public static final int b = -1992012396;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqg_0) {
            this.c.c(((fqg_0)fyb_02).getColor());
        }
        super.add(fyb_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fbq_2 getMesh() {
        return this.c;
    }

    @Override
    public Entity getEntity() {
        return null;
    }

    public int getDuration() {
        return this.c.d();
    }

    public void setDuration(int n) {
        this.c.a(n);
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fbm_1 fbm_12 = (fbm_1)fyo2;
        fbm_12.setDuration(this.getDuration());
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.c.h();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.c.i();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != -1992012396) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setDuration(Co.c(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -1992012396) {
            return super.setPropertyAttribute(n, object);
        }
        this.setDuration(Co.c(object));
        return true;
    }
}

