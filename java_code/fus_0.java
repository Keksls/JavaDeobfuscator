/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fus
 */
public class fus_0
extends fsr_0<Object>
implements faa_1,
fam_2 {
    public static final String TAG = "StackList";
    private boolean l = true;
    private fag_2 m;
    private final ArrayList<ftj_0> n = new ArrayList();
    private final ArrayList<fdt_1> o = new ArrayList();
    private ftj_0 p = null;
    private Object q = null;
    private int r = -1;
    private boolean s = true;
    private boolean t = true;
    private boolean u = true;
    private boolean v = true;
    private boolean w = true;
    private boolean x = false;
    private int y;
    private ftj_0 z;
    private final ArrayList<fac_2> A = new ArrayList();
    private boolean B = false;
    private final ArrayList<Object> C = new ArrayList();
    private Object D;
    private fwk E;
    private boolean F = false;
    private String G = null;
    private fyy_0 H = null;
    public static final int a = 1384730090;
    public static final int b = -1466575902;
    public static final int c = -1872656916;
    public static final int d = 1387629604;
    public static final int e = "selected".hashCode();
    public static final int f = "selectedValue".hashCode();
    public static final int g = 1039818982;
    public static final int h = -2013533217;
    public static final int i = -1763504454;
    public static final int j = "listFilter".hashCode();
    public static final int k = 400843111;

    public void a(fac_2 fac_22) {
        if (fac_22 != null && !this.A.contains(fac_22)) {
            this.A.add(fac_22);
        }
    }

    public void b(fac_2 fac_22) {
        this.A.remove(fac_22);
    }

    @Override
    public fqr getAppearance() {
        return (fqr)this.m_appearance;
    }

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
        if (fyb_02 instanceof faf_2) {
            this.m.a((faf_2)fyb_02);
        }
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
    public fvE getWidget(String string, int n) {
        if (n >= 0 && n < this.n.size()) {
            return this.n.get(n);
        }
        return null;
    }

    @Override
    public ArrayList<ftj_0> getRenderables() {
        return this.n;
    }

    public boolean getSelectionable() {
        return this.t;
    }

    public void setSelectionable(boolean bl) {
        this.t = bl;
    }

    public boolean getSelectionTogglable() {
        return this.u;
    }

    public void setSelectionTogglable(boolean bl) {
        this.u = bl;
    }

    public boolean isSelectOnlyOnLeftClick() {
        return this.v;
    }

    public void setSelectOnlyOnLeftClick(boolean bl) {
        this.v = bl;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        for (ftj_0 ftj_02 : this.n) {
            ftj_02.setEnabled(bl);
            this.refreshEnabledAppearance(ftj_02);
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        for (ftj_0 ftj_02 : this.n) {
            ftj_02.setNetEnabled(bl);
            this.refreshEnabledAppearance(ftj_02);
        }
    }

    public void setEnableDND(boolean bl) {
        this.s = bl;
    }

    public boolean getEnableDND() {
        return this.s;
    }

    public boolean isHorizontal() {
        return this.l;
    }

    public void setHorizontal(boolean bl) {
        ((fin_2)this.m_layout).setHorizontal(bl);
        this.l = bl;
        this.invalidateMinSize();
    }

    public boolean isInnerExpandable() {
        return this.w;
    }

    public void setInnerExpandable(boolean bl) {
        if (this.w != bl) {
            this.w = bl;
            for (int k = 0; k < this.n.size(); ++k) {
                this.n.get(k).setExpandable(this.w);
            }
        }
    }

    public boolean getInnerNonBlocking() {
        return this.x;
    }

    public void setInnerNonBlocking(boolean bl) {
        if (this.x != bl) {
            this.x = bl;
            for (int k = 0; k < this.n.size(); ++k) {
                this.n.get(k).setNonBlocking(this.x);
            }
        }
    }

    public int getSelectedOffsetByValue(Object object) {
        int n;
        int n2 = this.C.size();
        for (n = 0; n < n2 && this.C.get(n) != object; ++n) {
        }
        if (n == n2) {
            return -1;
        }
        return n;
    }

    @Override
    public Object getSelectedValue() {
        return this.q;
    }

    @Override
    public void setContent(@NotNull Iterable<Object> iterable, boolean bl) {
        if (this.m_isATemplate) {
            return;
        }
        int n = this.r;
        Object object = this.getSelectedValue();
        this.C.clear();
        for (Object object2 : iterable) {
            if (this.E != null && !this.E.a(object2)) continue;
            this.C.add(object2);
        }
        this.r = this.getSelectedOffsetByValue(object);
        if (this.r == -1 && n != -1) {
            this.dispatchEvent(new fcf_2(this, null, object, false));
            this.dispatchEvent(new fcf_2(this, null, null, true));
        }
        this.a(this.C.size());
        this.a();
    }

    public ArrayList<Object> getItems() {
        return this.C;
    }

    @Override
    public Object getValue(int n) {
        if (n >= 0 && n < this.C.size()) {
            return this.C.get(n);
        }
        return null;
    }

    @Override
    public ftj_0 getSelected() {
        return this.p;
    }

    @Override
    public int getTableIndex(ftj_0 ftj_02) {
        return this.n.indexOf(ftj_02);
    }

    @Override
    public int getItemIndex(Object object) {
        return this.C.indexOf(object);
    }

    @Override
    public void setContentProperty(String string, fyy_0 fyy_02) {
        this.G = string;
        this.H = fyy_02;
    }

    public int getOffsetByRenderable(ftj_0 ftj_02) {
        return this.n.indexOf(ftj_02);
    }

    public void setSelected(fiq_1 fiq_12) {
        this.r = this.C.indexOf(fiq_12);
        this.b();
    }

    public int getClickSoundId() {
        return this.y;
    }

    public void setClickSoundId(int n) {
        this.y = n;
    }

    public int getSelectedOffset() {
        return this.r;
    }

    public void setSelectedValue(Object object) {
        if (this.C == null) {
            return;
        }
        int n = this.r;
        this.r = -1;
        for (int k = 0; k < this.C.size(); ++k) {
            if (this.C.get(k) != object) continue;
            this.r = k;
            break;
        }
        if (n != this.r) {
            if (n != -1) {
                this.dispatchEvent(new fcf_2(this, this.n.get(this.r), this.C.get(n), false));
            }
            if (this.r != -1) {
                this.dispatchEvent(new fcf_2(this, this.n.get(this.r), this.C.get(this.r), true));
            }
            this.b();
        }
    }

    public void setFilter(fwk fwk2) {
        if (fwk2 == null) {
            return;
        }
        this.E = fwk2;
        this.E.a(this);
        this.E.a(this.F);
    }

    public boolean isEnableFilterCache() {
        return this.F;
    }

    public void setEnableFilterCache(boolean bl) {
        this.F = bl;
        if (this.E != null) {
            this.E.a(bl);
        }
    }

    @Override
    protected void processEventForSound(fzs fzs2, boolean bl) {
        if (!(fzs2.g() || fzs2.f() != frd_0.j && fzs2.f() != frd_0.k)) {
            fzs2.b(true);
            switch (this.y) {
                case -1: {
                    fza_0.a().b();
                    break;
                }
                case -2: {
                    fza_0.a().e();
                    break;
                }
                default: {
                    fza_0.a().a(this.y);
                }
            }
        }
    }

    private void a() {
        if (this.n == null) {
            return;
        }
        this.p = null;
        boolean bl = false;
        int n = this.n.size();
        for (int k = 0; k < n; ++k) {
            ftj_0 ftj_02 = this.n.get(k);
            ftj_02.setContentProperty(this.G + "#" + k, this.H);
            if (this.C != null && k < this.C.size()) {
                if (k == this.r && !bl) {
                    bl = true;
                    this.p = ftj_02;
                }
                ftj_02.setContent(this.C.get(k));
                continue;
            }
            ftj_02.setContent(null);
        }
        if (!bl) {
            this.p = null;
        }
    }

    private void b() {
        this.removeSelectedAppearanceState(this.p);
        this.p = this.n.get(this.r);
        this.setSelectedAppearanceState(this.p);
    }

    private void b(ftj_0 ftj_02) {
        fcf_2 fcf_22;
        ftj_0 ftj_03 = this.p;
        if (ftj_02 == this.p) {
            return;
        }
        Object object = this.getSelectedValue();
        this.removeSelectedAppearanceState(this.p);
        this.p = ftj_02;
        this.setSelectedAppearanceState(this.p);
        this.r = this.p != null ? this.getOffsetByRenderable(this.p) : -1;
        Object object2 = this.r == -1 ? null : this.C.get(this.r);
        if (ftj_03 != null) {
            fcf_22 = new fcf_2(this);
            fcf_22.a(ftj_03);
            fcf_22.c(false);
            fcf_22.a(object);
            this.dispatchEvent(fcf_22);
        }
        if (this.p != null) {
            fcf_22 = new fcf_2(this);
            fcf_22.a(this.p);
            fcf_22.c(true);
            fcf_22.a(object2);
            this.dispatchEvent(fcf_22);
        }
    }

    @Override
    public void setOnClick(fdt_1 fdt_12) {
        super.setOnClick(fdt_12);
        this.o.add(fdt_12);
    }

    @Override
    @NotNull
    protected ftj_0 createRenderableElement() {
        ftj_0 ftj_02 = super.createRenderableElement();
        ftj_02.setCollection(this);
        ftj_02.setNonBlocking(this.m_nonBlocking);
        ftj_02.setRendererManager(this.m);
        ftj_02.setEnableDND(this.s);
        ftj_02.setEnabled(this.m_enabled);
        ftj_02.setNetEnabled(this.m_netEnabled);
        this.refreshEnabledAppearance(ftj_02);
        ftj_02.setExpandable(this.w);
        ftj_02.setNonBlocking(this.x);
        if (this.m_cursorType != null) {
            ftj_02.setCursorType(this.m_cursorType);
        }
        this.o.forEach(fdt_12 -> ftj_02.addEventListener(fdt_12.a(), (fzu)fdt_12, false));
        this.o.clear();
        ftj_02.addEventListener(frd_0.A, fzs2 -> {
            if (this.isEnabledFull() && this.isSelectEvent(fzs2)) {
                ftj_0 ftj_02;
                this.setMousePressedAppearanceState(ftj_02, this.p == (ftj_02 = (ftj_0)fzs2.d()));
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.C, fzs2 -> {
            if (this.isEnabledFull() && this.isSelectEvent(fzs2)) {
                ftj_0 ftj_02 = (ftj_0)fzs2.d();
                ftj_0 ftj_03 = this.u && this.p == ftj_02 ? null : ftj_02;
                this.b(ftj_03);
                this.setMousePressedAppearanceState(ftj_02, this.p == ftj_02);
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.B, fzs2 -> {
            if (this.isEnabledFull()) {
                ftj_0 ftj_02;
                this.setMouseOverAppearanceState(ftj_02, this.p == (ftj_02 = (ftj_0)fzs2.d()));
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.y, fzs2 -> {
            ftj_0 ftj_02;
            if (this.isEnabledFull() && (ftj_02 = (ftj_0)fzs2.d()).getItemValue() != null) {
                this.removeMouseOverAppearanceState(this.z);
                this.z = ftj_02;
                this.setMouseOverAppearanceState(this.z, this.p == ftj_02);
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.z, fzs2 -> {
            if (this.isEnabledFull()) {
                this.removeMouseAppearanceState(this.z, this.p == ftj_02);
                this.z = null;
                this.setNeedsToResetMeshes();
            }
            return false;
        }, false);
        return ftj_02;
    }

    public boolean isSelectEvent(fzs fzs2) {
        if (!this.t) {
            return false;
        }
        if (!this.v) {
            return true;
        }
        if (!(fzs2 instanceof fck_2)) {
            return false;
        }
        return ((fck_2)fzs2).x() == 1;
    }

    protected void a(ftj_0 ftj_02) {
        this.n.add(ftj_02);
        this.add(ftj_02);
        int n = this.n.indexOf(ftj_02);
        this.refreshSelectedAppearance(ftj_02, this.r == n);
    }

    private void a(int n) {
        int n2;
        for (n2 = this.n.size(); n2 < n; ++n2) {
            ftj_0 ftj_02 = this.createRenderableElement();
            if (this.m_id != null) {
                ftj_02.setId(this.m_id + "RenderableContainer" + n2);
            }
            this.a(ftj_02);
        }
        n2 = this.n.size();
        for (int k = n2 - 1; k >= n; --k) {
            ftj_0 ftj_03 = this.n.remove(k);
            if (ftj_03 == this.z) {
                this.z = null;
            }
            ftj_03.destroySelfFromParent();
        }
    }

    @Override
    public void setHideContainerWithoutItem(boolean bl) {
        super.setHideContainerWithoutItem(bl);
        for (ftj_0 ftj_02 : this.n) {
            ftj_02.setHideWithoutItem(this.isHideContainerWithoutItem());
        }
    }

    @Override
    public int size() {
        return this.C != null ? this.C.size() : 0;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.G = null;
        this.H = null;
        this.p = null;
        this.z = null;
        this.n.clear();
        this.C.clear();
        this.q = null;
        this.G = null;
        this.H = null;
        this.m = null;
        this.A.clear();
        if (this.E != null) {
            this.E.a((fsq_0)null);
            this.E.a();
        }
        this.E = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.m_nonBlocking = false;
        this.B = false;
        fqr fqr2 = new fqr();
        fqr2.onCheckOut();
        fqr2.setWidget(this);
        this.add(fqr2);
        this.m = new fag_2();
        this.r = -1;
        this.s = true;
        this.m_needsScissor = true;
        this.y = -1;
        this.t = true;
        this.u = true;
        this.v = true;
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        if (this.B) {
            for (int k = this.A.size() - 1; k >= 0; --k) {
                this.A.get(k).a();
            }
            this.B = false;
        }
        return bl;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fus_0 fus_02 = (fus_0)fyo2;
        super.copyElement(fyo2);
        fus_02.setHorizontal(this.l);
        fus_02.setEnableDND(this.s);
        fus_02.setInnerExpandable(this.w);
        fus_02.setInnerNonBlocking(this.x);
        fus_02.setClickSoundId(this.y);
        fus_02.setFilter(this.E);
        fus_02.setEnableFilterCache(this.F);
        fus_02.setSelectionable(this.t);
        fus_02.setSelectionTogglable(this.u);
        fus_02.setSelectOnlyOnLeftClick(this.v);
        for (int k = fus_02.m_widgetChildren.size() - 1; k >= 0; --k) {
            fvE fvE2 = (fvE)fus_02.m_widgetChildren.get(k);
            fvE2.destroySelfFromParent();
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1384730090) {
            this.setInnerExpandable(Co.a(string));
        } else if (n == -1466575902) {
            this.setClickSoundId(Co.c(string));
        } else if (n == -1872656916) {
            this.setInnerNonBlocking(Co.a(string));
        } else if (n == 1387629604) {
            this.setHorizontal(Co.a(string));
        } else if (n == 1039818982) {
            this.setSelectionable(Co.a(string));
        } else if (n == -2013533217) {
            this.setSelectionTogglable(Co.a(string));
        } else if (n == 400843111) {
            this.setEnableFilterCache(Co.a(string));
        } else if (n == -1763504454) {
            this.setSelectOnlyOnLeftClick(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1384730090) {
            this.setInnerExpandable(Co.b(object));
        } else if (n == -1466575902) {
            this.setClickSoundId(Co.c(object));
        } else if (n == -1872656916) {
            this.setInnerNonBlocking(Co.b(object));
        } else if (n == e) {
            this.setSelected((fiq_1)object);
        } else if (n == f) {
            this.setSelectedValue(object);
        } else if (n == j) {
            this.setFilter((fwk)object);
        } else if (n == 400843111) {
            this.setEnableFilterCache(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public boolean setContentProperty(@Nullable Object object) {
        this.D = object;
        return super.setContentProperty(object);
    }

    public Object getBaseValue() {
        return this.D;
    }

    @Override
    public Iterable<Object> getUnfilteredContent() {
        return (Iterable)this.getBaseValue();
    }

    @Override
    public String getTag() {
        return TAG;
    }
}

