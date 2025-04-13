/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;

/*
 * Renamed from fqL
 */
public abstract class fql_0
extends fyg_0 {
    private final Insets c = new Insets(0, 0, 0, 0);
    public static final int a = -2012158909;
    public static final int b = -1183792394;

    @Deprecated
    public void setSpacing(Insets insets) {
        this.setInsets(insets);
    }

    @Deprecated
    public Insets getSpacing() {
        return this.getInsets();
    }

    public void setInsets(Insets insets) {
        if (insets == null) {
            return;
        }
        this.c.top = insets.top;
        this.c.bottom = insets.bottom;
        this.c.left = insets.left;
        this.c.right = insets.right;
        fqD fqD2 = this.getParentOfType(fqD.class);
        if (fqD2 != null) {
            fqD2.setSpacing(this);
        }
    }

    public Insets getInsets() {
        return this.c;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fql_0 fql_02 = (fql_0)fyo2;
        super.copyElement(fql_02);
        fql_02.setInsets(this.c);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.c.set(0, 0, 0, 0);
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

