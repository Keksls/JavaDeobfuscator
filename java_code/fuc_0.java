/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fuC
 */
public class fuc_0
extends fsr_0<ajf_1>
implements faa_1,
fab_1,
faj_2,
fqf_0,
fxt_0 {
    public static final String TAG = "table";
    public static final String a = "button";
    public static final String b = "directSortButton";
    public static final String c = "indirectSortButton";
    public static final String d = "oddCell";
    public static final String e = "evenCell";
    public static final String f = "scrollBar";
    public static final String g = "mouseOver";
    public static final String h = "mouseOverCell";
    public static final String i = "selected";
    ArrayList<fru_0> w;
    ArrayList<fxs_0> x;
    ArrayList<ajf_1> y;
    private List<ajf_1> z;
    private fwk A;
    private boolean B = false;
    ArrayList<ftj_0> C;
    ftx_0 D;
    boolean E = false;
    boolean F;
    int G;
    private int H = -1;
    private int I = -1;
    private ftj_0 J;
    ftj_0 K;
    private String L = null;
    private fyy_0 M = null;
    private boolean N;
    private boolean O;
    int[] P = null;
    ArrayList<fbz_2> Q;
    private fbz_2 R;
    private fbz_2 S;
    private fbz_2 T;
    fra_0 U;
    int V;
    int W;
    int X;
    private boolean Y;
    fxu_0 Z;
    private azj_2 aa;
    private azj_2 ab;
    private boolean ac = true;
    private boolean ad;
    private boolean ae = true;
    private final ArrayList<fac_2> af = new ArrayList();
    private final ArrayList<fad_2> ag = new ArrayList();
    private boolean ah = false;
    private final fsh_0 ak = new fsh_0(this);
    @NotNull
    private final fzu al = fzs2 -> !this.isEnabledFull();
    @NotNull
    private final fzu am = fzs2 -> {
        fck_2 fck_22 = (fck_2)fzs2;
        this.setOffset(this.G + fck_22.z());
        return false;
    };
    @NotNull
    private final fzu an = fzs2 -> {
        fcq_1 fcq_12 = (fcq_1)fzs2;
        this.setTableOffset(this.b(fcq_12.j()));
        return false;
    };
    @NotNull
    private final List<fda_2> ao = new LinkedList<fda_2>();
    public static final int j = -1675365079;
    public static final int k = -631680873;
    public static final int l = 1063854923;
    public static final int m = 844056925;
    public static final int n = 1602982231;
    public static final int o = 1039818982;
    public static final int p = -1763504454;
    public static final int q = 1189020792;
    public static final int r = "tableFilter".hashCode();
    public static final int s = 400843111;
    public static final int t = 901829030;
    public static final int u = "tableModel".hashCode();

    @Override
    @NotNull
    protected ftj_0 createRenderableElement() {
        ftj_0 ftj_02 = super.createRenderableElement();
        ftj_02.setCollection(this);
        ftj_02.setNonBlocking(this.m_nonBlocking);
        ftj_02.setEnableDND(this.Y);
        ftj_02.setEnabled(this.m_enabled);
        ftj_02.setNetEnabled(this.m_netEnabled);
        this.refreshEnabledAppearance(ftj_02);
        ftj_02.setCanBeCloned(false);
        ftj_02.addEventListener(frd_0.A, fzs2 -> {
            if (this.isEnabledFull() && this.isSelectEvent(fzs2)) {
                ftj_0 ftj_02;
                this.setMousePressedAppearanceState(ftj_02, this.J == (ftj_02 = (ftj_0)fzs2.d()));
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.C, fzs2 -> {
            if (this.isEnabledFull() && this.isSelectEvent(fzs2)) {
                ftj_0 ftj_02 = (ftj_0)fzs2.d();
                ftj_0 ftj_03 = this.ad && this.J == ftj_02 ? null : ftj_02;
                this.b(ftj_03);
                this.setMousePressedAppearanceState(ftj_02, this.J == ftj_02);
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.B, fzs2 -> {
            if (this.isEnabledFull()) {
                ftj_0 ftj_02;
                this.setMouseOverAppearanceState(ftj_02, this.J == (ftj_02 = (ftj_0)fzs2.d()));
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.y, fzs2 -> {
            ftj_0 ftj_02;
            if (this.isEnabledFull() && (ftj_02 = (ftj_0)fzs2.d()).getItemValue() != null) {
                this.removeMouseOverAppearanceState(this.K);
                this.K = ftj_02;
                this.setMouseOverAppearanceState(this.K, this.J == ftj_02);
                if (this.R != null) {
                    this.R.a(0, this.K.getY(), this.m_appearance.getContentWidth() - this.D.getWidth(), this.K.getHeight(), this.m_appearance.getTopInset(), this.m_appearance.getBottomInset(), this.m_appearance.getLeftInset(), this.m_appearance.getRightInset());
                    this.setNeedsToResetMeshes();
                }
                if (this.S != null) {
                    this.S.a(this.K.getPosition(), this.K.getSize(), this.m_appearance.getTotalInsets());
                }
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.z, fzs2 -> {
            if (this.isEnabledFull()) {
                this.removeMouseAppearanceState(this.K, this.J == ftj_02);
                this.K = null;
                this.setNeedsToResetMeshes();
            }
            return false;
        }, false);
        return ftj_02;
    }

    public boolean isSelectEvent(fzs fzs2) {
        if (!this.ac) {
            return false;
        }
        if (!this.ae) {
            return true;
        }
        if (!(fzs2 instanceof fck_2)) {
            return false;
        }
        return ((fck_2)fzs2).x() == 1;
    }

    protected void a(ftj_0 ftj_02) {
        this.C.add(ftj_02);
        this.add(ftj_02);
        int n = this.C.indexOf(ftj_02);
        this.refreshSelectedAppearance(ftj_02, this.H == n);
    }

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
        if (fyb_02 instanceof fxs_0) {
            fxs_0 fxs_02 = (fxs_0)fyb_02;
            this.a(fxs_02, fxs_02.isVisible());
            fxs_02.setVisibilityListener(this);
        }
    }

    private void a(fxs_0 fxs_02) {
        this.x.add(fxs_02);
        this.x.sort(Comparator.comparingInt(fxs_0::getColumnIndex));
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        this.add(fru_02);
        fru_02.setElementMap(this.m_elementMap);
        fru_02.setChildrenAdded(true);
        fru_02.setCanBeCloned(false);
        fru_02.setPixmapAlign(frm_0.c);
        String string = this.getStyle();
        StringBuilder stringBuilder = new StringBuilder(TAG);
        if (string != null) {
            stringBuilder.append(string);
        }
        stringBuilder.append("$").append(a);
        String string2 = stringBuilder.toString();
        fru_02.setStyle(string2, true);
        fru_02.setText(fxs_02.getName());
        fru_02.setEnabled(this.m_enabled && fxs_02.getSortable());
        fru_02.setNetEnabled(this.m_netEnabled);
        if (!fxs_02.getSortable()) {
            fru_02.setPixmap(null);
        }
        fru_02.addEventListener(frd_0.C, new fuD(this, fxs_02, fru_02, string2, string), false);
        this.w.add(this.x.indexOf(fxs_02), fru_02);
        this.setTableDirty();
    }

    @Override
    protected void addInnerMeshes() {
        for (int k = this.Q.size() - 1; k >= 0; --k) {
            this.m_entity.a(this.Q.get(k).c());
        }
        if (this.T != null && this.J != null) {
            this.m_entity.a(this.T.c());
        }
        if (this.R != null && this.K != null) {
            this.m_entity.a(this.R.c());
        }
        if (this.S != null && this.K != null) {
            this.m_entity.a(this.S.c());
        }
        super.addInnerMeshes();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (string.equals(f)) {
            return this.D;
        }
        return super.getWidgetByThemeElementName(string, bl);
    }

    @Override
    public void setColor(azj_2 azj_22, String string) {
        if (string == null || string.equals(g)) {
            if (azj_22 != null) {
                if (this.R == null) {
                    this.R = new fbz_2();
                    this.R.i();
                    this.setNeedsToResetMeshes();
                }
                this.R.a(azj_22);
            } else {
                if (this.R != null) {
                    this.R.h();
                }
                this.R = null;
                this.setNeedsToResetMeshes();
            }
        } else if (string.equals(h)) {
            if (azj_22 != null) {
                if (this.S == null) {
                    this.S = new fbz_2();
                    this.S.i();
                    this.setNeedsToResetMeshes();
                }
                this.S.a(azj_22);
            } else {
                if (this.S != null) {
                    this.S.h();
                }
                this.S = null;
                this.setNeedsToResetMeshes();
            }
        } else if (string.equals(i)) {
            if (azj_22 != null) {
                if (this.T == null) {
                    this.T = new fbz_2();
                    this.T.i();
                    this.setNeedsToResetMeshes();
                }
                this.T.a(azj_22);
            } else {
                if (this.T != null) {
                    this.T.h();
                }
                this.T = null;
                this.setNeedsToResetMeshes();
            }
        } else if (string.equals(e)) {
            this.aa = azj_22;
        } else if (string.equals(d)) {
            this.ab = azj_22;
        }
    }

    @Override
    public void setContentProperty(String string, fyy_0 fyy_02) {
        this.L = string;
        this.M = fyy_02;
    }

    public void setSelectionable(boolean bl) {
        this.ac = bl;
    }

    public boolean isSelectOnlyOnLeftClick() {
        return this.ae;
    }

    public void setSelectOnlyOnLeftClick(boolean bl) {
        this.ae = bl;
    }

    public fra_0 getScrollBarBehaviour() {
        return this.U;
    }

    public void setScrollBarBehaviour(fra_0 fra_02) {
        this.U = fra_02;
    }

    public int getCellHeight() {
        return this.V;
    }

    public void setCellHeight(int n) {
        this.V = n;
    }

    public int getMinRows() {
        return this.W;
    }

    public void setMinRows(int n) {
        this.W = n;
    }

    public int getMaxRows() {
        return this.X;
    }

    public void setMaxRows(int n) {
        this.X = n;
    }

    public boolean isEnableDND() {
        return this.Y;
    }

    public void setEnableDND(boolean bl) {
        this.Y = bl;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        for (ftj_0 ftj_02 : this.C) {
            ftj_02.setEnabled(bl);
            this.refreshEnabledAppearance(ftj_02);
        }
        int n = this.w.size();
        for (int k = 0; k < n; ++k) {
            this.w.get(k).setEnabled(bl && this.x.get(k).getSortable());
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        for (ftj_0 ftj_02 : this.C) {
            ftj_02.setNetEnabled(bl);
            this.refreshEnabledAppearance(ftj_02);
        }
        int n = this.w.size();
        for (int k = 0; k < n; ++k) {
            this.w.get(k).setNetEnabled(bl);
        }
    }

    @Override
    public void setContent(@NotNull Iterable<ajf_1> iterable, boolean bl) {
        assert (this.y != null);
        ajf_1 ajf_12 = null;
        if (this.H != -1) {
            ajf_12 = this.y.get(this.P[this.H]);
        }
        this.y.clear();
        for (ajf_1 ajf_13 : iterable) {
            if (bl && this.A != null && !this.A.a(ajf_13)) continue;
            this.y.add(ajf_13);
        }
        if (!bl) {
            this.z = new ArrayList<ajf_1>(this.y);
        }
        this.P = null;
        this.setOffset(0.0f);
        int n = this.getSelectedOffsetByValue(ajf_12);
        if (this.G == 0 || this.getRenderableByOffset(this.G) == null) {
            this.setOffset(0.0f);
        }
        this.removeSelectedAppearanceState(this.J);
        if (n != -1) {
            this.setSelectedOffset(n, false);
        } else {
            ajf_1 ajf_13;
            this.H = Hw.a(this.H, -1, this.y.size() - 1);
            this.J = this.getRenderableByOffset(this.H);
            this.setSelectedAppearanceState(this.J);
            if (this.P == null) {
                this.g();
            }
            ajf_13 = null;
            if (this.H != -1) {
                ajf_13 = this.y.get(this.P[this.H]);
            }
            if (ajf_12 != ajf_13) {
                fct_1 fct_12 = new fct_1(this);
                fct_12.b(ajf_12);
                fct_12.a(ajf_13);
                this.dispatchEvent(fct_12);
            }
            this.f();
        }
        this.setTableDirty();
        this.setValuesDirty();
    }

    ftj_0 getRenderableByPosition(int n, int n2) {
        int n3 = n * this.x.size() + n2;
        if (n3 < 0 || n3 >= this.C.size()) {
            return null;
        }
        return this.C.get(n3);
    }

    private void setTableDirty() {
        this.O = true;
        this.setNeedsToPreProcess();
    }

    void setValuesDirty() {
        this.N = true;
        this.setNeedsToPostProcess();
    }

    public void setTableFilter(fwk fwk2) {
        this.A = fwk2;
        if (this.A != null) {
            this.A.a(this);
            this.A.a(this.B);
        }
    }

    public fwk getTableFilter() {
        return this.A;
    }

    public boolean isEnableFilterCache() {
        return this.B;
    }

    public void setEnableFilterCache(boolean bl) {
        this.B = bl;
        if (this.A != null) {
            this.A.a(bl);
        }
    }

    @Override
    public Object getValue(int n) {
        if (n < 0 || n >= this.y.size()) {
            return null;
        }
        return this.y.get(n);
    }

    @Override
    public int getTableIndex(ftj_0 ftj_02) {
        return this.C.indexOf(ftj_02);
    }

    @Override
    public int getItemIndex(Object object) {
        return this.y.indexOf(object);
    }

    @Override
    public Iterable<ajf_1> getUnfilteredContent() {
        return this.z;
    }

    @Override
    public fvE getWidget(String string, int n) {
        if (n >= 0 && n < this.C.size()) {
            return this.C.get(n);
        }
        return null;
    }

    @Override
    public ArrayList<ftj_0> getRenderables() {
        return this.C;
    }

    public void setTableModel(fxu_0 fxu_02) {
        this.Z = fxu_02;
    }

    public fxu_0 getTableModel() {
        return this.Z;
    }

    @Override
    public float getOffset() {
        return this.G;
    }

    @Override
    public void setOffset(float f2) {
        if ((float)this.G == f2) {
            return;
        }
        float f3 = this.a(f2);
        this.D.getSlider().setValue(f3, true);
    }

    private void setTableOffset(int n) {
        if (this.G == n) {
            return;
        }
        this.G = n;
        for (fad_2 fad_22 : this.ag) {
            fad_22.a(n);
        }
        this.setValuesDirty();
    }

    public int getSelectedOffsetByValue(Object object) {
        if (this.y == null) {
            return -1;
        }
        int n = this.y.indexOf(object);
        if (n == -1) {
            return -1;
        }
        if (this.P == null) {
            this.g();
        }
        for (int k = 0; k < this.P.length; ++k) {
            if (this.P[k] != n) continue;
            return k;
        }
        return -1;
    }

    public int getOffsetByRenderable(ftj_0 ftj_02) {
        if (ftj_02 == null || this.y == null) {
            return -1;
        }
        int n = this.G + this.C.indexOf(ftj_02) / this.x.size();
        if (n >= this.y.size()) {
            n = -1;
        }
        return n;
    }

    public ftj_0 getRenderableByOffset(int n) {
        if (n == -1 || this.y == null) {
            return null;
        }
        int n2 = (n - this.G) * this.x.size();
        if (n2 < 0 || n2 >= this.C.size()) {
            return null;
        }
        return this.C.get(n2);
    }

    public void setSelectedOffset(int n, boolean bl) {
        if (n == this.H && !bl) {
            return;
        }
        int n2 = this.H;
        this.H = n;
        this.removeSelectedAppearanceState(this.J);
        this.J = this.getRenderableByOffset(n);
        this.setSelectedAppearanceState(this.J);
        if (this.P == null) {
            this.g();
        }
        ajf_1 ajf_12 = null;
        ajf_1 ajf_13 = null;
        if (n2 != -1) {
            ajf_12 = this.y.get(this.P[n2]);
        }
        if (this.H != -1) {
            ajf_13 = this.y.get(this.P[this.H]);
        }
        if (ajf_12 != ajf_13) {
            fct_1 fct_12 = new fct_1(this);
            fct_12.b(ajf_12);
            fct_12.a(ajf_13);
            this.dispatchEvent(fct_12);
        }
        this.f();
    }

    private void f() {
        if (this.J != null && this.T != null) {
            this.T.a(0, this.J.getY(), this.m_appearance.getContentWidth() - this.D.getWidth(), this.J.getHeight(), this.m_appearance.getTopInset(), this.m_appearance.getBottomInset(), this.m_appearance.getLeftInset(), this.m_appearance.getRightInset());
        }
        this.setNeedsToResetMeshes();
    }

    private void b(ftj_0 ftj_02) {
        if (ftj_02 == this.J) {
            return;
        }
        if (ftj_02 != null) {
            this.setSelectedOffset(this.getOffsetByRenderable(ftj_02), false);
        } else {
            this.H = -1;
        }
    }

    private float a(float f2) {
        int n;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if ((n = this.y.size() - this.C.size() / this.x.size()) <= 0) {
            return 1.0f;
        }
        if (f2 > (float)(n + 1)) {
            f2 = n + 1;
        }
        return 1.0f - f2 / (float)n;
    }

    private int b(float f2) {
        float f3 = this.y.size() - this.C.size() / this.x.size();
        float f4 = f3 - (float)Math.round(f3 * f2);
        if (f3 < 0.0f || f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > f3 + 1.0f) {
            f4 = f3 + 1.0f;
        }
        return Math.round(f4);
    }

    public void a() {
        int n;
        int n2;
        if (this.F || this.C == null) {
            return;
        }
        this.g();
        this.removeSelectedAppearanceState(this.J);
        this.J = null;
        int n3 = this.G;
        for (n2 = 0; n2 < this.C.size(); n2 += this.x.size()) {
            n = n2 / this.x.size() + n3;
            ftj_0 ftj_02 = this.C.get(n2);
            if (n2 < 0 || n2 >= this.C.size() || this.y == null || n < 0 || n >= this.y.size() || n != this.H) continue;
            this.J = ftj_02;
            this.setSelectedAppearanceState(this.J);
            break;
        }
        n2 = this.C.size() / this.x.size();
        for (n = 0; n < n2; ++n) {
            int n4 = n + n3;
            int n5 = n4 >= this.P.length ? n4 : this.P[n4];
            this.Q.get(n).a(n4 % 2 == 0 ? this.aa : this.ab);
            for (int k = this.x.size() - 1; k >= 0; --k) {
                fxs_0 fxs_02 = this.x.get(k);
                ftj_0 ftj_03 = this.getRenderableByPosition(n, k);
                String string = fxs_02.getField();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.L);
                stringBuilder.append("#").append(n5);
                if (string != null) {
                    stringBuilder.append("/").append(fxs_02.getField());
                }
                ftj_03.setContentProperty(stringBuilder.toString(), this.M);
                if (this.y != null && n5 >= 0 && n5 < this.y.size()) {
                    ajf_1 ajf_12 = this.y.get(n5);
                    if (ajf_12 != null) {
                        if (string != null) {
                            ftj_03.setContent(ajf_12.b(fxs_02.getField()));
                            continue;
                        }
                        ftj_03.setContent(ajf_12);
                        continue;
                    }
                    ftj_03.setContent(null);
                    continue;
                }
                ftj_03.setContent(null);
            }
        }
        this.f();
    }

    private void g() {
        if (this.P == null && this.Z != null) {
            this.P = this.Z.a(this.y);
        }
        if (this.P == null) {
            this.P = fxu_0.a(this.y.size());
        }
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.O) {
            super.invalidateMinSize();
            this.invalidate();
            this.O = false;
        }
        return bl;
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        if (this.N) {
            this.a();
            this.N = false;
        }
        for (int k = this.af.size() - 1; k >= 0; --k) {
            this.af.get(k).a();
        }
        return bl;
    }

    @Override
    public void copyElement(fyo fyo2) {
        System.arraycopy(this.m_style, 0, ((fvE)fyo2).m_style, 0, this.m_style.length);
        super.copyElement(fyo2);
        fuc_0 fuc_02 = (fuc_0)fyo2;
        fuc_02.setCellHeight(this.V);
        fuc_02.setMinRows(this.W);
        fuc_02.setMaxRows(this.X);
        fuc_02.setEnableDND(this.Y);
        fuc_02.setTableModel(this.Z);
        fuc_02.setScrollBarBehaviour(this.U);
        fuc_02.setSelectionable(this.ac);
        fuc_02.setSelectOnlyOnLeftClick(this.ae);
        fuc_02.setTableFilter(this.A);
        fuc_02.setEnableFilterCache(this.B);
        fuc_02.removeEventListener(frd_0.I, this.al, true);
        fuc_02.removeEventListener(frd_0.I, this.al, false);
        fuc_02.removeEventListener(frd_0.I, this.an, false);
        fuc_02.removeEventListener(frd_0.E, this.al, true);
        fuc_02.removeEventListener(frd_0.E, this.al, false);
        fuc_02.removeEventListener(frd_0.E, this.am, false);
        fuc_02.ao.addAll(this.ao);
    }

    @Override
    public void addedToWidgetTree() {
        this.D.addedToWidgetTree();
        super.addedToWidgetTree();
        this.addEventListener(frd_0.I, this.al, true, 0);
        this.addEventListener(frd_0.I, this.al, false, 0);
        this.addEventListener(frd_0.I, this.an, false);
        this.addEventListener(frd_0.E, this.al, true, 0);
        this.addEventListener(frd_0.E, this.al, false, 0);
        this.addEventListener(frd_0.E, this.am, false);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.removeEventListener(frd_0.I, this.al, true);
        this.removeEventListener(frd_0.I, this.al, false);
        this.removeEventListener(frd_0.I, this.an, false);
        this.removeEventListener(frd_0.E, this.al, true);
        this.removeEventListener(frd_0.E, this.al, false);
        this.removeEventListener(frd_0.E, this.am, false);
        for (fda_2 fda_22 : this.ao) {
            this.removeEventListener(fda_22.a(), fda_22, true);
        }
        this.ao.clear();
        this.aa = null;
        this.ab = null;
        if (this.R != null) {
            this.R.h();
            this.R = null;
        }
        if (this.S != null) {
            this.S.h();
            this.S = null;
        }
        if (this.T != null) {
            this.T.h();
            this.T = null;
        }
        if (this.Q != null) {
            for (int k = this.Q.size() - 1; k >= 0; --k) {
                this.Q.get(k).h();
            }
            this.Q = null;
        }
        this.J = null;
        this.K = null;
        this.w = null;
        this.D = null;
        this.x = null;
        this.y = null;
        this.Z = null;
        this.C = null;
        if (this.A != null) {
            this.A.a((fsq_0)null);
            this.A.a();
        }
        this.A = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fuF fuF2 = new fuF(this);
        fuF2.onCheckOut();
        this.add(fuF2);
        this.D = new ftx_0();
        this.D.onCheckOut();
        this.D.setHorizontal(false);
        this.D.setValue(1.0f);
        this.D.setCanBeCloned(false);
        this.add(this.D);
        this.W = -1;
        this.X = -1;
        this.V = 30;
        this.Y = true;
        this.G = 0;
        this.F = false;
        this.O = false;
        this.m_nonBlocking = false;
        this.ac = true;
        this.ad = false;
        this.ae = true;
        this.H = -1;
        this.I = -1;
        this.C = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.Q = new ArrayList();
        this.U = fra_0.a;
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
        } else if (n == 1039818982) {
            this.setSelectionable(Co.a(string));
        } else if (n == -1763504454) {
            this.setSelectOnlyOnLeftClick(Co.a(string));
        } else if (n == 1602982231) {
            this.setScrollBarBehaviour(fra_0.a(string));
        } else if (n == 1189020792) {
            this.setKeepOffset(Co.a(string, false));
        } else if (n == 901829030) {
            this.setOnColumnHeaderClick(fze2.a(fda_2.class, string));
        } else if (n == 400843111) {
            this.setEnableFilterCache(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == r) {
            this.setTableFilter((fwk)object);
        } else if (n == 400843111) {
            this.setEnableFilterCache(Co.b(object));
        } else if (n == u) {
            this.setTableModel((fxu_0)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public void removeValue(Object object) {
    }

    @Override
    public void addValue(Object object) {
    }

    @Override
    public boolean addValue(int n, Object object) {
        return false;
    }

    @Override
    public int addValue(Object object, Object object2) {
        return -1;
    }

    @Override
    public boolean replaceValue(Object object, Object object2) {
        return false;
    }

    @Override
    public int size() {
        return this.y.size();
    }

    @Override
    public void a(fxs_0 fxs_02, boolean bl) {
        if (bl) {
            if (this.x.contains(fxs_02)) {
                return;
            }
            this.a(fxs_02);
        } else {
            if (!this.x.contains(fxs_02)) {
                return;
            }
            int n = this.x.indexOf(fxs_02);
            this.x.remove(fxs_02);
            fru_0 fru_02 = this.w.remove(n);
            if (fru_02 != null) {
                fru_02.setVisible(false);
            }
            this.setTableDirty();
            this.setNeedsToPreProcess();
        }
    }

    public void setKeepOffset(boolean bl) {
        if (this.ah == bl) {
            return;
        }
        this.ah = bl;
        if (this.ah) {
            if (!this.af.contains(this.ak)) {
                this.af.add(this.ak);
            }
            if (!this.ag.contains(this.ak)) {
                this.ag.add(this.ak);
            }
        } else {
            this.af.remove(this.ak);
            this.ag.remove(this.ak);
        }
    }

    public void setOnColumnHeaderClick(fda_2 fda_22) {
        if (this.ao.contains(fda_22)) {
            return;
        }
        this.ao.add(fda_22);
        this.addEventListener(fda_22.a(), fda_22, true);
    }

    @Override
    public void setHideContainerWithoutItem(boolean bl) {
        super.setHideContainerWithoutItem(bl);
        for (ftj_0 ftj_02 : this.C) {
            ftj_02.setHideWithoutItem(this.isHideContainerWithoutItem());
        }
    }

    static /* synthetic */ Logger b() {
        return m_logger;
    }

    static /* synthetic */ Logger c() {
        return m_logger;
    }

    static /* synthetic */ Logger d() {
        return m_logger;
    }
}

