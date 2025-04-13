/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from frU
 */
public class fru_0
extends fso
implements fpz_0,
fqf_0,
fqm,
fqu {
    public static final String TAG = "Button";
    protected fsk_0 a;
    protected ful_0 b;
    protected frs_0 c;
    protected frm_0 d;
    protected frh_0 e;
    protected ayf_2 f;
    protected boolean g = true;
    protected fzu h;
    protected fzu i;
    protected fzu j;
    protected int k = -1;
    protected fjf_2 l;
    protected azj_2 m;
    public static final int n = 3556653;
    public static final int o = 92903173;
    public static final int p = 3148879;
    public static final int q = -1156593849;
    public static final int r = 728975971;
    public static final int s = -1417816805;
    public static final int t = -549216856;
    public static final int u = -1466575902;
    public static final int v = 1714306019;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqv) {
            this.setPixmap((fqv)fyb_02);
        } else if (fyb_02 instanceof ful_0) {
            this.setLabel((ful_0)fyb_02);
        }
        super.add(fyb_02);
    }

    @Override
    public void addFromXML(fyb_0 fyb_02) {
        if (fyb_02 instanceof fsk_0) {
            if (this.a != null && this.a != fyb_02) {
                this.a.destroySelfFromParent();
            }
            this.a = (fsk_0)fyb_02;
            if (this.l != null) {
                this.a.setId("buttonImage");
                this.a.setDisplaySize(this.l);
            }
        }
        super.addFromXML(fyb_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public frm_0 getPixmapAlign() {
        return this.d;
    }

    public void setPixmapAlign(frm_0 frm_02) {
        this.d = frm_02;
        this.invalidateMinSize();
    }

    public fjf_2 getDisplaySize() {
        return this.l;
    }

    public void setDisplaySize(fjf_2 fjf_22) {
        this.l = fjf_22;
        if (this.a != null) {
            this.a.setDisplaySize(this.l);
        }
    }

    public frh_0 getTextOrientation() {
        return this.e;
    }

    public void setTextOrientation(frh_0 frh_02) {
        this.e = frh_02;
        if (this.b != null) {
            this.b.setOrientation(frh_02);
        }
    }

    @Override
    public void setAlign(frs_0 frs_02) {
        this.c = frs_02;
        this.g = true;
        this.setNeedsToPreProcess();
    }

    public void setLabel(ful_0 ful_02) {
        if (ful_02 != this.b && this.b != null) {
            this.b.destroySelfFromParent();
            this.b = ful_02;
        } else if (this.b == null) {
            this.b = ful_02;
        }
        if (this.b != null) {
            this.b.setOrientation(this.e);
            this.b.setColor(this.getAppearance().getTextColor(), null);
            this.b.setFont(this.getAppearance().getFont());
            this.b.setAlign(frs_0.e);
        }
    }

    public void setText(String string) {
        if (string == null || string.isEmpty()) {
            if (this.b != null) {
                this.destroy(this.b);
            }
            return;
        }
        if (this.b == null) {
            this.b = new fsM();
            this.b.onCheckOut();
            this.add(this.b);
        }
        this.b.c(string);
    }

    public String getText() {
        if (this.b != null) {
            return this.b.getText();
        }
        return "";
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.c();
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        this.c();
    }

    private void c() {
        if (this.isEnabledFull()) {
            this.getAppearance().f();
        } else {
            this.getAppearance().e();
        }
    }

    @Override
    public fvE getWidget(int n, int n2) {
        if (this.m_unloading) {
            return null;
        }
        if (this.m_visible && !this.m_nonBlocking && this.getAppearance().a(n, n2) && !fta_0.getInstance().isMovePointMode()) {
            return this;
        }
        return null;
    }

    @Override
    public fqd_0 getAppearance() {
        return (fqd_0)this.m_appearance;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return fqj2 instanceof fqd_0;
    }

    public void setTexture(ays_2 ays_22) {
        fqv fqv2 = null;
        if (ays_22 != null) {
            fqv2 = fqv.checkOut();
            fqv2.setTexture(ays_22);
        }
        this.setPixmap(fqv2);
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        if (this.a != null) {
            this.a.setModulationColor(azj_22);
        } else {
            this.m = azj_22;
        }
    }

    @Override
    public azj_2 getModulationColor() {
        if (this.a != null) {
            return this.a.getModulationColor();
        }
        return this.m;
    }

    @Override
    public void setPixmap(fqv fqv2) {
        if (fqv2 != null) {
            if (this.a == null) {
                this.a = new fsk_0();
                this.a.onCheckOut();
                if (this.l != null) {
                    this.a.setDisplaySize(this.l);
                }
                this.add(this.a);
            }
            this.a.setPixmap(fqv2);
            if (this.m != null) {
                this.a.setModulationColor(this.m);
                this.m = null;
            }
        } else if (this.a != null) {
            this.a.destroySelfFromParent();
            this.a = null;
        }
    }

    @Override
    public void setFocusable(boolean bl) {
        super.setFocusable(bl);
        if (this.m_focusable && this.h == null) {
            this.h = new frV(this);
            this.addEventListener(frd_0.n, this.h, false);
        } else if (!this.m_focusable && this.h != null) {
            this.removeEventListener(frd_0.n, this.h, false);
            this.h = null;
        }
    }

    @Override
    public void setFont(ayf_2 ayf_22) {
        if (this.b != null) {
            this.b.setFont(ayf_22);
        }
        this.f = ayf_22;
    }

    @Override
    public void setColor(azj_2 azj_22, String string) {
        if (this.b != null && (string == null || string.equalsIgnoreCase("text"))) {
            this.b.setColor(azj_22, null);
        }
    }

    public void setClickSoundId(int n) {
        this.k = n;
    }

    public int getClickSoundId() {
        return this.k;
    }

    @Override
    protected void processEventForSound(fzs fzs2, boolean bl) {
        if (!fzs2.g()) {
            block0 : switch (fzs2.f()) {
                case C: 
                case D: 
                case j: 
                case k: {
                    fzs2.b(true);
                    switch (this.k) {
                        case -1: {
                            fza_0.a().b();
                            break block0;
                        }
                        case -2: {
                            fza_0.a().e();
                            break block0;
                        }
                    }
                    fza_0.a().a(this.k);
                    break;
                }
                case y: {
                    fza_0.a().h();
                    fzs2.b(true);
                }
            }
        }
    }

    public void a() {
        this.a(1, 1, 0);
    }

    public void a(int n, int n2, int n3) {
        this.getAppearance().c();
        adi_2.a().a(new frZ(this, n, n2, n3, this.getScreenX() + this.m_size.width / 2, this.getScreenY() + this.m_size.height / 2), 200L, 0, 1L);
    }

    @Override
    public void addedToWidgetTree() {
        super.addedToWidgetTree();
    }

    @Override
    public boolean dispatchEvent(fzs fzs2) {
        if (fzs2.f() == frd_0.y) {
            this.getAppearance().a();
        } else if (fzs2.f() == frd_0.z) {
            this.getAppearance().b();
        }
        return super.dispatchEvent(fzs2);
    }

    public void b() {
        this.i = new frW(this);
        fta_0.getInstance().addEventListener(frd_0.B, this.i, false);
        this.j = new frX(this);
        this.addEventListener(frd_0.A, this.j, false);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.a = null;
        this.b = null;
        this.l = null;
        fta_0.getInstance().removeEventListener(frd_0.B, this.i, false);
        this.j = null;
        this.i = null;
        this.h = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fqd_0 fqd_02 = fqd_0.checkOut();
        fqd_02.setWidget(this);
        this.add(fqd_02);
        fsa fsa2 = new fsa(this);
        fsa2.onCheckOut();
        this.add(fsa2);
        this.m_nonBlocking = false;
        this.c = frs_0.e;
        this.d = frm_0.d;
        this.e = frh_0.c;
        this.k = -1;
        this.b();
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.g) {
            this.invalidate();
            this.g = false;
        }
        return bl;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fru_0 fru_02 = (fru_0)fyo2;
        super.copyElement(fru_02);
        fru_02.c = this.c;
        fru_02.d = this.d;
        fru_02.e = this.e;
        fru_02.k = this.k;
        fru_02.setDisplaySize(this.l != null ? (fjf_2)this.l.clone() : null);
        fru_02.removeEventListener(frd_0.A, this.j, false);
        if (this.h != null) {
            fru_02.removeEventListener(frd_0.n, this.h, false);
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 3556653) {
            this.setText(fze2.a(string, this.m_elementMap));
        } else if (n == 92903173) {
            this.setAlign(fze2.a(frs_0.class, string));
        } else if (n == -1156593849) {
            this.setModulationColor(fze2.a(string));
        } else if (n == 3148879) {
            this.setFont(fze2.e(string));
        } else if (n == 728975971) {
            this.setTextOrientation(fze2.a(frh_0.class, string));
        } else if (n == -1417816805) {
            this.setTexture(fze2.d(string));
        } else if (n == -549216856) {
            this.setPixmapAlign(fze2.a(frm_0.class, string));
        } else if (n == -1466575902) {
            this.setClickSoundId(Co.c(string));
        } else if (n == 1714306019) {
            this.setDisplaySize(fze2.b(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 3556653) {
            if (object == null) {
                this.setText(null);
            } else {
                this.setText(String.valueOf(object));
            }
        } else if (n == 92903173) {
            this.setAlign((frs_0)((Object)object));
        } else if (n == -1156593849) {
            this.setModulationColor((azj_2)object);
        } else if (n == 3148879) {
            this.setFont((ayf_2)object);
        } else if (n == 728975971) {
            this.setTextOrientation((frh_0)((Object)object));
        } else if (n == -1417816805) {
            this.setTexture((ays_2)object);
        } else if (n == -549216856) {
            this.setPixmapAlign((frm_0)((Object)object));
        } else if (n == 1714306019) {
            this.setDisplaySize((fjf_2)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public frb_0 getCursorType() {
        return frb_0.b;
    }
}

