/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fts
 */
public class fts_0
extends fso {
    public static final String TAG = "PopupMenu";
    public static final String a = "Button";
    public static final String b = "Label";
    public static final String c = "Separator";
    private frs_0 e = frs_0.a;
    private int f = -1;
    private int g = -1;
    private fzu h;
    private fzu i;
    private fru_0 j;
    private fsM k;
    private ful l;
    private boolean m = false;
    public static final int d = 1905963320;

    @Override
    public void addFromXML(fyb_0 fyb_02) {
        if (fyb_02 instanceof fru_0) {
            this.j = (fru_0)fyb_02;
        } else if (fyb_02 instanceof fsM) {
            this.k = (fsM)fyb_02;
        } else if (fyb_02 instanceof ful) {
            this.l = (ful)fyb_02;
        } else if (!(fyb_02 instanceof fvE)) {
            super.addFromXML(fyb_02);
        }
    }

    public void a(String string, ayo_2 ayo_22) {
        fsM fsM2 = (fsM)this.k.cloneElementStructure();
        fsM2.c(string);
        this.add(fsM2);
    }

    public void a(String string, ayo_2 ayo_22, fdt_1 fdt_12, boolean bl) {
        fru_0 fru_02 = (fru_0)this.j.cloneElementStructure();
        this.add(fru_02);
        fru_02.setText(string);
        fru_02.setOnClick(fdt_12);
        fru_02.setEnabled(bl);
    }

    public void a() {
        ful ful2 = (ful)this.l.cloneElementStructure();
        this.add(ful2);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (a.equalsIgnoreCase(string)) {
            if (this.j != null) {
                return this.j;
            }
            fru_0 fru_02 = new fru_0();
            fru_02.onCheckOut();
            return fru_02;
        }
        if (b.equalsIgnoreCase(string)) {
            if (this.k != null) {
                return this.k;
            }
            fsM fsM2 = new fsM();
            fsM2.onCheckOut();
            return fsM2;
        }
        if (c.equalsIgnoreCase(string)) {
            if (this.l != null) {
                return this.l;
            }
            ful ful2 = new ful();
            ful2.onCheckOut();
            return ful2;
        }
        return null;
    }

    public void setHotSpotPosition(frs_0 frs_02) {
        this.e = frs_02;
    }

    public void a(int n, int n2) {
        this.setVisible(true);
        this.f = n;
        this.g = n2;
    }

    public void b() {
        this.a(fyf_0.a().c(), fyf_0.a().d());
    }

    public void c() {
        this.h = new ftt(this);
        this.i = new ftu_0(this);
        fta_0.getInstance().addEventListener(frd_0.C, this.h, false);
        fta_0.getInstance().addEventListener(frd_0.A, this.i, false);
    }

    @Override
    public void validate() {
        this.setSizeToPrefSize();
        this.f -= this.e.a(this.getWidth());
        this.g -= this.e.b(this.getHeight());
        ftv_0 ftv_02 = this.getWidgetParentOfType(ftv_0.class);
        this.f = Math.min(ftv_02.getWidth() - this.getWidth(), this.f);
        if (this.g < 0) {
            this.g = 0;
        }
        this.g = Math.min(ftv_02.getHeight() - this.getHeight(), this.g);
        this.setPosition(this.f, this.g);
        super.validate();
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        if (!this.m) {
            this.c();
            this.m = true;
        }
        return bl;
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        this.setStyle(this.m_style[0], true);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        this.add(fin_22);
        this.setNeedsToPostProcess();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        fta_0.getInstance().removeEventListener(frd_0.C, this.h, false);
        fta_0.getInstance().removeEventListener(frd_0.A, this.i, false);
        if (this.j != null) {
            this.j.destroySelfFromParent();
            this.j = null;
        }
        if (this.k != null) {
            this.k.destroySelfFromParent();
            this.k = null;
        }
        if (this.l != null) {
            this.l.destroySelfFromParent();
            this.l = null;
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != 1905963320) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setHotSpotPosition(frs_0.a(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 1905963320) {
            return super.setPropertyAttribute(n, object);
        }
        this.setHotSpotPosition((frs_0)((Object)object));
        return true;
    }

    static /* synthetic */ fyy_0 a(fts_0 fts_02) {
        return fts_02.m_elementMap;
    }

    static /* synthetic */ fyy_0 b(fts_0 fts_02) {
        return fts_02.m_elementMap;
    }

    static /* synthetic */ fyy_0 c(fts_0 fts_02) {
        return fts_02.m_elementMap;
    }
}

