/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fut
 */
public class fut_0
extends fso
implements fio_1 {
    public static final String TAG = "TabbedContainer";
    private static final String q = "tab";
    private static final String r = "separator";
    private static final String s = "backgroundTabsContainer";
    private static final String t = "increaseButton";
    private static final String u = "decreaseButton";
    HashMap<ftI, fin_1> v;
    ArrayList<ftI> w;
    fso x;
    fso y;
    fsk_0 z;
    fso A;
    private ftI B;
    Rectangle C = new Rectangle();
    double D;
    frm_0 E;
    fro_0 F;
    private frm_0 G = frm_0.d;
    private frs_0 H = frs_0.e;
    private frh_0 I = frh_0.c;
    private fim_1 J;
    ftI K;
    boolean L;
    boolean M;
    fru_0 N;
    fru_0 O;
    int P;
    boolean Q;
    boolean R = true;
    private boolean S;
    int T;
    int U;
    private boolean V = false;
    private boolean W = false;
    private boolean X = false;
    public static final String a = "tabsRadiogGroup";
    public static int b;
    public static final int c = 866098950;
    public static final int d = -1182011501;
    public static final int e = 1641575257;
    public static final int f = -1258980872;
    public static final int g = -1693803515;
    public static final int h = 1734729837;
    public static final int i = 913232583;
    public static final int j = -316714927;
    public static final int k = 728975971;
    public static final int l = 797913549;
    public static final int m = 1685417230;
    public static final int n = -2138722491;
    public static final int o = 1495959491;
    public static final int p = -2098222524;

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
        if (fyb_02 instanceof fin_1) {
            fin_1 fin_12 = (fin_1)fyb_02;
            ftI ftI2 = this.setupRadioButtonForTabItem(fin_12);
            fin_12.a(this);
            this.v.put(ftI2, fin_12);
            this.w.add(ftI2);
            this.A.add(ftI2);
        }
    }

    public void a(@NotNull fin_1 fin_12) {
        Optional<ftI> optional = this.v.entrySet().stream().filter(entry -> entry.getValue() == fin_12).map(Map.Entry::getKey).findFirst();
        if (optional.isEmpty()) {
            return;
        }
        ftI ftI2 = optional.get();
        ftI ftI3 = this.setupRadioButtonForTabItem(fin_12);
        this.v.remove(ftI2);
        this.v.put(ftI3, fin_12);
        this.w.remove(ftI2);
        this.w.add(ftI3);
        this.A.replace(ftI2, ftI3);
        if (this.B == ftI2) {
            this.setSelectedTab(ftI3);
        }
        ftI2.onCheckIn();
        this.R = true;
        this.setNeedsToPreProcess();
    }

    @NotNull
    private ftI setupRadioButtonForTabItem(@NotNull fin_1 fin_12) {
        ftI ftI2;
        ftI ftI3 = fin_12.getButton();
        String string = TAG + this.getStyle() + "$tab" + this.E;
        if (ftI3 != null) {
            ftI2 = ftI3;
            if (fin_12.isKeepButtonParameters()) {
                ftI2.setStyle(string, true);
            }
        } else {
            ftI2 = new ftI();
            ftI2.onCheckOut();
            ftI2.setStyle(string, true);
            fin_12.setButton(ftI2);
            ftI2.setChildrenAdded(true);
        }
        ftI2.setElementMap(this.m_elementMap);
        ftI2.setGroupId(this.J.getId());
        ftI2.setValue(Integer.toString(this.v.size()));
        ftI2.setTextOrientation(this.I);
        ftI2.setPixmapAlign(this.G);
        ftI2.setNeedsScissor(true);
        ftI2.setClickSoundId(-2);
        ftI2.setOverrideClickSound(false);
        ftI2.addEventListener(frd_0.A, fzs2 -> {
            if (ftI2 != this.B) {
                this.setSelectedTab(ftI2);
            }
            return false;
        }, false);
        return ftI2;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setElementMap(fyy_0 fyy_02) {
        super.setElementMap(fyy_02);
        this.J.setElementMap(fyy_02);
    }

    public boolean isScrollButtonsNearby() {
        return this.M;
    }

    public void setScrollButtonsNearby(boolean bl) {
        this.M = bl;
        this.R = true;
        this.setNeedsToPreProcess();
    }

    public boolean isScrollButtonsPositionedBeforeTabs() {
        return this.L;
    }

    public void setScrollButtonsPositionedBeforeTabs(boolean bl) {
        this.L = bl;
        this.R = true;
        this.setNeedsToPreProcess();
    }

    public frm_0 getTabsPosition() {
        return this.E;
    }

    public void setTabsSizesEquilibrate(boolean bl) {
        this.S = bl;
    }

    public int getTabXOffset() {
        return this.T;
    }

    public void setTabsXOffset(int n) {
        this.T = n;
    }

    public int getTabYOffset() {
        return this.U;
    }

    public void setTabsYOffset(int n) {
        this.U = n;
    }

    public void setTabsPosition(frm_0 frm_02) {
        fin_2 fin_22 = (fin_2)this.A.getLayoutManager();
        switch (frm_02) {
            case a: {
                fin_22.setHorizontal(true);
                break;
            }
            case b: {
                fin_22.setHorizontal(true);
                break;
            }
            case d: {
                fin_22.setHorizontal(false);
                break;
            }
            case c: {
                fin_22.setHorizontal(false);
            }
        }
        this.E = frm_02;
        this.A.invalidateMinSize();
        this.b();
    }

    public fro_0 getTabsAlignment() {
        return this.F;
    }

    public void setTabsAlignment(fro_0 fro_02) {
        this.F = fro_02;
        this.A.invalidateMinSize();
    }

    public frs_0 getTabsLabelAlignment() {
        return this.H;
    }

    public void setTabsLabelAlignment(frs_0 frs_02) {
        this.H = frs_02;
        for (ftI ftI2 : this.w) {
            ftI2.setAlign(this.H);
        }
    }

    public frm_0 getPixmapAlignment() {
        return this.G;
    }

    public void setPixmapAlignment(frm_0 frm_02) {
        this.G = frm_02;
        for (ftI ftI2 : this.w) {
            ftI2.setPixmapAlign(frm_02);
        }
    }

    public frh_0 getTextOrientation() {
        return this.I;
    }

    public void setTextOrientation(frh_0 frh_02) {
        if (this.I != frh_02) {
            this.I = frh_02;
            for (ftI ftI2 : this.w) {
                ftI2.setTextOrientation(frh_02);
            }
        }
    }

    public fru_0 getSelectedTab() {
        return this.B;
    }

    public int getSelectedTabIndex() {
        for (int k = 0; k < this.w.size(); ++k) {
            if (this.w.get(k) != this.B) continue;
            return k;
        }
        return -1;
    }

    public void setSelectedTab(ftI ftI2) {
        Runnable runnable = () -> ftI2.getAppearance().o();
        fso fso2 = this.v.get(ftI2).getData();
        if (this.W && !fso2.isVisible()) {
            fso2.addVisibilityListener(new fuu_0(this, fso2, runnable));
        } else {
            runnable.run();
        }
        this.B = ftI2;
        this.K = ftI2;
        this.R = true;
        this.setNeedsToPreProcess();
    }

    public void setSelectedTabIndex(int n) {
        ftI ftI2 = this.w.get(n);
        if (ftI2.getVisible()) {
            this.setSelectedTab(ftI2);
        } else {
            this.a();
        }
    }

    public void setDataContainer(fso fso3) {
        if (fso3 == this.x) {
            return;
        }
        boolean bl = this.X && !fso3.isVisible();
        Runnable runnable = () -> {
            this.add(fso3);
            fso3.invalidate();
            this.x = fso3;
        };
        Consumer<@Nullable fso> consumer = fso2 -> {
            if (fso2 == null) {
                return;
            }
            this.remove((fyb_0)fso2);
        };
        Runnable runnable2 = this.X ? () -> {
            if (fso3 == this.x) {
                return;
            }
            fso fso3 = this.x;
            runnable.run();
            if (fso3 == null) {
                return;
            }
            if (bl && !fso3.isValid()) {
                this.setNeedsToPostProcess();
                fso3.addPostProcessCallback(new fuv(this, fso3, consumer, fso3));
            } else {
                consumer.accept(fso3);
            }
        } : () -> {
            if (fso3 == this.x) {
                return;
            }
            consumer.accept(this.x);
            runnable.run();
        };
        if (bl) {
            fso3.addVisibilityListener(new fuw_0(this, fso3, runnable2));
        } else {
            runnable2.run();
        }
        if (this.V) {
            fso3.setVisible(true);
        }
    }

    public void setForceVisibilityOfTabItemContent(boolean bl) {
        this.V = bl;
    }

    public boolean isForceVisibilityOfTabItemContent() {
        return this.V;
    }

    public void setSyncTabButtonStateAndTab(boolean bl) {
        this.W = bl;
    }

    public boolean isSyncTabButtonStateAndTab() {
        return this.W;
    }

    public void setChangeTabWhenReady(boolean bl) {
        this.X = bl;
    }

    public boolean isChangeTabWhenReady() {
        return this.X;
    }

    @Override
    public fvE getWidget(int n, int n2) {
        if (this.m_unloading || !this.m_visible || !this.getAppearance().a(n, n2) || fta_0.getInstance().isMovePointMode()) {
            return null;
        }
        fvE fvE2 = this.m_nonBlocking ? null : this;
        int n3 = this.A.getX();
        int n4 = this.A.getY() + (int)this.D;
        if ((n -= this.getAppearance().getLeftInset()) > n3 && (double)n < (double)n3 + this.C.getWidth() && (n2 -= this.getAppearance().getBottomInset()) > n4 && (double)n2 < (double)n4 + this.C.getHeight()) {
            fvE2 = this.A.getWidget(n - this.A.m_position.x, n2 - this.A.m_position.y);
        }
        if (fvE2 != null) {
            return fvE2;
        }
        for (int k = 0; k < this.m_widgetChildren.size(); ++k) {
            fvE fvE3 = (fvE)this.m_widgetChildren.get(k);
            if (fvE3 == this.A || fvE3.isUnloading() || (fvE3 = fvE3.getWidget(n - fvE3.m_position.x, n2 - fvE3.m_position.y)) == null) continue;
            fvE2 = fvE3;
        }
        return fvE2;
    }

    private void setButtonsMinHeight(int n) {
        for (ftI ftI2 : this.w) {
            ftI2.setPrefSize(new fjf_2(0, n));
        }
    }

    @Override
    public void setStyle(String string, boolean bl) {
        super.setStyle(string, bl);
        this.b();
    }

    private void setButtonsMinWidth(int n) {
        for (ftI ftI2 : this.w) {
            ftI2.setPrefSize(new fjf_2(n, 0));
        }
    }

    private int b(boolean bl) {
        int n = 0;
        n = (int)Math.max(bl ? this.N.getMinSize().getWidth() : this.N.getMinSize().getHeight(), (double)n);
        n = (int)Math.max(bl ? this.O.getMinSize().getWidth() : this.O.getMinSize().getHeight(), (double)n);
        for (ftI ftI2 : this.w) {
            n = (int)Math.max(bl ? ftI2.getMinSize().getWidth() : ftI2.getMinSize().getHeight(), (double)n);
        }
        return n;
    }

    @Override
    public void onChildrenAdded() {
        this.J.onChildrenAdded();
        this.A.onChildrenAdded();
        this.y.onChildrenAdded();
        this.z.onChildrenAdded();
        this.N.onChildrenAdded();
        this.O.onChildrenAdded();
        super.onChildrenAdded();
    }

    @Override
    public void onCheckIn() {
        if (this.x != null) {
            this.m_children.remove(this.x);
        }
        super.onCheckIn();
        this.v.clear();
        this.C = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.v = new HashMap();
        this.w = new ArrayList();
        fua_0 fua_02 = new fua_0(this);
        ((fyo)fua_02).onCheckOut();
        this.add(fua_02);
        this.J = new fim_1();
        this.J.onCheckOut();
        this.J.setId(a + b++);
        this.A = fso.checkOut();
        fub_0 fub_02 = new fub_0(this);
        this.A.getEntity().a(fub_02);
        this.A.getEntity().b(fub_02);
        this.y = new fso();
        this.y.onCheckOut();
        this.z = new fsk_0();
        this.z.onCheckOut();
        this.N = new fru_0();
        this.N.onCheckOut();
        this.N.addEventListener(frd_0.C, new fux(this), false);
        this.O = new fru_0();
        this.O.onCheckOut();
        this.O.addEventListener(frd_0.C, new fuy(this), false);
        this.A.setNeedsScissor(true);
        this.add(this.y);
        this.add(this.A);
        this.add(this.z);
        this.add(this.N);
        this.add(this.O);
        this.setTabsPosition(frm_0.a);
        this.setTabsAlignment(fro_0.d);
        this.m_needsScissor = true;
        this.V = false;
        this.W = false;
        this.X = false;
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.R) {
            this.invalidate();
            this.R = false;
        }
        return bl;
    }

    @Override
    public void validate() {
        if (this.B != null) {
            this.setDataContainer(this.v.get(this.B).getData());
        } else if (this.w.isEmpty()) {
            this.B = null;
            this.x = null;
        } else {
            for (ftI ftI2 : this.w) {
                if (ftI2.getValue() == null || !ftI2.getValue().equalsIgnoreCase(this.J.getValue())) continue;
                this.setSelectedTab(ftI2);
            }
            if (this.B == null) {
                this.a();
            }
            if (this.B != null) {
                this.setDataContainer(this.v.get(this.B).getData());
            }
        }
        super.validate();
    }

    @Override
    public void onAttributesInitialized() {
        super.onAttributesInitialized();
        this.b();
    }

    private void b() {
        if (this.v != null) {
            for (fin_1 fin_12 : this.v.values()) {
                if (fin_12.a()) continue;
                ftI ftI2 = fin_12.getButton();
                ftI2.m_appearance.l();
                ftI2.setStyle(TAG + this.getStyle() + "$tab" + this.E, true);
                fin_12.b();
            }
        }
        if (this.z != null) {
            this.z.m_appearance.l();
            this.z.setStyle(TAG + this.getStyle() + "$separator" + this.E, true);
        }
        if (this.y != null) {
            this.y.m_appearance.l();
            this.y.setStyle(TAG + this.getStyle() + "$backgroundTabsContainer" + this.E, true);
        }
        if (this.N != null) {
            this.N.m_appearance.l();
            this.N.setStyle(TAG + this.getStyle() + "$increaseButton" + this.E, true);
        }
        if (this.O != null) {
            this.O.m_appearance.l();
            this.O.setStyle(TAG + this.getStyle() + "$decreaseButton" + this.E, true);
        }
    }

    @Override
    public void invalidateMinSize() {
        super.invalidateMinSize();
        switch (this.E) {
            case a: 
            case b: {
                this.A.setPrefSize(new fjf_2(0, this.b(false)));
                if (!this.S) break;
                this.setButtonsMinWidth(this.b(true));
                break;
            }
            case d: 
            case c: {
                this.A.setPrefSize(new fjf_2(this.b(true), 0));
                if (!this.S) break;
                this.setButtonsMinHeight(this.b(false));
            }
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        fut_0 fut_02 = (fut_0)fyo2;
        super.copyElement(fut_02);
        fut_02.E = this.E;
        fut_02.F = this.F;
        fut_02.G = this.G;
        fut_02.H = this.H;
        fut_02.I = this.I;
        fut_02.L = this.L;
        fut_02.M = this.M;
        fut_02.T = this.T;
        fut_02.U = this.U;
        fut_02.V = this.V;
        fut_02.W = this.W;
        fut_02.X = this.X;
    }

    @Override
    public void a(boolean bl) {
        if (!this.m_childrenAdded) {
            return;
        }
        this.m_layout.a(this.getContainer());
        if (this.B != null) {
            this.a();
        }
    }

    public void a() {
        for (int k = 0; k < this.w.size(); ++k) {
            ftI ftI2 = this.w.get(k);
            if (ftI2 == null || !this.v.get(ftI2).isVisible()) continue;
            this.setSelectedTab(ftI2);
            return;
        }
    }

    ArrayList<ftI> getVisibleTabs() {
        ArrayList<ftI> arrayList = new ArrayList<ftI>();
        for (ftI ftI2 : this.w) {
            if (!this.v.get(ftI2).isVisible()) continue;
            arrayList.add(ftI2);
        }
        return arrayList;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 866098950) {
            this.setPixmapAlignment(frm_0.a(string));
        } else if (n == -1182011501) {
            this.setScrollButtonsNearby(Co.a(string));
        } else if (n == -1258980872) {
            this.setSelectedTabIndex(Co.c(string));
        } else if (n == 1641575257) {
            this.setScrollButtonsPositionedBeforeTabs(Co.a(string));
        } else if (n == -1693803515) {
            this.setTabsAlignment(fro_0.a(string));
        } else if (n == 1734729837) {
            this.setTabsLabelAlignment(frs_0.a(string));
        } else if (n == 913232583) {
            this.setTabsPosition(frm_0.a(string));
        } else if (n == 728975971) {
            this.setTextOrientation(frh_0.a(string));
        } else if (n == 797913549) {
            this.T = Co.c(string);
        } else if (n == 1685417230) {
            this.U = Co.c(string);
        } else if (n == -316714927) {
            this.S = Co.a(string);
        } else if (n == -2138722491) {
            this.setForceVisibilityOfTabItemContent(Co.a(string));
        } else if (n == 1495959491) {
            this.setSyncTabButtonStateAndTab(Co.a(string));
        } else if (n == -2098222524) {
            this.setChangeTabWhenReady(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 866098950) {
            this.setPixmapAlignment((frm_0)((Object)object));
        } else if (n == -1258980872) {
            this.setSelectedTabIndex(Co.c(object));
        } else if (n == -1182011501) {
            this.setScrollButtonsNearby(Co.b(object));
        } else if (n == 1641575257) {
            this.setScrollButtonsPositionedBeforeTabs(Co.b(object));
        } else if (n == -1693803515) {
            this.setTabsAlignment((fro_0)((Object)object));
        } else if (n == 1734729837) {
            this.setTabsLabelAlignment((frs_0)((Object)object));
        } else if (n == 913232583) {
            this.setTabsPosition((frm_0)((Object)object));
        } else if (n == 728975971) {
            this.setTextOrientation((frh_0)((Object)object));
        } else if (n == 797913549) {
            this.T = Co.c(object);
        } else if (n == 1685417230) {
            this.U = Co.c(object);
        } else if (n == -316714927) {
            this.S = Co.b(object);
        } else if (n == -2138722491) {
            this.setForceVisibilityOfTabItemContent(Co.b(object));
        } else if (n == 1495959491) {
            this.setSyncTabButtonStateAndTab(Co.b(object));
        } else if (n == -2098222524) {
            this.setChangeTabWhenReady(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

