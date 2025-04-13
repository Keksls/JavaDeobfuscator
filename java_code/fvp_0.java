/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from fvP
 */
public class fvp_0
extends fso {
    public static final String TAG = "WindowResizePoint";
    public static final String a = "WRP";
    fvk_0 c = null;
    frs_0 d;
    Point e;
    boolean f = false;
    fso g = null;
    private fzu h;
    public static final int b = 1238322005;

    @Override
    public String getTag() {
        return TAG;
    }

    public void setPointAlign(frs_0 frs_02) {
        this.d = frs_02;
        switch (this.d) {
            case f: 
            case d: {
                this.setCursorType(frb_0.h);
                break;
            }
            case b: 
            case h: {
                this.setCursorType(frb_0.i);
                break;
            }
            case a: 
            case i: {
                this.setCursorType(frb_0.j);
                break;
            }
            case c: 
            case g: {
                this.setCursorType(frb_0.k);
                break;
            }
            case e: {
                this.setCursorType(frb_0.c);
            }
        }
    }

    public frs_0 getPointAlign() {
        return this.d;
    }

    public void setWindow(fvk_0 fvk_02) {
        this.c = fvk_02;
    }

    public fvk_0 getWindow() {
        return this.c;
    }

    protected int setCheckedWidth(int n) {
        fjf_2 fjf_22 = this.c.getPrefSize();
        if (n < fjf_22.width) {
            n = fjf_22.width;
        }
        fjf_2 fjf_23 = this.c.getMaxSize();
        if (fjf_23.width < n) {
            n = fjf_23.width;
        }
        this.c.setSize(n, this.c.m_size.height);
        return n;
    }

    protected int setCheckedHeight(int n) {
        fjf_2 fjf_22 = this.c.getPrefSize();
        if (n < fjf_22.height) {
            n = fjf_22.height;
        }
        fjf_2 fjf_23 = this.c.getMaxSize();
        if (fjf_23.height < n) {
            n = fjf_23.height;
        }
        this.c.setSize(this.c.m_size.width, n);
        return n;
    }

    public void a() {
        this.h = new fvq_0(this);
        fta_0.getInstance().addEventListener(frd_0.B, this.h, false);
        this.addEventListener(frd_0.w, new fvR(this), false);
    }

    @Override
    public void addedToWidgetTree() {
        super.addedToWidgetTree();
        this.c = this.getParentOfType(fvk_0.class);
        if (this.c != null) {
            this.g = this.c.getWidgetParentOfType(ftv_0.class);
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        fta_0.getInstance().removeEventListener(frd_0.B, this.h, false);
        this.c = null;
        this.d = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a();
        this.m_nonBlocking = false;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fvp_0 fvp_02 = (fvp_0)fyo2;
        super.copyElement(fyo2);
        fvp_02.setPointAlign(this.d);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != 1238322005) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setPointAlign(frs_0.a(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.b();
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        this.b();
    }

    private void b() {
        if (this.isEnabledFull()) {
            this.setPointAlign(this.d);
        } else {
            this.setCursorType(frb_0.a);
        }
    }
}

