/*
 * Decompiled with CFR 0.152.
 */
public class fvM
extends fso {
    public static final String TAG = "WindowMovePoint";
    public static final String a = "WMP";
    fvk_0 d;
    boolean e = false;
    boolean f = false;
    int g;
    int h;
    ftv_0 i;
    private fzu j;
    boolean k = true;
    boolean l = true;
    public static final int b = 1387629604;
    public static final int c = -1984141450;

    @Override
    public String getTag() {
        return TAG;
    }

    public void setHorizontal(boolean bl) {
        this.k = bl;
    }

    public boolean isHorizontal() {
        return this.k;
    }

    public boolean isVertical() {
        return this.l;
    }

    public void setVertical(boolean bl) {
        this.l = bl;
    }

    public fvk_0 getWindow() {
        return this.d;
    }

    public void setDragMousePosition(int n, int n2) {
        this.e = true;
        this.g = n - this.d.getDisplayX();
        this.h = n2 - this.d.getDisplayY();
    }

    public void a() {
        this.j = new fvN(this);
        fta_0.getInstance().addEventListener(frd_0.B, this.j, false);
        this.addEventListener(frd_0.w, new fvo_0(this), false);
    }

    @Override
    public void addedToWidgetTree() {
        super.addedToWidgetTree();
        this.d = this.getWidgetParentOfType(fvk_0.class);
        if (this.d != null) {
            this.i = this.d.getWidgetParentOfType(ftv_0.class);
            this.d.a(this);
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        fta_0.getInstance().removeEventListener(frd_0.B, this.j, false);
        this.d = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a();
        this.setCursorType(frb_0.c);
        this.m_nonBlocking = false;
        this.k = true;
        this.l = true;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fvM fvM2 = (fvM)fyo2;
        super.copyElement(fyo2);
        fvM2.setHorizontal(this.k);
        fvM2.setVertical(this.l);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1387629604) {
            this.setHorizontal(Co.a(string));
        } else if (n == -1984141450) {
            this.setVertical(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1387629604) {
            this.setHorizontal(Co.b(object));
        } else if (n == -1984141450) {
            this.setVertical(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public fvE getWidget(int n, int n2) {
        return fta_0.getInstance().isMovePointMode() ? this : super.getWidget(n, n2);
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
            this.setCursorType(frb_0.c);
        } else {
            this.setCursorType(frb_0.a);
        }
    }
}

