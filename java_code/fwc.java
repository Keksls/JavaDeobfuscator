/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class fwc
extends fso {
    private static final Logger d = Logger.getLogger(fwc.class);
    protected ArrayList<azj_2> a;
    protected boolean b = false;
    public static final int c = "colors".hashCode();

    public void setColors(ArrayList<azj_2> arrayList) {
        if (this.a == arrayList) {
            return;
        }
        this.a = arrayList;
        this.b = true;
        this.setNeedsToPreProcess();
    }

    protected abstract void a();

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.b) {
            this.a();
            this.b = false;
        }
        return bl;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.setColors(null);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b = false;
        this.a = new ArrayList();
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != c) {
            return super.setPropertyAttribute(n, object);
        }
        this.setColors((ArrayList)object);
        return true;
    }
}

