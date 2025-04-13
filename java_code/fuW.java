/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Insets;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class fuW
extends fso
implements faa_1,
fqf_0 {
    public static final String TAG = "tree";
    public static final String a = "button";
    public static final String b = "cell";
    public static final String c = "openedCell";
    public static final String d = "leafCell";
    public static final String e = "selectedCell";
    public static final String f = "oddCell";
    public static final String g = "evenCell";
    public static final String h = "scrollBar";
    fag_2 s;
    private fxx_0 t;
    ArrayList<fxx_0> u;
    ArrayList<ftj_0> v;
    ftx_0 w;
    boolean x = false;
    boolean y;
    int z;
    private String A = null;
    private fyy_0 B = null;
    private boolean C;
    private boolean D;
    private boolean E;
    ArrayList<fbz_2> F;
    boolean G = true;
    boolean H = true;
    fxx_0 I = null;
    ArrayList<fxx_0> J;
    private boolean K = false;
    boolean L = false;
    boolean M = false;
    int N;
    int O;
    int P;
    boolean Q;
    private azj_2 R;
    private azj_2 S;
    public static final int i = "content".hashCode();
    public static final int j = -1675365079;
    public static final int k = -631680873;
    public static final int l = 1063854923;
    public static final int m = 844056925;
    public static final int n = -1510502032;
    public static final int o = -590219650;
    public static final int p = 1714281668;
    public static final int q = -1649785707;
    public static final int r = 71989981;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof faf_2) {
            this.s.a((faf_2)fyb_02);
        }
        super.add(fyb_02);
    }

    @Override
    protected void addInnerMeshes() {
        for (int k = this.F.size() - 1; k >= 0; --k) {
            this.m_entity.a(this.F.get(k).c());
        }
        super.addInnerMeshes();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (string.equals(h)) {
            return this.w;
        }
        return super.getWidgetByThemeElementName(string, bl);
    }

    @Override
    public void setColor(azj_2 azj_22, String string) {
        if (string == null || string.equals(g)) {
            this.R = azj_22;
        } else if (string.equals(f)) {
            this.S = azj_22;
        }
    }

    @Override
    public void setContentProperty(String string, fyy_0 fyy_02) {
        this.A = string;
        this.B = fyy_02;
    }

    public int getCellHeight() {
        return this.N;
    }

    public void setCellHeight(int n) {
        this.N = n;
    }

    public int getMinRows() {
        return this.O;
    }

    public void setMinRows(int n) {
        this.O = n;
    }

    public int getMaxRows() {
        return this.P;
    }

    public void setMaxRows(int n) {
        this.P = n;
    }

    public boolean isEnableDND() {
        return this.Q;
    }

    public void setEnableDND(boolean bl) {
        this.Q = bl;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        int n = this.v.size();
        for (int k = 0; k < n; ++k) {
            this.v.get(k).setEnabled(bl);
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        int n = this.v.size();
        for (int k = 0; k < n; ++k) {
            this.v.get(k).setNetEnabled(bl);
        }
    }

    public boolean getSelectOnlyOne() {
        return this.G;
    }

    public void setSelectOnlyOne(boolean bl) {
        this.G = bl;
    }

    public fxx_0 getSelected() {
        return this.I;
    }

    public boolean getOpenOnlyOne() {
        return this.H;
    }

    public void setOpenOnlyOne(boolean bl) {
        this.H = bl;
    }

    public fxx_0 getTopOpened() {
        if (!this.J.isEmpty()) {
            return this.J.get(this.J.size() - 1);
        }
        return null;
    }

    public void setContent(fxx_0 fxx_02) {
        this.t = fxx_02;
        if (!this.K) {
            this.t.a(true);
        }
        this.setContentDirty();
    }

    void setContentDirty() {
        this.E = true;
        this.setNeedsToPreProcess();
    }

    private void setTreeDirty() {
        this.D = true;
        this.setNeedsToPreProcess();
    }

    private void setValuesDirty() {
        this.C = true;
        this.setNeedsToPostProcess();
    }

    public void setOffset(int n) {
        if (this.z == n) {
            return;
        }
        float f2 = this.a(n);
        this.w.getSlider().setValue(f2);
    }

    void setListOffset(int n) {
        if (this.z == n) {
            return;
        }
        this.z = n;
        this.setValuesDirty();
    }

    public void setDisplayRoot(boolean bl) {
        this.K = bl;
    }

    public void setNoClosingOnClick(boolean bl) {
        this.L = bl;
    }

    public void setNoUnselectingOnClick(boolean bl) {
        this.M = bl;
    }

    private void c() {
        boolean bl;
        fxx_0 fxx_02 = this.getTopOpened();
        this.u.clear();
        fxy_0 fxy_02 = new fxy_0(this.t);
        boolean bl2 = bl = !this.K;
        while (fxy_02.hasNext()) {
            if (bl) {
                fxy_02.a();
                bl = false;
                continue;
            }
            this.u.add(fxy_02.a());
        }
        int n = this.z;
        int n2 = this.u.indexOf(fxx_02);
        if (this.u.size() <= this.v.size()) {
            n = 0;
        } else if ((n2 == -1 || n2 < this.z || n2 >= this.z + this.v.size()) && n2 != -1 && n2 + this.v.size() <= this.u.size()) {
            n = n2;
        }
        n = Hw.a(n, 0, this.u.size() - this.v.size());
        if (n != this.z) {
            this.z = n;
            this.setOffset(n);
        }
    }

    int d() {
        return this.a(this.t) - (this.K ? 0 : 1);
    }

    private int a(fxx_0 fxx_02) {
        if (fxx_02 == null) {
            return 0;
        }
        int n = 1;
        if (fxx_02.a() && fxx_02.e()) {
            ArrayList<fxx_0> arrayList = fxx_02.b();
            int n2 = arrayList.size();
            for (int k = 0; k < n2; ++k) {
                n += this.a(arrayList.get(k));
            }
        }
        return n;
    }

    private float a(int n) {
        int n2;
        int n3;
        if (n < 0) {
            n = 0;
        }
        if (n > (n3 = (n2 = this.d()) - this.v.size()) + 1) {
            n = n3 + 1;
        }
        return 1.0f - (float)n / (float)n3;
    }

    int a(float f2) {
        int n = this.d();
        float f3 = n - this.v.size();
        float f4 = f3 - (float)Math.round(f3 * f2);
        if (f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > f3 + 1.0f) {
            f4 = f3 + 1.0f;
        }
        return Math.round(f4);
    }

    public void a() {
        Object object;
        Object object2;
        int n;
        if (this.y || this.v == null) {
            return;
        }
        int n2 = this.z;
        int n3 = 0;
        int n4 = this.u.size();
        for (n = 0; n < n4; ++n) {
            object2 = this.u.get(n);
            if (n2 != 0) {
                --n2;
                continue;
            }
            if (n3 == this.v.size()) break;
            object = this.v.get(n3);
            String string = this.A + "#" + (n3 + this.z);
            ((ftj_0)object).setContentProperty(string, this.B);
            ((ftj_0)object).setContent(object2.d());
            String string2 = this.getStyle();
            StringBuilder stringBuilder = new StringBuilder(TAG);
            if (string2 != null) {
                stringBuilder.append(string2);
            }
            stringBuilder.append("$");
            if (object2.e()) {
                stringBuilder.append(c);
            } else if (object2.f()) {
                stringBuilder.append(e);
            } else if (object2.a()) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append(d);
            }
            ((fso)object).getAppearance().setMargin(new Insets(0, (object2.g() - (this.K ? 0 : 1)) * 10 + 5, 0, 0));
            ((fvE)object).setStyle(stringBuilder.toString(), true);
            ++n3;
        }
        n4 = this.v.size();
        for (n = n3; n < n4; ++n) {
            object2 = this.v.get(n3);
            object = this.A + "#" + (n + this.z);
            ((ftj_0)object2).setContentProperty((String)object, this.B);
            ((ftj_0)object2).setContent(null);
        }
    }

    @Override
    public void addedToWidgetTree() {
        this.w.addedToWidgetTree();
        super.addedToWidgetTree();
        this.addEventListener(frd_0.I, new fux_0(this), false);
        this.addEventListener(frd_0.E, new fuy_0(this), false);
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.E) {
            this.c();
            this.setValuesDirty();
            this.D = true;
            this.E = false;
        }
        if (this.D) {
            super.invalidateMinSize();
            this.invalidate();
            this.D = false;
        }
        return bl;
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        if (this.C) {
            this.a();
            this.C = false;
        }
        return bl;
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fuW fuW2 = (fuW)fyo2;
        fuW2.setCellHeight(this.N);
        fuW2.setMinRows(this.O);
        fuW2.setMaxRows(this.P);
        fuW2.setEnableDND(this.Q);
        fuW2.setSelectOnlyOne(this.G);
        fuW2.setOpenOnlyOne(this.H);
        for (int k = fuW2.m_widgetChildren.size() - 1; k >= 0; --k) {
            fvE fvE2 = (fvE)fuW2.m_widgetChildren.get(k);
            if (fvE2 == fuW2.w) continue;
            fvE2.destroySelfFromParent();
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.R = null;
        this.S = null;
        this.w = null;
        this.t = null;
        this.u = null;
        this.F = null;
        this.v = null;
        this.I = null;
        this.J = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fuz_0 fuz_02 = new fuz_0(this);
        fuz_02.onCheckOut();
        this.add(fuz_02);
        this.w = new ftx_0();
        this.w.onCheckOut();
        this.w.setHorizontal(false);
        this.w.setValue(1.0f);
        this.add(this.w);
        this.O = -1;
        this.P = -1;
        this.N = 30;
        this.Q = true;
        this.z = 0;
        this.y = false;
        this.D = false;
        this.s = new fag_2();
        this.v = new ArrayList();
        this.F = new ArrayList();
        this.u = new ArrayList();
        this.J = new ArrayList();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -1675365079) {
            this.setCellHeight(Co.c(string));
        } else if (n == -631680873) {
            this.setEnableDND(Co.a(string));
        } else if (n == 1063854923) {
            this.setMinRows(Co.c(string));
        } else if (n == 844056925) {
            this.setMaxRows(Co.c(string));
        } else if (n == -1510502032) {
            this.setOpenOnlyOne(Co.a(string));
        } else if (n == -590219650) {
            this.setSelectOnlyOne(Co.a(string));
        } else if (n == 1714281668) {
            this.setDisplayRoot(Co.a(string));
        } else if (n == -1649785707) {
            this.setNoClosingOnClick(Co.a(string));
        } else if (n == 71989981) {
            this.setNoUnselectingOnClick(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != i) {
            return super.setPropertyAttribute(n, object);
        }
        this.setContent((fxx_0)object);
        return true;
    }

    static /* synthetic */ Logger b() {
        return m_logger;
    }
}

