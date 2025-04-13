/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Insets;

/*
 * Renamed from fBw
 */
public abstract class fbw_1
extends fbl_2 {
    protected Insets c;
    protected boolean d;
    public static final int f = -2012158909;
    public static final int g = -1183792394;

    public Insets getInsets() {
        return this.c;
    }

    public void setInsets(Insets insets) {
        this.c.set(insets.top, insets.left, insets.bottom, insets.right);
    }

    @Deprecated
    public void setSpacing(Insets insets) {
        this.setInsets(insets);
    }

    @Override
    public abstract Entity getEntity();

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.c = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.c = new Insets(0, 0, 0, 0);
    }

    @Override
    public void copyElement(fyo fyo2) {
        fbw_1 fbw_12 = (fbw_1)fyo2;
        super.copyElement(fbw_12);
        fbw_12.setInsets(this.c);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != -2012158909 && n != -1183792394) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setInsets(fze2.c(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -2012158909 && n != -1183792394) {
            return super.setPropertyAttribute(n, object);
        }
        this.setInsets((Insets)object);
        return true;
    }
}

