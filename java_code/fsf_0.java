/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fsF
 */
public class fsf_0
extends fso {
    public static final String TAG = "FoldingContainer";
    private static final String c = "titleBar";
    private static final String d = "content";
    frm_0 e = frm_0.a;
    fso f;
    fso g;
    private boolean h;
    private boolean i;
    public static final int a = 1000592612;
    public static final int b = -1268966304;

    @Override
    public void addFromXML(fyb_0 fyb_02) {
        if (fyb_02 instanceof fso && ((fvE)fyb_02).getThemeElementName().equals(c)) {
            if (this.f != null) {
                this.f.destroySelfFromParent();
            }
            this.f = (fso)fyb_02;
            this.add(this.f);
        } else if (fyb_02 instanceof fso && ((fvE)fyb_02).getThemeElementName().equals(d)) {
            if (this.g != null) {
                this.g.destroySelfFromParent();
            }
            this.g = (fso)fyb_02;
            this.g.setVisible(!this.h);
            this.add(this.g);
        } else if (!(fyb_02 instanceof fvE)) {
            super.addFromXML(fyb_02);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public frm_0 getTitleBarPosition() {
        return this.e;
    }

    public void setTitleBarPosition(frm_0 frm_02) {
        this.e = frm_02;
        this.invalidate();
    }

    public void setFolded(boolean bl) {
        if (bl) {
            this.a();
        } else {
            this.b();
        }
    }

    public boolean isFolded() {
        return this.h;
    }

    public void a() {
        this.h = true;
        this.i = this.m_expandable;
        this.setExpandable(false);
        if (this.g != null) {
            this.g.setVisible(false);
        }
        this.invalidateMinSize();
    }

    public void b() {
        this.h = false;
        this.setExpandable(this.i);
        this.g.setVisible(true);
        this.invalidateMinSize();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.e = null;
        this.g = null;
        this.f = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fsH fsH2 = new fsH(this);
        fsH2.onCheckOut();
        this.add(fsH2);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1000592612) {
            this.setTitleBarPosition(fze2.a(frm_0.class, string));
        } else if (n == -1268966304) {
            this.setFolded(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1000592612) {
            this.setTitleBarPosition((frm_0)((Object)object));
        } else if (n == -1268966304) {
            this.setFolded(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

