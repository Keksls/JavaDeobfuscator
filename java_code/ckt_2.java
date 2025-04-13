/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Font;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cKt
 */
public class ckt_2
extends fvc_0 {
    private static final Logger r = Logger.getLogger(ckt_2.class);
    public static final String TAG = "interactiveBubble";
    public static final String a = "buttonContainer";
    public static final String b = "clickLabel";
    public static final String c = "text";
    public static final String d = "image";
    private final ArrayList<fru_0> s = new ArrayList();
    private int t;
    private int u;
    private int v;
    private String w = "Arial Unicode MS";
    private int x = 0;
    private int y = 12;
    private boolean z = false;
    private boolean A = false;
    private boolean B = true;
    private boolean C = false;
    private boolean D = true;
    private fzu E = null;
    public static final int e = -1393501002;
    public static final int f = 163334105;
    public static final int g = 3556653;
    public static final int h = 1597976017;
    public static final int i = 799849652;

    public void a(String string, fzu fzu2, boolean bl) {
        if (!this.C) {
            fru_0 fru_02 = new fru_0();
            this.s.add(fru_02);
            fru_02.onCheckOut();
            fru_02.setText(string);
            fru_02.setExpandable(false);
            fru_02.addEventListener(frd_0.C, fzu2, true);
            fru_02.setEnabled(bl);
            fvE fvE2 = this.getWidgetByThemeElementName(a, false);
            if (fvE2 instanceof fso) {
                fvE2.add(fru_02);
            }
            fru_02.onChildrenAdded();
            fru_02.setStyle(TAG + this.getStyle() + "$button", true);
            fvE2 = this.getWidgetByThemeElementName(b, false);
            if (fvE2 != null) {
                fvE2.setVisible(false);
            }
        } else {
            this.addEventListener(frd_0.C, fzu2, true);
            fvE fvE3 = this.getWidgetByThemeElementName(b, false);
            if (fvE3 != null) {
                fvE3.setVisible(true);
            }
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public ckv_2 getAppearance() {
        return (ckv_2)this.m_appearance;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return fqj2 instanceof ckv_2;
    }

    public void a(int n, String string) {
        fru_0 fru_02 = this.s.get(n);
        if (fru_02 != null) {
            fru_02.setText(string);
        }
    }

    public void a(int n, fzu fzu2, fzu fzu3) {
        ckt_2 ckt_22;
        fvE fvE2 = ckt_22 = this.C ? this : (fvE)this.s.get(n);
        if (ckt_22 != null) {
            ckt_22.removeEventListener(frd_0.C, fzu2, true);
            ckt_22.addEventListener(frd_0.C, fzu3, true);
        }
    }

    public void setText(String string) {
        fvE fvE2 = this.getWidgetByThemeElementName(c, false);
        if (fvE2 != null && fvE2 instanceof ful_0) {
            ((ful_0)fvE2).c(string);
        } else {
            r.warn((Object)"Le champ de texte n'a pas \u00e9t\u00e9 d\u00e9fini dans le XML");
        }
    }

    public void setIconUrl(String string) {
        fvE fvE2 = this.getWidgetByThemeElementName(d, false);
        if (fvE2 instanceof fsk_0) {
            ays_2 ays_22 = ayu_2.a().b((aui_2)auj_1.a.a(), (long)auc_1.d(string), string, false);
            if (ays_22 == null) {
                return;
            }
            fqv fqv2 = new fqv();
            fqv2.onCheckOut();
            fqv2.setPixmap(new ayo_2(ays_22));
            fvE2.add(fqv2);
        }
    }

    public boolean getActAsButton() {
        return this.C;
    }

    public void setActAsButton(boolean bl) {
        if (bl != this.C) {
            this.C = bl;
        }
    }

    public final void setBubbleFontName(String string) {
        this.w = string;
        this.invalidate();
    }

    public final void setBubbleFontStyle(int n) {
        this.x = n;
        this.invalidate();
    }

    public final void setBubbleFontSize(int n) {
        this.y = n;
        this.invalidate();
    }

    public final void setBubbleText(String string) {
        this.setText(string);
    }

    public void setForcedDisplaySpark(boolean bl) {
        this.A = true;
        this.z = bl;
        ckv_2 ckv_22 = this.getAppearance();
        if (ckv_22 != null && ckv_22.getBubbleBorder() != null) {
            ckv_22.getBubbleBorder().setDisplaySpark(this.z);
        }
        if ((ckv_22 = (ckv_2)this.m_xmlAppearance) != null && ckv_22.getBubbleBorder() != null) {
            ckv_22.getBubbleBorder().setDisplaySpark(this.z);
        }
    }

    public boolean isCloseOnClick() {
        return this.D;
    }

    public void setCloseOnClick(boolean bl) {
        if (this.D != bl) {
            this.D = bl;
            this.a(this.D);
        }
    }

    private void a(boolean bl) {
        if (bl) {
            if (this.E != null) {
                this.removeEventListener(frd_0.C, this.E, false);
            }
            this.E = new cku_2(this);
            this.addEventListener(frd_0.C, this.E, false);
        } else {
            this.removeEventListener(frd_0.C, this.E, false);
        }
    }

    public void a() {
        this.destroySelfFromParent();
    }

    public void b() {
        this.setText("");
        for (int k = this.s.size() - 1; k >= 0; --k) {
            this.s.get(k).destroySelfFromParent();
        }
        this.s.clear();
    }

    public final void c() {
        this.setVisible(true);
    }

    public final void d() {
        this.setVisible(false);
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        ckt_2 ckt_22 = (ckt_2)fyo2;
        if (this.A) {
            ckt_22.setForcedDisplaySpark(this.z);
        }
        this.setActAsButton(this.C);
        this.setCloseOnClick(this.D);
    }

    @Override
    public void addedToWidgetTree() {
        super.addedToWidgetTree();
        this.a(this.D);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.s.clear();
        this.E = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        Font font = new Font(this.w, this.x, this.y);
        this.A = false;
        this.z = false;
        this.B = true;
        this.C = false;
        this.D = true;
        ckv_2 ckv_22 = new ckv_2();
        ckv_22.onCheckOut();
        ckv_22.setWidget(this);
        this.add(ckv_22);
        this.setNeedsToPostProcess();
    }

    @Override
    public final boolean postProcess(int n) {
        super.postProcess(n);
        return true;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a(this.getTarget(), this.t, this.u, this.v);
    }

    @Override
    public void a(YQ yQ, int n, int n2, int n3) {
        ckv_2 ckv_22;
        boolean bl;
        if (!this.isUseTargetPositionning()) {
            return;
        }
        this.t = n;
        this.u = n2;
        this.v = n3;
        fyX fyX2 = fpm_0.b().j();
        float f2 = fyX2.E();
        float f3 = fyX2.F();
        fjf_2 fjf_22 = this.getSize();
        float f4 = (float)n + f2 * 0.5f;
        float f5 = (float)n2 + f3 * 0.5f + (float)n3;
        int n4 = 0;
        int n5 = 0;
        int n6 = this.getScreenX();
        int n7 = this.getScreenY();
        if (n6 < 0) {
            n4 = -n6;
        } else if (n6 + fjf_22.width > this.m_containerParent.getAppearance().getContentWidth()) {
            n4 = this.m_containerParent.getAppearance().getContentWidth() - fjf_22.width - n6;
        }
        if (n7 < 0) {
            n5 = -n7;
        } else if (n7 + fjf_22.height > this.m_containerParent.getAppearance().getContentHeight()) {
            n5 = this.m_containerParent.getAppearance().getContentHeight() - fjf_22.height - n7;
        }
        boolean bl2 = bl = this.A ? this.z : true;
        if (!this.z) {
            if (f4 < 0.0f || f4 > f2) {
                bl = false;
            }
            if (f5 < 0.0f || f5 > f3) {
                bl = false;
            }
        }
        if (bl != this.B && (ckv_22 = this.getAppearance()) != null && ckv_22.getBubbleBorder() != null) {
            ckv_22.getBubbleBorder().setDisplaySpark(bl);
            this.B = bl;
        }
        super.a(yQ, (int)f4 - this.getHalfDisplayWidth(), (int)f5 - this.getHalfDisplayHeight(), 0);
    }

    @Override
    public afe_1 getComputedPosition(int n, int n2, int n3) {
        return this.getPositionWithOutOfScreen(n, n2, n3);
    }

    @Override
    public void setOffset(int n, int n2) {
        super.setOffset(n, n2);
    }

    @Override
    public String toString() {
        fvE fvE2 = this.getWidgetByThemeElementName(c, false);
        String string = "";
        if (fvE2 != null && fvE2 instanceof ful_0) {
            string = ((ful_0)fvE2).getText();
        }
        return "InteractiveBubble{m_text=" + string + ", m_targetX=" + this.t + ", m_targetY=" + this.u + ", m_screenX=" + this.getDisplayX() + ", m_screenY=" + this.getDisplayY() + "}";
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -1393501002) {
            this.setActAsButton(Co.a(string));
        } else if (n == 163334105) {
            this.setBubbleText(fze2.a(string, this.m_elementMap));
        } else if (n == 3556653) {
            this.setText(fze2.a(string, this.m_elementMap));
        } else if (n == 1597976017) {
            this.setCloseOnClick(Co.a(string));
        } else if (n == 799849652) {
            this.setForcedDisplaySpark(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1393501002) {
            this.setActAsButton(Co.b(object));
        } else if (n == 163334105) {
            if (object == null) {
                this.setBubbleText(null);
            } else {
                this.setBubbleText(String.valueOf(object));
            }
        } else if (n == 3556653) {
            if (object == null) {
                this.setText(null);
            } else {
                this.setText(String.valueOf(object));
            }
        } else if (n == 1597976017) {
            this.setCloseOnClick(Co.b(object));
        } else if (n == 799849652) {
            this.setForcedDisplaySpark(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    static /* synthetic */ fyy_0 a(ckt_2 ckt_22) {
        return ckt_22.m_elementMap;
    }
}

