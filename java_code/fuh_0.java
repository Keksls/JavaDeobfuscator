/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fuH
 */
public class fuh_0
extends fso
implements fxy {
    public static final String TAG = "textEditorPlus";
    public static final String a = "textEditor";
    public static final String b = "searchButton";
    public static final String c = "clearButton";
    public static final String d = "list";
    protected boolean e = false;
    protected boolean f = false;
    protected boolean g = false;
    private int ac = -1;
    private frs_0 ad = frs_0.b;
    private frs_0 ae = frs_0.h;
    private fqs_0 af = fqs_0.a;
    private boolean ag = false;
    private int ah = Integer.MAX_VALUE;
    protected fug_0 h;
    protected fru_0 i;
    protected fru_0 j;
    private fsQ ak = null;
    boolean al;
    private fzu am;
    private fzu an;
    private fzu ao;
    private fzu ap;
    private fxG aq;
    private fzu ar;
    private fzu as;
    private fzu at;
    private fzu au;
    private fzu av;
    boolean aw;
    private boolean ax = false;
    private boolean ay = false;
    private final fwk<String, ?> az = new fwl();
    private final List<Consumer<@NotNull fug_0>> aA = new LinkedList<Consumer<fug_0>>();
    private final List<Consumer<@NotNull fug_0>> aB = new LinkedList<Consumer<fug_0>>();
    public static final int k = 92903173;
    public static final int l = -1249482096;
    public static final int m = 3148879;
    public static final int n = 48371712;
    public static final int o = -919628796;
    public static final int p = 1307418143;
    public static final int q = -1326227699;
    public static final int r = 400381634;
    public static final int s = -1375815020;
    public static final int t = -1206239059;
    public static final int u = 390232059;
    public static final int v = -1439500848;
    public static final int w = 3556653;
    public static final int x = -1852365066;
    public static final int y = 1153931755;
    public static final int z = -1152148181;
    public static final int A = 3744723;
    public static final int B = 1913333550;
    public static final int C = -1655575466;
    public static final int D = -625591907;
    public static final int E = -470861862;
    public static final int F = 1249389695;
    public static final int G = 381878489;
    public static final int H = 73055982;
    public static final int I = 1216985755;
    public static final int J = -336545092;
    public static final int K = 1602416228;
    public static final int L = 1453943993;
    public static final int M = -1784789924;
    public static final int N = 534924003;
    public static final int O = 105252970;
    public static final int P = fug_0.F;
    public static final int Q = -410343712;
    public static final int R = -2072642759;
    public static final int S = 1492073575;
    public static final int T = -1351906386;
    public static final int U = 428573020;
    public static final int V = 844056925;
    public static final int W = "selectedValue".hashCode();
    public static final int X = 1905963320;
    public static final int Y = -406349635;
    public static final int Z = 408593605;
    public static final int aa = 583200901;
    public static final int ab = 193923019;

    public void setWithSearchButton(boolean bl) {
        if (bl == this.e) {
            return;
        }
        this.e = bl;
        this.i.setVisible(this.e);
        this.b();
    }

    public void setWithClearButton(boolean bl) {
        if (bl == this.f) {
            return;
        }
        this.f = bl;
        this.b();
    }

    public void setOnSearch(fdh_1 fdh_12) {
        this.addEventListener(fdh_12.a(), fdh_12, true);
    }

    public void setOnClear(fcy_2 fcy_22) {
        this.addEventListener(fcy_22.a(), fcy_22, true);
    }

    public void setSearchOnPressEnter(boolean bl) {
        if (this.g == bl) {
            return;
        }
        if (this.isMultiline() && bl) {
            return;
        }
        this.g = bl;
    }

    public void a() {
        this.a(fug_0::d);
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (a.equalsIgnoreCase(string)) {
            return this.h;
        }
        if (b.equalsIgnoreCase(string)) {
            return this.i;
        }
        if (c.equalsIgnoreCase(string)) {
            return this.j;
        }
        if (d.equalsIgnoreCase(string)) {
            return this.ak;
        }
        return this;
    }

    @Override
    public void invalidateMinSize() {
        super.invalidateMinSize();
        this.al = true;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.al = true;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.al = false;
        this.aw = false;
        this.i.removeEventListener(frd_0.C, this.am, false);
        this.am = null;
        this.j.removeEventListener(frd_0.C, this.an, false);
        this.an = null;
        this.h.removeEventListener(frd_0.n, this.ao, false);
        this.ao = null;
        this.h.removeEventListener(frd_0.p, this.ap, false);
        this.ap = null;
        this.h.b(this.aq);
        this.aq = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.f = false;
        this.e = false;
        this.aA.clear();
        this.aB.clear();
        fta_0.getInstance().removeEventListener(frd_0.A, this.at, false);
        fta_0.getInstance().removeEventListener(frd_0.B, this.au, false);
        this.ae = null;
        this.ad = null;
        if (this.ak != null) {
            this.removeEventListener(frd_0.i, this.av, true);
            this.ak.removeEventListener(frd_0.q, this.ar, false);
            this.ak.destroySelfFromParent();
            this.ak = null;
        }
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.al = true;
        fqG fqG2 = new fqG();
        fqG2.onCheckOut();
        fqG2.setWidget(this);
        this.add(fqG2);
        fuJ fuJ2 = new fuJ(this);
        fuJ2.onCheckOut();
        this.add(fuJ2);
        this.h = new fug_0();
        this.h.onCheckOut();
        this.h.setCanBeCloned(false);
        this.aq = (string, string2) -> {
            if (!this.f) {
                return;
            }
            boolean bl = Cz.t(string2);
            if (this.aw == bl) {
                return;
            }
            this.aw = bl;
            this.b();
        };
        this.h.a(this.aq);
        this.aw = false;
        this.g();
        this.ao = fzs2 -> {
            if (!(fzs2 instanceof fcd_2)) {
                return false;
            }
            fcd_2 fcd_22 = (fcd_2)fzs2;
            this.b(fcd_22);
            return false;
        };
        this.h.addEventListener(frd_0.n, this.ao, false);
        this.ap = fzs2 -> {
            if (!(fzs2 instanceof fcd_2)) {
                return false;
            }
            fcd_2 fcd_22 = (fcd_2)fzs2;
            this.a(fcd_22);
            return false;
        };
        this.h.addEventListener(frd_0.p, this.ap, false);
        this.add(this.h);
        this.h.setListFilter(this.az);
        this.ak = new fsQ();
        this.ak.onCheckOut();
        this.i = new fru_0();
        this.i.onCheckOut();
        this.i.setCanBeCloned(false);
        this.i.setVisible(false);
        this.am = fzs2 -> {
            this.dispatchEvent(new fco_2(this.h, this.h.getText()));
            return false;
        };
        this.i.addEventListener(frd_0.C, this.am, false);
        this.add(this.i);
        this.j = new fru_0();
        this.j.onCheckOut();
        this.j.setCanBeCloned(false);
        this.j.setVisible(false);
        this.an = fzs2 -> {
            String string = this.h.getText();
            this.h.d();
            this.dispatchEvent(new fcl_1(this.h, string));
            return false;
        };
        this.j.addEventListener(frd_0.C, this.an, false);
        this.add(this.j);
        this.f();
    }

    private void a(fcd_2 fcd_22) {
        if (this.isMultiline()) {
            return;
        }
        if (this.ak == null) {
            return;
        }
        int n = this.ak.getSelectedOffset();
        if (fcd_22.k() == 38) {
            if (n == 0) {
                this.h();
            } else {
                int n2 = n - 1;
                this.ak.setSelectedOffset(n2, false);
                if ((float)n2 < this.ak.getOffset()) {
                    this.ak.setOffset(this.ak.getOffset() - (float)Hw.d(this.ak.getOffset() - (float)n2));
                } else if ((float)n2 > this.ak.getOffset() + (float)this.ac - 1.0f) {
                    this.ak.setOffset(n2);
                }
            }
        } else if (fcd_22.k() == 40) {
            boolean bl = !this.ax;
            this.i();
            int n3 = bl ? n : Math.min(n + 1, this.ak.getItems().size());
            this.ak.setSelectedOffset(n3, false);
            if (bl) {
                this.ak.setOffset(n3);
            } else if ((float)n3 > this.ak.getOffset() + (float)this.ac - 1.0f) {
                this.ak.setOffset(this.ak.getOffset() + (float)Hw.d((float)(n3 - this.ac + 1) - this.ak.getOffset()));
            }
        } else if (fcd_22.k() == 10) {
            this.ak.a();
            this.h();
        } else if (fcd_22.j() != '\uffff') {
            this.i();
        }
    }

    private void b(fcd_2 fcd_22) {
        if (!this.g) {
            return;
        }
        if (fcd_22.k() != 10) {
            return;
        }
        this.dispatchEvent(new fco_2(this.h, this.h.getText()));
    }

    private void f() {
        this.as = fzs2 -> {
            if (this.b(fzs2) || this.c(fzs2)) {
                this.h();
            } else if (this.af.a() && this.isEnabledFull()) {
                this.i();
            }
            return false;
        };
        this.addEventListener(frd_0.C, this.as, false);
        this.at = fzs2 -> {
            fck_2 fck_22 = (fck_2)fzs2;
            if (this.ax) {
                if (this.m_appearance == null) {
                    return true;
                }
                if (this.m_appearance.a(fck_22.a(this), fck_22.b(this))) {
                    return true;
                }
                fqr fqr2 = this.ak.getAppearance();
                if (fqr2 == null) {
                    return true;
                }
                if (!fqr2.a(fck_22.a(this.ak), fck_22.b(this.ak))) {
                    this.h();
                    return true;
                }
            }
            return false;
        };
        fta_0.getInstance().addEventListener(frd_0.A, this.at, false);
        this.au = fzs2 -> {
            fck_2 fck_22 = (fck_2)fzs2;
            if (!this.ay && this.ax) {
                fzs fzs3 = fck_22.h();
                if (fzs3 == null) {
                    return true;
                }
                if (this.a(fzs3)) {
                    return true;
                }
                if (fzs3.e() == this.h) {
                    return true;
                }
                if (this.af.b()) {
                    this.h();
                }
                return true;
            }
            if (this.ay) {
                this.ay = false;
            }
            return false;
        };
        fta_0.getInstance().addEventListener(frd_0.B, this.au, false);
        this.ar = fzs2 -> {
            fcf_2 fcf_22 = (fcf_2)fzs2;
            if (this.af.b() && fcf_22.k()) {
                this.setSelectedValue(fcf_22.l());
                this.h();
            }
            fcf_2 fcf_23 = new fcf_2(this, fcf_22.j(), fcf_22.l(), fcf_22.k());
            this.dispatchEvent(fcf_23);
            return false;
        };
        this.av = fzs2 -> {
            boolean bl;
            fcz_1 fcz_12 = (fcz_1)fzs2;
            boolean bl2 = bl = fcz_12.e().getParentOfType(fuh_0.class) == this;
            if (bl || fcz_12.j()) {
                this.i();
            } else {
                this.h();
            }
            return false;
        };
        this.addEventListener(frd_0.i, this.av, true);
        this.az.a((T string) -> {
            if (this.ax) {
                this.x();
            }
        });
    }

    private boolean a(fzs fzs2) {
        ftx_0 ftx_02 = this.ak.getScrollBar();
        if (ftx_02 == null) {
            return false;
        }
        fum fum2 = ftx_02.getSlider();
        if (fum2 == null) {
            return false;
        }
        return fzs2.e() == fum2.getButton();
    }

    private boolean b(fzs fzs2) {
        if (!this.f || this.j == null) {
            return false;
        }
        return fzs2 != null && fzs2.e() == this.j;
    }

    private boolean c(fzs fzs2) {
        if (!this.e || this.i == null) {
            return false;
        }
        return fzs2 != null && fzs2.e() == this.i;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fuh_0 fuh_02 = (fuh_0)fyo2;
        super.copyElement(fuh_02);
        fuh_02.setWithSearchButton(this.e);
        fuh_02.setWithClearButton(this.f);
        fuh_02.setSearchOnPressEnter(this.g);
        fuh_02.aA.addAll(this.aB);
        fuh_02.aA.addAll(this.aA);
        fuh_02.g();
        if (this.ak != null) {
            fvE fvE2 = (fvE)this.ak.cloneElementStructure();
            fvE2.m_styleIsDirty = false;
            fvE2.removeAllEventListeners();
            fuh_02.add(fvE2);
        }
        fuh_02.setMaxRows(this.ac);
        fuh_02.setHotSpotPosition(this.ad);
        fuh_02.setAlign(this.ae);
        fuh_02.setBehaviour(this.af);
        fuh_02.setDisplayListOnlyIfTextPresent(this.ag);
        fuh_02.setDisplayListThreshold(this.ah);
        fuh_02.removeEventListener(frd_0.A, this.at, false);
        fuh_02.removeEventListener(frd_0.B, this.au, false);
        fuh_02.removeEventListener(frd_0.C, this.as, false);
        if (this.h != null) {
            this.h.copyElement(fuh_02.h);
            fuh_02.h.b(this.aq);
            fuh_02.h.removeEventListener(frd_0.n, this.ao, false);
            fuh_02.h.removeEventListener(frd_0.p, this.ap, false);
        }
        if (this.i != null) {
            this.i.copyElement(fuh_02.i);
            fuh_02.i.removeEventListener(frd_0.C, this.am, false);
        }
        if (this.j != null) {
            this.j.copyElement(fuh_02.j);
            fuh_02.j.removeEventListener(frd_0.C, this.an, false);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    private void g() {
        if (this.h == null) {
            return;
        }
        this.aA.forEach(consumer -> {
            consumer.accept(this.h);
            this.aB.add((Consumer<fug_0>)consumer);
        });
        this.aA.clear();
    }

    private void a(Consumer<@NotNull fug_0> consumer) {
        if (this.h != null) {
            consumer.accept(this.h);
            this.aB.add(consumer);
        } else {
            this.aA.add(consumer);
        }
    }

    private <T> T a(Function<@NotNull fug_0, T> function) {
        if (this.h != null) {
            T t = function.apply(this.h);
            this.aB.add(function::apply);
            return t;
        }
        this.aA.add(function::apply);
        return null;
    }

    @Override
    public void setAlign(frs_0 frs_02) {
        this.a((fug_0 fug_02) -> fug_02.setAlign(frs_02));
        if (frs_02 != null) {
            this.ae = frs_02;
        }
    }

    @Override
    public boolean isSelectable() {
        if (this.h == null) {
            return false;
        }
        return this.h.isSelectable();
    }

    @Override
    public void setSelectable(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setSelectable(bl));
    }

    @Override
    public boolean isSelectOnFocus() {
        if (this.h == null) {
            return false;
        }
        return this.h.isSelectOnFocus();
    }

    @Override
    public void setSelectOnFocus(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setSelectOnFocus(bl));
    }

    @Override
    public boolean isEnableOnlySelectablePartInteraction() {
        if (this.h == null) {
            return false;
        }
        return this.h.isEnableOnlySelectablePartInteraction();
    }

    @Override
    public void setEnableOnlySelectablePartInteraction(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setEnableOnlySelectablePartInteraction(bl));
    }

    @Override
    public boolean isAutoHorizontalScrolled() {
        if (this.h == null) {
            return false;
        }
        return this.h.isAutoHorizontalScrolled();
    }

    @Override
    public void setAutoHorizontalScrolled(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setAutoHorizontalScrolled(bl));
    }

    @Override
    public int getMaxCharacters() {
        if (this.h == null) {
            return 0;
        }
        return this.h.getMaxCharacters();
    }

    @Override
    public void setMaxCharacters(int n) {
        this.a((fug_0 fug_02) -> fug_02.setMaxCharacters(n));
    }

    @Override
    public boolean isPassword() {
        if (this.h == null) {
            return false;
        }
        return this.h.isPassword();
    }

    @Override
    public void setPassword(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setPassword(bl));
    }

    @Override
    public String getRestrict() {
        if (this.h == null) {
            return null;
        }
        return this.h.getRestrict();
    }

    @Override
    public void setRestrict(String string) {
        this.a((fug_0 fug_02) -> fug_02.setRestrict(string));
    }

    @Override
    public boolean isEditable() {
        if (this.h == null) {
            return false;
        }
        return this.h.isEditable();
    }

    @Override
    public void setEditable(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setEditable(bl));
    }

    @Override
    public String getGhostText() {
        if (this.h == null) {
            return null;
        }
        return this.h.getGhostText();
    }

    @Override
    public void setGhostText(@Nullable Object object) {
        this.a((fug_0 fug_02) -> fug_02.setGhostText(object));
    }

    @Override
    public boolean isUnicodeRestrict() {
        if (this.h == null) {
            return false;
        }
        return this.h.isUnicodeRestrict();
    }

    @Override
    public void setUnicodeRestrict(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setUnicodeRestrict(bl));
    }

    @Override
    public boolean isDisplayGhostTextOnFocusLost() {
        if (this.h == null) {
            return false;
        }
        return this.h.isDisplayGhostTextOnFocusLost();
    }

    @Override
    public void setDisplayGhostTextOnFocusLost(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setDisplayGhostTextOnFocusLost(bl));
    }

    @Override
    public boolean isReplaceNullByGhostText() {
        if (this.h == null) {
            return false;
        }
        return this.h.isReplaceNullByGhostText();
    }

    @Override
    public void setReplaceNullByGhostText(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setReplaceNullByGhostText(bl));
    }

    @Override
    public fwn<String, ?> getListFilter() {
        if (this.h == null) {
            return null;
        }
        return this.h.getListFilter();
    }

    @Override
    public void setListFilter(fwn<String, ?> fwn2) {
        this.a((fug_0 fug_02) -> fug_02.setListFilter(fwn2));
    }

    @Override
    public void a(String string) {
        this.a((fug_0 fug_02) -> fug_02.a(string));
    }

    @Override
    public boolean isJustify() {
        if (this.h == null) {
            return false;
        }
        return this.h.isJustify();
    }

    @Override
    public void setJustify(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setJustify(bl));
    }

    @Override
    public void setFont(ayf_2 ayf_22) {
        this.a((fug_0 fug_02) -> fug_02.setFont(ayf_22));
    }

    @Override
    public void setHorizontalAlignment(fro_0 fro_02) {
        this.a((fug_0 fug_02) -> fug_02.setHorizontalAlignment(fro_02));
    }

    @Override
    public void setVerticalAlignment(fro_0 fro_02) {
        this.a((fug_0 fug_02) -> fug_02.setVerticalAlignment(fro_02));
    }

    @Override
    public boolean isBrightenColor() {
        if (this.h == null) {
            return false;
        }
        return this.h.isBrightenColor();
    }

    @Override
    public void setBrightenColor(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setBrightenColor(bl));
    }

    @Override
    public boolean isDarkenColor() {
        if (this.h == null) {
            return false;
        }
        return this.h.isDarkenColor();
    }

    @Override
    public void setDarkenColor(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setDarkenColor(bl));
    }

    @Override
    public int getMinWidth() {
        if (this.h == null) {
            return 0;
        }
        return this.h.getMinWidth();
    }

    @Override
    public void setMinWidth(int n) {
        this.a((fug_0 fug_02) -> fug_02.setMinWidth(n));
    }

    @Override
    public int getMaxWidth() {
        if (this.h == null) {
            return 0;
        }
        return this.h.getMaxWidth();
    }

    @Override
    public void setMaxWidth(int n) {
        this.a((fug_0 fug_02) -> fug_02.setMaxWidth(n));
    }

    @Override
    public boolean isMultiline() {
        if (this.h == null) {
            return false;
        }
        return this.h.isMultiline();
    }

    @Override
    public void setMultiline(boolean bl) {
        if (bl && this.g) {
            this.setSearchOnPressEnter(false);
        }
        this.a((fug_0 fug_02) -> fug_02.setMultiline(bl));
    }

    @Override
    public int getMaxLines() {
        if (this.h == null) {
            return Integer.MAX_VALUE;
        }
        return this.h.getMaxLines();
    }

    @Override
    public void setMaxLines(int n) {
        this.a((fug_0 fug_02) -> fug_02.setMaxLines(n));
    }

    @Override
    public frh_0 getOrientation() {
        if (this.h == null) {
            return null;
        }
        return this.h.getOrientation();
    }

    @Override
    public void setOrientation(frh_0 frh_02) {
        this.a((fug_0 fug_02) -> fug_02.setOrientation(frh_02));
    }

    @Override
    public String getText() {
        if (this.h == null) {
            return null;
        }
        return this.h.getText();
    }

    @Override
    @Nullable
    public String setText(@Nullable Object object) {
        return this.a((fug_0 fug_02) -> fug_02.setText(object));
    }

    @Override
    public boolean isUseHighContrast() {
        if (this.h == null) {
            return false;
        }
        return this.h.isUseHighContrast();
    }

    @Override
    public void setUseHighContrast(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setUseHighContrast(bl));
    }

    @Override
    public boolean isEnableShrinking() {
        if (this.h == null) {
            return false;
        }
        return this.h.isEnableShrinking();
    }

    @Override
    public void setEnableShrinking(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setEnableShrinking(bl));
    }

    @Override
    public void setZoom(float f2) {
        this.a((fug_0 fug_02) -> fug_02.setZoom(f2));
    }

    @Override
    public void setDisplayCharDelay(long l) {
        this.a((fug_0 fug_02) -> fug_02.setDisplayCharDelay(l));
    }

    @Override
    public boolean isEnableAutoZoomShrink() {
        if (this.h == null) {
            return false;
        }
        return this.h.isEnableAutoZoomShrink();
    }

    @Override
    public void setEnableAutoZoomShrink(boolean bl) {
        this.a((fug_0 fug_02) -> fug_02.setEnableAutoZoomShrink(bl));
    }

    @Override
    public void setColor(azj_2 azj_22, @Nullable String string) {
        this.a((fug_0 fug_02) -> fug_02.setColor(azj_22, string));
    }

    @Override
    public void setFocused(boolean bl) {
        if (this.h != null) {
            this.h.setFocused(bl);
        } else {
            super.setFocused(bl);
        }
    }

    protected void b() {
        this.d();
        this.c();
        this.e();
        this.invalidate();
    }

    public void setSearchButtonDisplaySize(@NotNull fjf_2 fjf_22) {
        this.i.setSize(fjf_22);
        this.i.setDisplaySize(fjf_22);
        this.b();
    }

    public void setClearButtonDisplaySize(@NotNull fjf_2 fjf_22) {
        this.j.setSize(fjf_22);
        this.j.setDisplaySize(fjf_22);
        this.b();
    }

    protected void c() {
        if (!this.m_prefSizeSet) {
            return;
        }
        fjf_2 fjf_22 = new fjf_2(this.m_prefSize);
        if (this.f) {
            fjf_22.width -= this.getClearButtonFullWidth();
        }
        if (this.e) {
            fjf_22.width -= this.getSearchButtonFullWidth();
        }
        this.a((fug_0 fug_02) -> fug_02.setPrefSize(fjf_22));
    }

    @Override
    public void setPrefSize(fjf_2 fjf_22) {
        super.setPrefSize(fjf_22);
        this.c();
        this.invalidate();
    }

    protected void d() {
        if (!this.m_minSizeSet) {
            return;
        }
        fjf_2 fjf_22 = new fjf_2(this.m_minSize);
        if (this.f) {
            fjf_22.width -= this.getClearButtonFullWidth();
        }
        if (this.e) {
            fjf_22.width -= this.getSearchButtonFullWidth();
        }
        this.a((fug_0 fug_02) -> fug_02.setMinSize(fjf_22));
    }

    @Override
    public void setMinSize(fjf_2 fjf_22) {
        super.setMinSize(fjf_22);
        this.d();
        this.invalidate();
    }

    protected void e() {
        if (!this.m_maxSizeSet) {
            return;
        }
        fjf_2 fjf_22 = new fjf_2(this.m_maxSize);
        if (this.f) {
            fjf_22.width -= this.getClearButtonFullWidth();
        }
        if (this.e) {
            fjf_22.width -= this.getSearchButtonFullWidth();
        }
        this.a((fug_0 fug_02) -> fug_02.setMaxSize(fjf_22));
    }

    @Override
    public void setMaxSize(fjf_2 fjf_22) {
        super.setMaxSize(fjf_22);
        this.e();
        this.invalidate();
    }

    protected int getSearchButtonFullWidth() {
        if (!this.e) {
            return 0;
        }
        return this.i.getWidth() + this.i.getAppearance().getInsetWidth();
    }

    protected int getSearchButtonHeight() {
        if (!this.e) {
            return 0;
        }
        return this.i.getHeight() + this.i.getAppearance().getInsetHeight();
    }

    protected int getClearButtonFullWidth() {
        if (!this.f) {
            return 0;
        }
        return this.j.getWidth() + this.j.getAppearance().getInsetWidth();
    }

    protected int getClearButtonHeight() {
        if (!this.f) {
            return 0;
        }
        return this.j.getHeight() + this.j.getAppearance().getInsetHeight();
    }

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fsQ) {
            if (this.ak != null) {
                this.ak.release();
            }
            this.ak = (fsQ)fyb_02;
            this.ak.setModalLevel((short)30000);
            this.ak.setListFilter(this.az);
            this.az.a(this.ak);
            this.a(this.ak);
        } else {
            super.add(fyb_02);
        }
    }

    private void a(fsQ fsQ2) {
        fsQ2.addEventListener(frd_0.q, this.ar, false);
        this.addEventListener(frd_0.i, this.av, true);
    }

    private void h() {
        if (this.ax) {
            this.ak.removeSelfFromParent();
            this.ax = false;
            fza_0.a().d();
        }
    }

    private void i() {
        if (this.ak == null || !this.isEnabledFull()) {
            return;
        }
        if (this.ak.size() > this.ah) {
            this.h();
            return;
        }
        if (!this.ax) {
            if (this.ag && this.getText().isEmpty()) {
                return;
            }
            if (this.ak.size() > this.ah) {
                return;
            }
            this.x();
            this.ak.setNonBlocking(false);
            fta_0.getInstance().getLayeredContainer().a(this.ak, 30000);
            this.ax = true;
            this.ay = true;
            fza_0.a().c();
        }
    }

    private void x() {
        ArrayList<Object> arrayList = this.ak.getItems();
        if (arrayList == null || arrayList.isEmpty()) {
            this.ak.setVisible(false);
            return;
        }
        this.ak.setVisible(true);
        int n = this.ak.getIdealSize((int)this.ac, (int)-1).height;
        int n2 = this.getDisplayY();
        fta_0 fta_02 = fta_0.getInstance();
        frs_0 frs_02 = this.ae;
        frs_0 frs_03 = this.ad;
        int n3 = this.getDisplayY() + frs_02.b(this.getHeight()) - frs_03.b(n);
        if (n3 < 0 || n3 > fta_02.getAppearance().getContentHeight() - n) {
            frs_02 = frs_02.f();
            frs_03 = frs_03.f();
        }
        n3 = this.getDisplayY() + frs_02.b(this.getHeight()) - frs_03.b(n);
        n3 = Hw.a(n3, 0, fta_02.getAppearance().getContentHeight() - n);
        if (n2 - n < 0 && n2 + this.getHeight() + n > fta_02.getHeight()) {
            n = n2;
            n3 = 0;
        }
        this.ak.setSizeToPrefSize();
        int n4 = Math.max(this.ak.getWidth(), this.getWidth() - this.getLeftMargin() - this.getRightMargin());
        this.ak.setSize(n4, n);
        this.ak.setPosition(this.getDisplayX() + this.getLeftMargin(), n3);
    }

    public void setMaxRows(int n) {
        this.ac = n;
    }

    public void setHotSpotPosition(frs_0 frs_02) {
        if (frs_02 != null) {
            this.ad = frs_02;
        }
    }

    public fsQ getList() {
        return this.ak;
    }

    public void setBehaviour(fqs_0 fqs_02) {
        this.af = fqs_02;
    }

    @Override
    public void setElementMap(fyy_0 fyy_02) {
        super.setElementMap(fyy_02);
        if (this.ak != null) {
            this.ak.setElementMap(fyy_02);
        }
    }

    public Object getSelectedValue() {
        return this.ak == null ? null : this.ak.getSelectedValue();
    }

    public void setSelectedValue(Object object) {
        if (object == null) {
            return;
        }
        if (this.ak != null) {
            this.ak.setSelectedValue(object);
            Object object2 = this.ak.getSelectedValue();
            if (object != object2 && !object.equals(object2) && object2 != null) {
                m_logger.warn((Object)("Cannot find the selected value in the content - 'content' attribute must be defined before 'selectedValue' - " + object + " - " + object2));
            }
        }
    }

    public void setAutoListFilter(boolean bl) {
        if (bl) {
            this.h.setListFilter(this.az);
        } else {
            this.az.b("");
            this.h.setListFilter(null);
        }
    }

    public void setDisplayListOnlyIfTextPresent(boolean bl) {
        this.ag = bl;
    }

    public void setDisplayListThreshold(int n) {
        this.ah = n;
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        this.a((fug_0 fug_02) -> fug_02.setNetEnabled(bl));
        if (this.i != null) {
            this.i.setNetEnabled(bl);
        }
        if (this.j != null) {
            this.j.setNetEnabled(bl);
        }
        if (!this.isEnabledFull()) {
            this.h();
        }
    }

    @Override
    public void addEventListener(frd_0 frd_02, fzu fzu2, boolean bl, @Nullable Integer n) {
        switch (frd_02) {
            case p: 
            case n: 
            case o: {
                this.a((fug_0 fug_02) -> fug_02.addEventListener(frd_02, fzu2, bl, n));
                break;
            }
            default: {
                super.addEventListener(frd_02, fzu2, bl, n);
            }
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        switch (n) {
            case -410343712: {
                this.setWithSearchButton(Co.a(string));
                return true;
            }
            case -2072642759: {
                this.setWithClearButton(Co.a(string));
                return true;
            }
            case 1492073575: {
                this.setOnSearch(fze2.a(fdh_1.class, string));
                return true;
            }
            case -1351906386: {
                this.setOnClear(fze2.a(fcy_2.class, string));
                return true;
            }
            case 428573020: {
                this.setSearchOnPressEnter(Co.a(string));
                return true;
            }
            case 1249389695: {
                this.setAutoHorizontalScrolled(Co.a(string));
                return true;
            }
            case 73055982: 
            case 381878489: {
                this.setMaxCharacters(Co.c(string));
                return true;
            }
            case 1216985755: {
                this.setPassword(Co.a(string));
                return true;
            }
            case -336545092: {
                this.setRestrict(fze2.a(string, this.m_elementMap));
                return true;
            }
            case 1602416228: {
                this.setEditable(Co.a(string));
                return true;
            }
            case -1784789924: {
                this.b(fze2.a(string, this.m_elementMap));
                return true;
            }
            case 1453943993: {
                this.setUnicodeRestrict(Co.a(string));
                return true;
            }
            case 534924003: {
                this.setDisplayGhostTextOnFocusLost(Co.a(string));
                return true;
            }
            case 105252970: {
                this.setReplaceNullByGhostText(Co.a(string));
                return true;
            }
            case -1655575466: {
                this.setSelectable(Co.a(string));
                return true;
            }
            case -625591907: {
                this.setSelectOnFocus(Co.a(string));
                return true;
            }
            case -470861862: {
                this.setEnableOnlySelectablePartInteraction(Co.a(string));
                return true;
            }
            case 92903173: {
                this.setAlign(frs_0.a(string));
                return true;
            }
            case -1249482096: {
                this.setJustify(Co.a(string));
                return true;
            }
            case 3148879: {
                this.setFont(fze2.e(string));
                return true;
            }
            case 1307418143: {
                this.setHorizontalAlignment(fro_0.a(string));
                return true;
            }
            case 48371712: {
                this.setBrightenColor(Co.a(string));
                return true;
            }
            case -919628796: {
                this.setDarkenColor(Co.a(string));
                return true;
            }
            case -1326227699: {
                this.setVerticalAlignment(fro_0.a(string));
                return true;
            }
            case 400381634: {
                this.setMaxWidth(Co.c(string));
                return true;
            }
            case -1375815020: {
                this.setMinWidth(Co.c(string));
                return true;
            }
            case -1206239059: {
                this.setMultiline(Co.a(string));
                return true;
            }
            case 390232059: {
                this.setMaxLines(Co.c(string));
                return true;
            }
            case -1439500848: {
                this.setOrientation(frh_0.a(string));
                return true;
            }
            case 3556653: {
                this.c(fze2.a(string, this.m_elementMap));
                return true;
            }
            case 1153931755: {
                this.setUseHighContrast(Co.a(string));
                return true;
            }
            case -1852365066: {
                this.setEnableShrinking(Co.a(string));
                return true;
            }
            case 3744723: {
                this.setZoom(Co.e(string));
                return true;
            }
            case -1152148181: {
                this.setDisplayCharDelay(Co.f(string));
                return true;
            }
            case 1913333550: {
                this.setEnableAutoZoomShrink(Co.a(string));
                return true;
            }
            case 844056925: {
                this.setMaxRows(Co.c(string));
                return true;
            }
            case 1905963320: {
                this.setHotSpotPosition(frs_0.a(string));
                return true;
            }
            case -406349635: {
                this.setBehaviour(fze2.a(fqs_0.class, string));
                return true;
            }
            case 408593605: {
                this.setAutoListFilter(Co.a(string));
                return true;
            }
            case 583200901: {
                this.setDisplayListOnlyIfTextPresent(Co.a(string));
                return true;
            }
            case 193923019: {
                this.setDisplayListThreshold(Co.c(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fze2);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -410343712) {
            this.setWithSearchButton(Co.b(object));
            return true;
        }
        if (n == -2072642759) {
            this.setWithClearButton(Co.b(object));
            return true;
        }
        if (n == 428573020) {
            this.setSearchOnPressEnter(Co.b(object));
            return true;
        }
        if (n == 1249389695) {
            this.setAutoHorizontalScrolled(Co.b(object));
            return true;
        }
        if (n == 73055982 || n == 381878489) {
            this.setMaxCharacters(Co.c(object));
            return true;
        }
        if (n == 1216985755) {
            this.setPassword(Co.b(object));
            return true;
        }
        if (n == -336545092) {
            this.setRestrict((String)object);
            return true;
        }
        if (n == 1602416228) {
            this.setEditable(Co.b(object));
            return true;
        }
        if (n == -1784789924) {
            this.setGhostText(object);
            return true;
        }
        if (n == P) {
            this.setListFilter((fwn)object);
            return true;
        }
        if (n == 1453943993) {
            this.setUnicodeRestrict(Co.b(object));
            return true;
        }
        if (n == 534924003) {
            this.setDisplayGhostTextOnFocusLost(Co.b(object));
            return true;
        }
        if (n == 105252970) {
            this.setReplaceNullByGhostText(Co.b(object));
            return true;
        }
        if (n == -1655575466) {
            this.setSelectable(Co.b(object));
            return true;
        }
        if (n == -625591907) {
            this.setSelectOnFocus(Co.b(object));
            return true;
        }
        if (n == -470861862) {
            this.setEnableOnlySelectablePartInteraction(Co.b(object));
            return true;
        }
        if (n == 3556653) {
            this.setText(object);
            return true;
        }
        if (n == 92903173) {
            this.setAlign((frs_0)((Object)object));
            return true;
        }
        if (n == -1249482096) {
            this.setJustify(Co.b(object));
            return true;
        }
        if (n == 3148879) {
            this.setFont((ays_1)object);
            return true;
        }
        if (n == 48371712) {
            this.setBrightenColor(Co.b(object));
            return true;
        }
        if (n == -919628796) {
            this.setDarkenColor(Co.b(object));
            return true;
        }
        if (n == 1307418143) {
            this.setHorizontalAlignment((fro_0)((Object)object));
            return true;
        }
        if (n == -1326227699) {
            this.setVerticalAlignment((fro_0)((Object)object));
            return true;
        }
        if (n == 400381634) {
            this.setMaxWidth(Co.c(object));
            return true;
        }
        if (n == -1375815020) {
            this.setMinWidth(Co.c(object));
            return true;
        }
        if (n == -1206239059) {
            this.setMultiline(Co.b(object));
            return true;
        }
        if (n == 390232059) {
            this.setMaxLines(Co.c(object));
            return true;
        }
        if (n == -1439500848) {
            this.setOrientation((frh_0)((Object)object));
            return true;
        }
        if (n == -1852365066) {
            this.setEnableShrinking(Co.b(object));
            return true;
        }
        if (n == 1153931755) {
            this.setUseHighContrast(Co.b(object));
            return true;
        }
        if (n == 3744723) {
            this.setZoom(Co.e(object));
            return true;
        }
        if (n == -1152148181) {
            this.setDisplayCharDelay(Co.f(object));
            return true;
        }
        if (n == 1913333550) {
            this.setEnableAutoZoomShrink(Co.b(object));
            return true;
        }
        if (n == 844056925) {
            this.setMaxRows(Co.c(object));
            return true;
        }
        if (n == 1905963320) {
            this.setHotSpotPosition((frs_0)((Object)object));
            return true;
        }
        if (n == W) {
            this.setSelectedValue(object);
            return true;
        }
        if (n == 408593605) {
            this.setAutoListFilter(Co.b(object));
            return true;
        }
        if (n == 583200901) {
            this.setDisplayListOnlyIfTextPresent(Co.b(object));
            return true;
        }
        if (n == 193923019) {
            this.setDisplayListThreshold(Co.c(object));
            return true;
        }
        return super.setPropertyAttribute(n, object);
    }

    @Override
    public boolean appendXMLAttribute(int n, String string, fze fze2) {
        switch (n) {
            case 3556653: {
                this.a(fze2.a(string, this.m_elementMap));
                return true;
            }
        }
        return super.appendXMLAttribute(n, string, fze2);
    }

    @Override
    public boolean appendPropertyAttribute(int n, Object object) {
        switch (n) {
            case 3556653: {
                this.a(String.valueOf(object));
                return true;
            }
        }
        return super.appendPropertyAttribute(n, object);
    }
}

