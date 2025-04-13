/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Insets;
import org.apache.log4j.Logger;

/*
 * Renamed from fBt
 */
public class fbt_1
extends fbw_1 {
    private static Logger h = Logger.getLogger(fbt_1.class);
    public static final String TAG = "BubbleBorder";
    private fbv_1 i;
    private boolean j = true;
    private boolean k = false;
    private float u = -2.0943952f;
    private boolean v = false;
    public static final int a = 1604064059;
    public static final int b = 1076156406;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fbv_1 getMesh() {
        return this.i;
    }

    @Override
    public void setInsets(Insets insets) {
    }

    @Override
    public Entity getEntity() {
        return this.i.g();
    }

    public void setDisplaySpark(boolean bl) {
        this.j = bl;
        this.k = true;
        this.i.a(bl);
    }

    public void setSparkAngle(float f2) {
        this.u = f2;
        this.v = true;
        if (this.j) {
            this.i.a(f2);
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fbt_1 fbt_12 = (fbt_1)fyo2;
        if (this.k) {
            fbt_12.setDisplaySpark(this.j);
        }
        if (this.v) {
            fbt_12.setSparkAngle(this.u);
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.i.h();
        this.i = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.u = -2.0943952f;
        this.j = true;
        this.i = new fbv_1();
        this.i.i();
        super.setInsets(this.i.a());
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1604064059) {
            this.setDisplaySpark(Co.a(string));
        } else if (n == 1076156406) {
            this.setSparkAngle(Co.e(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1604064059) {
            this.setDisplaySpark(Co.b(object));
        } else if (n == 1076156406) {
            this.setSparkAngle(Co.e(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

