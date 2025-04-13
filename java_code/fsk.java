/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collections;
import org.jetbrains.annotations.NotNull;

public class fsk
extends fsq_0<Object>
implements faa_1 {
    public static final String TAG = "ComboBoxPlus";
    public static final String a = "ComboBox";
    public static final String b = "renderable";
    public static final String c = "list";
    public static final String d = "button";
    private boolean j = false;
    private boolean k = true;
    private fsQ l = null;
    ftj_0 m = null;
    fru_0 n = null;
    private int o = -1;
    private fqs_0 p = fqs_0.a;
    private final fzu q = fzs2 -> {
        fck_2 fck_22 = (fck_2)fzs2;
        if (this.j) {
            if (this.m_appearance == null) {
                return true;
            }
            if (this.m_appearance.a(fck_22.a(this), fck_22.b(this))) {
                return true;
            }
            fqr fqr2 = this.l.getAppearance();
            if (fqr2 == null) {
                return true;
            }
            if (!fqr2.a(fck_22.a(this.l), fck_22.b(this.l))) {
                this.c();
                return true;
            }
        }
        return false;
    };
    private final fzu r = fzs2 -> {
        fck_2 fck_22 = (fck_2)fzs2;
        if (!this.k && this.j) {
            ftx_0 ftx_02 = this.l.getScrollBar();
            if (ftx_02 == null) {
                return true;
            }
            fum fum2 = ftx_02.getSlider();
            if (fum2 == null) {
                return true;
            }
            fzs fzs3 = fck_22.h();
            if (fzs3 == null) {
                return true;
            }
            if (fum2.getButton() != fzs3.e()) {
                if (this.p.b()) {
                    this.c();
                }
                return true;
            }
        }
        if (this.k) {
            this.k = false;
        }
        return false;
    };
    private final fzu s = fzs2 -> {
        if (this.p.a() && this.isEnabledFull()) {
            this.a();
        }
        return false;
    };
    private final fzu t = fzs2 -> {
        fcf_2 fcf_22 = (fcf_2)fzs2;
        if (this.p.b() && fcf_22.k()) {
            this.setSelectedValue(fcf_22.l());
            this.c();
        }
        fcf_2 fcf_23 = new fcf_2(this, fcf_22.j(), fcf_22.l(), fcf_22.k());
        this.dispatchEvent(fcf_23);
        return false;
    };
    private String u = null;
    private fyy_0 v = null;
    private frs_0 w = frs_0.h;
    private frs_0 x = frs_0.b;
    public static final int e = 844056925;
    public static final int f = "selectedValue".hashCode();
    public static final int g = 92903173;
    public static final int h = 1905963320;
    public static final int i = -406349635;

    @Override
    public void add(fyb_0 fyb_02) {
        boolean bl = true;
        if (fyb_02 instanceof fsQ) {
            if (this.l != null) {
                this.l.release();
            }
            bl = false;
            this.l = (fsQ)fyb_02;
            this.l.setModalLevel((short)30000);
            this.a(this.l);
        } else if (fyb_02 instanceof ftj_0) {
            if (this.m != null) {
                this.m.release();
            }
            this.m = (ftj_0)fyb_02;
        } else if (fyb_02 instanceof fru_0) {
            if (this.n != null) {
                this.n.destroySelfFromParent();
            }
            this.n = (fru_0)fyb_02;
        }
        if (bl) {
            super.add(fyb_02);
        }
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (b.equalsIgnoreCase(string)) {
            if (this.m != null) {
                return this.m;
            }
        } else if (c.equalsIgnoreCase(string)) {
            if (this.l != null) {
                return this.l;
            }
        } else if (d.equalsIgnoreCase(string)) {
            return this.n;
        }
        return null;
    }

    @Override
    public fqi getAppearance() {
        return (fqi)this.m_appearance;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fru_0 getButton() {
        return this.n;
    }

    public fsQ getList() {
        return this.l;
    }

    public int getMaxRows() {
        return this.o;
    }

    public void setMaxRows(int n) {
        this.o = n;
    }

    @Override
    public void setElementMap(fyy_0 fyy_02) {
        super.setElementMap(fyy_02);
        if (this.l != null) {
            this.l.setElementMap(fyy_02);
        }
    }

    public Object getSelectedValue() {
        if (this.l != null) {
            return this.l.getSelectedValue();
        }
        return null;
    }

    public void setSelectedValue(Object object) {
        if (object == null) {
            return;
        }
        if (this.l != null) {
            this.l.setSelectedValue(object);
            Object object2 = this.l.getSelectedValue();
            if (object != object2 && !object.equals(object2) && object2 != null) {
                m_logger.warn((Object)("Impossible de retrouver la valeur s\u00e9lectionn\u00e9e dans la liste - il faut appliquer l'attribut content AVANT selectedValue - " + object + " - " + object2));
            }
            this.setRenderableContent(object2, -1);
        }
    }

    public ftj_0 getRenderable() {
        return this.m;
    }

    @Override
    public void setContentProperty(String string, fyy_0 fyy_02) {
        this.u = string;
        this.v = fyy_02;
    }

    private void setRenderableContent(Object object, int n) {
        if (this.m != null) {
            Object object2;
            int n2 = 0;
            if (this.l != null) {
                object2 = this.l.getSelectedValue();
                n2 = this.l.getSelectedOffset();
            } else {
                object2 = object;
                if (n != -1) {
                    n2 = n;
                }
            }
            if (object2 != null) {
                this.m.setContentProperty(this.u + "#" + n2, this.v);
            }
            this.m.setContent(object2);
        }
    }

    @Override
    public void setContent(@NotNull Iterable<Object> iterable, boolean bl) {
        boolean bl2 = true;
        Object object = null;
        if (this.l != null) {
            this.l.setContentProperty(this.u, this.v);
            this.l.setContent(iterable);
            if (!this.l.e() && this.l.getSelectedValue() == null) {
                bl2 = false;
                object = this.l.getItems().get(0);
                this.l.setSelectedOffset(0);
            }
        }
        Object object2 = null;
        int n = -1;
        if (!bl2) {
            object2 = object;
            n = 0;
        }
        this.setRenderableContent(object2, n);
    }

    @Override
    public Iterable<Object> getUnfilteredContent() {
        if (this.l != null) {
            return this.l.getUnfilteredContent();
        }
        return Collections.emptyList();
    }

    public void setHotSpotPosition(frs_0 frs_02) {
        if (frs_02 != null) {
            this.x = frs_02;
        }
    }

    public void setAlign(frs_0 frs_02) {
        if (frs_02 != null) {
            this.w = frs_02;
        }
    }

    @Override
    public void addedToWidgetTree() {
        super.addedToWidgetTree();
        this.setFocusable(true);
    }

    public void setBehaviour(fqs_0 fqs_02) {
        this.p = fqs_02;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        if (this.n != null) {
            this.n.setEnabled(bl);
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        if (this.n != null) {
            this.n.setNetEnabled(bl);
        }
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        if (this.n != null) {
            this.n.setVisible(this.p.c());
        }
    }

    private void b() {
        this.addEventListener(frd_0.C, this.s, false);
    }

    private void a(fta_0 fta_02) {
        fta_02.addEventListener(frd_0.A, this.q, false);
        fta_02.addEventListener(frd_0.B, this.r, false);
    }

    private void a(fsQ fsQ2) {
        fsQ2.addEventListener(frd_0.q, this.t, false);
    }

    public void a() {
        if (this.j) {
            this.c();
        } else {
            this.d();
        }
    }

    private void c() {
        if (this.j) {
            this.l.removeSelfFromParent();
            this.j = false;
            fza_0.a().d();
        }
    }

    private void d() {
        if (!this.j) {
            fjf_2 fjf_22 = this.l.getIdealSize(this.o, -1);
            int n = fjf_22.height;
            int n2 = this.getDisplayY();
            fta_0 fta_02 = fta_0.getInstance();
            frs_0 frs_02 = this.w;
            frs_0 frs_03 = this.x;
            int n3 = this.getDisplayY() + frs_02.b(this.getHeight()) - frs_03.b(n);
            if (n3 < 0 || n3 > fta_02.getAppearance().getContentHeight() - n) {
                frs_02 = frs_02.f();
                frs_03 = frs_03.f();
            }
            n3 = this.getDisplayY() + frs_02.b(this.getHeight()) - frs_03.b(n);
            n3 = Math.max(0, Math.min(n3, fta_02.getAppearance().getContentHeight() - n));
            if (n2 - n < 0 && n2 + this.getHeight() + n > fta_02.getHeight()) {
                n = n2;
                n3 = 0;
            }
            this.l.setSizeToPrefSize();
            int n4 = Math.max(this.l.getWidth(), this.getWidth());
            this.l.setSize(n4, n);
            this.l.setPosition(this.getDisplayX(), n3);
            this.l.setNonBlocking(false);
            fta_02.getLayeredContainer().a(this.l, 30000);
            this.j = true;
            this.k = true;
            fza_0.a().c();
        }
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return fqj2 instanceof fqi;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        fta_0.getInstance().removeEventListener(frd_0.A, this.q, false);
        fta_0.getInstance().removeEventListener(frd_0.B, this.r, false);
        this.w = null;
        this.x = null;
        this.l.destroySelfFromParent();
        this.n = null;
        this.l = null;
        this.m = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fsl fsl2 = new fsl(this);
        fsl2.onCheckOut();
        this.add(fsl2);
        fqi fqi2 = new fqi();
        fqi2.onCheckOut();
        fqi2.setWidget(this);
        this.add(fqi2);
        this.p = fqs_0.a;
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        this.add(fru_02);
        this.l = new fsQ();
        this.l.onCheckOut();
        this.m = new ftj_0();
        this.m.onCheckOut();
        this.m_nonBlocking = false;
        this.b();
        this.a(fta_0.getInstance());
    }

    @Override
    public void copyElement(fyo fyo2) {
        fsk fsk2 = (fsk)fyo2;
        super.copyElement(fsk2);
        fsk2.p = this.p;
        fsk2.o = this.o;
        fvE fvE2 = (fvE)this.l.cloneElementStructure();
        fvE2.m_styleIsDirty = false;
        fvE2.removeAllEventListeners();
        fsk2.add(fvE2);
        fsk2.removeEventListener(frd_0.A, this.q, false);
        fsk2.removeEventListener(frd_0.B, this.r, false);
        fsk2.removeEventListener(frd_0.C, this.s, false);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 844056925) {
            this.setMaxRows(Co.c(string));
        } else if (n == 92903173) {
            this.setAlign(frs_0.a(string));
        } else if (n == -406349635) {
            this.setBehaviour(fze2.a(fqs_0.class, string));
        } else if (n == 1905963320) {
            this.setHotSpotPosition(frs_0.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 844056925) {
            this.setMaxRows(Co.c(object));
        } else if (n == 92903173) {
            this.setAlign((frs_0)((Object)object));
        } else if (n == 1905963320) {
            this.setHotSpotPosition((frs_0)((Object)object));
        } else if (n == f) {
            this.setSelectedValue(object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

