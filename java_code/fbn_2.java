/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fBn
 */
public abstract class fbn_2
extends fbm_2
implements fbk_2 {
    private static Logger a = Logger.getLogger(fbn_2.class);
    private boolean b;
    public static final int u = 52396879;

    @Override
    public boolean isDecoratorSwitch() {
        return this.b;
    }

    @Override
    public void setDecoratorSwitch(boolean bl) {
        this.b = bl;
    }

    @Override
    public abstract void setup(fbl_1 var1);

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b = false;
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fbn_2 fbn_22 = (fbn_2)fyo2;
        fbn_22.setDecoratorSwitch(this.b);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != 52396879) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setDecoratorSwitch(Co.a(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 52396879) {
            return super.setPropertyAttribute(n, object);
        }
        this.setDecoratorSwitch(Co.b(object));
        return true;
    }
}

