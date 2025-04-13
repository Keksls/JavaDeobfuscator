/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fvK
 */
public class fvk_0
extends ftv_0 {
    public static final String TAG = "Window";
    public static final String e = "MessageBox";
    public static final String f = "titleBar";
    public static final String g = "label";
    public static final String h = "content";
    public static final String i = "closeButton";
    public static final String j = "minButton";
    public static final String k = "maxButton";
    private boolean s;
    private boolean t = true;
    private boolean u = false;
    private fbe_2 v;
    private boolean w = true;
    private boolean x = true;
    private final ArrayList<fvM> y = new ArrayList();
    private String z;
    private String A;
    private final ArrayList<fkd_1> B = new ArrayList();
    public static final int l = 1699002606;
    public static final int m = 1243452014;
    public static final int n = -208490308;
    public static final int o = -1468557212;
    public static final int p = 2101661594;
    public static final int q = -1984181620;
    public static final int r = -894345122;

    @Override
    public void addFromXML(fyb_0 fyb_02) {
        if (fyb_02 instanceof fif_1) {
            this.add(fyb_02);
        } else if (fyb_02 instanceof fqj) {
            this.add(fyb_02);
        } else if (fyb_02 instanceof fiy_1) {
            this.add(fyb_02);
        } else if (fyb_02 instanceof fir_1) {
            this.add(fyb_02);
        } else {
            super.addFromXML(fyb_02);
        }
    }

    void a(fvM fvM2) {
        this.y.add(fvM2);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public ArrayList<fvM> getMovePoints() {
        return this.y;
    }

    public boolean isMovable() {
        return this.x;
    }

    public void setMovable(boolean bl) {
        this.x = bl;
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        return null;
    }

    @Deprecated
    public boolean isStickWithinDisplayBounds() {
        return this.t;
    }

    @Deprecated
    public void setStickWithinDisplayBounds(boolean bl) {
        this.t = bl;
    }

    public boolean isStickWithinRootContainer() {
        return this.t;
    }

    public void setStickWithinRootContainer(boolean bl) {
        this.t = bl;
    }

    public boolean getStickFullyWithinRootContainer() {
        return this.u;
    }

    public void setStickFullyWithinRootContainer(boolean bl) {
        this.u = bl;
    }

    public void setStickData(fbe_2 fbe_22) {
        this.v = fbe_22;
    }

    public fbe_2 getStickData() {
        return this.v;
    }

    @Override
    public void setStyle(String string, boolean bl) {
        super.setStyle(string, bl);
        if (this.m_themeElementWidgets != null) {
            for (fvE fvE2 : this.m_themeElementWidgets.values()) {
                fvE2.setStyle(this.getStyleTag() + this.getStyle() + "$" + fvE2.getThemeElementName(), bl);
            }
        }
    }

    public boolean getCanBePushedToTop() {
        return this.w;
    }

    public void setCanBePushedToTop(boolean bl) {
        this.w = bl;
    }

    public void a(fkd_1 fkd_12) {
        if (fkd_12 != null && !this.B.contains(fkd_12)) {
            this.B.add(fkd_12);
        }
    }

    public void b(fkd_1 fkd_12) {
        this.B.remove(fkd_12);
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        for (int k = this.B.size() - 1; k >= 0; --k) {
            this.B.get(k).a();
        }
        return bl;
    }

    public String getHorizontalDialog() {
        return this.z;
    }

    public void setHorizontalDialog(String string) {
        this.z = string;
    }

    public String getVerticalDialog() {
        return this.A;
    }

    public void setVerticalDialog(String string) {
        this.A = string;
    }

    public void a() {
        fsn_0 fsn_02;
        if (this.w && (fsn_02 = this.getParentOfType(fsn_0.class)) != null) {
            fsn_02.a(this);
            fpm_0.b().e().a(this.m_elementMap.c(), true);
        }
    }

    private void b() {
        this.addEventListener(frd_0.A, new fvl_0(this), true);
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fvk_0 fvk_02 = (fvk_0)fyo2;
        fvk_02.setMovable(this.x);
        fvk_02.w = this.w;
        fvk_02.s = this.s;
        fvk_02.t = this.t;
        fvk_02.u = this.u;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.B.clear();
        if (this.v != null) {
            fbf_2.a().a(this);
            this.v = null;
        }
        this.y.clear();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fin_2 fin_22 = fin_2.checkOut();
        this.add(fin_22);
        this.x = true;
        this.m_nonBlocking = false;
        this.m_stickWithinContainer = true;
        this.t = true;
        this.u = false;
        this.b();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1699002606) {
            this.setCanBePushedToTop(Co.a(string));
        } else if (n == 1243452014) {
            this.setMovable(Co.a(string));
        } else if (n == -208490308 || n == -1468557212) {
            this.setStickWithinRootContainer(Co.a(string));
        } else if (n == 2101661594) {
            this.setStickFullyWithinRootContainer(Co.a(string));
        } else if (n == -1984181620) {
            this.setHorizontalDialog(fze2.a(string, this.m_elementMap));
        } else if (n == -894345122) {
            this.setVerticalDialog(fze2.a(string, this.m_elementMap));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1699002606) {
            this.setCanBePushedToTop(Co.b(object));
        } else if (n == 1243452014) {
            this.setMovable(Co.b(object));
        } else if (n == -208490308 || n == -1468557212) {
            this.setStickWithinRootContainer(Co.b(object));
        } else if (n == 2101661594) {
            this.setStickFullyWithinRootContainer(Co.b(object));
        } else if (n == -1984181620) {
            this.setHorizontalDialog((String)object);
        } else if (n == -894345122) {
            this.setVerticalDialog((String)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

